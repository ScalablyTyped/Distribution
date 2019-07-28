package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsanity extends js.Object {
  def sanity_check(mflags: Double, uflags: Double): Double
  def sanity_check_defaults(): Double
  def sanity_reply(): Double
}

object Typeofsanity {
  @scala.inline
  def apply(
    sanity_check: (Double, Double) => Double,
    sanity_check_defaults: () => Double,
    sanity_reply: () => Double
  ): Typeofsanity = {
    val __obj = js.Dynamic.literal(sanity_check = js.Any.fromFunction2(sanity_check), sanity_check_defaults = js.Any.fromFunction0(sanity_check_defaults), sanity_reply = js.Any.fromFunction0(sanity_reply))
  
    __obj.asInstanceOf[Typeofsanity]
  }
}

