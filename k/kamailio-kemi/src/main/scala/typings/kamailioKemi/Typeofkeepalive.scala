package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofkeepalive extends js.Object {
  def is_alive(dest: String): Double
}

object Typeofkeepalive {
  @scala.inline
  def apply(is_alive: String => Double): Typeofkeepalive = {
    val __obj = js.Dynamic.literal(is_alive = js.Any.fromFunction1(is_alive))
  
    __obj.asInstanceOf[Typeofkeepalive]
  }
}

