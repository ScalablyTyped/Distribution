package typings.jupyterlabCells.modelMod.CodeCellModel

import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/cells/lib/model", "CodeCellModel.ContentFactory")
@js.native
class ContentFactory () extends IContentFactory {
  /**
    * Create an output area.
    */
  /* CompleteClass */
  override def createOutputArea(options: typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions): IOutputAreaModel = js.native
}

