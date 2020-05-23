package typings.luminoDatagrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vx extends js.Object {
  var vx: Double
  var vy: Double
}

object Vx {
  @scala.inline
  def apply(vx: Double, vy: Double): Vx = {
    val __obj = js.Dynamic.literal(vx = vx.asInstanceOf[js.Any], vy = vy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vx]
  }
}

