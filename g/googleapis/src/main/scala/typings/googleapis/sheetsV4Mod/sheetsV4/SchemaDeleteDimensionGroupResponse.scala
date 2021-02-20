package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of deleting a group.
  */
@js.native
trait SchemaDeleteDimensionGroupResponse extends StObject {
  
  /**
    * All groups of a dimension after deleting a group from that dimension.
    */
  var dimensionGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
}
object SchemaDeleteDimensionGroupResponse {
  
  @scala.inline
  def apply(): SchemaDeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDimensionGroupResponse]
  }
  
  @scala.inline
  implicit class SchemaDeleteDimensionGroupResponseMutableBuilder[Self <: SchemaDeleteDimensionGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionGroups(value: js.Array[SchemaDimensionGroup]): Self = StObject.set(x, "dimensionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionGroupsUndefined: Self = StObject.set(x, "dimensionGroups", js.undefined)
    
    @scala.inline
    def setDimensionGroupsVarargs(value: SchemaDimensionGroup*): Self = StObject.set(x, "dimensionGroups", js.Array(value :_*))
  }
}
