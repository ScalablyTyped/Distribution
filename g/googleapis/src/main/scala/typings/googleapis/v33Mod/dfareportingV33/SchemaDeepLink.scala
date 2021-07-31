package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a landing page deep link.
  */
trait SchemaDeepLink extends StObject {
  
  /**
    * The URL of the mobile app being linked to.
    */
  var appUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The fallback URL. This URL will be served to users who do not have the
    * mobile app installed.
    */
  var fallbackUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#deepLink&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The mobile app targeted by this deep link.
    */
  var mobileApp: js.UndefOr[SchemaMobileApp] = js.undefined
  
  /**
    * Ads served to users on these remarketing lists will use this deep link.
    * Applicable when mobileApp.directory is APPLE_APP_STORE.
    */
  var remarketingListIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaDeepLink {
  
  @scala.inline
  def apply(): SchemaDeepLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeepLink]
  }
  
  @scala.inline
  implicit class SchemaDeepLinkMutableBuilder[Self <: SchemaDeepLink] (val x: Self) extends AnyVal {
    
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
    def setMobileApp(value: SchemaMobileApp): Self = StObject.set(x, "mobileApp", value.asInstanceOf[js.Any])
    
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
