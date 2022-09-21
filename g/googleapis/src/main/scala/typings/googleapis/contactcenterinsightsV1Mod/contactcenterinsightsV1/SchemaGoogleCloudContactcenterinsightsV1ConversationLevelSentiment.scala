package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ConversationLevelSentiment extends StObject {
  
  /**
    * The channel of the audio that the data applies to.
    */
  var channelTag: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Data specifying sentiment.
    */
  var sentimentData: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1SentimentData] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ConversationLevelSentiment {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ConversationLevelSentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ConversationLevelSentiment]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ConversationLevelSentiment](x: Self) {
    
    inline def setChannelTag(value: Double): Self = StObject.set(x, "channelTag", value.asInstanceOf[js.Any])
    
    inline def setChannelTagNull: Self = StObject.set(x, "channelTag", null)
    
    inline def setChannelTagUndefined: Self = StObject.set(x, "channelTag", js.undefined)
    
    inline def setSentimentData(value: SchemaGoogleCloudContactcenterinsightsV1SentimentData): Self = StObject.set(x, "sentimentData", value.asInstanceOf[js.Any])
    
    inline def setSentimentDataUndefined: Self = StObject.set(x, "sentimentData", js.undefined)
  }
}
