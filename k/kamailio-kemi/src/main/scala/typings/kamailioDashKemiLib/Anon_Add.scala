package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  def add(sname: java.lang.String, v: scala.Double): scala.Double
  def inc(sname: java.lang.String): scala.Double
  def reset(sname: java.lang.String): scala.Double
}

object Anon_Add {
  @scala.inline
  def apply(
    add: (java.lang.String, scala.Double) => scala.Double,
    inc: java.lang.String => scala.Double,
    reset: java.lang.String => scala.Double
  ): Anon_Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), inc = js.Any.fromFunction1(inc), reset = js.Any.fromFunction1(reset))
  
    __obj.asInstanceOf[Anon_Add]
  }
}

