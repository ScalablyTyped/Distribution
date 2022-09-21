package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGdataObjectId extends StObject {
  
  /**
    * gdata
    */
  var bucketName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * gdata
    */
  var generation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * gdata
    */
  var objectName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGdataObjectId {
  
  inline def apply(): SchemaGdataObjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataObjectId]
  }
  
  extension [Self <: SchemaGdataObjectId](x: Self) {
    
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
