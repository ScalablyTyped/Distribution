package typings.markdownItEmoji

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.libMod.PluginSimple
import typings.markdownIt.libMod.PluginWithOptions
import typings.markdownItEmoji.mod.MarkdownItEmoji.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("markdown-it-emoji", JSImport.Namespace)
  @js.native
  val ^ : PluginSimple | PluginWithOptions[Options] = js.native
  
  object MarkdownItEmoji {
    
    @js.native
    trait Options extends StObject {
      
      var defs: js.UndefOr[Record[String, String]] = js.native
      
      var enabled: js.UndefOr[js.Array[String]] = js.native
      
      var shortcuts: js.UndefOr[Record[String, String | js.Array[String]]] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefs(value: Record[String, String]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
        
        @scala.inline
        def setEnabled(value: js.Array[String]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
        
        @scala.inline
        def setEnabledVarargs(value: String*): Self = StObject.set(x, "enabled", js.Array(value :_*))
        
        @scala.inline
        def setShortcuts(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      }
    }
  }
  
  type _To = PluginSimple | PluginWithOptions[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginSimple | PluginWithOptions[Options] = ^
}
