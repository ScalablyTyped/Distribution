package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a path id within a model.
  */
trait IRefPathIdInModel extends js.Object {
  var modelContext: IModel
  var pathId: String
}

object IRefPathIdInModel {
  @scala.inline
  def apply(modelContext: IModel, pathId: String): IRefPathIdInModel = {
    val __obj = js.Dynamic.literal(modelContext = modelContext.asInstanceOf[js.Any], pathId = pathId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRefPathIdInModel]
  }
}

