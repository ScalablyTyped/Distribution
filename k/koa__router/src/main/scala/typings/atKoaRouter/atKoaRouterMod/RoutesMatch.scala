package typings.atKoaRouter.atKoaRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutesMatch extends js.Object {
  var path: js.Array[Layer]
  var pathAndMethod: js.Array[Layer]
  var route: Boolean
}

object RoutesMatch {
  @scala.inline
  def apply(path: js.Array[Layer], pathAndMethod: js.Array[Layer], route: Boolean): RoutesMatch = {
    val __obj = js.Dynamic.literal(path = path, pathAndMethod = pathAndMethod, route = route)
  
    __obj.asInstanceOf[RoutesMatch]
  }
}

