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
  def apply(): SchemaHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheck]
  }
  @scala.inline
  implicit class SchemaHealthCheckOps[Self <: SchemaHealthCheck] (val x: Self) extends AnyVal {
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
    def setCheckIntervalSec(value: Double): Self = this.set("checkIntervalSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckIntervalSec: Self = this.set("checkIntervalSec", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHealthyThreshold(value: Double): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthyThreshold: Self = this.set("healthyThreshold", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setTimeoutSec(value: Double): Self = this.set("timeoutSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutSec: Self = this.set("timeoutSec", js.undefined)
    @scala.inline
    def setUnhealthyThreshold(value: Double): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnhealthyThreshold: Self = this.set("unhealthyThreshold", js.undefined)
  }
  
}

