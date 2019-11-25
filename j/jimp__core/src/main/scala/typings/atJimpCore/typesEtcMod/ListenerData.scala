package typings.atJimpCore.typesEtcMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJimpCore.atJimpCoreStrings.`before-change`
import typings.atJimpCore.atJimpCoreStrings.changed
import typings.atJimpCore.atJimpCoreStrings.clone
import typings.atJimpCore.atJimpCoreStrings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atJimpCore.Anon_BeforechangeBeforeclone[T]
  - typings.atJimpCore.Anon_Beforechange[T]
*/
trait ListenerData[T /* <: ListenableName */] extends js.Object

object ListenerData {
  @scala.inline
  def Anon_BeforechangeBeforeclone[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): ListenerData[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListenerData[T]]
  }
  @scala.inline
  def Anon_Beforechange[T /* <: ListenableName */](
    eventName: `before-change` | changed,
    methodName: T,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): ListenerData[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ListenerData[T]]
  }
}

