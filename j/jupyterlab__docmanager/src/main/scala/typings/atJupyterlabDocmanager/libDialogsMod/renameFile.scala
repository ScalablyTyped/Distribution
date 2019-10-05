package typings.atJupyterlabDocmanager.libDialogsMod

import typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.atJupyterlabServices.libContentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/dialogs", "renameFile")
@js.native
object renameFile extends js.Object {
  def apply(manager: IDocumentManager, oldPath: String, newPath: String): js.Promise[IModel | Null] = js.native
}

