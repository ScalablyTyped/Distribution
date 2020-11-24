package typings.jupyterlabOutputarea.modelMod.IOutputAreaModel

import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for an output content factory.
  */
@js.native
trait IContentFactory extends js.Object {
  
  /**
    * Create an output model.
    */
  def createOutputModel(options: typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions): IOutputModel = js.native
}
object IContentFactory {
  
  @scala.inline
  def apply(
    createOutputModel: typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions => IOutputModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createOutputModel = js.Any.fromFunction1(createOutputModel))
    __obj.asInstanceOf[IContentFactory]
  }
  
  @scala.inline
  implicit class IContentFactoryOps[Self <: IContentFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateOutputModel(value: typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions => IOutputModel): Self = this.set("createOutputModel", js.Any.fromFunction1(value))
  }
}
