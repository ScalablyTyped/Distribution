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
  def apply(): SchemaDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetails]
  }
  @scala.inline
  implicit class SchemaDetailsOps[Self <: SchemaDetails] (val x: Self) extends AnyVal {
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
    def setAttestation(value: SchemaAttestation): Self = this.set("attestation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttestation: Self = this.set("attestation", js.undefined)
  }
  
}

