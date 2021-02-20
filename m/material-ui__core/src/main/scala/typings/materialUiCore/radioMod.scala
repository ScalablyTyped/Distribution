package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.radioRadioMod.RadioProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod extends Shortcut {
  
  @JSImport("@material-ui/core/Radio", JSImport.Default)
  @js.native
  val default: ComponentType[RadioProps] = js.native
  
  type _To = ComponentType[RadioProps]
  
  /* This means you don't have to write `default`, but can instead just say `radioMod.foo` */
  override def _to: ComponentType[RadioProps] = default
}
