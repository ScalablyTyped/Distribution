package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventTimestamped[T] extends IEvent[T] {
  /**
    * The engine.timing.timestamp of the event
    */
  var timestamp: Double
}

object IEventTimestamped {
  @scala.inline
  def apply[T](name: String, source: T, timestamp: Double): IEventTimestamped[T] = {
    val __obj = js.Dynamic.literal(name = name, source = source.asInstanceOf[js.Any], timestamp = timestamp)
  
    __obj.asInstanceOf[IEventTimestamped[T]]
  }
}

