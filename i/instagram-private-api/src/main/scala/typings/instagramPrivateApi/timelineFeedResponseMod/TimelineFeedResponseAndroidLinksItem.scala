package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseAndroidLinksItem extends StObject {
  
  @JSName("package")
  var _package: String
  
  var androidClass: String
  
  var appInstallObjectiveInvalidationBehavior: Null
  
  var callToActionTitle: String
  
  var deeplinkUri: String
  
  var igUserId: Null
  
  var leadGenFormId: String | Double
  
  var linkType: Double
  
  var redirectUri: String
  
  var webUri: String
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
  implicit class TimelineFeedResponseAndroidLinksItemMutableBuilder[Self <: TimelineFeedResponseAndroidLinksItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidClass(value: String): Self = StObject.set(x, "androidClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstallObjectiveInvalidationBehavior(value: Null): Self = StObject.set(x, "appInstallObjectiveInvalidationBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallToActionTitle(value: String): Self = StObject.set(x, "callToActionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeeplinkUri(value: String): Self = StObject.set(x, "deeplinkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgUserId(value: Null): Self = StObject.set(x, "igUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadGenFormId(value: String | Double): Self = StObject.set(x, "leadGenFormId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkType(value: Double): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUri(value: String): Self = StObject.set(x, "webUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
