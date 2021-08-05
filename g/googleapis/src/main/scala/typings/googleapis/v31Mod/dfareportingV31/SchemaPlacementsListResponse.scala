package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placement List Response
  */
trait SchemaPlacementsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Placement collection.
    */
  var placements: js.UndefOr[js.Array[SchemaPlacement]] = js.undefined
}
object SchemaPlacementsListResponse {
  
  inline def apply(): SchemaPlacementsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementsListResponse]
  }
  
  extension [Self <: SchemaPlacementsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPlacements(value: js.Array[SchemaPlacement]): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
    
    inline def setPlacementsUndefined: Self = StObject.set(x, "placements", js.undefined)
    
    inline def setPlacementsVarargs(value: SchemaPlacement*): Self = StObject.set(x, "placements", js.Array(value :_*))
  }
}
