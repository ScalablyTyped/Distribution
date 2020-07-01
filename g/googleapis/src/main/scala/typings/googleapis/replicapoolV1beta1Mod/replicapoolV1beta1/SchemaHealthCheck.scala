package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaHealthCheck extends js.Object {
  /**
    * How often (in seconds) to make HTTP requests for this healthcheck. The
    * default value is 5 seconds.
    */
  var checkIntervalSec: js.UndefOr[Double] = js.native
  /**
    * The description for this health check.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The number of consecutive health check requests that need to succeed
    * before the replica is considered healthy again. The default value is 2.
    */
  var healthyThreshold: js.UndefOr[Double] = js.native
  /**
    * The value of the host header in the HTTP health check request. If left
    * empty (default value), the localhost IP 127.0.0.1 will be used.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The name of this health check.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The localhost request path to send this health check, in the format
    * /path/to/use. For example, /healthcheck.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The TCP port for the health check requests.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * How long (in seconds) to wait before a timeout failure for this
    * healthcheck. The default value is 5 seconds.
    */
  var timeoutSec: js.UndefOr[Double] = js.native
  /**
    * The number of consecutive health check requests that need to fail in
    * order to consider the replica unhealthy. The default value is 2.
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.native
}

object SchemaHealthCheck {
  @scala.inline
  def apply(
    checkIntervalSec: js.UndefOr[Double] = js.undefined,
    description: String = null,
    healthyThreshold: js.UndefOr[Double] = js.undefined,
    host: String = null,
    name: String = null,
    path: String = null,
    port: js.UndefOr[Double] = js.undefined,
    timeoutSec: js.UndefOr[Double] = js.undefined,
    unhealthyThreshold: js.UndefOr[Double] = js.undefined
  ): SchemaHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkIntervalSec)) __obj.updateDynamic("checkIntervalSec")(checkIntervalSec.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(healthyThreshold)) __obj.updateDynamic("healthyThreshold")(healthyThreshold.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutSec)) __obj.updateDynamic("timeoutSec")(timeoutSec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unhealthyThreshold)) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHealthCheck]
  }
}

