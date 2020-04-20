package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpdt extends js.Object {
  def pd_translate(sd: String, md: Double): Double
  def pprefix2domain(m: Double, s: Double): Double
}

object Typeofpdt {
  @scala.inline
  def apply(pd_translate: (String, Double) => Double, pprefix2domain: (Double, Double) => Double): Typeofpdt = {
    val __obj = js.Dynamic.literal(pd_translate = js.Any.fromFunction2(pd_translate), pprefix2domain = js.Any.fromFunction2(pprefix2domain))
    __obj.asInstanceOf[Typeofpdt]
  }
}

