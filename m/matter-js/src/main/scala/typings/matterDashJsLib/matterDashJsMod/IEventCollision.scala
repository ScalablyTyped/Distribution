package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventCollision[T] extends IEventTimestamped[T] {
  /**
    * The collision pair
    */
  var pairs: js.Array[IPair]
}

object IEventCollision {
  @scala.inline
  def apply[T](name: java.lang.String, pairs: js.Array[IPair], source: T, timestamp: scala.Double): IEventCollision[T] = {
    val __obj = js.Dynamic.literal(name = name, pairs = pairs, source = source.asInstanceOf[js.Any], timestamp = timestamp)
  
    __obj.asInstanceOf[IEventCollision[T]]
  }
}

