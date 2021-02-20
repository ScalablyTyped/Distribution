package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectAttachmentPartnerMetadata extends StObject {
  
  /**
    * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved
    * Partner values.
    */
  var interconnectName: js.UndefOr[String] = js.native
  
  /** Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values. */
  var partnerName: js.UndefOr[String] = js.native
  
  /**
    * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match
    * approved Partner values.
    */
  var portalUrl: js.UndefOr[String] = js.native
}
object InterconnectAttachmentPartnerMetadata {
  
  @scala.inline
  def apply(): InterconnectAttachmentPartnerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectAttachmentPartnerMetadata]
  }
  
  @scala.inline
  implicit class InterconnectAttachmentPartnerMetadataMutableBuilder[Self <: InterconnectAttachmentPartnerMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterconnectName(value: String): Self = StObject.set(x, "interconnectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterconnectNameUndefined: Self = StObject.set(x, "interconnectName", js.undefined)
    
    @scala.inline
    def setPartnerName(value: String): Self = StObject.set(x, "partnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerNameUndefined: Self = StObject.set(x, "partnerName", js.undefined)
    
    @scala.inline
    def setPortalUrl(value: String): Self = StObject.set(x, "portalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUrlUndefined: Self = StObject.set(x, "portalUrl", js.undefined)
  }
}
