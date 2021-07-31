package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignCreativeAssociation extends StObject {
  
  /** ID of the creative associated with the campaign. This is a required field. */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaignCreativeAssociation". */
  var kind: js.UndefOr[String] = js.undefined
}
object CampaignCreativeAssociation {
  
  @scala.inline
  def apply(): CampaignCreativeAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignCreativeAssociation]
  }
  
  @scala.inline
  implicit class CampaignCreativeAssociationMutableBuilder[Self <: CampaignCreativeAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
