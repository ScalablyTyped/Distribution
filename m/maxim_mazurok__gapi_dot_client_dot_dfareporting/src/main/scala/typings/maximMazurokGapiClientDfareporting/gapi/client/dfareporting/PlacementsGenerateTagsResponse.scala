package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementsGenerateTagsResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementsGenerateTagsResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Set of generated tags for the specified placements. */
  var placementTags: js.UndefOr[js.Array[PlacementTag]] = js.undefined
}
object PlacementsGenerateTagsResponse {
  
  inline def apply(): PlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementsGenerateTagsResponse]
  }
  
  extension [Self <: PlacementsGenerateTagsResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlacementTags(value: js.Array[PlacementTag]): Self = StObject.set(x, "placementTags", value.asInstanceOf[js.Any])
    
    inline def setPlacementTagsUndefined: Self = StObject.set(x, "placementTags", js.undefined)
    
    inline def setPlacementTagsVarargs(value: PlacementTag*): Self = StObject.set(x, "placementTags", js.Array(value*))
  }
}
