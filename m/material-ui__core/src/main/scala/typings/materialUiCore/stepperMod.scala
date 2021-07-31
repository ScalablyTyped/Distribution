package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.stepperStepperMod.StepperProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperMod extends Shortcut {
  
  @JSImport("@material-ui/core/Stepper", JSImport.Default)
  @js.native
  val default: ComponentType[StepperProps] = js.native
  
  type _To = ComponentType[StepperProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepperMod.foo` */
  override def _to: ComponentType[StepperProps] = default
}
