package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information a client needs to provision and register beacons that broadcast
  * Eddystone-EID format beacon IDs, using Elliptic curve Diffie-Hellman key
  * exchange. See [the Eddystone
  * specification](https://github.com/google/eddystone/tree/master/eddystone-eid)
  * at GitHub.
  */
@js.native
trait SchemaEphemeralIdRegistrationParams extends js.Object {
  /**
    * Indicates the maximum rotation period supported by the service. See
    * EddystoneEidRegistration.rotation_period_exponent
    */
  var maxRotationPeriodExponent: js.UndefOr[Double] = js.native
  /**
    * Indicates the minimum rotation period supported by the service. See
    * EddystoneEidRegistration.rotation_period_exponent
    */
  var minRotationPeriodExponent: js.UndefOr[Double] = js.native
  /**
    * The beacon service&#39;s public key for use by a beacon to derive its
    * Identity Key using Elliptic Curve Diffie-Hellman key exchange.
    */
  var serviceEcdhPublicKey: js.UndefOr[String] = js.native
}

object SchemaEphemeralIdRegistrationParams {
  @scala.inline
  def apply(
    maxRotationPeriodExponent: Int | Double = null,
    minRotationPeriodExponent: Int | Double = null,
    serviceEcdhPublicKey: String = null
  ): SchemaEphemeralIdRegistrationParams = {
    val __obj = js.Dynamic.literal()
    if (maxRotationPeriodExponent != null) __obj.updateDynamic("maxRotationPeriodExponent")(maxRotationPeriodExponent.asInstanceOf[js.Any])
    if (minRotationPeriodExponent != null) __obj.updateDynamic("minRotationPeriodExponent")(minRotationPeriodExponent.asInstanceOf[js.Any])
    if (serviceEcdhPublicKey != null) __obj.updateDynamic("serviceEcdhPublicKey")(serviceEcdhPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEphemeralIdRegistrationParams]
  }
}

