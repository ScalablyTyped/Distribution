package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryConfig extends StObject {
  
  var dimensionFilters: js.UndefOr[js.Array[DimensionFilters]] = js.native
  
  var end: js.UndefOr[QueryDateTypes] = js.native
  
  var frequency: js.UndefOr[typings.itunesconnectanalytics.mod.frequency] = js.native
  
  var group: js.UndefOr[QueryGroup] = js.native
  
  var measures: js.UndefOr[
    typings.itunesconnectanalytics.mod.measures | js.Array[typings.itunesconnectanalytics.mod.measures]
  ] = js.native
  
  var start: js.UndefOr[QueryDateTypes] = js.native
}
object QueryConfig {
  
  @scala.inline
  def apply(): QueryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryConfig]
  }
  
  @scala.inline
  implicit class QueryConfigMutableBuilder[Self <: QueryConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionFilters(value: js.Array[DimensionFilters]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: DimensionFilters*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setEnd(value: QueryDateTypes): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFrequency(value: frequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setGroup(value: QueryGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setMeasures(value: measures | js.Array[measures]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    @scala.inline
    def setMeasuresVarargs(value: measures*): Self = StObject.set(x, "measures", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: QueryDateTypes): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
