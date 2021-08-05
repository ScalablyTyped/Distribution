package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryConfig extends StObject {
  
  var dimensionFilters: js.UndefOr[js.Array[DimensionFilters]] = js.undefined
  
  var end: js.UndefOr[QueryDateTypes] = js.undefined
  
  var frequency: js.UndefOr[typings.itunesconnectanalytics.mod.frequency] = js.undefined
  
  var group: js.UndefOr[QueryGroup] = js.undefined
  
  var measures: js.UndefOr[
    typings.itunesconnectanalytics.mod.measures | js.Array[typings.itunesconnectanalytics.mod.measures]
  ] = js.undefined
  
  var start: js.UndefOr[QueryDateTypes] = js.undefined
}
object QueryConfig {
  
  inline def apply(): QueryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryConfig]
  }
  
  extension [Self <: QueryConfig](x: Self) {
    
    inline def setDimensionFilters(value: js.Array[DimensionFilters]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    inline def setDimensionFiltersVarargs(value: DimensionFilters*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    inline def setEnd(value: QueryDateTypes): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFrequency(value: frequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setGroup(value: QueryGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setMeasures(value: measures | js.Array[measures]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    inline def setMeasuresVarargs(value: measures*): Self = StObject.set(x, "measures", js.Array(value :_*))
    
    inline def setStart(value: QueryDateTypes): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
