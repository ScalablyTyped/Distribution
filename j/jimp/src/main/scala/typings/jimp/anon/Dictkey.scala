package typings.jimp.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jimp.jimpStrings.`before-change`
import typings.jimp.jimpStrings.changed
import typings.jimp.mod.ListenableName
import typings.jimp.mod.ListenerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey[T /* <: ListenableName */]
  extends /* key */ StringDictionary[js.Any]
     with ListenerData[T] {
  var eventName: `before-change` | changed
  var methodName: T
}

object Dictkey {
  @scala.inline
  def apply[/* <: typings.jimp.mod.ListenableName */ T](
    eventName: `before-change` | changed,
    methodName: T,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Dictkey[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey[T]]
  }
}

