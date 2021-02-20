package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Column headers.
  */
@js.native
trait SchemaColumnHeader extends StObject {
  
  /**
    * The dimension names in the response.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Metric headers for the metrics in the response.
    */
  var metricHeader: js.UndefOr[SchemaMetricHeader] = js.native
}
object SchemaColumnHeader {
  
  @scala.inline
  def apply(): SchemaColumnHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumnHeader]
  }
  
  @scala.inline
  implicit class SchemaColumnHeaderMutableBuilder[Self <: SchemaColumnHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setMetricHeader(value: SchemaMetricHeader): Self = StObject.set(x, "metricHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricHeaderUndefined: Self = StObject.set(x, "metricHeader", js.undefined)
  }
}
