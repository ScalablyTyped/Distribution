package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetBucket extends StObject {
  
  /** Number of results that match the bucket value. Counts are only returned for searches when count accuracy is ensured. Can be empty. */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Percent of results that match the bucket value. The returned value is between (0-100], and is rounded down to an integer if fractional. If the value is not explicitly returned, it
    * represents a percentage value that rounds to 0. Percentages are returned for all searches, but are an estimate. Because percentages are always returned, you should render
    * percentages instead of counts.
    */
  var percentage: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Value] = js.undefined
}
object FacetBucket {
  
  inline def apply(): FacetBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetBucket]
  }
  
  extension [Self <: FacetBucket](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
