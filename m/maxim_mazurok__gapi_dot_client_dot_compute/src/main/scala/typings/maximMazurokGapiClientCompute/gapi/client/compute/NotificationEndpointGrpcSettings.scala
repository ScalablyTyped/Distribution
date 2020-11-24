package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationEndpointGrpcSettings extends js.Object {
  
  /** Optional. If specified, this field is used to set the authority header by the sender of notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3 */
  var authority: js.UndefOr[String] = js.native
  
  /** Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name. */
  var endpoint: js.UndefOr[String] = js.native
  
  /** Optional. If specified, this field is used to populate the "name" field in gRPC requests. */
  var payloadName: js.UndefOr[String] = js.native
  
  /**
    * Optional. This field is used to configure how often to send a full update of all non-healthy backends. If unspecified, full updates are not sent. If specified, must be in the range
    * between 600 seconds to 3600 seconds. Nanos are disallowed.
    */
  var resendInterval: js.UndefOr[Duration] = js.native
  
  /** How much time (in seconds) is spent attempting notification retries until a successful response is received. Default is 30s. Limit is 20m (1200s). Must be a positive number. */
  var retryDurationSec: js.UndefOr[Double] = js.native
}
object NotificationEndpointGrpcSettings {
  
  @scala.inline
  def apply(): NotificationEndpointGrpcSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationEndpointGrpcSettings]
  }
  
  @scala.inline
  implicit class NotificationEndpointGrpcSettingsOps[Self <: NotificationEndpointGrpcSettings] (val x: Self) extends AnyVal {
    
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
    def setAuthority(value: String): Self = this.set("authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthority: Self = this.set("authority", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setPayloadName(value: String): Self = this.set("payloadName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadName: Self = this.set("payloadName", js.undefined)
    
    @scala.inline
    def setResendInterval(value: Duration): Self = this.set("resendInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResendInterval: Self = this.set("resendInterval", js.undefined)
    
    @scala.inline
    def setRetryDurationSec(value: Double): Self = this.set("retryDurationSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDurationSec: Self = this.set("retryDurationSec", js.undefined)
  }
}
