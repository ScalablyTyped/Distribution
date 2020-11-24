package typings.karmaSummaryReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends js.Object {
  
  /**
    * Show a table detailing the test results for all connected browsers at the end of a test run.
    * This gives a better overview which browsers are broken than the output of other reporters.
    * see {@link https://github.com/sth/karma-summary-reporter#config}
    */
  val summaryReporter: js.UndefOr[SummaryReporterConfig] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setSummaryReporter(value: SummaryReporterConfig): Self = this.set("summaryReporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryReporter: Self = this.set("summaryReporter", js.undefined)
  }
}
