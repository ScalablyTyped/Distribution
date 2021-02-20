package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placement Strategy List Response
  */
@js.native
trait SchemaPlacementStrategiesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementStrategiesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Placement strategy collection.
    */
  var placementStrategies: js.UndefOr[js.Array[SchemaPlacementStrategy]] = js.native
}
object SchemaPlacementStrategiesListResponse {
  
  @scala.inline
  def apply(): SchemaPlacementStrategiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementStrategiesListResponse]
  }
  
  @scala.inline
  implicit class SchemaPlacementStrategiesListResponseMutableBuilder[Self <: SchemaPlacementStrategiesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPlacementStrategies(value: js.Array[SchemaPlacementStrategy]): Self = StObject.set(x, "placementStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementStrategiesUndefined: Self = StObject.set(x, "placementStrategies", js.undefined)
    
    @scala.inline
    def setPlacementStrategiesVarargs(value: SchemaPlacementStrategy*): Self = StObject.set(x, "placementStrategies", js.Array(value :_*))
  }
}
