package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentDefinition extends StObject {
  
  /** A segment is defined by a set of segment filters which are combined together with a logical `AND` operation. */
  var segmentFilters: js.UndefOr[js.Array[SegmentFilter]] = js.native
}
object SegmentDefinition {
  
  @scala.inline
  def apply(): SegmentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDefinition]
  }
  
  @scala.inline
  implicit class SegmentDefinitionMutableBuilder[Self <: SegmentDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentFilters(value: js.Array[SegmentFilter]): Self = StObject.set(x, "segmentFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentFiltersUndefined: Self = StObject.set(x, "segmentFilters", js.undefined)
    
    @scala.inline
    def setSegmentFiltersVarargs(value: SegmentFilter*): Self = StObject.set(x, "segmentFilters", js.Array(value :_*))
  }
}
