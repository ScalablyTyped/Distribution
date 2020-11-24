package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseHashtagsImpressions extends js.Object {
  
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
  implicit class InsightsServiceAccountResponseHashtagsImpressionsOps[Self <: InsightsServiceAccountResponseHashtagsImpressions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount_hashtags(value: InsightsServiceAccountResponseAccountHashtags): Self = this.set("account_hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic(value: InsightsServiceAccountResponseOrganic): Self = this.set("organic", value.asInstanceOf[js.Any])
  }
}
