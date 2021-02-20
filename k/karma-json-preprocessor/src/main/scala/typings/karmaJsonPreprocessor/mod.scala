package typings.karmaJsonPreprocessor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * see {@link https://github.com/mjeanroy/karma-json-preprocessor#configuration-1}
      */
    var jsonPreprocessor: js.UndefOr[JsonPreprocessorOptions] = js.native
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
      def setJsonPreprocessor(value: JsonPreprocessorOptions): Self = StObject.set(x, "jsonPreprocessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonPreprocessorUndefined: Self = StObject.set(x, "jsonPreprocessor", js.undefined)
    }
  }
  
  /**
    * Default global variable name is by default `__json__`,
    * but you can override it with your own name in karma configuration:
    */
  @js.native
  trait JsonPreprocessorOptions extends StObject {
    
    /**
      * @default ''
      */
    var stripPrefix: js.UndefOr[String] = js.native
    
    /**
      * @default '__json__'
      */
    var varName: js.UndefOr[String] = js.native
  }
  object JsonPreprocessorOptions {
    
    @scala.inline
    def apply(): JsonPreprocessorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonPreprocessorOptions]
    }
    
    @scala.inline
    implicit class JsonPreprocessorOptionsMutableBuilder[Self <: JsonPreprocessorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStripPrefix(value: String): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripPrefixUndefined: Self = StObject.set(x, "stripPrefix", js.undefined)
      
      @scala.inline
      def setVarName(value: String): Self = StObject.set(x, "varName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarNameUndefined: Self = StObject.set(x, "varName", js.undefined)
    }
  }
}
