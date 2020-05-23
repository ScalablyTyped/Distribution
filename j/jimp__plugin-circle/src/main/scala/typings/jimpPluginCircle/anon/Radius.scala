package typings.jimpPluginCircle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radius extends js.Object {
  var radius: Double
  var x: Double
  var y: Double
}

object Radius {
  @scala.inline
  def apply(radius: Double, x: Double, y: Double): Radius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
}

