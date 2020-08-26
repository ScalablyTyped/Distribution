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
  def apply(): SchemaPubsubLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubLocation]
  }
  @scala.inline
  implicit class SchemaPubsubLocationOps[Self <: SchemaPubsubLocation] (val x: Self) extends AnyVal {
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
    def setDropLateData(value: Boolean): Self = this.set("dropLateData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropLateData: Self = this.set("dropLateData", js.undefined)
    @scala.inline
    def setIdLabel(value: String): Self = this.set("idLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdLabel: Self = this.set("idLabel", js.undefined)
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
    @scala.inline
    def setTimestampLabel(value: String): Self = this.set("timestampLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampLabel: Self = this.set("timestampLabel", js.undefined)
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    @scala.inline
    def setTrackingSubscription(value: String): Self = this.set("trackingSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingSubscription: Self = this.set("trackingSubscription", js.undefined)
    @scala.inline
    def setWithAttributes(value: Boolean): Self = this.set("withAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithAttributes: Self = this.set("withAttributes", js.undefined)
  }
  
}

