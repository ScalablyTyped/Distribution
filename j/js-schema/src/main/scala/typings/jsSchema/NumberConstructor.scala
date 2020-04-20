package typings.jsSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberConstructor extends js.Object {
  def above(n: Double): NumberConstructor
  def below(n: Double): NumberConstructor
  def max(n: Double): NumberConstructor
  def min(n: Double): NumberConstructor
  def step(n: Double): NumberConstructor
}

object NumberConstructor {
  @scala.inline
  def apply(
    above: Double => NumberConstructor,
    below: Double => NumberConstructor,
    max: Double => NumberConstructor,
    min: Double => NumberConstructor,
    step: Double => NumberConstructor
  ): NumberConstructor = {
    val __obj = js.Dynamic.literal(above = js.Any.fromFunction1(above), below = js.Any.fromFunction1(below), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), step = js.Any.fromFunction1(step))
    __obj.asInstanceOf[NumberConstructor]
  }
}

