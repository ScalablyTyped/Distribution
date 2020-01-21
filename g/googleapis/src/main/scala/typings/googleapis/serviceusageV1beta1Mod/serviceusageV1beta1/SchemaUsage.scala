package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration controlling usage of a service.
  */
@js.native
trait SchemaUsage extends js.Object {
  /**
    * The full resource name of a channel used for sending notifications to the
    * service producer.  Google Service Management currently only supports
    * [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification
    * channel. To use Google Cloud Pub/Sub as the channel, this must be the
    * name of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name
    * format documented in https://cloud.google.com/pubsub/docs/overview.
    */
  var producerNotificationChannel: js.UndefOr[String] = js.native
  /**
    * Requirements that must be satisfied before a consumer project can use the
    * service. Each requirement is of the form
    * &lt;service.name&gt;/&lt;requirement-id&gt;; for example
    * &#39;serviceusage.googleapis.com/billing-enabled&#39;.
    */
  var requirements: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of usage rules that apply to individual API methods.  **NOTE:**
    * All service configuration rules follow &quot;last one wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaUsageRule]] = js.native
}

object SchemaUsage {
  @scala.inline
  def apply(
    producerNotificationChannel: String = null,
    requirements: js.Array[String] = null,
    rules: js.Array[SchemaUsageRule] = null
  ): SchemaUsage = {
    val __obj = js.Dynamic.literal()
    if (producerNotificationChannel != null) __obj.updateDynamic("producerNotificationChannel")(producerNotificationChannel.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUsage]
  }
}

