package typings.jimp

import typings.jimp.jimpStrings.clone
import typings.jimp.jimpStrings.constructor
import typings.jimp.mod.ChangeName
import typings.jimp.mod.ListenableName
import typings.jimp.mod.ListenerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBeforechangeBeforeclone[T /* <: ListenableName */] extends ListenerData[T] {
  var eventName: T
  var methodName: clone | ChangeName | constructor
}

object AnonBeforechangeBeforeclone {
  @scala.inline
  def apply[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): AnonBeforechangeBeforeclone[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBeforechangeBeforeclone[T]]
  }
}

