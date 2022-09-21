package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApkManifest extends StObject {
  
  /**
    * User-readable name for the application.
    */
  var applicationLabel: js.UndefOr[String | Null] = js.undefined
  
  var intentFilters: js.UndefOr[js.Array[SchemaIntentFilter]] = js.undefined
  
  /**
    * Maximum API level on which the application is designed to run.
    */
  var maxSdkVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimum API level required for the application to run.
    */
  var minSdkVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Full Java-style package name for this application, e.g. "com.example.foo".
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the API Level on which the application is designed to run.
    */
  var targetSdkVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Permissions declared to be used by the application
    */
  var usesPermission: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaApkManifest {
  
  inline def apply(): SchemaApkManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkManifest]
  }
  
  extension [Self <: SchemaApkManifest](x: Self) {
    
    inline def setApplicationLabel(value: String): Self = StObject.set(x, "applicationLabel", value.asInstanceOf[js.Any])
    
    inline def setApplicationLabelNull: Self = StObject.set(x, "applicationLabel", null)
    
    inline def setApplicationLabelUndefined: Self = StObject.set(x, "applicationLabel", js.undefined)
    
    inline def setIntentFilters(value: js.Array[SchemaIntentFilter]): Self = StObject.set(x, "intentFilters", value.asInstanceOf[js.Any])
    
    inline def setIntentFiltersUndefined: Self = StObject.set(x, "intentFilters", js.undefined)
    
    inline def setIntentFiltersVarargs(value: SchemaIntentFilter*): Self = StObject.set(x, "intentFilters", js.Array(value*))
    
    inline def setMaxSdkVersion(value: Double): Self = StObject.set(x, "maxSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxSdkVersionNull: Self = StObject.set(x, "maxSdkVersion", null)
    
    inline def setMaxSdkVersionUndefined: Self = StObject.set(x, "maxSdkVersion", js.undefined)
    
    inline def setMinSdkVersion(value: Double): Self = StObject.set(x, "minSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMinSdkVersionNull: Self = StObject.set(x, "minSdkVersion", null)
    
    inline def setMinSdkVersionUndefined: Self = StObject.set(x, "minSdkVersion", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setTargetSdkVersion(value: Double): Self = StObject.set(x, "targetSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetSdkVersionNull: Self = StObject.set(x, "targetSdkVersion", null)
    
    inline def setTargetSdkVersionUndefined: Self = StObject.set(x, "targetSdkVersion", js.undefined)
    
    inline def setUsesPermission(value: js.Array[String]): Self = StObject.set(x, "usesPermission", value.asInstanceOf[js.Any])
    
    inline def setUsesPermissionNull: Self = StObject.set(x, "usesPermission", null)
    
    inline def setUsesPermissionUndefined: Self = StObject.set(x, "usesPermission", js.undefined)
    
    inline def setUsesPermissionVarargs(value: String*): Self = StObject.set(x, "usesPermission", js.Array(value*))
  }
}
