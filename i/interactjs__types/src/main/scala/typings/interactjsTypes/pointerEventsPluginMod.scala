package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.coreScopeMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventsPluginMod extends Shortcut {
  
  @JSImport("@interactjs/pointer-events/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `pointerEventsPluginMod.foo` */
  override def _to: Plugin = default
}
