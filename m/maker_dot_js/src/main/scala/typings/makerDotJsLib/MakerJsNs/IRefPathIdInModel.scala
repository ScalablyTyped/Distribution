package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a path id within a model.
  */
trait IRefPathIdInModel extends js.Object {
  var modelContext: IModel
  var pathId: java.lang.String
}

object IRefPathIdInModel {
  @scala.inline
  def apply(modelContext: IModel, pathId: java.lang.String): IRefPathIdInModel = {
    val __obj = js.Dynamic.literal(modelContext = modelContext, pathId = pathId)
  
    __obj.asInstanceOf[IRefPathIdInModel]
  }
}

