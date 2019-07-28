package typings.atJupyterlabApputils.libDialogMod

import typings.atJupyterlabApputils.libDialogMod.DialogNs.IButton
import typings.atJupyterlabApputils.libDialogMod.DialogNs.IOptions
import typings.atJupyterlabApputils.libDialogMod.DialogNs.IResult
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/dialog", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def showDialog[T](): js.Promise[IResult[T]] = js.native
  def showDialog[T](options: Partial[IOptions[T]]): js.Promise[IResult[T]] = js.native
  def showErrorMessage(title: String, error: js.Any): js.Promise[Unit] = js.native
  def showErrorMessage(title: String, error: js.Any, buttons: js.Array[IButton]): js.Promise[Unit] = js.native
}

