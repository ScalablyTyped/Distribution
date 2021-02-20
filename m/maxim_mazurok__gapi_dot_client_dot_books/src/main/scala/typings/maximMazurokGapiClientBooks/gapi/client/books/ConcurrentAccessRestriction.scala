package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcurrentAccessRestriction extends StObject {
  
  /** Whether access is granted for this (user, device, volume). */
  var deviceAllowed: js.UndefOr[Boolean] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** The maximum number of concurrent access licenses for this volume. */
  var maxConcurrentDevices: js.UndefOr[Double] = js.native
  
  /** Error/warning message. */
  var message: js.UndefOr[String] = js.native
  
  /** Client nonce for verification. Download access and client-validation only. */
  var nonce: js.UndefOr[String] = js.native
  
  /** Error/warning reason code. */
  var reasonCode: js.UndefOr[String] = js.native
  
  /** Whether this volume has any concurrent access restrictions. */
  var restricted: js.UndefOr[Boolean] = js.native
  
  /** Response signature. */
  var signature: js.UndefOr[String] = js.native
  
  /** Client app identifier for verification. Download access and client-validation only. */
  var source: js.UndefOr[String] = js.native
  
  /** Time in seconds for license auto-expiration. */
  var timeWindowSeconds: js.UndefOr[Double] = js.native
  
  /** Identifies the volume for which this entry applies. */
  var volumeId: js.UndefOr[String] = js.native
}
object ConcurrentAccessRestriction {
  
  @scala.inline
  def apply(): ConcurrentAccessRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrentAccessRestriction]
  }
  
  @scala.inline
  implicit class ConcurrentAccessRestrictionMutableBuilder[Self <: ConcurrentAccessRestriction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceAllowed(value: Boolean): Self = StObject.set(x, "deviceAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceAllowedUndefined: Self = StObject.set(x, "deviceAllowed", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMaxConcurrentDevices(value: Double): Self = StObject.set(x, "maxConcurrentDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentDevicesUndefined: Self = StObject.set(x, "maxConcurrentDevices", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    @scala.inline
    def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTimeWindowSeconds(value: Double): Self = StObject.set(x, "timeWindowSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeWindowSecondsUndefined: Self = StObject.set(x, "timeWindowSeconds", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
