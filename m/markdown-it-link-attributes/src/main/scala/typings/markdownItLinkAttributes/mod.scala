package typings.markdownItLinkAttributes

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.libMod.PluginWithOptions
import typings.markdownItLinkAttributes.anon.DefaultRender
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("markdown-it-link-attributes", JSImport.Namespace)
  @js.native
  val ^ : (PluginWithOptions[Config | js.Array[Config]]) & DefaultRender = js.native
  
  trait Config extends StObject {
    
    var attrs: Record[String, String]
  }
  object Config {
    
    inline def apply(attrs: Record[String, String]): Config = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAttrs(value: Record[String, String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = (PluginWithOptions[Config | js.Array[Config]]) & DefaultRender
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: (PluginWithOptions[Config | js.Array[Config]]) & DefaultRender = ^
}
