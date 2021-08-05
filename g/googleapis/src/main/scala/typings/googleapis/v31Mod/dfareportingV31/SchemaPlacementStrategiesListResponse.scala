package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placement Strategy List Response
  */
trait SchemaPlacementStrategiesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementStrategiesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Placement strategy collection.
    */
  var placementStrategies: js.UndefOr[js.Array[SchemaPlacementStrategy]] = js.undefined
}
object SchemaPlacementStrategiesListResponse {
  
  inline def apply(): SchemaPlacementStrategiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementStrategiesListResponse]
  }
  
  extension [Self <: SchemaPlacementStrategiesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPlacementStrategies(value: js.Array[SchemaPlacementStrategy]): Self = StObject.set(x, "placementStrategies", value.asInstanceOf[js.Any])
    
    inline def setPlacementStrategiesUndefined: Self = StObject.set(x, "placementStrategies", js.undefined)
    
    inline def setPlacementStrategiesVarargs(value: SchemaPlacementStrategy*): Self = StObject.set(x, "placementStrategies", js.Array(value :_*))
  }
}
