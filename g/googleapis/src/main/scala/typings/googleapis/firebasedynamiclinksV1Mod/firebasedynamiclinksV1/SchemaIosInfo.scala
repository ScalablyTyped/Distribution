package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosInfo extends StObject {
  
  /**
    * iOS App Store ID.
    */
  var iosAppStoreId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * iOS bundle ID of the app.
    */
  var iosBundleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom (destination) scheme to use for iOS. By default, we’ll use the bundle ID as the custom scheme. Developer can override this behavior using this param.
    */
  var iosCustomScheme: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to open on iOS if the app is not installed.
    */
  var iosFallbackLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * iPad bundle ID of the app.
    */
  var iosIpadBundleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If specified, this overrides the ios_fallback_link value on iPads.
    */
  var iosIpadFallbackLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * iOS minimum version.
    */
  var iosMinimumVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaIosInfo {
  
  inline def apply(): SchemaIosInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosInfo]
  }
  
  extension [Self <: SchemaIosInfo](x: Self) {
    
    inline def setIosAppStoreId(value: String): Self = StObject.set(x, "iosAppStoreId", value.asInstanceOf[js.Any])
    
    inline def setIosAppStoreIdNull: Self = StObject.set(x, "iosAppStoreId", null)
    
    inline def setIosAppStoreIdUndefined: Self = StObject.set(x, "iosAppStoreId", js.undefined)
    
    inline def setIosBundleId(value: String): Self = StObject.set(x, "iosBundleId", value.asInstanceOf[js.Any])
    
    inline def setIosBundleIdNull: Self = StObject.set(x, "iosBundleId", null)
    
    inline def setIosBundleIdUndefined: Self = StObject.set(x, "iosBundleId", js.undefined)
    
    inline def setIosCustomScheme(value: String): Self = StObject.set(x, "iosCustomScheme", value.asInstanceOf[js.Any])
    
    inline def setIosCustomSchemeNull: Self = StObject.set(x, "iosCustomScheme", null)
    
    inline def setIosCustomSchemeUndefined: Self = StObject.set(x, "iosCustomScheme", js.undefined)
    
    inline def setIosFallbackLink(value: String): Self = StObject.set(x, "iosFallbackLink", value.asInstanceOf[js.Any])
    
    inline def setIosFallbackLinkNull: Self = StObject.set(x, "iosFallbackLink", null)
    
    inline def setIosFallbackLinkUndefined: Self = StObject.set(x, "iosFallbackLink", js.undefined)
    
    inline def setIosIpadBundleId(value: String): Self = StObject.set(x, "iosIpadBundleId", value.asInstanceOf[js.Any])
    
    inline def setIosIpadBundleIdNull: Self = StObject.set(x, "iosIpadBundleId", null)
    
    inline def setIosIpadBundleIdUndefined: Self = StObject.set(x, "iosIpadBundleId", js.undefined)
    
    inline def setIosIpadFallbackLink(value: String): Self = StObject.set(x, "iosIpadFallbackLink", value.asInstanceOf[js.Any])
    
    inline def setIosIpadFallbackLinkNull: Self = StObject.set(x, "iosIpadFallbackLink", null)
    
    inline def setIosIpadFallbackLinkUndefined: Self = StObject.set(x, "iosIpadFallbackLink", js.undefined)
    
    inline def setIosMinimumVersion(value: String): Self = StObject.set(x, "iosMinimumVersion", value.asInstanceOf[js.Any])
    
    inline def setIosMinimumVersionNull: Self = StObject.set(x, "iosMinimumVersion", null)
    
    inline def setIosMinimumVersionUndefined: Self = StObject.set(x, "iosMinimumVersion", js.undefined)
  }
}
