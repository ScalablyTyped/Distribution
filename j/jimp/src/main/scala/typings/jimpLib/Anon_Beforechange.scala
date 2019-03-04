package typings
package jimpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Beforechange[T /* <: ListenableName */]
  extends ListenerData[T]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var eventName: jimpLib.jimpLibStrings.`before-change` | jimpLib.jimpLibStrings.changed
  var methodName: T
}

object Anon_Beforechange {
  @scala.inline
  def apply[T /* <: ListenableName */](
    eventName: jimpLib.jimpLibStrings.`before-change` | jimpLib.jimpLibStrings.changed,
    methodName: T,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Beforechange[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Beforechange[T]]
  }
}

