package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of an attestation occurrence.
  */
@js.native
trait SchemaDetails extends StObject {
  
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
  implicit class SchemaDetailsMutableBuilder[Self <: SchemaDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttestation(value: SchemaAttestation): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
  }
}
