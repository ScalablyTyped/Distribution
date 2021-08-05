package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Simple segment conditions consist of one or more dimension/metric
  * conditions that can be combined.
  */
trait SchemaSimpleSegment extends StObject {
  
  /**
    * A list of segment filters groups which are combined with logical `AND`
    * operator.
    */
  var orFiltersForSegment: js.UndefOr[js.Array[SchemaOrFiltersForSegment]] = js.undefined
}
object SchemaSimpleSegment {
  
  inline def apply(): SchemaSimpleSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSimpleSegment]
  }
  
  extension [Self <: SchemaSimpleSegment](x: Self) {
    
    inline def setOrFiltersForSegment(value: js.Array[SchemaOrFiltersForSegment]): Self = StObject.set(x, "orFiltersForSegment", value.asInstanceOf[js.Any])
    
    inline def setOrFiltersForSegmentUndefined: Self = StObject.set(x, "orFiltersForSegment", js.undefined)
    
    inline def setOrFiltersForSegmentVarargs(value: SchemaOrFiltersForSegment*): Self = StObject.set(x, "orFiltersForSegment", js.Array(value :_*))
  }
}
