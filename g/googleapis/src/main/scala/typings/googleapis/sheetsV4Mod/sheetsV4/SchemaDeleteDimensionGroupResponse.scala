package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of deleting a group.
  */
trait SchemaDeleteDimensionGroupResponse extends StObject {
  
  /**
    * All groups of a dimension after deleting a group from that dimension.
    */
  var dimensionGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.undefined
}
object SchemaDeleteDimensionGroupResponse {
  
  inline def apply(): SchemaDeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDimensionGroupResponse]
  }
  
  extension [Self <: SchemaDeleteDimensionGroupResponse](x: Self) {
    
    inline def setDimensionGroups(value: js.Array[SchemaDimensionGroup]): Self = StObject.set(x, "dimensionGroups", value.asInstanceOf[js.Any])
    
    inline def setDimensionGroupsUndefined: Self = StObject.set(x, "dimensionGroups", js.undefined)
    
    inline def setDimensionGroupsVarargs(value: SchemaDimensionGroup*): Self = StObject.set(x, "dimensionGroups", js.Array(value :_*))
  }
}
