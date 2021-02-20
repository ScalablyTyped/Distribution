package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.stepStepMod.StepProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepMod extends Shortcut {
  
  @JSImport("@material-ui/core/Step", JSImport.Default)
  @js.native
  val default: ComponentType[StepProps] = js.native
  
  type _To = ComponentType[StepProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepMod.foo` */
  override def _to: ComponentType[StepProps] = default
}
