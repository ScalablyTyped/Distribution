package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourceFileGcs extends StObject {
  
  /**
    * Required. Bucket of the Cloud Storage object.
    */
  var bucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Generation number of the Cloud Storage object.
    */
  var generation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Name of the Cloud Storage object.
    */
  var `object`: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyResourceFileGcs {
  
  inline def apply(): SchemaOSPolicyResourceFileGcs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourceFileGcs]
  }
  
  extension [Self <: SchemaOSPolicyResourceFileGcs](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketNull: Self = StObject.set(x, "bucket", null)
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationNull: Self = StObject.set(x, "generation", null)
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectNull: Self = StObject.set(x, "object", null)
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
