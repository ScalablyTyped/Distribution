package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event indicating a received message or truncation event.
  */
@js.native
trait SchemaPubsubEvent extends js.Object {
  /**
    * Indicates that this subscription has been deleted. (Note that pull
    * subscribers will always receive NOT_FOUND in response in their pull
    * request on the subscription, rather than seeing this boolean.)
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * A received message.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.native
  /**
    * The subscription that received the event.
    */
  var subscription: js.UndefOr[String] = js.native
  /**
    * Indicates that this subscription has been truncated.
    */
  var truncated: js.UndefOr[Boolean] = js.native
}

object SchemaPubsubEvent {
  @scala.inline
  def apply(): SchemaPubsubEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubEvent]
  }
  @scala.inline
  implicit class SchemaPubsubEventOps[Self <: SchemaPubsubEvent] (val x: Self) extends AnyVal {
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setMessage(value: SchemaPubsubMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
    @scala.inline
    def setTruncated(value: Boolean): Self = this.set("truncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncated: Self = this.set("truncated", js.undefined)
  }
  
}

