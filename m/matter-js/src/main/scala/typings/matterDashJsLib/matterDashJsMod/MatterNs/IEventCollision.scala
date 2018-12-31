package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventCollision[T] extends IEventTimestamped[T] {
  /**
    * The collision pair
    */
  var pairs: js.Array[IPair]
}

