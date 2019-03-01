package typings
package atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bin extends js.Object {
  var h: scala.Double
  var id: ID
  var w: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Bin {
  @scala.inline
  def apply(h: scala.Double, id: ID, w: scala.Double, x: scala.Double, y: scala.Double): Bin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Bin]
  }
}

