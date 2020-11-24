package typings.karmaCoverageIstanbulReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageIstanbulReporter extends js.Object {
  
  /** Combines coverage information from multiple browsers into one report rather than outputting a report for each browser */
  val combineBrowserReports: js.UndefOr[Boolean] = js.native
  
  /**
    * Base output directory.
    * If you include `%browser%` in the path it will be replaced with the karma browser name.
    */
  val dir: js.UndefOr[String] = js.native
  
  /** if using webpack and pre-loaders, work around webpack breaking the source path. */
  val fixWebpackSourcePaths: js.UndefOr[Boolean] = js.native
  
  // TODO: Add istanbul-api
  /** `instrumentation` is used to configure Istanbul API package. */
  val instrumentation: js.UndefOr[js.Any] = js.native
  
  // TODO: Add istanbul-api
  /** Most reporters accept additional config options. You can pass these through the `report-config` option. */
  val `report-config`: js.UndefOr[js.Any] = js.native
  
  /** Reports can be any that are listed {@link https://github.com/istanbuljs/istanbuljs/tree/aae256fb8b9a3d19414dcf069c592e88712c32c6/packages/istanbul-reports/lib here}. */
  val reports: js.UndefOr[js.Array[String]] = js.native
  
  /** Omit files with no statements, no functions and no branches from the report. */
  val skipFilesWithNoCoverage: js.UndefOr[Boolean] = js.native
  
  /**
    * Enforce percentage thresholds.
    * Anything under these percentages will cause karma to fail with an exit code of 1 if not running in watch mode.
    */
  val thresholds: js.UndefOr[ThresholdConfig] = js.native
  
  /** Output config used by istanbul for debugging. */
  val verbose: js.UndefOr[Boolean] = js.native
}
object CoverageIstanbulReporter {
  
  @scala.inline
  def apply(): CoverageIstanbulReporter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageIstanbulReporter]
  }
  
  @scala.inline
  implicit class CoverageIstanbulReporterOps[Self <: CoverageIstanbulReporter] (val x: Self) extends AnyVal {
    
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
    def setCombineBrowserReports(value: Boolean): Self = this.set("combineBrowserReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCombineBrowserReports: Self = this.set("combineBrowserReports", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setFixWebpackSourcePaths(value: Boolean): Self = this.set("fixWebpackSourcePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixWebpackSourcePaths: Self = this.set("fixWebpackSourcePaths", js.undefined)
    
    @scala.inline
    def setInstrumentation(value: js.Any): Self = this.set("instrumentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstrumentation: Self = this.set("instrumentation", js.undefined)
    
    @scala.inline
    def `setReport-config`(value: js.Any): Self = this.set("report-config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteReport-config`: Self = this.set("report-config", js.undefined)
    
    @scala.inline
    def setReportsVarargs(value: String*): Self = this.set("reports", js.Array(value :_*))
    
    @scala.inline
    def setReports(value: js.Array[String]): Self = this.set("reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReports: Self = this.set("reports", js.undefined)
    
    @scala.inline
    def setSkipFilesWithNoCoverage(value: Boolean): Self = this.set("skipFilesWithNoCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFilesWithNoCoverage: Self = this.set("skipFilesWithNoCoverage", js.undefined)
    
    @scala.inline
    def setThresholds(value: ThresholdConfig): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholds: Self = this.set("thresholds", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
