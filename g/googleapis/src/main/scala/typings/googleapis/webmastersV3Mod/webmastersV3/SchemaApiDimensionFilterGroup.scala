package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApiDimensionFilterGroup extends StObject {
  
  var filters: js.UndefOr[js.Array[SchemaApiDimensionFilter]] = js.undefined
  
  var groupType: js.UndefOr[String] = js.undefined
}
object SchemaApiDimensionFilterGroup {
  
  @scala.inline
  def apply(): SchemaApiDimensionFilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiDimensionFilterGroup]
  }
  
  @scala.inline
  implicit class SchemaApiDimensionFilterGroupMutableBuilder[Self <: SchemaApiDimensionFilterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[SchemaApiDimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: SchemaApiDimensionFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
  }
}
