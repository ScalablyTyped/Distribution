package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.mobileStepperMobileStepperMod.MobileStepperProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileStepperMod extends Shortcut {
  
  @JSImport("@material-ui/core/MobileStepper", JSImport.Default)
  @js.native
  val default: ComponentType[MobileStepperProps] = js.native
  
  type _To = ComponentType[MobileStepperProps]
  
  /* This means you don't have to write `default`, but can instead just say `mobileStepperMod.foo` */
  override def _to: ComponentType[MobileStepperProps] = default
}
