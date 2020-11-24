package typings.jupyterlabCodeeditor.tokensMod

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabCodeeditor.factoryMod.IEditorFactoryService
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorServices extends js.Object {
  
  /**
    * The code editor factory.
    */
  val factoryService: IEditorFactoryService = js.native
  
  /**
    * The editor mime type service.
    */
  val mimeTypeService: IEditorMimeTypeService = js.native
}
@JSImport("@jupyterlab/codeeditor/lib/tokens", "IEditorServices")
@js.native
object IEditorServices extends TopLevel[Token[IEditorServices]]
