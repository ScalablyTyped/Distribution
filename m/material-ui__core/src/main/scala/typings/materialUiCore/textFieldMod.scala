package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.textFieldTextFieldMod.TextFieldProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldMod extends Shortcut {
  
  @JSImport("@material-ui/core/TextField", JSImport.Default)
  @js.native
  val default: ComponentType[TextFieldProps] = js.native
  
  type _To = ComponentType[TextFieldProps]
  
  /* This means you don't have to write `default`, but can instead just say `textFieldMod.foo` */
  override def _to: ComponentType[TextFieldProps] = default
}
