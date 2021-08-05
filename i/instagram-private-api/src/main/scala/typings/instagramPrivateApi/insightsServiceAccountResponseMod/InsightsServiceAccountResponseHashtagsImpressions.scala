package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseHashtagsImpressions extends StObject {
  
  var account_hashtags: InsightsServiceAccountResponseAccountHashtags
  
  var organic: InsightsServiceAccountResponseOrganic
}
object InsightsServiceAccountResponseHashtagsImpressions {
  
  inline def apply(
    account_hashtags: InsightsServiceAccountResponseAccountHashtags,
    organic: InsightsServiceAccountResponseOrganic
  ): InsightsServiceAccountResponseHashtagsImpressions = {
    val __obj = js.Dynamic.literal(account_hashtags = account_hashtags.asInstanceOf[js.Any], organic = organic.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseHashtagsImpressions]
  }
  
  extension [Self <: InsightsServiceAccountResponseHashtagsImpressions](x: Self) {
    
    inline def setAccount_hashtags(value: InsightsServiceAccountResponseAccountHashtags): Self = StObject.set(x, "account_hashtags", value.asInstanceOf[js.Any])
    
    inline def setOrganic(value: InsightsServiceAccountResponseOrganic): Self = StObject.set(x, "organic", value.asInstanceOf[js.Any])
  }
}
