package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttestation extends StObject {
  
  var genericSignedAttestation: js.UndefOr[SchemaGenericSignedAttestation] = js.undefined
  
  /**
    * A PGP signed attestation.
    */
  var pgpSignedAttestation: js.UndefOr[SchemaPgpSignedAttestation] = js.undefined
}
object SchemaAttestation {
  
  inline def apply(): SchemaAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestation]
  }
  
  extension [Self <: SchemaAttestation](x: Self) {
    
    inline def setGenericSignedAttestation(value: SchemaGenericSignedAttestation): Self = StObject.set(x, "genericSignedAttestation", value.asInstanceOf[js.Any])
    
    inline def setGenericSignedAttestationUndefined: Self = StObject.set(x, "genericSignedAttestation", js.undefined)
    
    inline def setPgpSignedAttestation(value: SchemaPgpSignedAttestation): Self = StObject.set(x, "pgpSignedAttestation", value.asInstanceOf[js.Any])
    
    inline def setPgpSignedAttestationUndefined: Self = StObject.set(x, "pgpSignedAttestation", js.undefined)
  }
}
