package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of segment filters in the `OR` group are combined with the logical
  * OR operator.
  */
trait SchemaOrFiltersForSegment extends StObject {
  
  /**
    * List of segment filters to be combined with a `OR` operator.
    */
  var segmentFilterClauses: js.UndefOr[js.Array[SchemaSegmentFilterClause]] = js.undefined
}
object SchemaOrFiltersForSegment {
  
  inline def apply(): SchemaOrFiltersForSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrFiltersForSegment]
  }
  
  extension [Self <: SchemaOrFiltersForSegment](x: Self) {
    
    inline def setSegmentFilterClauses(value: js.Array[SchemaSegmentFilterClause]): Self = StObject.set(x, "segmentFilterClauses", value.asInstanceOf[js.Any])
    
    inline def setSegmentFilterClausesUndefined: Self = StObject.set(x, "segmentFilterClauses", js.undefined)
    
    inline def setSegmentFilterClausesVarargs(value: SchemaSegmentFilterClause*): Self = StObject.set(x, "segmentFilterClauses", js.Array(value :_*))
  }
}
