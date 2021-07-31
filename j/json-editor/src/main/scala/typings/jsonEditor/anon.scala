package typings.jsonEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Array extends StObject {
    
    var array: OptionsJSONEditorArrayOptions
    
    var `object`: Options
  }
  object Array {
    
    @scala.inline
    def apply(array: OptionsJSONEditorArrayOptions, `object`: Options): Array = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Array]
    }
    
    @scala.inline
    implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: OptionsJSONEditorArrayOptions): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: Options): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  trait BasePath extends StObject {
    
    var basePath: String
  }
  object BasePath {
    
    @scala.inline
    def apply(basePath: String): BasePath = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePath]
    }
    
    @scala.inline
    implicit class BasePathMutableBuilder[Self <: BasePath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Compile extends StObject {
    
    def compile(template: String): js.Function1[/* vars */ js.Any, String]
  }
  object Compile {
    
    @scala.inline
    def apply(compile: String => js.Function1[/* vars */ js.Any, String]): Compile = {
      val __obj = js.Dynamic.literal(compile = js.Any.fromFunction1(compile))
      __obj.asInstanceOf[Compile]
    }
    
    @scala.inline
    implicit class CompileMutableBuilder[Self <: Compile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompile(value: String => js.Function1[/* vars */ js.Any, String]): Self = StObject.set(x, "compile", js.Any.fromFunction1(value))
    }
  }
  
  trait EmoticonsEnabled extends StObject {
    
    var emoticonsEnabled: Boolean
  }
  object EmoticonsEnabled {
    
    @scala.inline
    def apply(emoticonsEnabled: Boolean): EmoticonsEnabled = {
      val __obj = js.Dynamic.literal(emoticonsEnabled = emoticonsEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmoticonsEnabled]
    }
    
    @scala.inline
    implicit class EmoticonsEnabledMutableBuilder[Self <: EmoticonsEnabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmoticonsEnabled(value: Boolean): Self = StObject.set(x, "emoticonsEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enable extends StObject {
    
    var enable: Boolean
  }
  object Enable {
    
    @scala.inline
    def apply(enable: Boolean): Enable = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enable]
    }
    
    @scala.inline
    implicit class EnableMutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var options: JSONEditorObjectOptions
  }
  object Options {
    
    @scala.inline
    def apply(options: JSONEditorObjectOptions): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: JSONEditorObjectOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsJSONEditorArrayOptions extends StObject {
    
    var options: JSONEditorArrayOptions
  }
  object OptionsJSONEditorArrayOptions {
    
    @scala.inline
    def apply(options: JSONEditorArrayOptions): OptionsJSONEditorArrayOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsJSONEditorArrayOptions]
    }
    
    @scala.inline
    implicit class OptionsJSONEditorArrayOptionsMutableBuilder[Self <: OptionsJSONEditorArrayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: JSONEditorArrayOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Theme extends StObject {
    
    var theme: String
  }
  object Theme {
    
    @scala.inline
    def apply(theme: String): Theme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
