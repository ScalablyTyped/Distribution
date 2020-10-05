package typings.jquery.anon

import typings.jquery.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelegateType
  extends _SpecialEventHook[js.Any, js.Any] {
  /**
    * When defined, these string properties specify that a special event should be handled like another event type until the event is delivered. The `bindType` is used if the event is attached directly, and the `delegateType` is used for delegated events. These types are generally DOM event types, and _should not_ be a special event themselves.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#bindtype-string-delegatetype-string }\`
    */
  var delegateType: String = js.native
}

object DelegateType {
  @scala.inline
  def apply(delegateType: String): DelegateType = {
    val __obj = js.Dynamic.literal(delegateType = delegateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegateType]
  }
  @scala.inline
  implicit class DelegateTypeOps[Self <: DelegateType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelegateType(value: String): Self = this.set("delegateType", value.asInstanceOf[js.Any])
  }
  
}

