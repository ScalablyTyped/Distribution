package typings.jupyterlabApputils.dialogMod

import typings.jupyterlabApputils.dialogMod.Dialog.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils/lib/dialog", "showErrorMessage")
@js.native
object showErrorMessage extends js.Object {
  
  def apply(title: String, error: js.Any): js.Promise[Unit] = js.native
  def apply(title: String, error: js.Any, buttons: js.Array[IButton]): js.Promise[Unit] = js.native
}
