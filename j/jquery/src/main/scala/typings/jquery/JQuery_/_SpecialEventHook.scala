package typings.jquery.JQuery_

import typings.jquery.AnonHandleObjHandleObject
import typings.jquery.jqueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SpecialEventHook[TTarget, TData] extends js.Object

object _SpecialEventHook {
  @scala.inline
  def AnonFalse[TTarget, TData](teardown: () => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonDataDefault[TTarget, TData](_default: (TriggeredEvent[TTarget, TData, _, _], TData) => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(_default = js.Any.fromFunction2(_default))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonAdd[TTarget, TData](add: HandleObject[TTarget, TData] => Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonEventPostDispatch[TTarget, TData](postDispatch: Event => Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonHandleObj[TTarget, TData](remove: HandleObject[TTarget, TData] => Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonDataEventHandle[TTarget, TData](
    handle: ((TriggeredEvent[TTarget, TData, _, _]) with (AnonHandleObjHandleObject[TTarget, TData]), /* repeated */ TData) => Unit
  ): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction2(handle))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonData[TTarget, TData](setup: (TData, String, EventHandler[TTarget, TData]) => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(setup = js.Any.fromFunction3(setup))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonDelegateType[TTarget, TData](delegateType: String): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(delegateType = delegateType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonNoBubble[TTarget, TData](noBubble: Boolean): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(noBubble = noBubble.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonEvent[TTarget, TData](preDispatch: Event => `false` | Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction1(preDispatch))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonBindType[TTarget, TData](bindType: String): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(bindType = bindType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonDataEvent[TTarget, TData](trigger: (Event, TData) => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction2(trigger))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
}

