package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a PubSub connector used by the job.
  */
@js.native
trait SchemaPubSubIODetails extends js.Object {
  /**
    * Subscription used in the connection.
    */
  var subscription: js.UndefOr[String] = js.native
  /**
    * Topic accessed in the connection.
    */
  var topic: js.UndefOr[String] = js.native
}

object SchemaPubSubIODetails {
  @scala.inline
  def apply(subscription: String = null, topic: String = null): SchemaPubSubIODetails = {
    val __obj = js.Dynamic.literal()
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPubSubIODetails]
  }
}

