package typings.jimp

import typings.jimp.jimpMod.ChangeName
import typings.jimp.jimpMod.ListenableName
import typings.jimp.jimpMod.ListenerData
import typings.jimp.jimpStrings.clone
import typings.jimp.jimpStrings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BeforechangeBeforeclone[T /* <: ListenableName */] extends ListenerData[T] {
  var eventName: T
  var methodName: clone | ChangeName | constructor
}

object Anon_BeforechangeBeforeclone {
  @scala.inline
  def apply[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): Anon_BeforechangeBeforeclone[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BeforechangeBeforeclone[T]]
  }
}

