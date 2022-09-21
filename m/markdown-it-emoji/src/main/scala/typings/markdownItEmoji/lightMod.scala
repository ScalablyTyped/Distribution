package typings.markdownItEmoji

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.libMod.PluginSimple
import typings.markdownIt.libMod.PluginWithOptions
import typings.markdownItEmoji.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightMod extends Shortcut {
  
  @JSImport("markdown-it-emoji/light", JSImport.Namespace)
  @js.native
  val ^ : PluginSimple | PluginWithOptions[Options] = js.native
  
  type _To = PluginSimple | PluginWithOptions[Options]
  
  /* This means you don't have to write `^`, but can instead just say `lightMod.foo` */
  override def _to: PluginSimple | PluginWithOptions[Options] = ^
}
