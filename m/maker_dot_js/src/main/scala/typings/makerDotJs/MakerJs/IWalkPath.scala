package typings.makerDotJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A path reference in a walk.
  */
trait IWalkPath
  extends IRefPathIdInModel
     with IRouteOffset {
  var pathContext: IPath
}

object IWalkPath {
  @scala.inline
  def apply(
    layer: String,
    modelContext: IModel,
    offset: IPoint,
    pathContext: IPath,
    pathId: String,
    route: js.Array[String],
    routeKey: String
  ): IWalkPath = {
    val __obj = js.Dynamic.literal(layer = layer, modelContext = modelContext, offset = offset, pathContext = pathContext, pathId = pathId, route = route, routeKey = routeKey)
  
    __obj.asInstanceOf[IWalkPath]
  }
}

