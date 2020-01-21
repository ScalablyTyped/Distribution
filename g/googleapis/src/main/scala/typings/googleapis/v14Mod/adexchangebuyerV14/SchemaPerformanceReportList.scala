package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration data for an Ad Exchange performance report list.
  */
@js.native
trait SchemaPerformanceReportList extends js.Object {
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A list of performance reports relevant for the account.
    */
  var performanceReport: js.UndefOr[js.Array[SchemaPerformanceReport]] = js.native
}

object SchemaPerformanceReportList {
  @scala.inline
  def apply(kind: String = null, performanceReport: js.Array[SchemaPerformanceReport] = null): SchemaPerformanceReportList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (performanceReport != null) __obj.updateDynamic("performanceReport")(performanceReport.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPerformanceReportList]
  }
}

