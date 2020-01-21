package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of an attestation occurrence.
  */
@js.native
trait SchemaDetails extends js.Object {
  /**
    * Required. Attestation for the resource.
    */
  var attestation: js.UndefOr[SchemaAttestation] = js.native
}

object SchemaDetails {
  @scala.inline
  def apply(attestation: SchemaAttestation = null): SchemaDetails = {
    val __obj = js.Dynamic.literal()
    if (attestation != null) __obj.updateDynamic("attestation")(attestation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDetails]
  }
}

