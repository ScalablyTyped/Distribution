package typings.jsforce.salesforceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletedRecord extends js.Object {
  var deletedDate: String
  var id: String
}

object DeletedRecord {
  @scala.inline
  def apply(deletedDate: String, id: String): DeletedRecord = {
    val __obj = js.Dynamic.literal(deletedDate = deletedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletedRecord]
  }
}

