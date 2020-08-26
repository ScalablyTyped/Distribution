package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An HealthCheck resource. This resource defines a template for how
  * individual virtual machines should be checked for health, via one of the
  * supported protocols.
  */
@js.native
trait SchemaHealthCheck extends js.Object {
  /**
    * How often (in seconds) to send a health check. The default value is 5
    * seconds.
    */
  var checkIntervalSec: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Creation timestamp in 3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A so-far unhealthy instance will be marked healthy after this many
    * consecutive successes. The default value is 2.
    */
  var healthyThreshold: js.UndefOr[Double] = js.native
  var http2HealthCheck: js.UndefOr[SchemaHTTP2HealthCheck] = js.native
  var httpHealthCheck: js.UndefOr[Schema$HTTPHealthCheck] = js.native
  var httpsHealthCheck: js.UndefOr[Schema$HTTPSHealthCheck] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  var sslHealthCheck: js.UndefOr[SchemaSSLHealthCheck] = js.native
  var tcpHealthCheck: js.UndefOr[SchemaTCPHealthCheck] = js.native
  /**
    * How long (in seconds) to wait before claiming failure. The default value
    * is 5 seconds. It is invalid for timeoutSec to have greater value than
    * checkIntervalSec.
    */
  var timeoutSec: js.UndefOr[Double] = js.native
  /**
    * Specifies the type of the healthCheck, either TCP, SSL, HTTP or HTTPS. If
    * not specified, the default is TCP. Exactly one of the protocol-specific
    * health check field must be specified, which must match type field.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A so-far healthy instance will be marked unhealthy after this many
    * consecutive failures. The default value is 2.
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHealthyThreshold(value: Double): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthyThreshold: Self = this.set("healthyThreshold", js.undefined)
    @scala.inline
    def setHttp2HealthCheck(value: SchemaHTTP2HealthCheck): Self = this.set("http2HealthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp2HealthCheck: Self = this.set("http2HealthCheck", js.undefined)
    @scala.inline
    def setHttpHealthCheck(value: Schema$HTTPHealthCheck): Self = this.set("httpHealthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpHealthCheck: Self = this.set("httpHealthCheck", js.undefined)
    @scala.inline
    def setHttpsHealthCheck(value: Schema$HTTPSHealthCheck): Self = this.set("httpsHealthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpsHealthCheck: Self = this.set("httpsHealthCheck", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setSslHealthCheck(value: SchemaSSLHealthCheck): Self = this.set("sslHealthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslHealthCheck: Self = this.set("sslHealthCheck", js.undefined)
    @scala.inline
    def setTcpHealthCheck(value: SchemaTCPHealthCheck): Self = this.set("tcpHealthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpHealthCheck: Self = this.set("tcpHealthCheck", js.undefined)
    @scala.inline
    def setTimeoutSec(value: Double): Self = this.set("timeoutSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutSec: Self = this.set("timeoutSec", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnhealthyThreshold(value: Double): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnhealthyThreshold: Self = this.set("unhealthyThreshold", js.undefined)
  }
  
}

