package typings.htmlReplaceWebpackPlugin

import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("html-replace-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ protected () extends StObject {
    def this(options: js.Array[HtmlReplaceWebpackPluginOption]) = this()
    def this(options: HtmlReplaceWebpackPluginOption) = this()
  }
  
  type HtmlReplaceWebpackPlugin = Plugin
  
  trait HtmlReplaceWebpackPluginOption extends StObject {
    
    var pattern: String | js.RegExp
    
    var replacement: String | ReplacementFunction
  }
  object HtmlReplaceWebpackPluginOption {
    
    inline def apply(pattern: String | js.RegExp, replacement: String | ReplacementFunction): HtmlReplaceWebpackPluginOption = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlReplaceWebpackPluginOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HtmlReplaceWebpackPluginOption] (val x: Self) extends AnyVal {
      
      inline def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setReplacement(value: String | ReplacementFunction): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    }
  }
  
  // Cannot have varargs in the middle of a type, so we need to unfortunately make the rest `any[]`
  // https://github.com/microsoft/TypeScript/issues/1360
  @js.native
  trait ReplacementFunction extends StObject {
    
    def apply(`match`: String, args: Any*): String = js.native
  }
}
