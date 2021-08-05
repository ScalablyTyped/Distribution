package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information a client needs to provision and register beacons that broadcast
  * Eddystone-EID format beacon IDs, using Elliptic curve Diffie-Hellman key
  * exchange. See [the Eddystone
  * specification](https://github.com/google/eddystone/tree/master/eddystone-eid)
  * at GitHub.
  */
trait SchemaEphemeralIdRegistrationParams extends StObject {
  
  /**
    * Indicates the maximum rotation period supported by the service. See
    * EddystoneEidRegistration.rotation_period_exponent
    */
  var maxRotationPeriodExponent: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the minimum rotation period supported by the service. See
    * EddystoneEidRegistration.rotation_period_exponent
    */
  var minRotationPeriodExponent: js.UndefOr[Double] = js.undefined
  
  /**
    * The beacon service&#39;s public key for use by a beacon to derive its
    * Identity Key using Elliptic Curve Diffie-Hellman key exchange.
    */
  var serviceEcdhPublicKey: js.UndefOr[String] = js.undefined
}
object SchemaEphemeralIdRegistrationParams {
  
  inline def apply(): SchemaEphemeralIdRegistrationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEphemeralIdRegistrationParams]
  }
  
  extension [Self <: SchemaEphemeralIdRegistrationParams](x: Self) {
    
    inline def setMaxRotationPeriodExponent(value: Double): Self = StObject.set(x, "maxRotationPeriodExponent", value.asInstanceOf[js.Any])
    
    inline def setMaxRotationPeriodExponentUndefined: Self = StObject.set(x, "maxRotationPeriodExponent", js.undefined)
    
    inline def setMinRotationPeriodExponent(value: Double): Self = StObject.set(x, "minRotationPeriodExponent", value.asInstanceOf[js.Any])
    
    inline def setMinRotationPeriodExponentUndefined: Self = StObject.set(x, "minRotationPeriodExponent", js.undefined)
    
    inline def setServiceEcdhPublicKey(value: String): Self = StObject.set(x, "serviceEcdhPublicKey", value.asInstanceOf[js.Any])
    
    inline def setServiceEcdhPublicKeyUndefined: Self = StObject.set(x, "serviceEcdhPublicKey", js.undefined)
  }
}
