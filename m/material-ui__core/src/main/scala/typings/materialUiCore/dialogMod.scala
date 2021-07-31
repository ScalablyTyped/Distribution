package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.dialogDialogMod.DialogProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod extends Shortcut {
  
  @JSImport("@material-ui/core/Dialog", JSImport.Default)
  @js.native
  val default: ComponentType[DialogProps] = js.native
  
  type _To = ComponentType[DialogProps]
  
  /* This means you don't have to write `default`, but can instead just say `dialogMod.foo` */
  override def _to: ComponentType[DialogProps] = default
}
