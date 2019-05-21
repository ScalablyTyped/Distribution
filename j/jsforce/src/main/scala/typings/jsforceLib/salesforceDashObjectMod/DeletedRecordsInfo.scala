package typings
package jsforceLib.salesforceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletedRecordsInfo extends js.Object {
  var deletedRecords: js.Array[DeletedRecord]
  var earliestDateAvailable: java.lang.String
  var latestDateCovered: java.lang.String
}

object DeletedRecordsInfo {
  @scala.inline
  def apply(
    deletedRecords: js.Array[DeletedRecord],
    earliestDateAvailable: java.lang.String,
    latestDateCovered: java.lang.String
  ): DeletedRecordsInfo = {
    val __obj = js.Dynamic.literal(deletedRecords = deletedRecords, earliestDateAvailable = earliestDateAvailable, latestDateCovered = latestDateCovered)
  
    __obj.asInstanceOf[DeletedRecordsInfo]
  }
}

