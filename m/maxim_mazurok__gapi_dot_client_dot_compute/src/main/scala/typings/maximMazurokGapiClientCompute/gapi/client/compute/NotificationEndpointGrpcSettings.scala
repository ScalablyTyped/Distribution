package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationEndpointGrpcSettings extends StObject {
  
  /** Optional. If specified, this field is used to set the authority header by the sender of notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3 */
  var authority: js.UndefOr[String] = js.undefined
  
  /** Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name. */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /** Optional. If specified, this field is used to populate the "name" field in gRPC requests. */
  var payloadName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. This field is used to configure how often to send a full update of all non-healthy backends. If unspecified, full updates are not sent. If specified, must be in the range
    * between 600 seconds to 3600 seconds. Nanos are disallowed.
    */
  var resendInterval: js.UndefOr[Duration] = js.undefined
  
  /** How much time (in seconds) is spent attempting notification retries until a successful response is received. Default is 30s. Limit is 20m (1200s). Must be a positive number. */
  var retryDurationSec: js.UndefOr[Double] = js.undefined
}
object NotificationEndpointGrpcSettings {
  
  @scala.inline
  def apply(): NotificationEndpointGrpcSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationEndpointGrpcSettings]
  }
  
  @scala.inline
  implicit class NotificationEndpointGrpcSettingsMutableBuilder[Self <: NotificationEndpointGrpcSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setPayloadName(value: String): Self = StObject.set(x, "payloadName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadNameUndefined: Self = StObject.set(x, "payloadName", js.undefined)
    
    @scala.inline
    def setResendInterval(value: Duration): Self = StObject.set(x, "resendInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResendIntervalUndefined: Self = StObject.set(x, "resendInterval", js.undefined)
    
    @scala.inline
    def setRetryDurationSec(value: Double): Self = StObject.set(x, "retryDurationSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDurationSecUndefined: Self = StObject.set(x, "retryDurationSec", js.undefined)
  }
}
