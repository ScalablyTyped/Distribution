package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a path id within a model.
  */
@js.native
trait IRefPathIdInModel extends js.Object {
  var modelContext: IModel = js.native
  var pathId: String = js.native
}

object IRefPathIdInModel {
  @scala.inline
  def apply(modelContext: IModel, pathId: String): IRefPathIdInModel = {
    val __obj = js.Dynamic.literal(modelContext = modelContext.asInstanceOf[js.Any], pathId = pathId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefPathIdInModel]
  }
  @scala.inline
  implicit class IRefPathIdInModelOps[Self <: IRefPathIdInModel] (val x: Self) extends AnyVal {
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
    def setModelContext(value: IModel): Self = this.set("modelContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathId(value: String): Self = this.set("pathId", value.asInstanceOf[js.Any])
  }
  
}

