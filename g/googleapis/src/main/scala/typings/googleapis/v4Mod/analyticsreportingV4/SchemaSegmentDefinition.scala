package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSegmentDefinition extends StObject {
  
  /**
    * A segment is defined by a set of segment filters which are combined together with a logical `AND` operation.
    */
  var segmentFilters: js.UndefOr[js.Array[SchemaSegmentFilter]] = js.undefined
}
object SchemaSegmentDefinition {
  
  inline def apply(): SchemaSegmentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentDefinition]
  }
  
  extension [Self <: SchemaSegmentDefinition](x: Self) {
    
    inline def setSegmentFilters(value: js.Array[SchemaSegmentFilter]): Self = StObject.set(x, "segmentFilters", value.asInstanceOf[js.Any])
    
    inline def setSegmentFiltersUndefined: Self = StObject.set(x, "segmentFilters", js.undefined)
    
    inline def setSegmentFiltersVarargs(value: SchemaSegmentFilter*): Self = StObject.set(x, "segmentFilters", js.Array(value*))
  }
}
