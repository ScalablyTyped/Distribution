package typings.licenseChecker.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitOpts extends js.Object {
  
  /**
    * Colorize output
    */
  var color: js.UndefOr[Boolean] = js.native
  
  /**
    * Output in csv format
    */
  var csv: js.UndefOr[Boolean] = js.native
  
  /**
    * Prefix column for component in csv format.
    */
  var csvComponentPrefix: js.UndefOr[String] = js.native
  
  /**
    * Specify the columns for CSV format
    * or add the specified items for JSON format
    */
  var customFormat: js.UndefOr[Record[String, _]] = js.native
  
  /**
    * To add a custom Format file in JSON
    */
  var customPath: js.UndefOr[String | ModuleInfo] = js.native
  
  /**
    * Only show development dependencies
    */
  var development: js.UndefOr[Boolean] = js.native
  
  /**
    * Look for direct dependencies only
    */
  var direct: js.UndefOr[Boolean] = js.native
  
  /**
    * Exclude modules which licenses are in the comma-separated list from the output
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Restrict output to the packages (package@version) not in the semicolon-separated list
    */
  var excludePackages: js.UndefOr[String] = js.native
  
  /**
    * Restrict output to not include any package marked as private
    */
  var excludePrivatePackages: js.UndefOr[Boolean] = js.native
  
  /**
    * Fail (exit with code 1) on the first occurrence of the licenses of the semicolon-separated list
    */
  var failOn: js.UndefOr[String] = js.native
  
  /**
    * Output in json format
    */
  var json: js.UndefOr[Boolean] = js.native
  
  /**
    * Fail (exit with code 1) on the first occurrence of the licenses not in the semicolon-separated list
    */
  var onlyAllow: js.UndefOr[String] = js.native
  
  /**
    * Only list packages with unknown or guessed licenses
    */
  var onlyunknown: js.UndefOr[Boolean] = js.native
  
  /**
    * Write the data to a specific file.
    */
  var out: js.UndefOr[String] = js.native
  
  /**
    * Restrict output to the packages (package@version) in the semicolon-separated list
    */
  var packages: js.UndefOr[String] = js.native
  
  /**
    * Only show production dependencies
    */
  var production: js.UndefOr[Boolean] = js.native
  
  /**
    * Output the location of the license files as relative paths
    */
  var relativeLicensePath: js.UndefOr[Boolean] = js.native
  
  /**
    * Path to start checking dependencies from
    */
  var start: String = js.native
  
  /**
    * Output a summary of the license usage
    */
  var summary: js.UndefOr[Boolean] = js.native
  
  /**
    * Report guessed licenses as unknown licenses
    */
  var unknown: js.UndefOr[Boolean] = js.native
}
object InitOpts {
  
  @scala.inline
  def apply(start: String): InitOpts = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOpts]
  }
  
  @scala.inline
  implicit class InitOptsOps[Self <: InitOpts] (val x: Self) extends AnyVal {
    
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
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCsv(value: Boolean): Self = this.set("csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
    
    @scala.inline
    def setCsvComponentPrefix(value: String): Self = this.set("csvComponentPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvComponentPrefix: Self = this.set("csvComponentPrefix", js.undefined)
    
    @scala.inline
    def setCustomFormat(value: Record[String, _]): Self = this.set("customFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFormat: Self = this.set("customFormat", js.undefined)
    
    @scala.inline
    def setCustomPath(value: String | ModuleInfo): Self = this.set("customPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomPath: Self = this.set("customPath", js.undefined)
    
    @scala.inline
    def setDevelopment(value: Boolean): Self = this.set("development", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevelopment: Self = this.set("development", js.undefined)
    
    @scala.inline
    def setDirect(value: Boolean): Self = this.set("direct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirect: Self = this.set("direct", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExcludePackages(value: String): Self = this.set("excludePackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludePackages: Self = this.set("excludePackages", js.undefined)
    
    @scala.inline
    def setExcludePrivatePackages(value: Boolean): Self = this.set("excludePrivatePackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludePrivatePackages: Self = this.set("excludePrivatePackages", js.undefined)
    
    @scala.inline
    def setFailOn(value: String): Self = this.set("failOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOn: Self = this.set("failOn", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setOnlyAllow(value: String): Self = this.set("onlyAllow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyAllow: Self = this.set("onlyAllow", js.undefined)
    
    @scala.inline
    def setOnlyunknown(value: Boolean): Self = this.set("onlyunknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyunknown: Self = this.set("onlyunknown", js.undefined)
    
    @scala.inline
    def setOut(value: String): Self = this.set("out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    
    @scala.inline
    def setPackages(value: String): Self = this.set("packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackages: Self = this.set("packages", js.undefined)
    
    @scala.inline
    def setProduction(value: Boolean): Self = this.set("production", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduction: Self = this.set("production", js.undefined)
    
    @scala.inline
    def setRelativeLicensePath(value: Boolean): Self = this.set("relativeLicensePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeLicensePath: Self = this.set("relativeLicensePath", js.undefined)
    
    @scala.inline
    def setSummary(value: Boolean): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setUnknown(value: Boolean): Self = this.set("unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknown: Self = this.set("unknown", js.undefined)
  }
}
