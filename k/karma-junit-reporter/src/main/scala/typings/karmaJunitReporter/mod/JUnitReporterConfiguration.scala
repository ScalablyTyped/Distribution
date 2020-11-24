package typings.karmaJunitReporter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JUnitReporterConfiguration extends js.Object {
  
  /** function (browser, result) to customize the classname attribute in xml testcase element */
  var classNameFormatter: js.UndefOr[js.Function2[/* browser */ js.Any, /* result */ js.Any, String]] = js.native
  
  /** function (browser, result) to customize the name attribute in xml testcase element */
  var nameFormatter: js.UndefOr[js.Function2[/* browser */ js.Any, /* result */ js.Any, String]] = js.native
  
  /** results will be saved as $outputDir/$browserName.xml */
  var outputDir: js.UndefOr[String] = js.native
  
  /** if included, results will be saved as $outputDir/$browserName/$outputFile */
  var outputFile: js.UndefOr[String] = js.native
  
  /** key value pair of properties to add to the <properties> section of the report */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /** suite will become the package name attribute in xml testsuite element */
  var suite: js.UndefOr[String] = js.native
  
  /** add browser name to report and classes names */
  var useBrowserName: js.UndefOr[Boolean] = js.native
  
  /** use '1' if reporting to be per SonarQube 6.2 XML format */
  var xmlVersion: js.UndefOr[Double | Null] = js.native
}
object JUnitReporterConfiguration {
  
  @scala.inline
  def apply(): JUnitReporterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JUnitReporterConfiguration]
  }
  
  @scala.inline
  implicit class JUnitReporterConfigurationOps[Self <: JUnitReporterConfiguration] (val x: Self) extends AnyVal {
    
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
    def setClassNameFormatter(value: (/* browser */ js.Any, /* result */ js.Any) => String): Self = this.set("classNameFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteClassNameFormatter: Self = this.set("classNameFormatter", js.undefined)
    
    @scala.inline
    def setNameFormatter(value: (/* browser */ js.Any, /* result */ js.Any) => String): Self = this.set("nameFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteNameFormatter: Self = this.set("nameFormatter", js.undefined)
    
    @scala.inline
    def setOutputDir(value: String): Self = this.set("outputDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDir: Self = this.set("outputDir", js.undefined)
    
    @scala.inline
    def setOutputFile(value: String): Self = this.set("outputFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFile: Self = this.set("outputFile", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[js.Any]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setSuite(value: String): Self = this.set("suite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuite: Self = this.set("suite", js.undefined)
    
    @scala.inline
    def setUseBrowserName(value: Boolean): Self = this.set("useBrowserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBrowserName: Self = this.set("useBrowserName", js.undefined)
    
    @scala.inline
    def setXmlVersion(value: Double): Self = this.set("xmlVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlVersion: Self = this.set("xmlVersion", js.undefined)
    
    @scala.inline
    def setXmlVersionNull: Self = this.set("xmlVersion", null)
  }
}
