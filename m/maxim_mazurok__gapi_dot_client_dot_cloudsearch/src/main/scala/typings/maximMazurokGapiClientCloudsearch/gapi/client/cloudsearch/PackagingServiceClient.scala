package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagingServiceClient extends StObject {
  
  /** Android app's package name to generate the deep-link URI. */
  var androidPackageName: js.UndefOr[String] = js.undefined
  
  /** iOS app's App Store ID to generate the App Store URL when app is not installed on device. */
  var iosAppStoreId: js.UndefOr[String] = js.undefined
  
  /** iOS app's bundle ID to generate the deep-link URI. */
  var iosBundleId: js.UndefOr[String] = js.undefined
  
  /** Type of Google API Console client. */
  var `type`: js.UndefOr[String] = js.undefined
}
object PackagingServiceClient {
  
  inline def apply(): PackagingServiceClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackagingServiceClient]
  }
  
  extension [Self <: PackagingServiceClient](x: Self) {
    
    inline def setAndroidPackageName(value: String): Self = StObject.set(x, "androidPackageName", value.asInstanceOf[js.Any])
    
    inline def setAndroidPackageNameUndefined: Self = StObject.set(x, "androidPackageName", js.undefined)
    
    inline def setIosAppStoreId(value: String): Self = StObject.set(x, "iosAppStoreId", value.asInstanceOf[js.Any])
    
    inline def setIosAppStoreIdUndefined: Self = StObject.set(x, "iosAppStoreId", js.undefined)
    
    inline def setIosBundleId(value: String): Self = StObject.set(x, "iosBundleId", value.asInstanceOf[js.Any])
    
    inline def setIosBundleIdUndefined: Self = StObject.set(x, "iosBundleId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
