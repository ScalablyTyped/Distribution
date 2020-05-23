package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var v: js.Any
  var w: js.Any
  var weight: Double
  def either(): Double
  def from(): Double
  def other(x: Double): Double
  def to(): Double
}

object Edge {
  @scala.inline
  def apply(
    either: () => Double,
    from: () => Double,
    other: Double => Double,
    to: () => Double,
    v: js.Any,
    w: js.Any,
    weight: Double,
    label: String = null
  ): Edge = {
    val __obj = js.Dynamic.literal(either = js.Any.fromFunction0(either), from = js.Any.fromFunction0(from), other = js.Any.fromFunction1(other), to = js.Any.fromFunction0(to), v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

