package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a model within a model.
  */
@js.native
trait IRefModelInModel extends js.Object {
  var childId: String = js.native
  var childModel: IModel = js.native
  var parentModel: IModel = js.native
}

object IRefModelInModel {
  @scala.inline
  def apply(childId: String, childModel: IModel, parentModel: IModel): IRefModelInModel = {
    val __obj = js.Dynamic.literal(childId = childId.asInstanceOf[js.Any], childModel = childModel.asInstanceOf[js.Any], parentModel = parentModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefModelInModel]
  }
  @scala.inline
  implicit class IRefModelInModelOps[Self <: IRefModelInModel] (val x: Self) extends AnyVal {
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
    def setChildId(value: String): Self = this.set("childId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildModel(value: IModel): Self = this.set("childModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentModel(value: IModel): Self = this.set("parentModel", value.asInstanceOf[js.Any])
  }
  
}

