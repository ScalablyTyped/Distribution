package typings.heremaps.H.math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for representing sizes consisting of a width and height.
  * @property w {number} - The size's width value
  * @property h {number} - The size's height value
  */
trait Size extends js.Object {
  var h: Double
  var w: Double
}

object Size {
  @scala.inline
  def apply(h: Double, w: Double): Size = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

