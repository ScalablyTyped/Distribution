package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lval extends js.Object {
  def resetdebug(): scala.Double
  def setdebug(lval: scala.Double): scala.Double
}

object Anon_Lval {
  @scala.inline
  def apply(resetdebug: () => scala.Double, setdebug: scala.Double => scala.Double): Anon_Lval = {
    val __obj = js.Dynamic.literal(resetdebug = js.Any.fromFunction0(resetdebug), setdebug = js.Any.fromFunction1(setdebug))
  
    __obj.asInstanceOf[Anon_Lval]
  }
}

