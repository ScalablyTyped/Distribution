package typings.makerDotJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model reference in a walk.
  */
trait IWalkModel
  extends IRefModelInModel
     with IRouteOffset

object IWalkModel {
  @scala.inline
  def apply(
    childId: String,
    childModel: IModel,
    layer: String,
    offset: IPoint,
    parentModel: IModel,
    route: js.Array[String],
    routeKey: String
  ): IWalkModel = {
    val __obj = js.Dynamic.literal(childId = childId.asInstanceOf[js.Any], childModel = childModel.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentModel = parentModel.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWalkModel]
  }
}

