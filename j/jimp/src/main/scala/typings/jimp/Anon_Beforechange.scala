package typings.jimp

import org.scalablytyped.runtime.StringDictionary
import typings.jimp.jimpMod.ListenableName
import typings.jimp.jimpMod.ListenerData
import typings.jimp.jimpStrings.`before-change`
import typings.jimp.jimpStrings.changed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Beforechange[T /* <: ListenableName */]
  extends /* key */ StringDictionary[js.Any]
     with ListenerData[T] {
  var eventName: `before-change` | changed
  var methodName: T
}

object Anon_Beforechange {
  @scala.inline
  def apply[T /* <: ListenableName */](
    eventName: `before-change` | changed,
    methodName: T,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Anon_Beforechange[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Beforechange[T]]
  }
}

