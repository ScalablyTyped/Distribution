package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObjectId extends StObject {
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var bucketName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var generation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var objectName: js.UndefOr[String | Null] = js.undefined
}
object SchemaObjectId {
  
  inline def apply(): SchemaObjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectId]
  }
  
  extension [Self <: SchemaObjectId](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameNull: Self = StObject.set(x, "bucketName", null)
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationNull: Self = StObject.set(x, "generation", null)
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    inline def setObjectNameNull: Self = StObject.set(x, "objectName", null)
    
    inline def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
  }
}
