package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistogramQuery extends StObject {
  
  /**
    * An expression specifies a histogram request against matching jobs for searches. See SearchJobsRequest.histogram_queries for details about syntax.
    */
  var histogramQuery: js.UndefOr[String | Null] = js.undefined
}
object SchemaHistogramQuery {
  
  inline def apply(): SchemaHistogramQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramQuery]
  }
  
  extension [Self <: SchemaHistogramQuery](x: Self) {
    
    inline def setHistogramQuery(value: String): Self = StObject.set(x, "histogramQuery", value.asInstanceOf[js.Any])
    
    inline def setHistogramQueryNull: Self = StObject.set(x, "histogramQuery", null)
    
    inline def setHistogramQueryUndefined: Self = StObject.set(x, "histogramQuery", js.undefined)
  }
}
