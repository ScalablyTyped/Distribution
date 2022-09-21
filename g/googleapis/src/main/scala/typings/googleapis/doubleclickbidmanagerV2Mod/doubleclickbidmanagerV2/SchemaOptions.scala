package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOptions extends StObject {
  
  /**
    * Set to true and filter your report by `FILTER_INSERTION_ORDER` or `FILTER_LINE_ITEM` to include data for audience lists specifically targeted by those items.
    */
  var includeOnlyTargetedUserLists: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Options that contain Path Filters and Custom Channel Groupings.
    */
  var pathQueryOptions: js.UndefOr[SchemaPathQueryOptions] = js.undefined
}
object SchemaOptions {
  
  inline def apply(): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptions]
  }
  
  extension [Self <: SchemaOptions](x: Self) {
    
    inline def setIncludeOnlyTargetedUserLists(value: Boolean): Self = StObject.set(x, "includeOnlyTargetedUserLists", value.asInstanceOf[js.Any])
    
    inline def setIncludeOnlyTargetedUserListsNull: Self = StObject.set(x, "includeOnlyTargetedUserLists", null)
    
    inline def setIncludeOnlyTargetedUserListsUndefined: Self = StObject.set(x, "includeOnlyTargetedUserLists", js.undefined)
    
    inline def setPathQueryOptions(value: SchemaPathQueryOptions): Self = StObject.set(x, "pathQueryOptions", value.asInstanceOf[js.Any])
    
    inline def setPathQueryOptionsUndefined: Self = StObject.set(x, "pathQueryOptions", js.undefined)
  }
}
