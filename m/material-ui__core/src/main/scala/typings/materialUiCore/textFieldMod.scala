package typings.materialUiCore

import typings.materialUiCore.textFieldTextFieldMod.TextFieldProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldMod {
  
  @JSImport("@material-ui/core/TextField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TextFieldProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
