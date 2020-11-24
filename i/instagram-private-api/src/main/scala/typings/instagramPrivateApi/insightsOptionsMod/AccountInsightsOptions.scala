package typings.instagramPrivateApi.insightsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountInsightsOptions extends js.Object {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var activityTab: js.UndefOr[Boolean] = js.native
  
  var audienceTab: js.UndefOr[Boolean] = js.native
  
  var contentTab: js.UndefOr[Boolean] = js.native
  
  var gridMediaSize: js.UndefOr[Double] = js.native
  
  var userId: js.UndefOr[String] = js.native
}
object AccountInsightsOptions {
  
  @scala.inline
  def apply(): AccountInsightsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountInsightsOptions]
  }
  
  @scala.inline
  implicit class AccountInsightsOptionsOps[Self <: AccountInsightsOptions] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setActivityTab(value: Boolean): Self = this.set("activityTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityTab: Self = this.set("activityTab", js.undefined)
    
    @scala.inline
    def setAudienceTab(value: Boolean): Self = this.set("audienceTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudienceTab: Self = this.set("audienceTab", js.undefined)
    
    @scala.inline
    def setContentTab(value: Boolean): Self = this.set("contentTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTab: Self = this.set("contentTab", js.undefined)
    
    @scala.inline
    def setGridMediaSize(value: Double): Self = this.set("gridMediaSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridMediaSize: Self = this.set("gridMediaSize", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
