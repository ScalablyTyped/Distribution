package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiffChecksumsResponse extends StObject {
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var checksumsLocation: js.UndefOr[SchemaCompositeMedia] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var chunkSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var objectLocation: js.UndefOr[SchemaCompositeMedia] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var objectSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var objectVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaDiffChecksumsResponse {
  
  inline def apply(): SchemaDiffChecksumsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiffChecksumsResponse]
  }
  
  extension [Self <: SchemaDiffChecksumsResponse](x: Self) {
    
    inline def setChecksumsLocation(value: SchemaCompositeMedia): Self = StObject.set(x, "checksumsLocation", value.asInstanceOf[js.Any])
    
    inline def setChecksumsLocationUndefined: Self = StObject.set(x, "checksumsLocation", js.undefined)
    
    inline def setChunkSizeBytes(value: String): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeBytesNull: Self = StObject.set(x, "chunkSizeBytes", null)
    
    inline def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    inline def setObjectLocation(value: SchemaCompositeMedia): Self = StObject.set(x, "objectLocation", value.asInstanceOf[js.Any])
    
    inline def setObjectLocationUndefined: Self = StObject.set(x, "objectLocation", js.undefined)
    
    inline def setObjectSizeBytes(value: String): Self = StObject.set(x, "objectSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeBytesNull: Self = StObject.set(x, "objectSizeBytes", null)
    
    inline def setObjectSizeBytesUndefined: Self = StObject.set(x, "objectSizeBytes", js.undefined)
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionNull: Self = StObject.set(x, "objectVersion", null)
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
