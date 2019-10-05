package typings.atJupyterlabCodeeditor.libTokensMod

import org.scalablytyped.runtime.TopLevel
import typings.atJupyterlabCodeeditor.libFactoryMod.IEditorFactoryService
import typings.atJupyterlabCodeeditor.libMimetypeMod.IEditorMimeTypeService
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
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

