package typings.karmaNyanReporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * If you want to suppress the stack trace at the end of the test run you can use the suppressErrorReport option.
      * {@link https://github.com/dgarlitt/karma-nyan-reporter#options}
      */
    var nyanReporter: js.UndefOr[NyanCatOptions] = js.native
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
      def setNyanReporter(value: NyanCatOptions): Self = StObject.set(x, "nyanReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNyanReporterUndefined: Self = StObject.set(x, "nyanReporter", js.undefined)
    }
  }
  
  @js.native
  trait NyanCatOptions extends StObject {
    
    /**
      * increase the number of rainbow lines displayed
      * enforced min = 4, enforced max = terminal height - 1
      * @default 4
      */
    var numberOfRainbowLines: js.UndefOr[Double] = js.native
    
    /**
      * Only render the graphic after all tests have finished.
      * This is ideal for using this reporter in a continuous integration environment
      * @default false
      */
    var renderOnRunCompleteOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Suppress the red background on errors in the error
      * report at the end of the test run.
      * @default false
      */
    var suppressErrorHighlighting: js.UndefOr[Boolean] = js.native
    
    /**
      * suppress the error report at the end of the test run
      * @default false
      */
    var suppressErrorReport: js.UndefOr[Boolean] = js.native
  }
  object NyanCatOptions {
    
    @scala.inline
    def apply(): NyanCatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NyanCatOptions]
    }
    
    @scala.inline
    implicit class NyanCatOptionsMutableBuilder[Self <: NyanCatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumberOfRainbowLines(value: Double): Self = StObject.set(x, "numberOfRainbowLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfRainbowLinesUndefined: Self = StObject.set(x, "numberOfRainbowLines", js.undefined)
      
      @scala.inline
      def setRenderOnRunCompleteOnly(value: Boolean): Self = StObject.set(x, "renderOnRunCompleteOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderOnRunCompleteOnlyUndefined: Self = StObject.set(x, "renderOnRunCompleteOnly", js.undefined)
      
      @scala.inline
      def setSuppressErrorHighlighting(value: Boolean): Self = StObject.set(x, "suppressErrorHighlighting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressErrorHighlightingUndefined: Self = StObject.set(x, "suppressErrorHighlighting", js.undefined)
      
      @scala.inline
      def setSuppressErrorReport(value: Boolean): Self = StObject.set(x, "suppressErrorReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressErrorReportUndefined: Self = StObject.set(x, "suppressErrorReport", js.undefined)
    }
  }
}
