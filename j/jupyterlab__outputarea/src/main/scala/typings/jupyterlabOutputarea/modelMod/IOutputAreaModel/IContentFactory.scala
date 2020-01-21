package typings.jupyterlabOutputarea.modelMod.IOutputAreaModel

import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an output content factory.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an output model.
    */
  def createOutputModel(options: typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions): IOutputModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createOutputModel: typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions => IOutputModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createOutputModel = js.Any.fromFunction1(createOutputModel))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

