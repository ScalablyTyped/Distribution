package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.snackbarSnackbarMod.SnackbarProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarMod extends Shortcut {
  
  @JSImport("@material-ui/core/Snackbar", JSImport.Default)
  @js.native
  val default: ComponentType[SnackbarProps] = js.native
  
  type _To = ComponentType[SnackbarProps]
  
  /* This means you don't have to write `default`, but can instead just say `snackbarMod.foo` */
  override def _to: ComponentType[SnackbarProps] = default
}
