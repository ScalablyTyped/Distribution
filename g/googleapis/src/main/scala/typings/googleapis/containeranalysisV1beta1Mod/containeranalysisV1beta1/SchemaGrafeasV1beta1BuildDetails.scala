package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of a build occurrence.
  */
@js.native
trait SchemaGrafeasV1beta1BuildDetails extends StObject {
  
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
  implicit class SchemaGrafeasV1beta1BuildDetailsMutableBuilder[Self <: SchemaGrafeasV1beta1BuildDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvenance(value: SchemaBuildProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvenanceBytes(value: String): Self = StObject.set(x, "provenanceBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvenanceBytesUndefined: Self = StObject.set(x, "provenanceBytes", js.undefined)
    
    @scala.inline
    def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
  }
}
