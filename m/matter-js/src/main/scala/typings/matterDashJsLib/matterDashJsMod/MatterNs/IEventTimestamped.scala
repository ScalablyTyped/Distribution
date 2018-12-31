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

