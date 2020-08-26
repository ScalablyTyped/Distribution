package typings.googleapis.v13Mod.adexchangebuyerV13

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
  def apply(): SchemaPerformanceReportList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerformanceReportList]
  }
  @scala.inline
  implicit class SchemaPerformanceReportListOps[Self <: SchemaPerformanceReportList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPerformanceReportVarargs(value: SchemaPerformanceReport*): Self = this.set("performanceReport", js.Array(value :_*))
    @scala.inline
    def setPerformanceReport(value: js.Array[SchemaPerformanceReport]): Self = this.set("performanceReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformanceReport: Self = this.set("performanceReport", js.undefined)
  }
  
}

