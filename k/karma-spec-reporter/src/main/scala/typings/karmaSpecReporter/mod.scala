package typings.karmaSpecReporter

import typings.karmaSpecReporter.anon.Failure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * {@link https://github.com/mlex/karma-spec-reporter#configuration}
      */
    var specReporter: js.UndefOr[SpecReporterOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setSpecReporter(value: SpecReporterOptions): Self = StObject.set(x, "specReporter", value.asInstanceOf[js.Any])
      
      inline def setSpecReporterUndefined: Self = StObject.set(x, "specReporter", js.undefined)
    }
  }
  
  trait SpecReporterOptions extends StObject {
    
    /** test would finish with error when a first fail occurs */
    var failFast: js.UndefOr[Boolean] = js.undefined
    
    /** limit number of lines logged per test */
    var maxLogLines: js.UndefOr[Double] = js.undefined
    
    /** custom prefixes to use when reporting passed/failed/skipped prefixes */
    var prefixes: js.UndefOr[Failure] = js.undefined
    
    /** print the time elapsed for each spec */
    var showSpecTiming: js.UndefOr[Boolean] = js.undefined
    
    /** do not print error summary */
    var suppressErrorSummary: js.UndefOr[Boolean] = js.undefined
    
    /** do not print information about failed tests */
    var suppressFailed: js.UndefOr[Boolean] = js.undefined
    
    /** do not print information about passed tests */
    var suppressPassed: js.UndefOr[Boolean] = js.undefined
    
    /** do not print information about skipped tests */
    var suppressSkipped: js.UndefOr[Boolean] = js.undefined
  }
  object SpecReporterOptions {
    
    inline def apply(): SpecReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecReporterOptions]
    }
    
    extension [Self <: SpecReporterOptions](x: Self) {
      
      inline def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
      
      inline def setFailFastUndefined: Self = StObject.set(x, "failFast", js.undefined)
      
      inline def setMaxLogLines(value: Double): Self = StObject.set(x, "maxLogLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLogLinesUndefined: Self = StObject.set(x, "maxLogLines", js.undefined)
      
      inline def setPrefixes(value: Failure): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      inline def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
      
      inline def setShowSpecTiming(value: Boolean): Self = StObject.set(x, "showSpecTiming", value.asInstanceOf[js.Any])
      
      inline def setShowSpecTimingUndefined: Self = StObject.set(x, "showSpecTiming", js.undefined)
      
      inline def setSuppressErrorSummary(value: Boolean): Self = StObject.set(x, "suppressErrorSummary", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorSummaryUndefined: Self = StObject.set(x, "suppressErrorSummary", js.undefined)
      
      inline def setSuppressFailed(value: Boolean): Self = StObject.set(x, "suppressFailed", value.asInstanceOf[js.Any])
      
      inline def setSuppressFailedUndefined: Self = StObject.set(x, "suppressFailed", js.undefined)
      
      inline def setSuppressPassed(value: Boolean): Self = StObject.set(x, "suppressPassed", value.asInstanceOf[js.Any])
      
      inline def setSuppressPassedUndefined: Self = StObject.set(x, "suppressPassed", js.undefined)
      
      inline def setSuppressSkipped(value: Boolean): Self = StObject.set(x, "suppressSkipped", value.asInstanceOf[js.Any])
      
      inline def setSuppressSkippedUndefined: Self = StObject.set(x, "suppressSkipped", js.undefined)
    }
  }
}
