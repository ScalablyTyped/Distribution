package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The auditDetails object encapsulates channel data that is relevant for
  * YouTube Partners during the audit process.
  */
trait SchemaChannelAuditDetails extends StObject {
  
  /**
    * Whether or not the channel respects the community guidelines.
    */
  var communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not the channel has any unresolved claims.
    */
  var contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not the channel has any copyright strikes.
    */
  var copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.undefined
}
object SchemaChannelAuditDetails {
  
  inline def apply(): SchemaChannelAuditDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelAuditDetails]
  }
  
  extension [Self <: SchemaChannelAuditDetails](x: Self) {
    
    inline def setCommunityGuidelinesGoodStanding(value: Boolean): Self = StObject.set(x, "communityGuidelinesGoodStanding", value.asInstanceOf[js.Any])
    
    inline def setCommunityGuidelinesGoodStandingUndefined: Self = StObject.set(x, "communityGuidelinesGoodStanding", js.undefined)
    
    inline def setContentIdClaimsGoodStanding(value: Boolean): Self = StObject.set(x, "contentIdClaimsGoodStanding", value.asInstanceOf[js.Any])
    
    inline def setContentIdClaimsGoodStandingUndefined: Self = StObject.set(x, "contentIdClaimsGoodStanding", js.undefined)
    
    inline def setCopyrightStrikesGoodStanding(value: Boolean): Self = StObject.set(x, "copyrightStrikesGoodStanding", value.asInstanceOf[js.Any])
    
    inline def setCopyrightStrikesGoodStandingUndefined: Self = StObject.set(x, "copyrightStrikesGoodStanding", js.undefined)
  }
}
