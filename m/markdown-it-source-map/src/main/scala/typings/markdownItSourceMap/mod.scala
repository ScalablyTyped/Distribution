package typings.markdownItSourceMap

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.libMod.PluginSimple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("markdown-it-source-map", JSImport.Default)
  @js.native
  val default: PluginSimple = js.native
  
  type _To = PluginSimple
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginSimple = default
}
