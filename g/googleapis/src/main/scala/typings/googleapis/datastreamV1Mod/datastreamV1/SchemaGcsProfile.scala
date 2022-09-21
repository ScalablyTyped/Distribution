package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGcsProfile extends StObject {
  
  /**
    * Required. The Cloud Storage bucket name.
    */
  var bucket: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketNull: Self = StObject.set(x, "bucket", null)
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
    
    inline def setRootPathNull: Self = StObject.set(x, "rootPath", null)
    
    inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
  }
}
