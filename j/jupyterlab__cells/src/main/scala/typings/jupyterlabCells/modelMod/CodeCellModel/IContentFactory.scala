package typings.jupyterlabCells.modelMod.CodeCellModel

import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating code cell model content.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an output area.
    */
  def createOutputArea(options: typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions): IOutputAreaModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createOutputArea: typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions => IOutputAreaModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createOutputArea = js.Any.fromFunction1(createOutputArea))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

