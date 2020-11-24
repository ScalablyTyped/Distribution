package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseHashtagsImpressions extends js.Object {
  
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
  implicit class InsightsServicePostResponseHashtagsImpressionsOps[Self <: InsightsServicePostResponseHashtagsImpressions] (val x: Self) extends AnyVal {
    
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
    def setHashtags(value: InsightsServicePostResponseHashtags): Self = this.set("hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic(value: InsightsServicePostResponseOrganic): Self = this.set("organic", value.asInstanceOf[js.Any])
  }
}
