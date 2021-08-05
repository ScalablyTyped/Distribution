package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Column headers.
  */
trait SchemaColumnHeader extends StObject {
  
  /**
    * The dimension names in the response.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Metric headers for the metrics in the response.
    */
  var metricHeader: js.UndefOr[SchemaMetricHeader] = js.undefined
}
object SchemaColumnHeader {
  
  inline def apply(): SchemaColumnHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumnHeader]
  }
  
  extension [Self <: SchemaColumnHeader](x: Self) {
    
    inline def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    inline def setMetricHeader(value: SchemaMetricHeader): Self = StObject.set(x, "metricHeader", value.asInstanceOf[js.Any])
    
    inline def setMetricHeaderUndefined: Self = StObject.set(x, "metricHeader", js.undefined)
  }
}
