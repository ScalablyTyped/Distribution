package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.checkboxCheckboxMod.CheckboxProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod extends Shortcut {
  
  @JSImport("@material-ui/core/Checkbox", JSImport.Default)
  @js.native
  val default: ComponentType[CheckboxProps] = js.native
  
  type _To = ComponentType[CheckboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkboxMod.foo` */
  override def _to: ComponentType[CheckboxProps] = default
}
