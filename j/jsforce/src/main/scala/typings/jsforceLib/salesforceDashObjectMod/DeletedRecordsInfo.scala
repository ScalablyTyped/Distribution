package typings
package jsforceLib.salesforceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletedRecordsInfo extends js.Object {
  var deletedRecords: jsforceLib.Anon_DeletedDate
  var earliestDateAvailable: java.lang.String
  var latestDateCovered: java.lang.String
}

object DeletedRecordsInfo {
  @scala.inline
  def apply(
    deletedRecords: jsforceLib.Anon_DeletedDate,
    earliestDateAvailable: java.lang.String,
    latestDateCovered: java.lang.String
  ): DeletedRecordsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deletedRecords")(deletedRecords)
    __obj.updateDynamic("earliestDateAvailable")(earliestDateAvailable)
    __obj.updateDynamic("latestDateCovered")(latestDateCovered)
    __obj.asInstanceOf[DeletedRecordsInfo]
  }
}

