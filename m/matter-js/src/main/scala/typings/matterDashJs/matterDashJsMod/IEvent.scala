package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent[T] extends js.Object {
  /**
    * The name of the event
    */
  var name: String
  /**
    * The source object of the event
    */
  var source: T
}

object IEvent {
  @scala.inline
  def apply[T](name: String, source: T): IEvent[T] = {
    val __obj = js.Dynamic.literal(name = name, source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEvent[T]]
  }
}

