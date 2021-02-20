package typings.karmaJasmineHtmlReporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * In combination with multiple reporters you may want to disable failed messages
      * because it's already handled by another reporter
      * See {@link https://github.com/dfederm/karma-jasmine-html-reporter#with-options}
      */
    var jasmineHtmlReporter: js.UndefOr[JasmineHtmlReporterOptions] = js.native
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
      def setJasmineHtmlReporter(value: JasmineHtmlReporterOptions): Self = StObject.set(x, "jasmineHtmlReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJasmineHtmlReporterUndefined: Self = StObject.set(x, "jasmineHtmlReporter", js.undefined)
    }
  }
  
  @js.native
  trait JasmineHtmlReporterOptions extends StObject {
    
    /**
      * Suppress all messages (overrides other suppress settings)
      */
    var suppressAll: js.UndefOr[Boolean] = js.native
    
    /** Suppress failed messages */
    var suppressFailed: js.UndefOr[Boolean] = js.native
  }
  object JasmineHtmlReporterOptions {
    
    @scala.inline
    def apply(): JasmineHtmlReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JasmineHtmlReporterOptions]
    }
    
    @scala.inline
    implicit class JasmineHtmlReporterOptionsMutableBuilder[Self <: JasmineHtmlReporterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSuppressAll(value: Boolean): Self = StObject.set(x, "suppressAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressAllUndefined: Self = StObject.set(x, "suppressAll", js.undefined)
      
      @scala.inline
      def setSuppressFailed(value: Boolean): Self = StObject.set(x, "suppressFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressFailedUndefined: Self = StObject.set(x, "suppressFailed", js.undefined)
    }
  }
}
