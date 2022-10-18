package typings.karmaNyanReporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object karmaMod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * If you want to suppress the stack trace at the end of the test run you can use the suppressErrorReport option.
      * {@link https://github.com/dgarlitt/karma-nyan-reporter#options}
      */
    var nyanReporter: js.UndefOr[NyanCatOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setNyanReporter(value: NyanCatOptions): Self = StObject.set(x, "nyanReporter", value.asInstanceOf[js.Any])
      
      inline def setNyanReporterUndefined: Self = StObject.set(x, "nyanReporter", js.undefined)
    }
  }
  
  trait NyanCatOptions extends StObject {
    
    /**
      * increase the number of rainbow lines displayed
      * enforced min = 4, enforced max = terminal height - 1
      * @default 4
      */
    var numberOfRainbowLines: js.UndefOr[Double] = js.undefined
    
    /**
      * Only render the graphic after all tests have finished.
      * This is ideal for using this reporter in a continuous integration environment
      * @default false
      */
    var renderOnRunCompleteOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the red background on errors in the error
      * report at the end of the test run.
      * @default false
      */
    var suppressErrorHighlighting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * suppress the error report at the end of the test run
      * @default false
      */
    var suppressErrorReport: js.UndefOr[Boolean] = js.undefined
  }
  object NyanCatOptions {
    
    inline def apply(): NyanCatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NyanCatOptions]
    }
    
    extension [Self <: NyanCatOptions](x: Self) {
      
      inline def setNumberOfRainbowLines(value: Double): Self = StObject.set(x, "numberOfRainbowLines", value.asInstanceOf[js.Any])
      
      inline def setNumberOfRainbowLinesUndefined: Self = StObject.set(x, "numberOfRainbowLines", js.undefined)
      
      inline def setRenderOnRunCompleteOnly(value: Boolean): Self = StObject.set(x, "renderOnRunCompleteOnly", value.asInstanceOf[js.Any])
      
      inline def setRenderOnRunCompleteOnlyUndefined: Self = StObject.set(x, "renderOnRunCompleteOnly", js.undefined)
      
      inline def setSuppressErrorHighlighting(value: Boolean): Self = StObject.set(x, "suppressErrorHighlighting", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorHighlightingUndefined: Self = StObject.set(x, "suppressErrorHighlighting", js.undefined)
      
      inline def setSuppressErrorReport(value: Boolean): Self = StObject.set(x, "suppressErrorReport", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorReportUndefined: Self = StObject.set(x, "suppressErrorReport", js.undefined)
    }
  }
}
