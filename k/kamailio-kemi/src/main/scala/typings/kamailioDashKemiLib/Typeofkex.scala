package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofkex extends js.Object {
  def resetdebug(): scala.Double
  def setdebug(lval: scala.Double): scala.Double
}

object Typeofkex {
  @scala.inline
  def apply(resetdebug: () => scala.Double, setdebug: scala.Double => scala.Double): Typeofkex = {
    val __obj = js.Dynamic.literal(resetdebug = js.Any.fromFunction0(resetdebug), setdebug = js.Any.fromFunction1(setdebug))
  
    __obj.asInstanceOf[Typeofkex]
  }
}

