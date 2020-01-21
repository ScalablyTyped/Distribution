package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Either a &lt;code&gt;PubsubMessage&lt;/code&gt; or a truncation event. One
  * of these two must be populated.
  */
@js.native
trait SchemaPullResponse extends js.Object {
  /**
    * This ID must be used to acknowledge the received event or message.
    */
  var ackId: js.UndefOr[String] = js.native
  /**
    * A pubsub message or truncation event.
    */
  var pubsubEvent: js.UndefOr[SchemaPubsubEvent] = js.native
}

object SchemaPullResponse {
  @scala.inline
  def apply(ackId: String = null, pubsubEvent: SchemaPubsubEvent = null): SchemaPullResponse = {
    val __obj = js.Dynamic.literal()
    if (ackId != null) __obj.updateDynamic("ackId")(ackId.asInstanceOf[js.Any])
    if (pubsubEvent != null) __obj.updateDynamic("pubsubEvent")(pubsubEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPullResponse]
  }
}

