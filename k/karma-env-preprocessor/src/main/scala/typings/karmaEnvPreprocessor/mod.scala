package typings.karmaEnvPreprocessor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * environment variables available to your tests
      * {@link https://github.com/jsok/karma-env-preprocessor#configuration}
      */
    var envPreprocessor: js.UndefOr[js.Array[String]] = js.undefined
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
      def setEnvPreprocessor(value: js.Array[String]): Self = StObject.set(x, "envPreprocessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvPreprocessorUndefined: Self = StObject.set(x, "envPreprocessor", js.undefined)
      
      @scala.inline
      def setEnvPreprocessorVarargs(value: String*): Self = StObject.set(x, "envPreprocessor", js.Array(value :_*))
    }
  }
}
