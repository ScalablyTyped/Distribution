package typings.jquery

import typings.jquery.JQuery_._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelegateType
  extends _SpecialEventHook[js.Any, js.Any] {
  /**
    * When defined, these string properties specify that a special event should be handled like another event type until the event is delivered. The `bindType` is used if the event is attached directly, and the `delegateType` is used for delegated events. These types are generally DOM event types, and _should not_ be a special event themselves.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#bindtype-string-delegatetype-string }\`
    */
  var delegateType: String
}

object AnonDelegateType {
  @scala.inline
  def apply(delegateType: String): AnonDelegateType = {
    val __obj = js.Dynamic.literal(delegateType = delegateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelegateType]
  }
}

