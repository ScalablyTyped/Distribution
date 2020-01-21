package typings.jupyterlabCodeeditor.tokensMod

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabCodeeditor.factoryMod.IEditorFactoryService
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorServices extends js.Object {
  /**
    * The code editor factory.
    */
  val factoryService: IEditorFactoryService
  /**
    * The editor mime type service.
    */
  val mimeTypeService: IEditorMimeTypeService
}

@JSImport("@jupyterlab/codeeditor/lib/tokens", "IEditorServices")
@js.native
object IEditorServices extends TopLevel[Token[IEditorServices]]

