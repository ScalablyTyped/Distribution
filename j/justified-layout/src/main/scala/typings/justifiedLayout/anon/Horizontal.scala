package typings.justifiedLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Horizontal extends js.Object {
  var horizontal: Double
  var vertical: Double
}

object Horizontal {
  @scala.inline
  def apply(horizontal: Double, vertical: Double): Horizontal = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horizontal]
  }
}

