package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeFilter extends StObject {
  
  /** The logic operator of the sub filter. */
  var logicOperator: js.UndefOr[String] = js.undefined
  
  /** Sub filters. */
  var subFilters: js.UndefOr[js.Array[Filter]] = js.undefined
}
object CompositeFilter {
  
  inline def apply(): CompositeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeFilter]
  }
  
  extension [Self <: CompositeFilter](x: Self) {
    
    inline def setLogicOperator(value: String): Self = StObject.set(x, "logicOperator", value.asInstanceOf[js.Any])
    
    inline def setLogicOperatorUndefined: Self = StObject.set(x, "logicOperator", js.undefined)
    
    inline def setSubFilters(value: js.Array[Filter]): Self = StObject.set(x, "subFilters", value.asInstanceOf[js.Any])
    
    inline def setSubFiltersUndefined: Self = StObject.set(x, "subFilters", js.undefined)
    
    inline def setSubFiltersVarargs(value: Filter*): Self = StObject.set(x, "subFilters", js.Array(value :_*))
  }
}
