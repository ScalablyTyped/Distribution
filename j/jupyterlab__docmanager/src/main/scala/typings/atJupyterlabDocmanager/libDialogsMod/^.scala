package typings.atJupyterlabDocmanager.libDialogsMod

import typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/dialogs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isValidFileName(name: String): Boolean = js.native
  def renameDialog(manager: IDocumentManager, oldPath: String): js.Promise[IModel | Null] = js.native
  def renameFile(manager: IDocumentManager, oldPath: String, newPath: String): js.Promise[IModel | Null] = js.native
  def shouldOverwrite(path: String): js.Promise[Boolean] = js.native
}

