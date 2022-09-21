package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCountArtifactsRequest extends StObject {
  
  /**
    * The search query.
    */
  var query: js.UndefOr[SchemaQuery] = js.undefined
  
  /**
    * Sets the granularity of the count results.
    */
  var view: js.UndefOr[String | Null] = js.undefined
}
object SchemaCountArtifactsRequest {
  
  inline def apply(): SchemaCountArtifactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountArtifactsRequest]
  }
  
  extension [Self <: SchemaCountArtifactsRequest](x: Self) {
    
    inline def setQuery(value: SchemaQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
