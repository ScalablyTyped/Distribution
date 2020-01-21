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
  def apply(provenance: SchemaBuildProvenance = null, provenanceBytes: String = null): SchemaGrafeasV1beta1BuildDetails = {
    val __obj = js.Dynamic.literal()
    if (provenance != null) __obj.updateDynamic("provenance")(provenance.asInstanceOf[js.Any])
    if (provenanceBytes != null) __obj.updateDynamic("provenanceBytes")(provenanceBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGrafeasV1beta1BuildDetails]
  }
}

