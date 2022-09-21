package typings.materialUiCore

import typings.materialUiCore.stepperStepperMod.StepperProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperMod {
  
  @JSImport("@material-ui/core/Stepper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: StepperProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
