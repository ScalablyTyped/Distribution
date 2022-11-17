package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonGroupButtonGroupMod.ButtonGroupTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Button Group](https://mui.com/components/button-group/)
    *
    * API:
    *
    * - [ButtonGroup API](https://mui.com/api/button-group/)
    */
  @JSImport("@material-ui/core/ButtonGroup", JSImport.Default)
  @js.native
  val default: OverridableComponent[ButtonGroupTypeMap[js.Object, "div"]] = js.native
  
  type _To = OverridableComponent[ButtonGroupTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `buttonGroupMod.foo` */
  override def _to: OverridableComponent[ButtonGroupTypeMap[js.Object, "div"]] = default
}
