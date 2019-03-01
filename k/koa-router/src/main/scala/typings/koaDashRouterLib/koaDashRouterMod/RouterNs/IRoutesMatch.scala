package typings
package koaDashRouterLib.koaDashRouterMod.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoutesMatch extends js.Object {
  var path: js.Array[Layer]
  var pathAndMethod: js.Array[Layer]
  var route: scala.Boolean
}

object IRoutesMatch {
  @scala.inline
  def apply(path: js.Array[Layer], pathAndMethod: js.Array[Layer], route: scala.Boolean): IRoutesMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("pathAndMethod")(pathAndMethod)
    __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[IRoutesMatch]
  }
}

