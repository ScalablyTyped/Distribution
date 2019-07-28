package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcounters extends js.Object {
  def add(sname: String, v: Double): Double
  def inc(sname: String): Double
  def reset(sname: String): Double
}

object Typeofcounters {
  @scala.inline
  def apply(add: (String, Double) => Double, inc: String => Double, reset: String => Double): Typeofcounters = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), inc = js.Any.fromFunction1(inc), reset = js.Any.fromFunction1(reset))
  
    __obj.asInstanceOf[Typeofcounters]
  }
}

