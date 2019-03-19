package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Resetstat extends js.Object {
  def reset_stat(sname: java.lang.String): scala.Double
  def update_stat(sname: java.lang.String, sval: scala.Double): scala.Double
}

object Anon_Resetstat {
  @scala.inline
  def apply(
    reset_stat: java.lang.String => scala.Double,
    update_stat: (java.lang.String, scala.Double) => scala.Double
  ): Anon_Resetstat = {
    val __obj = js.Dynamic.literal(reset_stat = js.Any.fromFunction1(reset_stat), update_stat = js.Any.fromFunction2(update_stat))
  
    __obj.asInstanceOf[Anon_Resetstat]
  }
}

