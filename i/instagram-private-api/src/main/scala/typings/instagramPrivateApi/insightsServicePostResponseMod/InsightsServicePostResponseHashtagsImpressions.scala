package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseHashtagsImpressions extends StObject {
  
  var hashtags: InsightsServicePostResponseHashtags = js.native
  
  var organic: InsightsServicePostResponseOrganic = js.native
}
object InsightsServicePostResponseHashtagsImpressions {
  
  @scala.inline
  def apply(hashtags: InsightsServicePostResponseHashtags, organic: InsightsServicePostResponseOrganic): InsightsServicePostResponseHashtagsImpressions = {
    val __obj = js.Dynamic.literal(hashtags = hashtags.asInstanceOf[js.Any], organic = organic.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseHashtagsImpressions]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseHashtagsImpressionsMutableBuilder[Self <: InsightsServicePostResponseHashtagsImpressions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashtags(value: InsightsServicePostResponseHashtags): Self = StObject.set(x, "hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic(value: InsightsServicePostResponseOrganic): Self = StObject.set(x, "organic", value.asInstanceOf[js.Any])
  }
}
