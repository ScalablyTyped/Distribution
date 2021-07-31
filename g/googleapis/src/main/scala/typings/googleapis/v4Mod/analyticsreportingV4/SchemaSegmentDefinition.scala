package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SegmentDefinition defines the segment to be a set of SegmentFilters which
  * are combined together with a logical `AND` operation.
  */
trait SchemaSegmentDefinition extends StObject {
  
  /**
    * A segment is defined by a set of segment filters which are combined
    * together with a logical `AND` operation.
    */
  var segmentFilters: js.UndefOr[js.Array[SchemaSegmentFilter]] = js.undefined
}
object SchemaSegmentDefinition {
  
  @scala.inline
  def apply(): SchemaSegmentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentDefinition]
  }
  
  @scala.inline
  implicit class SchemaSegmentDefinitionMutableBuilder[Self <: SchemaSegmentDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentFilters(value: js.Array[SchemaSegmentFilter]): Self = StObject.set(x, "segmentFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentFiltersUndefined: Self = StObject.set(x, "segmentFilters", js.undefined)
    
    @scala.inline
    def setSegmentFiltersVarargs(value: SchemaSegmentFilter*): Self = StObject.set(x, "segmentFilters", js.Array(value :_*))
  }
}
