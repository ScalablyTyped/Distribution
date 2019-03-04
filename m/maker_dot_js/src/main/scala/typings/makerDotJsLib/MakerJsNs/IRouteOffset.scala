package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A route to either a path or a model, and the absolute offset of it.
  */
trait IRouteOffset extends js.Object {
  var layer: java.lang.String
  var offset: IPoint
  var route: js.Array[java.lang.String]
  var routeKey: java.lang.String
}

object IRouteOffset {
  @scala.inline
  def apply(
    layer: java.lang.String,
    offset: IPoint,
    route: js.Array[java.lang.String],
    routeKey: java.lang.String
  ): IRouteOffset = {
    val __obj = js.Dynamic.literal(layer = layer, offset = offset, route = route, routeKey = routeKey)
  
    __obj.asInstanceOf[IRouteOffset]
  }
}

