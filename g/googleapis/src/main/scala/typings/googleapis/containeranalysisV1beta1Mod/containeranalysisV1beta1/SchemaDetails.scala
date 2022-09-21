package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetails extends StObject {
  
  /**
    * Required. Attestation for the resource.
    */
  var attestation: js.UndefOr[SchemaAttestation] = js.undefined
}
object SchemaDetails {
  
  inline def apply(): SchemaDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetails]
  }
  
  extension [Self <: SchemaDetails](x: Self) {
    
    inline def setAttestation(value: SchemaAttestation): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
  }
}
