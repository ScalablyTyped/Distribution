package typings.markdownItHighlightjs

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.libMod.PluginWithOptions
import typings.markdownItHighlightjs.anon.Auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("markdown-it-highlightjs", JSImport.Namespace)
  @js.native
  val ^ : PluginWithOptions[Auto] = js.native
  
  type _To = PluginWithOptions[Auto]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginWithOptions[Auto] = ^
}
