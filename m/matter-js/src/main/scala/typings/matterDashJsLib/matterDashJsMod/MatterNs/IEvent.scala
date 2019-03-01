package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent[T] extends js.Object {
  /**
    * The name of the event
    */
  var name: java.lang.String
  /**
    * The source object of the event
    */
  var source: T
}

object IEvent {
  @scala.inline
  def apply[T](name: java.lang.String, source: T): IEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent[T]]
  }
}

