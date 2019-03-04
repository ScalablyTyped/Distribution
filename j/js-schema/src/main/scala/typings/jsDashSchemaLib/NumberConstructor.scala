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
    above: js.Function1[scala.Double, NumberConstructor],
    below: js.Function1[scala.Double, NumberConstructor],
    max: js.Function1[scala.Double, NumberConstructor],
    min: js.Function1[scala.Double, NumberConstructor],
    step: js.Function1[scala.Double, NumberConstructor]
  ): NumberConstructor = {
    val __obj = js.Dynamic.literal(above = above, below = below, max = max, min = min, step = step)
  
    __obj.asInstanceOf[NumberConstructor]
  }
}

