package typings.materialUiCore

import typings.materialUiCore.inputInputMod.InputProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@material-ui/core/Input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: InputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
