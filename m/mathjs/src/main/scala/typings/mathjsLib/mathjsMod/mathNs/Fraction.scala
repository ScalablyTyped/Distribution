package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line no-empty-interface
trait Fraction extends _MathType {
  var d: scala.Double
  var n: scala.Double
  var s: scala.Double
}

object Fraction {
  @scala.inline
  def apply(d: scala.Double, n: scala.Double, s: scala.Double): Fraction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("d")(d)
    __obj.updateDynamic("n")(n)
    __obj.updateDynamic("s")(s)
    __obj.asInstanceOf[Fraction]
  }
}

