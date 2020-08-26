package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a build occurrence.
  */
@js.native
trait SchemaGrafeasV1beta1BuildDetails extends js.Object {
  /**
    * Required. The actual provenance for the build.
    */
  var provenance: js.UndefOr[SchemaBuildProvenance] = js.native
  /**
    * Serialized JSON representation of the provenance, used in generating the
    * build signature in the corresponding build note. After verifying the
    * signature, `provenance_bytes` can be unmarshalled and compared to the
    * provenance to confirm that it is unchanged. A base64-encoded string
    * representation of the provenance bytes is used for the signature in order
    * to interoperate with openssl which expects this format for signature
    * verification.  The serialized form is captured both to avoid ambiguity in
    * how the provenance is marshalled to json as well to prevent
    * incompatibilities with future changes.
    */
  var provenanceBytes: js.UndefOr[String] = js.native
}

object SchemaGrafeasV1beta1BuildDetails {
  @scala.inline
  def apply(): SchemaGrafeasV1beta1BuildDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1BuildDetails]
  }
  @scala.inline
  implicit class SchemaGrafeasV1beta1BuildDetailsOps[Self <: SchemaGrafeasV1beta1BuildDetails] (val x: Self) extends AnyVal {
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
    def setProvenance(value: SchemaBuildProvenance): Self = this.set("provenance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvenance: Self = this.set("provenance", js.undefined)
    @scala.inline
    def setProvenanceBytes(value: String): Self = this.set("provenanceBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvenanceBytes: Self = this.set("provenanceBytes", js.undefined)
  }
  
}

