package typings
package jsforceLib.salesforceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletedRecord extends js.Object {
  var deletedDate: java.lang.String
  var id: java.lang.String
}

object DeletedRecord {
  @scala.inline
  def apply(deletedDate: java.lang.String, id: java.lang.String): DeletedRecord = {
    val __obj = js.Dynamic.literal(deletedDate = deletedDate, id = id)
  
    __obj.asInstanceOf[DeletedRecord]
  }
}

