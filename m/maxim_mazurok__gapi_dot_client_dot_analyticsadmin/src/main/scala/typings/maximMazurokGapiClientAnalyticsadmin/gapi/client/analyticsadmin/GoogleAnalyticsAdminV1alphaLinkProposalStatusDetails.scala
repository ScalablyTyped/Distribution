package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaLinkProposalStatusDetails extends StObject {
  
  /** Output only. The source of this proposal. */
  var linkProposalInitiatingProduct: js.UndefOr[String] = js.undefined
  
  /** Output only. The state of this proposal. */
  var linkProposalState: js.UndefOr[String] = js.undefined
  
  /** Output only. The email address of the user that proposed this linkage. */
  var requestorEmail: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaLinkProposalStatusDetails {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaLinkProposalStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaLinkProposalStatusDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaLinkProposalStatusDetails] (val x: Self) extends AnyVal {
    
    inline def setLinkProposalInitiatingProduct(value: String): Self = StObject.set(x, "linkProposalInitiatingProduct", value.asInstanceOf[js.Any])
    
    inline def setLinkProposalInitiatingProductUndefined: Self = StObject.set(x, "linkProposalInitiatingProduct", js.undefined)
    
    inline def setLinkProposalState(value: String): Self = StObject.set(x, "linkProposalState", value.asInstanceOf[js.Any])
    
    inline def setLinkProposalStateUndefined: Self = StObject.set(x, "linkProposalState", js.undefined)
    
    inline def setRequestorEmail(value: String): Self = StObject.set(x, "requestorEmail", value.asInstanceOf[js.Any])
    
    inline def setRequestorEmailUndefined: Self = StObject.set(x, "requestorEmail", js.undefined)
  }
}
