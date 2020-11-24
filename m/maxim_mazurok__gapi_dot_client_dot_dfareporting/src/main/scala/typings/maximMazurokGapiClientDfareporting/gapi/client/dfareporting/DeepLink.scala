package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepLink extends js.Object {
  
  /** The URL of the mobile app being linked to. */
  var appUrl: js.UndefOr[String] = js.native
  
  /** The fallback URL. This URL will be served to users who do not have the mobile app installed. */
  var fallbackUrl: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#deepLink". */
  var kind: js.UndefOr[String] = js.native
  
  /** The mobile app targeted by this deep link. */
  var mobileApp: js.UndefOr[MobileApp] = js.native
  
  /** Ads served to users on these remarketing lists will use this deep link. Applicable when mobileApp.directory is APPLE_APP_STORE. */
  var remarketingListIds: js.UndefOr[js.Array[String]] = js.native
}
object DeepLink {
  
  @scala.inline
  def apply(): DeepLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepLink]
  }
  
  @scala.inline
  implicit class DeepLinkOps[Self <: DeepLink] (val x: Self) extends AnyVal {
    
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
    def setAppUrl(value: String): Self = this.set("appUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppUrl: Self = this.set("appUrl", js.undefined)
    
    @scala.inline
    def setFallbackUrl(value: String): Self = this.set("fallbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackUrl: Self = this.set("fallbackUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMobileApp(value: MobileApp): Self = this.set("mobileApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileApp: Self = this.set("mobileApp", js.undefined)
    
    @scala.inline
    def setRemarketingListIdsVarargs(value: String*): Self = this.set("remarketingListIds", js.Array(value :_*))
    
    @scala.inline
    def setRemarketingListIds(value: js.Array[String]): Self = this.set("remarketingListIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarketingListIds: Self = this.set("remarketingListIds", js.undefined)
  }
}
