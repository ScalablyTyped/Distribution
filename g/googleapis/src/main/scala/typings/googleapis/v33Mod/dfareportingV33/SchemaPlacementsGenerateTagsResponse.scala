package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlacementsGenerateTagsResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementsGenerateTagsResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of generated tags for the specified placements.
    */
  var placementTags: js.UndefOr[js.Array[SchemaPlacementTag]] = js.undefined
}
object SchemaPlacementsGenerateTagsResponse {
  
  inline def apply(): SchemaPlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementsGenerateTagsResponse]
  }
  
  extension [Self <: SchemaPlacementsGenerateTagsResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlacementTags(value: js.Array[SchemaPlacementTag]): Self = StObject.set(x, "placementTags", value.asInstanceOf[js.Any])
    
    inline def setPlacementTagsUndefined: Self = StObject.set(x, "placementTags", js.undefined)
    
    inline def setPlacementTagsVarargs(value: SchemaPlacementTag*): Self = StObject.set(x, "placementTags", js.Array(value*))
  }
}
