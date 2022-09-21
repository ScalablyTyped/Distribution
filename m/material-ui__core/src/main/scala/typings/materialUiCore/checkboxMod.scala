package typings.materialUiCore

import typings.materialUiCore.checkboxCheckboxMod.CheckboxProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("@material-ui/core/Checkbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CheckboxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
