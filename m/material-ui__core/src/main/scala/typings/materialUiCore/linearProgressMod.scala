package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.linearProgressLinearProgressMod.LinearProgressProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearProgressMod extends Shortcut {
  
  @JSImport("@material-ui/core/LinearProgress", JSImport.Default)
  @js.native
  val default: ComponentType[LinearProgressProps] = js.native
  
  type _To = ComponentType[LinearProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `linearProgressMod.foo` */
  override def _to: ComponentType[LinearProgressProps] = default
}
