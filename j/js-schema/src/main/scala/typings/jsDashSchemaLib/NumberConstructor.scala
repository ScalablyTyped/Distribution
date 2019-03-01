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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("above")(above)
    __obj.updateDynamic("below")(below)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[NumberConstructor]
  }
}

