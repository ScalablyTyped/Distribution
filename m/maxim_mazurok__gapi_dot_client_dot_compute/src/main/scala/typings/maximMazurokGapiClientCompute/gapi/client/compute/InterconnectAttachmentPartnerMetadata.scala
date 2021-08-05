package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterconnectAttachmentPartnerMetadata extends StObject {
  
  /**
    * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved
    * Partner values.
    */
  var interconnectName: js.UndefOr[String] = js.undefined
  
  /** Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values. */
  var partnerName: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match
    * approved Partner values.
    */
  var portalUrl: js.UndefOr[String] = js.undefined
}
object InterconnectAttachmentPartnerMetadata {
  
  inline def apply(): InterconnectAttachmentPartnerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectAttachmentPartnerMetadata]
  }
  
  extension [Self <: InterconnectAttachmentPartnerMetadata](x: Self) {
    
    inline def setInterconnectName(value: String): Self = StObject.set(x, "interconnectName", value.asInstanceOf[js.Any])
    
    inline def setInterconnectNameUndefined: Self = StObject.set(x, "interconnectName", js.undefined)
    
    inline def setPartnerName(value: String): Self = StObject.set(x, "partnerName", value.asInstanceOf[js.Any])
    
    inline def setPartnerNameUndefined: Self = StObject.set(x, "partnerName", js.undefined)
    
    inline def setPortalUrl(value: String): Self = StObject.set(x, "portalUrl", value.asInstanceOf[js.Any])
    
    inline def setPortalUrlUndefined: Self = StObject.set(x, "portalUrl", js.undefined)
  }
}
