package typings.jimp.anon

import typings.jimp.jimpStrings.clone
import typings.jimp.jimpStrings.constructor
import typings.jimp.mod.ChangeName
import typings.jimp.mod.ListenableName
import typings.jimp.mod.ListenerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventName[T /* <: ListenableName */] extends ListenerData[T] {
  var eventName: T
  var methodName: clone | ChangeName | constructor
}

object EventName {
  @scala.inline
  def apply[/* <: typings.jimp.mod.ListenableName */ T](eventName: T, methodName: clone | ChangeName | constructor): EventName[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventName[T]]
  }
}

