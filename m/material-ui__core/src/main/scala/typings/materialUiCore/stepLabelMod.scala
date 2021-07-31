package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.stepLabelStepLabelMod.StepLabelProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepLabelMod extends Shortcut {
  
  @JSImport("@material-ui/core/StepLabel", JSImport.Default)
  @js.native
  val default: ComponentType[StepLabelProps] = js.native
  
  type _To = ComponentType[StepLabelProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepLabelMod.foo` */
  override def _to: ComponentType[StepLabelProps] = default
}
