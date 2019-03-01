package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a model within a model.
  */
trait IRefModelInModel extends js.Object {
  var childId: java.lang.String
  var childModel: IModel
  var parentModel: IModel
}

object IRefModelInModel {
  @scala.inline
  def apply(childId: java.lang.String, childModel: IModel, parentModel: IModel): IRefModelInModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childId")(childId)
    __obj.updateDynamic("childModel")(childModel)
    __obj.updateDynamic("parentModel")(parentModel)
    __obj.asInstanceOf[IRefModelInModel]
  }
}

