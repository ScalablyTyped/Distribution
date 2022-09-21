package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOccurrence extends StObject {
  
  /** Deprecated. See InTotoStatement for the replacement. In-toto Provenance representation as defined in spec. */
  var intotoProvenance: js.UndefOr[InTotoProvenance] = js.undefined
  
  /**
    * In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the
    * Occurrence's envelope.
    */
  var intotoStatement: js.UndefOr[InTotoStatement] = js.undefined
  
  /** The actual provenance for the build. */
  var provenance: js.UndefOr[BuildProvenance] = js.undefined
  
  /**
    * Serialized JSON representation of the provenance, used in generating the build signature in the corresponding build note. After verifying the signature, `provenance_bytes` can be
    * unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to
    * interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json
    * as well to prevent incompatibilities with future changes.
    */
  var provenanceBytes: js.UndefOr[String] = js.undefined
}
object BuildOccurrence {
  
  inline def apply(): BuildOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOccurrence]
  }
  
  extension [Self <: BuildOccurrence](x: Self) {
    
    inline def setIntotoProvenance(value: InTotoProvenance): Self = StObject.set(x, "intotoProvenance", value.asInstanceOf[js.Any])
    
    inline def setIntotoProvenanceUndefined: Self = StObject.set(x, "intotoProvenance", js.undefined)
    
    inline def setIntotoStatement(value: InTotoStatement): Self = StObject.set(x, "intotoStatement", value.asInstanceOf[js.Any])
    
    inline def setIntotoStatementUndefined: Self = StObject.set(x, "intotoStatement", js.undefined)
    
    inline def setProvenance(value: BuildProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceBytes(value: String): Self = StObject.set(x, "provenanceBytes", value.asInstanceOf[js.Any])
    
    inline def setProvenanceBytesUndefined: Self = StObject.set(x, "provenanceBytes", js.undefined)
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
  }
}
