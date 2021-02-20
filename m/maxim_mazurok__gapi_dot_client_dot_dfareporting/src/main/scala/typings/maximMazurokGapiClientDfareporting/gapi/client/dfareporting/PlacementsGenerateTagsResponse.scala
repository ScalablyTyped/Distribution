package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementsGenerateTagsResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementsGenerateTagsResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Set of generated tags for the specified placements. */
  var placementTags: js.UndefOr[js.Array[PlacementTag]] = js.native
}
object PlacementsGenerateTagsResponse {
  
  @scala.inline
  def apply(): PlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementsGenerateTagsResponse]
  }
  
  @scala.inline
  implicit class PlacementsGenerateTagsResponseMutableBuilder[Self <: PlacementsGenerateTagsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlacementTags(value: js.Array[PlacementTag]): Self = StObject.set(x, "placementTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementTagsUndefined: Self = StObject.set(x, "placementTags", js.undefined)
    
    @scala.inline
    def setPlacementTagsVarargs(value: PlacementTag*): Self = StObject.set(x, "placementTags", js.Array(value :_*))
  }
}
