package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a pubsub location to use for transferring data into or out of a
  * streaming Dataflow job.
  */
@js.native
trait SchemaPubsubLocation extends js.Object {
  /**
    * Indicates whether the pipeline allows late-arriving data.
    */
  var dropLateData: js.UndefOr[Boolean] = js.native
  /**
    * If set, contains a pubsub label from which to extract record ids. If left
    * empty, record deduplication will be strictly best effort.
    */
  var idLabel: js.UndefOr[String] = js.native
  /**
    * A pubsub subscription, in the form of
    * &quot;pubsub.googleapis.com/subscriptions/&lt;project-id&gt;/&lt;subscription-name&gt;&quot;
    */
  var subscription: js.UndefOr[String] = js.native
  /**
    * If set, contains a pubsub label from which to extract record timestamps.
    * If left empty, record timestamps will be generated upon arrival.
    */
  var timestampLabel: js.UndefOr[String] = js.native
  /**
    * A pubsub topic, in the form of
    * &quot;pubsub.googleapis.com/topics/&lt;project-id&gt;/&lt;topic-name&gt;&quot;
    */
  var topic: js.UndefOr[String] = js.native
  /**
    * If set, specifies the pubsub subscription that will be used for tracking
    * custom time timestamps for watermark estimation.
    */
  var trackingSubscription: js.UndefOr[String] = js.native
  /**
    * If true, then the client has requested to get pubsub attributes.
    */
  var withAttributes: js.UndefOr[Boolean] = js.native
}

object SchemaPubsubLocation {
  @scala.inline
  def apply(
    dropLateData: js.UndefOr[Boolean] = js.undefined,
    idLabel: String = null,
    subscription: String = null,
    timestampLabel: String = null,
    topic: String = null,
    trackingSubscription: String = null,
    withAttributes: js.UndefOr[Boolean] = js.undefined
  ): SchemaPubsubLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropLateData)) __obj.updateDynamic("dropLateData")(dropLateData.get.asInstanceOf[js.Any])
    if (idLabel != null) __obj.updateDynamic("idLabel")(idLabel.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (timestampLabel != null) __obj.updateDynamic("timestampLabel")(timestampLabel.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (trackingSubscription != null) __obj.updateDynamic("trackingSubscription")(trackingSubscription.asInstanceOf[js.Any])
    if (!js.isUndefined(withAttributes)) __obj.updateDynamic("withAttributes")(withAttributes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPubsubLocation]
  }
}

