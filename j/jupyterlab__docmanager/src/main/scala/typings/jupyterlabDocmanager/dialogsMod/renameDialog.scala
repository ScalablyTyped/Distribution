package typings.jupyterlabDocmanager.dialogsMod

import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabServices.contentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/docmanager/lib/dialogs", "renameDialog")
@js.native
object renameDialog extends js.Object {
  
  def apply(manager: IDocumentManager, oldPath: String): js.Promise[IModel | Null] = js.native
}
