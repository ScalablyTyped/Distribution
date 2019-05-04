package typings
package atJupyterlabCodeeditorLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorServices extends js.Object {
  /**
    * The code editor factory.
    */
  val factoryService: atJupyterlabCodeeditorLib.libFactoryMod.IEditorFactoryService
  /**
    * The editor mime type service.
    */
  val mimeTypeService: atJupyterlabCodeeditorLib.libMimetypeMod.IEditorMimeTypeService
}

object IEditorServices {
  @scala.inline
  def apply(
    factoryService: atJupyterlabCodeeditorLib.libFactoryMod.IEditorFactoryService,
    mimeTypeService: atJupyterlabCodeeditorLib.libMimetypeMod.IEditorMimeTypeService
  ): IEditorServices = {
    val __obj = js.Dynamic.literal(factoryService = factoryService, mimeTypeService = mimeTypeService)
  
    __obj.asInstanceOf[IEditorServices]
  }
}

