package typings.koaRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoutesMatch extends js.Object {
  var path: js.Array[Layer]
  var pathAndMethod: js.Array[Layer]
  var route: Boolean
}

object IRoutesMatch {
  @scala.inline
  def apply(path: js.Array[Layer], pathAndMethod: js.Array[Layer], route: Boolean): IRoutesMatch = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathAndMethod = pathAndMethod.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoutesMatch]
  }
}

