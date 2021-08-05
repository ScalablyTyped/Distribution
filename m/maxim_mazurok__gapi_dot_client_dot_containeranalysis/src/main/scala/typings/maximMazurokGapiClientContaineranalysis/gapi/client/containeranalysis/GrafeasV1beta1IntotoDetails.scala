package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1beta1IntotoDetails extends StObject {
  
  var signatures: js.UndefOr[js.Array[GrafeasV1beta1IntotoSignature]] = js.undefined
  
  var signed: js.UndefOr[Link] = js.undefined
}
object GrafeasV1beta1IntotoDetails {
  
  inline def apply(): GrafeasV1beta1IntotoDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1beta1IntotoDetails]
  }
  
  extension [Self <: GrafeasV1beta1IntotoDetails](x: Self) {
    
    inline def setSignatures(value: js.Array[GrafeasV1beta1IntotoSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    inline def setSignaturesVarargs(value: GrafeasV1beta1IntotoSignature*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    inline def setSigned(value: Link): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    
    inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
  }
}
