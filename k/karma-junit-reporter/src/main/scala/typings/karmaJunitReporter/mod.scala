package typings.karmaJunitReporter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ConfigOptions extends StObject {
    
    var junitReporter: js.UndefOr[JUnitReporterConfiguration] = js.undefined
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJunitReporter(value: JUnitReporterConfiguration): Self = StObject.set(x, "junitReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJunitReporterUndefined: Self = StObject.set(x, "junitReporter", js.undefined)
    }
  }
  
  trait JUnitReporterConfiguration extends StObject {
    
    /** function (browser, result) to customize the classname attribute in xml testcase element */
    var classNameFormatter: js.UndefOr[js.Function2[/* browser */ js.Any, /* result */ js.Any, String]] = js.undefined
    
    /** function (browser, result) to customize the name attribute in xml testcase element */
    var nameFormatter: js.UndefOr[js.Function2[/* browser */ js.Any, /* result */ js.Any, String]] = js.undefined
    
    /** results will be saved as $outputDir/$browserName.xml */
    var outputDir: js.UndefOr[String] = js.undefined
    
    /** if included, results will be saved as $outputDir/$browserName/$outputFile */
    var outputFile: js.UndefOr[String] = js.undefined
    
    /** key value pair of properties to add to the <properties> section of the report */
    var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    /** suite will become the package name attribute in xml testsuite element */
    var suite: js.UndefOr[String] = js.undefined
    
    /** add browser name to report and classes names */
    var useBrowserName: js.UndefOr[Boolean] = js.undefined
    
    /** use '1' if reporting to be per SonarQube 6.2 XML format */
    var xmlVersion: js.UndefOr[Double | Null] = js.undefined
  }
  object JUnitReporterConfiguration {
    
    @scala.inline
    def apply(): JUnitReporterConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JUnitReporterConfiguration]
    }
    
    @scala.inline
    implicit class JUnitReporterConfigurationMutableBuilder[Self <: JUnitReporterConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNameFormatter(value: (/* browser */ js.Any, /* result */ js.Any) => String): Self = StObject.set(x, "classNameFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClassNameFormatterUndefined: Self = StObject.set(x, "classNameFormatter", js.undefined)
      
      @scala.inline
      def setNameFormatter(value: (/* browser */ js.Any, /* result */ js.Any) => String): Self = StObject.set(x, "nameFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNameFormatterUndefined: Self = StObject.set(x, "nameFormatter", js.undefined)
      
      @scala.inline
      def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      @scala.inline
      def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
      
      @scala.inline
      def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setSuite(value: String): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuiteUndefined: Self = StObject.set(x, "suite", js.undefined)
      
      @scala.inline
      def setUseBrowserName(value: Boolean): Self = StObject.set(x, "useBrowserName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBrowserNameUndefined: Self = StObject.set(x, "useBrowserName", js.undefined)
      
      @scala.inline
      def setXmlVersion(value: Double): Self = StObject.set(x, "xmlVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlVersionNull: Self = StObject.set(x, "xmlVersion", null)
      
      @scala.inline
      def setXmlVersionUndefined: Self = StObject.set(x, "xmlVersion", js.undefined)
    }
  }
}
