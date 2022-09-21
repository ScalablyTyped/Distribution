package typings.markdownIt

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.libMod.MarkdownItConstructor
import typings.markdownIt.libMod.Options
import typings.markdownIt.libMod.PresetName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object markdownit extends Shortcut {
    
    @JSGlobal("markdownit")
    @js.native
    val ^ : js.Object & MarkdownItConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("markdownit")
    @js.native
    open class Class ()
      extends StObject
         with MarkdownIt {
      def this(options: Options) = this()
      def this(presetName: PresetName) = this()
      def this(presetName: PresetName, options: Options) = this()
    }
    
    type _To = js.Object & MarkdownItConstructor
    
    /* This means you don't have to write `^`, but can instead just say `markdownit.foo` */
    override def _to: js.Object & MarkdownItConstructor = ^
  }
}
