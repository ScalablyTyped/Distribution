package typings.jsforce.salesforceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedRecordsInfo extends js.Object {
  var ids: js.Array[String]
  var latestDateCovered: String
}

object UpdatedRecordsInfo {
  @scala.inline
  def apply(ids: js.Array[String], latestDateCovered: String): UpdatedRecordsInfo = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], latestDateCovered = latestDateCovered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatedRecordsInfo]
  }
}

