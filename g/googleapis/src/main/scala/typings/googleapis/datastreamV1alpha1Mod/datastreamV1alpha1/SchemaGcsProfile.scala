package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGcsProfile extends StObject {
  
  /**
    * Required. The full project and resource path for Cloud Storage bucket including the name.
    */
  var bucketName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The root path inside the Cloud Storage bucket.
    */
  var rootPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaGcsProfile {
  
  inline def apply(): SchemaGcsProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcsProfile]
  }
  
  extension [Self <: SchemaGcsProfile](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameNull: Self = StObject.set(x, "bucketName", null)
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
    
    inline def setRootPathNull: Self = StObject.set(x, "rootPath", null)
    
    inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
  }
}
