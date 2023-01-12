package typings.jasmineReporters

import typings.jasmine.jasmine.CustomReporter
import typings.jasmine.jasmine.SpecResult
import typings.jasmine.jasmine.SuiteResult
import typings.jasmineReporters.jasmineReportersInts.`0`
import typings.jasmineReporters.jasmineReportersInts.`1`
import typings.jasmineReporters.jasmineReportersInts.`2`
import typings.jasmineReporters.jasmineReportersInts.`3`
import typings.jasmineReporters.mod.AppVeyorReporter.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jasmine-reporters", "AppVeyorReporter")
  @js.native
  open class AppVeyorReporter ()
    extends StObject
       with CustomReporter {
    def this(options: ConstructorOptions) = this()
  }
  object AppVeyorReporter {
    
    trait ConstructorOptions extends StObject {
      
      var batchSize: js.UndefOr[Double] = js.undefined
      
      var color: js.UndefOr[Boolean] = js.undefined
      
      var verbosity: js.UndefOr[`0` | `1` | `2`] = js.undefined
    }
    object ConstructorOptions {
      
      inline def apply(): ConstructorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConstructorOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
        
        inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
        
        inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
        
        inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setVerbosity(value: `0` | `1` | `2`): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
        
        inline def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
      }
    }
  }
  
  @JSImport("jasmine-reporters", "JUnitXmlReporter")
  @js.native
  open class JUnitXmlReporter ()
    extends StObject
       with CustomReporter {
    def this(options: typings.jasmineReporters.mod.JUnitXmlReporter.ConstructorOptions) = this()
  }
  object JUnitXmlReporter {
    
    trait ConstructorOptions extends StObject {
      
      @JSName("package")
      var _package: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
      
      var captureStdout: js.UndefOr[Boolean] = js.undefined
      
      var consolidate: js.UndefOr[Boolean] = js.undefined
      
      var consolidateAll: js.UndefOr[Boolean] = js.undefined
      
      var filePrefix: js.UndefOr[String] = js.undefined
      
      var modifyReportFileName: js.UndefOr[js.Function2[/* reportFileName */ String, /* suite */ SuiteResult, String]] = js.undefined
      
      var modifySuiteName: js.UndefOr[js.Function2[/* suiteName */ String, /* suite */ SuiteResult, String]] = js.undefined
      
      var savePath: js.UndefOr[String] = js.undefined
      
      var stylesheetPath: js.UndefOr[Boolean | String] = js.undefined
      
      var suppressDisabled: js.UndefOr[Boolean] = js.undefined
      
      var systemOut: js.UndefOr[js.Function2[/* spec */ SpecResult, /* suiteName */ String, String]] = js.undefined
      
      var useDotNotation: js.UndefOr[Boolean] = js.undefined
      
      var useFullTestName: js.UndefOr[Boolean] = js.undefined
    }
    object ConstructorOptions {
      
      inline def apply(): typings.jasmineReporters.mod.JUnitXmlReporter.ConstructorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jasmineReporters.mod.JUnitXmlReporter.ConstructorOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.jasmineReporters.mod.JUnitXmlReporter.ConstructorOptions] (val x: Self) extends AnyVal {
        
        inline def setCaptureStdout(value: Boolean): Self = StObject.set(x, "captureStdout", value.asInstanceOf[js.Any])
        
        inline def setCaptureStdoutUndefined: Self = StObject.set(x, "captureStdout", js.undefined)
        
        inline def setConsolidate(value: Boolean): Self = StObject.set(x, "consolidate", value.asInstanceOf[js.Any])
        
        inline def setConsolidateAll(value: Boolean): Self = StObject.set(x, "consolidateAll", value.asInstanceOf[js.Any])
        
        inline def setConsolidateAllUndefined: Self = StObject.set(x, "consolidateAll", js.undefined)
        
        inline def setConsolidateUndefined: Self = StObject.set(x, "consolidate", js.undefined)
        
        inline def setFilePrefix(value: String): Self = StObject.set(x, "filePrefix", value.asInstanceOf[js.Any])
        
        inline def setFilePrefixUndefined: Self = StObject.set(x, "filePrefix", js.undefined)
        
        inline def setModifyReportFileName(value: (/* reportFileName */ String, /* suite */ SuiteResult) => String): Self = StObject.set(x, "modifyReportFileName", js.Any.fromFunction2(value))
        
        inline def setModifyReportFileNameUndefined: Self = StObject.set(x, "modifyReportFileName", js.undefined)
        
        inline def setModifySuiteName(value: (/* suiteName */ String, /* suite */ SuiteResult) => String): Self = StObject.set(x, "modifySuiteName", js.Any.fromFunction2(value))
        
        inline def setModifySuiteNameUndefined: Self = StObject.set(x, "modifySuiteName", js.undefined)
        
        inline def setSavePath(value: String): Self = StObject.set(x, "savePath", value.asInstanceOf[js.Any])
        
        inline def setSavePathUndefined: Self = StObject.set(x, "savePath", js.undefined)
        
        inline def setStylesheetPath(value: Boolean | String): Self = StObject.set(x, "stylesheetPath", value.asInstanceOf[js.Any])
        
        inline def setStylesheetPathUndefined: Self = StObject.set(x, "stylesheetPath", js.undefined)
        
        inline def setSuppressDisabled(value: Boolean): Self = StObject.set(x, "suppressDisabled", value.asInstanceOf[js.Any])
        
        inline def setSuppressDisabledUndefined: Self = StObject.set(x, "suppressDisabled", js.undefined)
        
        inline def setSystemOut(value: (/* spec */ SpecResult, /* suiteName */ String) => String): Self = StObject.set(x, "systemOut", js.Any.fromFunction2(value))
        
        inline def setSystemOutUndefined: Self = StObject.set(x, "systemOut", js.undefined)
        
        inline def setUseDotNotation(value: Boolean): Self = StObject.set(x, "useDotNotation", value.asInstanceOf[js.Any])
        
        inline def setUseDotNotationUndefined: Self = StObject.set(x, "useDotNotation", js.undefined)
        
        inline def setUseFullTestName(value: Boolean): Self = StObject.set(x, "useFullTestName", value.asInstanceOf[js.Any])
        
        inline def setUseFullTestNameUndefined: Self = StObject.set(x, "useFullTestName", js.undefined)
        
        inline def set_package(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
        
        inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
        
        inline def set_packageVarargs(value: String*): Self = StObject.set(x, "package", js.Array(value*))
      }
    }
  }
  
  @JSImport("jasmine-reporters", "NUnitXmlReporter")
  @js.native
  open class NUnitXmlReporter ()
    extends StObject
       with CustomReporter {
    def this(options: typings.jasmineReporters.mod.NUnitXmlReporter.ConstructorOptions) = this()
  }
  object NUnitXmlReporter {
    
    trait ConstructorOptions extends StObject {
      
      var filename: js.UndefOr[String] = js.undefined
      
      var reportName: js.UndefOr[String] = js.undefined
      
      var savePath: js.UndefOr[String] = js.undefined
    }
    object ConstructorOptions {
      
      inline def apply(): typings.jasmineReporters.mod.NUnitXmlReporter.ConstructorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jasmineReporters.mod.NUnitXmlReporter.ConstructorOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.jasmineReporters.mod.NUnitXmlReporter.ConstructorOptions] (val x: Self) extends AnyVal {
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
        
        inline def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
        
        inline def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
        
        inline def setSavePath(value: String): Self = StObject.set(x, "savePath", value.asInstanceOf[js.Any])
        
        inline def setSavePathUndefined: Self = StObject.set(x, "savePath", js.undefined)
      }
    }
  }
  
  @JSImport("jasmine-reporters", "TapReporter")
  @js.native
  open class TapReporter ()
    extends StObject
       with CustomReporter
  
  @JSImport("jasmine-reporters", "TeamCityReporter")
  @js.native
  open class TeamCityReporter ()
    extends StObject
       with CustomReporter {
    def this(options: typings.jasmineReporters.mod.TeamCityReporter.ConstructorOptions) = this()
  }
  object TeamCityReporter {
    
    trait ConstructorOptions extends StObject {
      
      var modifySuiteName: js.UndefOr[js.Function2[/* suiteName */ String, /* suite */ SuiteResult, String]] = js.undefined
    }
    object ConstructorOptions {
      
      inline def apply(): typings.jasmineReporters.mod.TeamCityReporter.ConstructorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jasmineReporters.mod.TeamCityReporter.ConstructorOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.jasmineReporters.mod.TeamCityReporter.ConstructorOptions] (val x: Self) extends AnyVal {
        
        inline def setModifySuiteName(value: (/* suiteName */ String, /* suite */ SuiteResult) => String): Self = StObject.set(x, "modifySuiteName", js.Any.fromFunction2(value))
        
        inline def setModifySuiteNameUndefined: Self = StObject.set(x, "modifySuiteName", js.undefined)
      }
    }
  }
  
  @JSImport("jasmine-reporters", "TerminalReporter")
  @js.native
  open class TerminalReporter ()
    extends StObject
       with CustomReporter {
    def this(options: typings.jasmineReporters.mod.TerminalReporter.ConstructorOptions) = this()
  }
  object TerminalReporter {
    
    trait ConstructorOptions extends StObject {
      
      var color: js.UndefOr[Boolean] = js.undefined
      
      var showStack: js.UndefOr[Boolean] = js.undefined
      
      var verbosity: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
    }
    object ConstructorOptions {
      
      inline def apply(): typings.jasmineReporters.mod.TerminalReporter.ConstructorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jasmineReporters.mod.TerminalReporter.ConstructorOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.jasmineReporters.mod.TerminalReporter.ConstructorOptions] (val x: Self) extends AnyVal {
        
        inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
        
        inline def setShowStackUndefined: Self = StObject.set(x, "showStack", js.undefined)
        
        inline def setVerbosity(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
        
        inline def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
      }
    }
  }
}
