package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Android application details based on application manifest and apk archive
  * contents.
  */
trait SchemaApkDetail extends StObject {
  
  var apkManifest: js.UndefOr[SchemaApkManifest] = js.undefined
}
object SchemaApkDetail {
  
  inline def apply(): SchemaApkDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkDetail]
  }
  
  extension [Self <: SchemaApkDetail](x: Self) {
    
    inline def setApkManifest(value: SchemaApkManifest): Self = StObject.set(x, "apkManifest", value.asInstanceOf[js.Any])
    
    inline def setApkManifestUndefined: Self = StObject.set(x, "apkManifest", js.undefined)
  }
}
