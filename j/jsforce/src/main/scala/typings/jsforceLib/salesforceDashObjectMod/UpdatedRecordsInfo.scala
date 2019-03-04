package typings
package jsforceLib.salesforceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedRecordsInfo extends js.Object {
  var ids: js.Array[java.lang.String]
  var latestDateCovered: java.lang.String
}

object UpdatedRecordsInfo {
  @scala.inline
  def apply(ids: js.Array[java.lang.String], latestDateCovered: java.lang.String): UpdatedRecordsInfo = {
    val __obj = js.Dynamic.literal(ids = ids, latestDateCovered = latestDateCovered)
  
    __obj.asInstanceOf[UpdatedRecordsInfo]
  }
}

