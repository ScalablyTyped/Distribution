package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrafeasV1beta1IntotoDetails extends StObject {
  
  var signatures: js.UndefOr[js.Array[GrafeasV1beta1IntotoSignature]] = js.native
  
  var signed: js.UndefOr[Link] = js.native
}
object GrafeasV1beta1IntotoDetails {
  
  @scala.inline
  def apply(): GrafeasV1beta1IntotoDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1beta1IntotoDetails]
  }
  
  @scala.inline
  implicit class GrafeasV1beta1IntotoDetailsMutableBuilder[Self <: GrafeasV1beta1IntotoDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignatures(value: js.Array[GrafeasV1beta1IntotoSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    @scala.inline
    def setSignaturesVarargs(value: GrafeasV1beta1IntotoSignature*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    @scala.inline
    def setSigned(value: Link): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
  }
}
