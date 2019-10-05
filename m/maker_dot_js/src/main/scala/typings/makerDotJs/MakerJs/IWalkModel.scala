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
    val __obj = js.Dynamic.literal(childId = childId, childModel = childModel, layer = layer, offset = offset, parentModel = parentModel, route = route, routeKey = routeKey)
  
    __obj.asInstanceOf[IWalkModel]
  }
}

