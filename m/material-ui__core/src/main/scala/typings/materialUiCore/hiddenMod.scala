package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.hiddenHiddenMod.HiddenProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenMod extends Shortcut {
  
  /**
    * Responsively hides children based on the selected implementation.
    * Demos:
    *
    * - [Hidden](https://mui.com/components/hidden/)
    *
    * API:
    *
    * - [Hidden API](https://mui.com/api/hidden/)
    */
  @JSImport("@material-ui/core/Hidden", JSImport.Default)
  @js.native
  val default: ComponentType[HiddenProps] = js.native
  
  type _To = ComponentType[HiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `hiddenMod.foo` */
  override def _to: ComponentType[HiddenProps] = default
}
