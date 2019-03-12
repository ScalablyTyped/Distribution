package typings
package jsDashSchemaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberConstructor extends js.Object {
  def above(n: scala.Double): NumberConstructor
  def below(n: scala.Double): NumberConstructor
  def max(n: scala.Double): NumberConstructor
  def min(n: scala.Double): NumberConstructor
  def step(n: scala.Double): NumberConstructor
}

object NumberConstructor {
  @scala.inline
  def apply(
    above: scala.Double => NumberConstructor,
    below: scala.Double => NumberConstructor,
    max: scala.Double => NumberConstructor,
    min: scala.Double => NumberConstructor,
    step: scala.Double => NumberConstructor
  ): NumberConstructor = {
    val __obj = js.Dynamic.literal(above = js.Any.fromFunction1(above), below = js.Any.fromFunction1(below), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), step = js.Any.fromFunction1(step))
  
    __obj.asInstanceOf[NumberConstructor]
  }
}

