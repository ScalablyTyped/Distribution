package typings.jimp.mod

import typings.jimp.jimpStrings.`before-change`
import typings.jimp.jimpStrings.changed
import typings.jimp.jimpStrings.clone
import typings.jimp.jimpStrings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jimp.anon.EventName[T]
  - typings.jimp.anon.Dictkey[T]
*/
trait ListenerData[T /* <: ListenableName */] extends js.Object

object ListenerData {
  @scala.inline
  def EventName[/* <: typings.jimp.mod.ListenableName */ T](eventName: T, methodName: clone | ChangeName | constructor): ListenerData[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerData[T]]
  }
  @scala.inline
  def Dictkey[/* <: typings.jimp.mod.ListenableName */ T](eventName: `before-change` | changed, methodName: T): ListenerData[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerData[T]]
  }
}

