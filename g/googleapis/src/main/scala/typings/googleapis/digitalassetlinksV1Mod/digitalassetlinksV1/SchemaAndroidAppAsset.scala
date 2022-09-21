package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidAppAsset extends StObject {
  
  /**
    * Because there is no global enforcement of package name uniqueness, we also require a signing certificate, which in combination with the package name uniquely identifies an app. Some apps' signing keys are rotated, so they may be signed by different keys over time. We treat these as distinct assets, since we use (package name, cert) as the unique ID. This should not normally pose any problems as both versions of the app will make the same or similar statements. Other assets making statements about the app will have to be updated when a key is rotated, however. (Note that the syntaxes for publishing and querying for statements contain syntactic sugar to easily let you specify apps that are known by multiple certificates.) REQUIRED
    */
  var certificate: js.UndefOr[SchemaCertificateInfo] = js.undefined
  
  /**
    * Android App assets are naturally identified by their Java package name. For example, the Google Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
}
object SchemaAndroidAppAsset {
  
  inline def apply(): SchemaAndroidAppAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidAppAsset]
  }
  
  extension [Self <: SchemaAndroidAppAsset](x: Self) {
    
    inline def setCertificate(value: SchemaCertificateInfo): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
