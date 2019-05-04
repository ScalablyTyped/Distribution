package typings
package atJupyterlabDocmanagerLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val IDocumentManager: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[atJupyterlabDocmanagerLib.libManagerMod.IDocumentManager] = js.native
  def getOpenPath(contentsManager: js.Any): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def isValidFileName(name: java.lang.String): scala.Boolean = js.native
  def renameDialog(manager: atJupyterlabDocmanagerLib.libManagerMod.IDocumentManager, oldPath: java.lang.String): js.Promise[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel | scala.Null] = js.native
  def renameFile(
    manager: atJupyterlabDocmanagerLib.libManagerMod.IDocumentManager,
    oldPath: java.lang.String,
    newPath: java.lang.String
  ): js.Promise[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel | scala.Null] = js.native
  def shouldOverwrite(path: java.lang.String): js.Promise[scala.Boolean] = js.native
}

