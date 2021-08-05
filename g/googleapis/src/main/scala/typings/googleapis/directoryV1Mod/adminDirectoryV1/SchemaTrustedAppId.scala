package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Trusted App Ids Resource object in Directory API.
  */
trait SchemaTrustedAppId extends StObject {
  
  /**
    * Android package name.
    */
  var androidPackageName: js.UndefOr[String] = js.undefined
  
  /**
    * SHA1 signature of the app certificate.
    */
  var certificateHashSHA1: js.UndefOr[String] = js.undefined
  
  /**
    * SHA256 signature of the app certificate.
    */
  var certificateHashSHA256: js.UndefOr[String] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the resource as a trusted AppId.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaTrustedAppId {
  
  inline def apply(): SchemaTrustedAppId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrustedAppId]
  }
  
  extension [Self <: SchemaTrustedAppId](x: Self) {
    
    inline def setAndroidPackageName(value: String): Self = StObject.set(x, "androidPackageName", value.asInstanceOf[js.Any])
    
    inline def setAndroidPackageNameUndefined: Self = StObject.set(x, "androidPackageName", js.undefined)
    
    inline def setCertificateHashSHA1(value: String): Self = StObject.set(x, "certificateHashSHA1", value.asInstanceOf[js.Any])
    
    inline def setCertificateHashSHA1Undefined: Self = StObject.set(x, "certificateHashSHA1", js.undefined)
    
    inline def setCertificateHashSHA256(value: String): Self = StObject.set(x, "certificateHashSHA256", value.asInstanceOf[js.Any])
    
    inline def setCertificateHashSHA256Undefined: Self = StObject.set(x, "certificateHashSHA256", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
