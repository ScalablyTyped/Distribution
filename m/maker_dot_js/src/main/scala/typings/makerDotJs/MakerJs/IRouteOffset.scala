package typings.makerDotJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A route to either a path or a model, and the absolute offset of it.
  */
trait IRouteOffset extends js.Object {
  var layer: String
  var offset: IPoint
  var route: js.Array[String]
  var routeKey: String
}

object IRouteOffset {
  @scala.inline
  def apply(layer: String, offset: IPoint, route: js.Array[String], routeKey: String): IRouteOffset = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRouteOffset]
  }
}

