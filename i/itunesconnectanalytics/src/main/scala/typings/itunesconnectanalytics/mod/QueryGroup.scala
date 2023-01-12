package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryGroup extends StObject {
  
  var dimension: typings.itunesconnectanalytics.mod.dimension
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var metric: js.UndefOr[measures] = js.undefined
  
  var rank: js.UndefOr[String] = js.undefined
}
object QueryGroup {
  
  inline def apply(dimension: dimension): QueryGroup = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryGroup] (val x: Self) extends AnyVal {
    
    inline def setDimension(value: dimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMetric(value: measures): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setRank(value: String): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
  }
}
