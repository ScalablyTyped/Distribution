package typings
package jimpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BeforechangeBeforeclone[T /* <: jimpLib.jimpMod.ListenableName */]
  extends jimpLib.jimpMod.ListenerData[T] {
  var eventName: T
  var methodName: jimpLib.jimpLibStrings.clone | jimpLib.jimpMod.ChangeName | jimpLib.jimpLibStrings.constructor
}

object Anon_BeforechangeBeforeclone {
  @scala.inline
  def apply[T /* <: jimpLib.jimpMod.ListenableName */](
    eventName: T,
    methodName: jimpLib.jimpLibStrings.clone | jimpLib.jimpMod.ChangeName | jimpLib.jimpLibStrings.constructor
  ): Anon_BeforechangeBeforeclone[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BeforechangeBeforeclone[T]]
  }
}

