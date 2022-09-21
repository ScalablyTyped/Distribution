package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaLinkProposalStatusDetails extends StObject {
  
  /**
    * Output only. The source of this proposal.
    */
  var linkProposalInitiatingProduct: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of this proposal.
    */
  var linkProposalState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The email address of the user that proposed this linkage.
    */
  var requestorEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaLinkProposalStatusDetails {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaLinkProposalStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaLinkProposalStatusDetails]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaLinkProposalStatusDetails](x: Self) {
    
    inline def setLinkProposalInitiatingProduct(value: String): Self = StObject.set(x, "linkProposalInitiatingProduct", value.asInstanceOf[js.Any])
    
    inline def setLinkProposalInitiatingProductNull: Self = StObject.set(x, "linkProposalInitiatingProduct", null)
    
    inline def setLinkProposalInitiatingProductUndefined: Self = StObject.set(x, "linkProposalInitiatingProduct", js.undefined)
    
    inline def setLinkProposalState(value: String): Self = StObject.set(x, "linkProposalState", value.asInstanceOf[js.Any])
    
    inline def setLinkProposalStateNull: Self = StObject.set(x, "linkProposalState", null)
    
    inline def setLinkProposalStateUndefined: Self = StObject.set(x, "linkProposalState", js.undefined)
    
    inline def setRequestorEmail(value: String): Self = StObject.set(x, "requestorEmail", value.asInstanceOf[js.Any])
    
    inline def setRequestorEmailNull: Self = StObject.set(x, "requestorEmail", null)
    
    inline def setRequestorEmailUndefined: Self = StObject.set(x, "requestorEmail", js.undefined)
  }
}
