package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Android app manifest. See
  * http://developer.android.com/guide/topics/manifest/manifest-intro.html
  */
trait SchemaApkManifest extends StObject {
  
  /**
    * User-readable name for the application.
    */
  var applicationLabel: js.UndefOr[String] = js.undefined
  
  var intentFilters: js.UndefOr[js.Array[SchemaIntentFilter]] = js.undefined
  
  /**
    * Maximum API level on which the application is designed to run.
    */
  var maxSdkVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum API level required for the application to run.
    */
  var minSdkVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * Full Java-style package name for this application, e.g.
    * &quot;com.example.foo&quot;.
    */
  var packageName: js.UndefOr[String] = js.undefined
}
object SchemaApkManifest {
  
  @scala.inline
  def apply(): SchemaApkManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkManifest]
  }
  
  @scala.inline
  implicit class SchemaApkManifestMutableBuilder[Self <: SchemaApkManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationLabel(value: String): Self = StObject.set(x, "applicationLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationLabelUndefined: Self = StObject.set(x, "applicationLabel", js.undefined)
    
    @scala.inline
    def setIntentFilters(value: js.Array[SchemaIntentFilter]): Self = StObject.set(x, "intentFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentFiltersUndefined: Self = StObject.set(x, "intentFilters", js.undefined)
    
    @scala.inline
    def setIntentFiltersVarargs(value: SchemaIntentFilter*): Self = StObject.set(x, "intentFilters", js.Array(value :_*))
    
    @scala.inline
    def setMaxSdkVersion(value: Double): Self = StObject.set(x, "maxSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSdkVersionUndefined: Self = StObject.set(x, "maxSdkVersion", js.undefined)
    
    @scala.inline
    def setMinSdkVersion(value: Double): Self = StObject.set(x, "minSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSdkVersionUndefined: Self = StObject.set(x, "minSdkVersion", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
