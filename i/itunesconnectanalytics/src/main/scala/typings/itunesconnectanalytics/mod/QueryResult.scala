package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResult extends StObject {
  
  var results: js.Array[AnalyticsResult]
  
  var size: Double
}
object QueryResult {
  
  inline def apply(results: js.Array[AnalyticsResult], size: Double): QueryResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryResult] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[AnalyticsResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: AnalyticsResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
