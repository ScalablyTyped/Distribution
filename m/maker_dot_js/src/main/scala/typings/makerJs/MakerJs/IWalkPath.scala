package typings.makerJs.MakerJs

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
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], modelContext = modelContext.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pathContext = pathContext.asInstanceOf[js.Any], pathId = pathId.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWalkPath]
  }
}

