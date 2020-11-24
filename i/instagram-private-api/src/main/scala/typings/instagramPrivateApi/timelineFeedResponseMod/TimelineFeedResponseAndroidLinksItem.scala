package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponseAndroidLinksItem extends js.Object {
  
  @JSName("package")
  var _package: String = js.native
  
  var androidClass: String = js.native
  
  var appInstallObjectiveInvalidationBehavior: Null = js.native
  
  var callToActionTitle: String = js.native
  
  var deeplinkUri: String = js.native
  
  var igUserId: Null = js.native
  
  var leadGenFormId: String | Double = js.native
  
  var linkType: Double = js.native
  
  var redirectUri: String = js.native
  
  var webUri: String = js.native
}
object TimelineFeedResponseAndroidLinksItem {
  
  @scala.inline
  def apply(
    _package: String,
    androidClass: String,
    appInstallObjectiveInvalidationBehavior: Null,
    callToActionTitle: String,
    deeplinkUri: String,
    igUserId: Null,
    leadGenFormId: String | Double,
    linkType: Double,
    redirectUri: String,
    webUri: String
  ): TimelineFeedResponseAndroidLinksItem = {
    val __obj = js.Dynamic.literal(androidClass = androidClass.asInstanceOf[js.Any], appInstallObjectiveInvalidationBehavior = appInstallObjectiveInvalidationBehavior.asInstanceOf[js.Any], callToActionTitle = callToActionTitle.asInstanceOf[js.Any], deeplinkUri = deeplinkUri.asInstanceOf[js.Any], igUserId = igUserId.asInstanceOf[js.Any], leadGenFormId = leadGenFormId.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], webUri = webUri.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseAndroidLinksItem]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseAndroidLinksItemOps[Self <: TimelineFeedResponseAndroidLinksItem] (val x: Self) extends AnyVal {
    
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
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidClass(value: String): Self = this.set("androidClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstallObjectiveInvalidationBehavior(value: Null): Self = this.set("appInstallObjectiveInvalidationBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallToActionTitle(value: String): Self = this.set("callToActionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeeplinkUri(value: String): Self = this.set("deeplinkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgUserId(value: Null): Self = this.set("igUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadGenFormId(value: String | Double): Self = this.set("leadGenFormId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkType(value: Double): Self = this.set("linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUri(value: String): Self = this.set("webUri", value.asInstanceOf[js.Any])
  }
}
