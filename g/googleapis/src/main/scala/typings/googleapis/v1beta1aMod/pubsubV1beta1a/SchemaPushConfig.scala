package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a push delivery endpoint.
  */
@js.native
trait SchemaPushConfig extends js.Object {
  /**
    * A URL locating the endpoint to which messages should be pushed. For
    * example, a Webhook endpoint might use
    * &quot;https://example.com/push&quot;.
    */
  var pushEndpoint: js.UndefOr[String] = js.native
}

object SchemaPushConfig {
  @scala.inline
  def apply(pushEndpoint: String = null): SchemaPushConfig = {
    val __obj = js.Dynamic.literal()
    if (pushEndpoint != null) __obj.updateDynamic("pushEndpoint")(pushEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPushConfig]
  }
}

