package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Trusted App Ids Resource object in Directory API.
  */
@js.native
trait SchemaTrustedAppId extends StObject {
  
  /**
    * Android package name.
    */
  var androidPackageName: js.UndefOr[String] = js.native
  
  /**
    * SHA1 signature of the app certificate.
    */
  var certificateHashSHA1: js.UndefOr[String] = js.native
  
  /**
    * SHA256 signature of the app certificate.
    */
  var certificateHashSHA256: js.UndefOr[String] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Identifies the resource as a trusted AppId.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaTrustedAppId {
  
  @scala.inline
  def apply(): SchemaTrustedAppId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrustedAppId]
  }
  
  @scala.inline
  implicit class SchemaTrustedAppIdMutableBuilder[Self <: SchemaTrustedAppId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidPackageName(value: String): Self = StObject.set(x, "androidPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidPackageNameUndefined: Self = StObject.set(x, "androidPackageName", js.undefined)
    
    @scala.inline
    def setCertificateHashSHA1(value: String): Self = StObject.set(x, "certificateHashSHA1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateHashSHA1Undefined: Self = StObject.set(x, "certificateHashSHA1", js.undefined)
    
    @scala.inline
    def setCertificateHashSHA256(value: String): Self = StObject.set(x, "certificateHashSHA256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateHashSHA256Undefined: Self = StObject.set(x, "certificateHashSHA256", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
