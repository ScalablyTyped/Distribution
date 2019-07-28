package typings.atJupyterlabCodeeditor.libTokensMod

import typings.atJupyterlabCodeeditor.libFactoryMod.IEditorFactoryService
import typings.atJupyterlabCodeeditor.libMimetypeMod.IEditorMimeTypeService
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

object IEditorServices {
  @scala.inline
  def apply(factoryService: IEditorFactoryService, mimeTypeService: IEditorMimeTypeService): IEditorServices = {
    val __obj = js.Dynamic.literal(factoryService = factoryService, mimeTypeService = mimeTypeService)
  
    __obj.asInstanceOf[IEditorServices]
  }
}

