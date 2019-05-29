package typings
package jaegerDashClientLib.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gauge extends js.Object {
  // Update the gauge to the value passed in.
  def update(value: scala.Double): scala.Unit
}

object Gauge {
  @scala.inline
  def apply(update: scala.Double => scala.Unit): Gauge = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Gauge]
  }
}

