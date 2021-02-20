package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.stepButtonStepButtonMod.StepButtonProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepButtonMod extends Shortcut {
  
  @JSImport("@material-ui/core/StepButton", JSImport.Default)
  @js.native
  val default: ComponentType[StepButtonProps] = js.native
  
  type _To = ComponentType[StepButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepButtonMod.foo` */
  override def _to: ComponentType[StepButtonProps] = default
}
