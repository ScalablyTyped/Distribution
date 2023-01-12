package typings.markdownItEmoji

import typings.markdownIt.libMod.PluginSimple
import typings.markdownIt.libMod.PluginWithOptions
import typings.markdownItEmoji.anon._empty
import typings.markdownItEmoji.markdownItEmojiStrings.angry
import typings.markdownItEmoji.markdownItEmojiStrings.blush
import typings.markdownItEmoji.markdownItEmojiStrings.broken_heart
import typings.markdownItEmoji.markdownItEmojiStrings.confused
import typings.markdownItEmoji.markdownItEmojiStrings.cry
import typings.markdownItEmoji.markdownItEmojiStrings.frowning
import typings.markdownItEmoji.markdownItEmojiStrings.heart
import typings.markdownItEmoji.markdownItEmojiStrings.imp
import typings.markdownItEmoji.markdownItEmojiStrings.innocent
import typings.markdownItEmoji.markdownItEmojiStrings.joy
import typings.markdownItEmoji.markdownItEmojiStrings.kissing
import typings.markdownItEmoji.markdownItEmojiStrings.laughing
import typings.markdownItEmoji.markdownItEmojiStrings.neutral_face
import typings.markdownItEmoji.markdownItEmojiStrings.open_mouth
import typings.markdownItEmoji.markdownItEmojiStrings.rage
import typings.markdownItEmoji.markdownItEmojiStrings.smile
import typings.markdownItEmoji.markdownItEmojiStrings.smiley
import typings.markdownItEmoji.markdownItEmojiStrings.smiling_imp
import typings.markdownItEmoji.markdownItEmojiStrings.sob
import typings.markdownItEmoji.markdownItEmojiStrings.stuck_out_tongue
import typings.markdownItEmoji.markdownItEmojiStrings.sunglasses
import typings.markdownItEmoji.markdownItEmojiStrings.sweat
import typings.markdownItEmoji.markdownItEmojiStrings.sweat_smile
import typings.markdownItEmoji.markdownItEmojiStrings.unamused
import typings.markdownItEmoji.markdownItEmojiStrings.wink
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod
  extends org.scalablytyped.runtime.Shortcut {
  
  @JSImport("markdown-it-emoji", JSImport.Namespace)
  @js.native
  val ^ : PluginSimple | PluginWithOptions[Options] = js.native
  
  type LiteralUnion[T /* <: U */, U] = T | (U & _empty)
  
  trait Options extends StObject {
    
    var defs: js.UndefOr[Record[String, String]] = js.undefined
    
    var enabled: js.UndefOr[js.Array[String]] = js.undefined
    
    var shortcuts: js.UndefOr[Shortcuts] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDefs(value: Record[String, String]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
      
      inline def setEnabled(value: js.Array[String]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEnabledVarargs(value: String*): Self = StObject.set(x, "enabled", js.Array(value*))
      
      inline def setShortcuts(value: Shortcuts): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in K ]:? T | std.Array<T>}
    }}}
    */
  @js.native
  trait PartialRecord[K /* <: /* keyof any */ String */, T] extends StObject
  
  type Shortcut = LiteralUnion[
    angry | blush | broken_heart | confused | cry | frowning | heart | imp | innocent | joy | kissing | laughing | neutral_face | open_mouth | rage | smile | smiley | smiling_imp | sob | stuck_out_tongue | sunglasses | sweat_smile | sweat | unamused | wink, 
    String
  ]
  
  type Shortcuts = PartialRecord[Shortcut, String]
  
  type _To = PluginSimple | PluginWithOptions[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginSimple | PluginWithOptions[Options] = ^
}
