package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.inputAdornmentInputAdornmentMod.InputAdornmentTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputAdornmentMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [InputAdornment API](https://mui.com/api/input-adornment/)
    */
  @JSImport("@material-ui/core/InputAdornment", JSImport.Default)
  @js.native
  val default: OverridableComponent[InputAdornmentTypeMap[js.Object, "div"]] = js.native
  
  type _To = OverridableComponent[InputAdornmentTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `inputAdornmentMod.foo` */
  override def _to: OverridableComponent[InputAdornmentTypeMap[js.Object, "div"]] = default
}
