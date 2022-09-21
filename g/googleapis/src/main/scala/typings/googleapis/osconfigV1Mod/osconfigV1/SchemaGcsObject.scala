package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGcsObject extends StObject {
  
  /**
    * Required. Bucket of the Cloud Storage object.
    */
  var bucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
    */
  var generationNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Name of the Cloud Storage object.
    */
  var `object`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGcsObject {
  
  inline def apply(): SchemaGcsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcsObject]
  }
  
  extension [Self <: SchemaGcsObject](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketNull: Self = StObject.set(x, "bucket", null)
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setGenerationNumber(value: String): Self = StObject.set(x, "generationNumber", value.asInstanceOf[js.Any])
    
    inline def setGenerationNumberNull: Self = StObject.set(x, "generationNumber", null)
    
    inline def setGenerationNumberUndefined: Self = StObject.set(x, "generationNumber", js.undefined)
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectNull: Self = StObject.set(x, "object", null)
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
