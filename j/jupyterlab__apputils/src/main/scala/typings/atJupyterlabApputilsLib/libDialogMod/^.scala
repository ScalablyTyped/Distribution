package typings
package atJupyterlabApputilsLib.libDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/dialog", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def showDialog[T](): js.Promise[atJupyterlabApputilsLib.libDialogMod.DialogNs.IResult[T]] = js.native
  def showDialog[T](options: stdLib.Partial[atJupyterlabApputilsLib.libDialogMod.DialogNs.IOptions[T]]): js.Promise[atJupyterlabApputilsLib.libDialogMod.DialogNs.IResult[T]] = js.native
  def showErrorMessage(title: java.lang.String, error: js.Any): js.Promise[scala.Unit] = js.native
}

