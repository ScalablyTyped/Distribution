package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofkex extends js.Object {
  def resetdebug(): Double
  def setdebug(lval: Double): Double
}

object Typeofkex {
  @scala.inline
  def apply(resetdebug: () => Double, setdebug: Double => Double): Typeofkex = {
    val __obj = js.Dynamic.literal(resetdebug = js.Any.fromFunction0(resetdebug), setdebug = js.Any.fromFunction1(setdebug))
  
    __obj.asInstanceOf[Typeofkex]
  }
}

