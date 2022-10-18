package typings.karmaBriefReporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object karmaMod {
  
  trait BriefReporterOptions extends StObject {
    
    /**
      * Print the test failures immediately instead of at the end
      * @default false
      */
    var earlyErrorReport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Omits stack frames from external dependencies like qunit,
      * jasmine or chai, which appear in stack traces of failed
      * tests and which are usually irrelevant to the tested code
      * @default false
      */
    var omitExternalStackFrames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only render the graphic after all tests have finished.
      * This is ideal for using this reporter in a continuous integration environment
      * @default false
      */
    var renderOnRunCompleteOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the browser console log at the end of the test run
      * @default false
      */
    var suppressBrowserLogs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the red background on errors in the error
      * report at the end of the test run.
      * @default false
      */
    var suppressErrorHighlighting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the error report at the end of the test run
      * @default false
      */
    var suppressErrorReport: js.UndefOr[Boolean] = js.undefined
  }
  object BriefReporterOptions {
    
    inline def apply(): BriefReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefReporterOptions]
    }
    
    extension [Self <: BriefReporterOptions](x: Self) {
      
      inline def setEarlyErrorReport(value: Boolean): Self = StObject.set(x, "earlyErrorReport", value.asInstanceOf[js.Any])
      
      inline def setEarlyErrorReportUndefined: Self = StObject.set(x, "earlyErrorReport", js.undefined)
      
      inline def setOmitExternalStackFrames(value: Boolean): Self = StObject.set(x, "omitExternalStackFrames", value.asInstanceOf[js.Any])
      
      inline def setOmitExternalStackFramesUndefined: Self = StObject.set(x, "omitExternalStackFrames", js.undefined)
      
      inline def setRenderOnRunCompleteOnly(value: Boolean): Self = StObject.set(x, "renderOnRunCompleteOnly", value.asInstanceOf[js.Any])
      
      inline def setRenderOnRunCompleteOnlyUndefined: Self = StObject.set(x, "renderOnRunCompleteOnly", js.undefined)
      
      inline def setSuppressBrowserLogs(value: Boolean): Self = StObject.set(x, "suppressBrowserLogs", value.asInstanceOf[js.Any])
      
      inline def setSuppressBrowserLogsUndefined: Self = StObject.set(x, "suppressBrowserLogs", js.undefined)
      
      inline def setSuppressErrorHighlighting(value: Boolean): Self = StObject.set(x, "suppressErrorHighlighting", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorHighlightingUndefined: Self = StObject.set(x, "suppressErrorHighlighting", js.undefined)
      
      inline def setSuppressErrorReport(value: Boolean): Self = StObject.set(x, "suppressErrorReport", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorReportUndefined: Self = StObject.set(x, "suppressErrorReport", js.undefined)
    }
  }
  
  trait ConfigOptions extends StObject {
    
    /**
      * Reports test progress statistics and lists failures at the end of a Karma test run.
      * {@link https://github.com/prantlf/karma-brief-reporter#options}
      */
    var briefReporter: js.UndefOr[BriefReporterOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setBriefReporter(value: BriefReporterOptions): Self = StObject.set(x, "briefReporter", value.asInstanceOf[js.Any])
      
      inline def setBriefReporterUndefined: Self = StObject.set(x, "briefReporter", js.undefined)
    }
  }
}
