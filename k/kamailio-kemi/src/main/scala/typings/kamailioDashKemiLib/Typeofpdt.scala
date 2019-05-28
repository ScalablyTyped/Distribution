package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpdt extends js.Object {
  def pd_translate(sd: java.lang.String, md: scala.Double): scala.Double
  def pprefix2domain(m: scala.Double, s: scala.Double): scala.Double
}

object Typeofpdt {
  @scala.inline
  def apply(
    pd_translate: (java.lang.String, scala.Double) => scala.Double,
    pprefix2domain: (scala.Double, scala.Double) => scala.Double
  ): Typeofpdt = {
    val __obj = js.Dynamic.literal(pd_translate = js.Any.fromFunction2(pd_translate), pprefix2domain = js.Any.fromFunction2(pprefix2domain))
  
    __obj.asInstanceOf[Typeofpdt]
  }
}

