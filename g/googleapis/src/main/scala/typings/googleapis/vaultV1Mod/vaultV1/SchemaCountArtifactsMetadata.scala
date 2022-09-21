package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCountArtifactsMetadata extends StObject {
  
  /**
    * End time of count operation. Available when operation is done.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The matter ID of the associated matter.
    */
  var matterId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The search query from the request.
    */
  var query: js.UndefOr[SchemaQuery] = js.undefined
  
  /**
    * Creation time of count operation.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCountArtifactsMetadata {
  
  inline def apply(): SchemaCountArtifactsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountArtifactsMetadata]
  }
  
  extension [Self <: SchemaCountArtifactsMetadata](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdNull: Self = StObject.set(x, "matterId", null)
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setQuery(value: SchemaQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
