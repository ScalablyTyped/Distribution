package typings.karmaSummaryReporter.mod

import typings.karmaSummaryReporter.karmaSummaryReporterStrings.all
import typings.karmaSummaryReporter.karmaSummaryReporterStrings.failed
import typings.karmaSummaryReporter.karmaSummaryReporterStrings.skipped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummaryReporterConfig extends js.Object {
  
  /**
    * Shows a overview column in the results table, showing the total result of a test over all browsers
    * ("failed" if the test failed anywhere, ...)
    */
  var overviewColumn: js.UndefOr[Boolean] = js.native
  
  /**
    * Select which tests are displayed in the summary:
    * * 'failed': Only show tests that failed in some browser (default)
    * * 'skipped': Additionally show tests that got skipped in some browser
    * * 'all': Show all test, also ones that didn't fail specLength
    */
  var show: js.UndefOr[failed | skipped | all] = js.native
  
  /**
    * Space reserved to display the spec label (width of the first column in the results table).
    */
  var specLength: js.UndefOr[Double] = js.native
}
object SummaryReporterConfig {
  
  @scala.inline
  def apply(): SummaryReporterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryReporterConfig]
  }
  
  @scala.inline
  implicit class SummaryReporterConfigOps[Self <: SummaryReporterConfig] (val x: Self) extends AnyVal {
    
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
    def setOverviewColumn(value: Boolean): Self = this.set("overviewColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverviewColumn: Self = this.set("overviewColumn", js.undefined)
    
    @scala.inline
    def setShow(value: failed | skipped | all): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSpecLength(value: Double): Self = this.set("specLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecLength: Self = this.set("specLength", js.undefined)
  }
}
