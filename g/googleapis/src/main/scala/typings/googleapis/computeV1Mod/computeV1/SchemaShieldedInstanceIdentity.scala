package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A shielded Instance identity entry.
  */
@js.native
trait SchemaShieldedInstanceIdentity extends js.Object {
  /**
    * An Endorsement Key (EK) issued to the Shielded Instance&#39;s vTPM.
    */
  var encryptionKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.native
  /**
    * [Output Only] Type of the resource. Always
    * compute#shieldedInstanceIdentity for shielded Instance identity entry.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An Attestation Key (AK) issued to the Shielded Instance&#39;s vTPM.
    */
  var signingKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.native
}

object SchemaShieldedInstanceIdentity {
  @scala.inline
  def apply(
    encryptionKey: SchemaShieldedInstanceIdentityEntry = null,
    kind: String = null,
    signingKey: SchemaShieldedInstanceIdentityEntry = null
  ): SchemaShieldedInstanceIdentity = {
    val __obj = js.Dynamic.literal()
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (signingKey != null) __obj.updateDynamic("signingKey")(signingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShieldedInstanceIdentity]
  }
}

