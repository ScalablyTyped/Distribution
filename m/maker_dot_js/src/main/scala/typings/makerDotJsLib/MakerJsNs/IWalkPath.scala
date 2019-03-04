package typings
package makerDotJsLib.MakerJsNs

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
    layer: java.lang.String,
    modelContext: IModel,
    offset: IPoint,
    pathContext: IPath,
    pathId: java.lang.String,
    route: js.Array[java.lang.String],
    routeKey: java.lang.String
  ): IWalkPath = {
    val __obj = js.Dynamic.literal(layer = layer, modelContext = modelContext, offset = offset, pathContext = pathContext, pathId = pathId, route = route, routeKey = routeKey)
  
    __obj.asInstanceOf[IWalkPath]
  }
}

