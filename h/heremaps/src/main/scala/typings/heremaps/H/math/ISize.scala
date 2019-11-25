package typings.heremaps.H.math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a 2-dimensional size consisting a with and a height.
  * @property w {number} - The size's width.
  * @property h {number} - The size's height.
  */
trait ISize extends js.Object {
  var h: Double
  var w: Double
}

object ISize {
  @scala.inline
  def apply(h: Double, w: Double): ISize = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISize]
  }
}

