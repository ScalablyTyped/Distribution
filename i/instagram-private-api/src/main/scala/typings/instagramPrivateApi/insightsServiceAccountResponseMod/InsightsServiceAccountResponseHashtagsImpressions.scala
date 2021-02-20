package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseHashtagsImpressions extends StObject {
  
  var account_hashtags: InsightsServiceAccountResponseAccountHashtags = js.native
  
  var organic: InsightsServiceAccountResponseOrganic = js.native
}
object InsightsServiceAccountResponseHashtagsImpressions {
  
  @scala.inline
  def apply(
    account_hashtags: InsightsServiceAccountResponseAccountHashtags,
    organic: InsightsServiceAccountResponseOrganic
  ): InsightsServiceAccountResponseHashtagsImpressions = {
    val __obj = js.Dynamic.literal(account_hashtags = account_hashtags.asInstanceOf[js.Any], organic = organic.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseHashtagsImpressions]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseHashtagsImpressionsMutableBuilder[Self <: InsightsServiceAccountResponseHashtagsImpressions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_hashtags(value: InsightsServiceAccountResponseAccountHashtags): Self = StObject.set(x, "account_hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic(value: InsightsServiceAccountResponseOrganic): Self = StObject.set(x, "organic", value.asInstanceOf[js.Any])
  }
}
