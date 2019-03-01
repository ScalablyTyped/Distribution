package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventTimestamped[T] extends IEvent[T] {
  /**
    * The engine.timing.timestamp of the event
    */
  var timestamp: scala.Double
}

object IEventTimestamped {
  @scala.inline
  def apply[T](name: java.lang.String, source: T, timestamp: scala.Double): IEventTimestamped[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[IEventTimestamped[T]]
  }
}

