package typings.markdownItEmoji

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.libMod.PluginSimple
import typings.markdownIt.libMod.PluginWithOptions
import typings.markdownItEmoji.mod.MarkdownItEmoji.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("markdown-it-emoji", JSImport.Namespace)
  @js.native
  val ^ : PluginSimple | PluginWithOptions[Options] = js.native
  
  object MarkdownItEmoji {
    
    trait Options extends StObject {
      
      var defs: js.UndefOr[Record[String, String]] = js.undefined
      
      var enabled: js.UndefOr[js.Array[String]] = js.undefined
      
      var shortcuts: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setDefs(value: Record[String, String]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
        
        inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
        
        inline def setEnabled(value: js.Array[String]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
        
        inline def setEnabledVarargs(value: String*): Self = StObject.set(x, "enabled", js.Array(value :_*))
        
        inline def setShortcuts(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
        
        inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      }
    }
  }
  
  type _To = PluginSimple | PluginWithOptions[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginSimple | PluginWithOptions[Options] = ^
}
