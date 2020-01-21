package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the ModifyPushConfig method.
  */
@js.native
trait SchemaModifyPushConfigRequest extends js.Object {
  /**
    * An empty &lt;code&gt;push_config&lt;/code&gt; indicates that the Pub/Sub
    * system should pause pushing messages from the given subscription.
    */
  var pushConfig: js.UndefOr[SchemaPushConfig] = js.native
  /**
    * The name of the subscription.
    */
  var subscription: js.UndefOr[String] = js.native
}

object SchemaModifyPushConfigRequest {
  @scala.inline
  def apply(pushConfig: SchemaPushConfig = null, subscription: String = null): SchemaModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (pushConfig != null) __obj.updateDynamic("pushConfig")(pushConfig.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModifyPushConfigRequest]
  }
}

