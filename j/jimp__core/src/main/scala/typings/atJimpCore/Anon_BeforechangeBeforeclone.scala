package typings.atJimpCore

import typings.atJimpCore.atJimpCoreStrings.clone
import typings.atJimpCore.atJimpCoreStrings.constructor
import typings.atJimpCore.typesEtcMod.ChangeName
import typings.atJimpCore.typesEtcMod.ListenableName
import typings.atJimpCore.typesEtcMod.ListenerData
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

