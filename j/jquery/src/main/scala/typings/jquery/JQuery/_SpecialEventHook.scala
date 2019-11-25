package typings.jquery.JQuery

import typings.jquery.Anon_HandleObjHandleObject
import typings.jquery.jqueryNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SpecialEventHook[TTarget, TData] extends js.Object

object _SpecialEventHook {
  @scala.inline
  def Anon_HandleObj[TTarget, TData](remove: (TTarget, HandleObject[TTarget, TData]) => Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DataEvent[TTarget, TData](trigger: (TTarget, Event, TData) => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction3(trigger))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_Add[TTarget, TData](add: (TTarget, HandleObject[TTarget, TData]) => Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DataEventHandle[TTarget, TData](
    handle: (TTarget, (TriggeredEvent[TTarget, TData, _, _]) with (Anon_HandleObjHandleObject[TTarget, TData]), /* repeated */ TData) => Unit
  ): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction3(handle))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DelegateType[TTarget, TData](delegateType: String): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(delegateType = delegateType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DataDefault[TTarget, TData](_default: (TriggeredEvent[TTarget, TData, _, _], TData) => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(_default = js.Any.fromFunction2(_default))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_BindType[TTarget, TData](bindType: String): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(bindType = bindType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_Data[TTarget, TData](setup: (TTarget, TData, String, EventHandler[TTarget, TData]) => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(setup = js.Any.fromFunction4(setup))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_NoBubble[TTarget, TData](noBubble: Boolean): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(noBubble = noBubble.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_Event[TTarget, TData](preDispatch: (TTarget, Event) => `false` | Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction2(preDispatch))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_False[TTarget, TData](teardown: TTarget => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction1(teardown))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_EventPostDispatch[TTarget, TData](postDispatch: (TTarget, Event) => Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction2(postDispatch))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
}

