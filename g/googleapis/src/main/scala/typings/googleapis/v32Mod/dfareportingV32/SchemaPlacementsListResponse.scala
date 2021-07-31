package typings.googleapis.v32Mod.dfareportingV32

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
  
  @scala.inline
  def apply(): SchemaPlacementsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementsListResponse]
  }
  
  @scala.inline
  implicit class SchemaPlacementsListResponseMutableBuilder[Self <: SchemaPlacementsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPlacements(value: js.Array[SchemaPlacement]): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementsUndefined: Self = StObject.set(x, "placements", js.undefined)
    
    @scala.inline
    def setPlacementsVarargs(value: SchemaPlacement*): Self = StObject.set(x, "placements", js.Array(value :_*))
  }
}
