package typings
package matterDashJsLib.matterDashJsMod

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
    val __obj = js.Dynamic.literal(name = name, source = source.asInstanceOf[js.Any], timestamp = timestamp)
  
    __obj.asInstanceOf[IEventTimestamped[T]]
  }
}

