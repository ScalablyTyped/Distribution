package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPackagingServiceClient extends StObject {
  
  /**
    * Android app's package name to generate the deep-link URI.
    */
  var androidPackageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * iOS app's App Store ID to generate the App Store URL when app is not installed on device.
    */
  var iosAppStoreId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * iOS app's bundle ID to generate the deep-link URI.
    */
  var iosBundleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of Google API Console client.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaPackagingServiceClient {
  
  inline def apply(): SchemaPackagingServiceClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackagingServiceClient]
  }
  
  extension [Self <: SchemaPackagingServiceClient](x: Self) {
    
    inline def setAndroidPackageName(value: String): Self = StObject.set(x, "androidPackageName", value.asInstanceOf[js.Any])
    
    inline def setAndroidPackageNameNull: Self = StObject.set(x, "androidPackageName", null)
    
    inline def setAndroidPackageNameUndefined: Self = StObject.set(x, "androidPackageName", js.undefined)
    
    inline def setIosAppStoreId(value: String): Self = StObject.set(x, "iosAppStoreId", value.asInstanceOf[js.Any])
    
    inline def setIosAppStoreIdNull: Self = StObject.set(x, "iosAppStoreId", null)
    
    inline def setIosAppStoreIdUndefined: Self = StObject.set(x, "iosAppStoreId", js.undefined)
    
    inline def setIosBundleId(value: String): Self = StObject.set(x, "iosBundleId", value.asInstanceOf[js.Any])
    
    inline def setIosBundleIdNull: Self = StObject.set(x, "iosBundleId", null)
    
    inline def setIosBundleIdUndefined: Self = StObject.set(x, "iosBundleId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
