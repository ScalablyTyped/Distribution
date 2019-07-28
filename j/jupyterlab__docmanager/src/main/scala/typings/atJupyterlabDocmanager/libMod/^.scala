package typings.atJupyterlabDocmanager.libMod

import typings.atJupyterlabServices.libContentsMod.ContentsNs.IModel
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val IDocumentManager: Token[typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager] = js.native
  def isValidFileName(name: String): Boolean = js.native
  def renameDialog(manager: typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager, oldPath: String): js.Promise[IModel | Null] = js.native
  def renameFile(
    manager: typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager,
    oldPath: String,
    newPath: String
  ): js.Promise[IModel | Null] = js.native
  def shouldOverwrite(path: String): js.Promise[Boolean] = js.native
}

