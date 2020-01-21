package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Publish method.
  */
@js.native
trait SchemaPublishRequest extends js.Object {
  /**
    * The message to publish.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.native
  /**
    * The message in the request will be published on this topic.
    */
  var topic: js.UndefOr[String] = js.native
}

object SchemaPublishRequest {
  @scala.inline
  def apply(message: SchemaPubsubMessage = null, topic: String = null): SchemaPublishRequest = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPublishRequest]
  }
}

