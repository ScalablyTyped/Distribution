package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepLink extends StObject {
  
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
  implicit class DeepLinkMutableBuilder[Self <: DeepLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUrlUndefined: Self = StObject.set(x, "appUrl", js.undefined)
    
    @scala.inline
    def setFallbackUrl(value: String): Self = StObject.set(x, "fallbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUrlUndefined: Self = StObject.set(x, "fallbackUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMobileApp(value: MobileApp): Self = StObject.set(x, "mobileApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileAppUndefined: Self = StObject.set(x, "mobileApp", js.undefined)
    
    @scala.inline
    def setRemarketingListIds(value: js.Array[String]): Self = StObject.set(x, "remarketingListIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarketingListIdsUndefined: Self = StObject.set(x, "remarketingListIds", js.undefined)
    
    @scala.inline
    def setRemarketingListIdsVarargs(value: String*): Self = StObject.set(x, "remarketingListIds", js.Array(value :_*))
  }
}
