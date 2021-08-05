package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseHashtagsImpressions extends StObject {
  
  var hashtags: InsightsServicePostResponseHashtags
  
  var organic: InsightsServicePostResponseOrganic
}
object InsightsServicePostResponseHashtagsImpressions {
  
  inline def apply(hashtags: InsightsServicePostResponseHashtags, organic: InsightsServicePostResponseOrganic): InsightsServicePostResponseHashtagsImpressions = {
    val __obj = js.Dynamic.literal(hashtags = hashtags.asInstanceOf[js.Any], organic = organic.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseHashtagsImpressions]
  }
  
  extension [Self <: InsightsServicePostResponseHashtagsImpressions](x: Self) {
    
    inline def setHashtags(value: InsightsServicePostResponseHashtags): Self = StObject.set(x, "hashtags", value.asInstanceOf[js.Any])
    
    inline def setOrganic(value: InsightsServicePostResponseOrganic): Self = StObject.set(x, "organic", value.asInstanceOf[js.Any])
  }
}
