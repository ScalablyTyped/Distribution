package typings.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line no-empty-interface
trait Fraction extends _MathType {
  var d: Double
  var n: Double
  var s: Double
}

object Fraction {
  @scala.inline
  def apply(d: Double, n: Double, s: Double): Fraction = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fraction]
  }
}

