package typings.looksSame.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tolerance extends js.Object {
  var tolerance: Double
}

object Tolerance {
  @scala.inline
  def apply(tolerance: Double): Tolerance = {
    val __obj = js.Dynamic.literal(tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tolerance]
  }
}

