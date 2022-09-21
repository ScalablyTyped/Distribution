package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ConversationCallMetadata extends StObject {
  
  /**
    * The audio channel that contains the agent.
    */
  var agentChannel: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The audio channel that contains the customer.
    */
  var customerChannel: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ConversationCallMetadata {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ConversationCallMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ConversationCallMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ConversationCallMetadata](x: Self) {
    
    inline def setAgentChannel(value: Double): Self = StObject.set(x, "agentChannel", value.asInstanceOf[js.Any])
    
    inline def setAgentChannelNull: Self = StObject.set(x, "agentChannel", null)
    
    inline def setAgentChannelUndefined: Self = StObject.set(x, "agentChannel", js.undefined)
    
    inline def setCustomerChannel(value: Double): Self = StObject.set(x, "customerChannel", value.asInstanceOf[js.Any])
    
    inline def setCustomerChannelNull: Self = StObject.set(x, "customerChannel", null)
    
    inline def setCustomerChannelUndefined: Self = StObject.set(x, "customerChannel", js.undefined)
  }
}
