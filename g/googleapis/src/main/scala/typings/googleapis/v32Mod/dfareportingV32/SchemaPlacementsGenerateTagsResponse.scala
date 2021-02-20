package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placement GenerateTags Response
  */
@js.native
trait SchemaPlacementsGenerateTagsResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementsGenerateTagsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Set of generated tags for the specified placements.
    */
  var placementTags: js.UndefOr[js.Array[SchemaPlacementTag]] = js.native
}
object SchemaPlacementsGenerateTagsResponse {
  
  @scala.inline
  def apply(): SchemaPlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementsGenerateTagsResponse]
  }
  
  @scala.inline
  implicit class SchemaPlacementsGenerateTagsResponseMutableBuilder[Self <: SchemaPlacementsGenerateTagsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlacementTags(value: js.Array[SchemaPlacementTag]): Self = StObject.set(x, "placementTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementTagsUndefined: Self = StObject.set(x, "placementTags", js.undefined)
    
    @scala.inline
    def setPlacementTagsVarargs(value: SchemaPlacementTag*): Self = StObject.set(x, "placementTags", js.Array(value :_*))
  }
}
