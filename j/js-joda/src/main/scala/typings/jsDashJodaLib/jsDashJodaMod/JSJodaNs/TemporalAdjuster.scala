package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporalAdjuster extends js.Object {
  def adjustInto(temporal: Temporal): Temporal
}

object TemporalAdjuster {
  @scala.inline
  def apply(adjustInto: Temporal => Temporal): TemporalAdjuster = {
    val __obj = js.Dynamic.literal(adjustInto = js.Any.fromFunction1(adjustInto))
  
    __obj.asInstanceOf[TemporalAdjuster]
  }
}

