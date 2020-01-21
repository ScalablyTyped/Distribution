package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key used to identify a report.
  */
@js.native
trait SchemaReportKey extends js.Object {
  /**
    * Query ID.
    */
  var queryId: js.UndefOr[String] = js.native
  /**
    * Report ID.
    */
  var reportId: js.UndefOr[String] = js.native
}

object SchemaReportKey {
  @scala.inline
  def apply(queryId: String = null, reportId: String = null): SchemaReportKey = {
    val __obj = js.Dynamic.literal()
    if (queryId != null) __obj.updateDynamic("queryId")(queryId.asInstanceOf[js.Any])
    if (reportId != null) __obj.updateDynamic("reportId")(reportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportKey]
  }
}

