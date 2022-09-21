package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1beta1IntotoDetails extends StObject {
  
  var signatures: js.UndefOr[js.Array[SchemaGrafeasV1beta1IntotoSignature]] = js.undefined
  
  var signed: js.UndefOr[SchemaLink] = js.undefined
}
object SchemaGrafeasV1beta1IntotoDetails {
  
  inline def apply(): SchemaGrafeasV1beta1IntotoDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1IntotoDetails]
  }
  
  extension [Self <: SchemaGrafeasV1beta1IntotoDetails](x: Self) {
    
    inline def setSignatures(value: js.Array[SchemaGrafeasV1beta1IntotoSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    inline def setSignaturesVarargs(value: SchemaGrafeasV1beta1IntotoSignature*): Self = StObject.set(x, "signatures", js.Array(value*))
    
    inline def setSigned(value: SchemaLink): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    
    inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
  }
}
