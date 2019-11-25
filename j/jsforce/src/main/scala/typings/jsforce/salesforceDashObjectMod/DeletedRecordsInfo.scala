package typings.jsforce.salesforceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletedRecordsInfo extends js.Object {
  var deletedRecords: js.Array[DeletedRecord]
  var earliestDateAvailable: String
  var latestDateCovered: String
}

object DeletedRecordsInfo {
  @scala.inline
  def apply(deletedRecords: js.Array[DeletedRecord], earliestDateAvailable: String, latestDateCovered: String): DeletedRecordsInfo = {
    val __obj = js.Dynamic.literal(deletedRecords = deletedRecords.asInstanceOf[js.Any], earliestDateAvailable = earliestDateAvailable.asInstanceOf[js.Any], latestDateCovered = latestDateCovered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletedRecordsInfo]
  }
}

