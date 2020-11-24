package typings.jupyterlabApputils.mod

import typings.jupyterlabApputils.dialogMod.Dialog.IOptions
import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils", "showDialog")
@js.native
object showDialog extends js.Object {
  
  def apply[T](): js.Promise[IResult[T]] = js.native
  def apply[T](options: Partial[IOptions[T]]): js.Promise[IResult[T]] = js.native
}
