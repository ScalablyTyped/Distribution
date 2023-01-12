package typings.leafletGeosearch.anon

import typings.leafletGeosearch.distProvidersBingProviderMod.RawResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EstimatedTotal extends StObject {
  
  var estimatedTotal: Double
  
  var resources: js.Array[RawResult]
}
object EstimatedTotal {
  
  inline def apply(estimatedTotal: Double, resources: js.Array[RawResult]): EstimatedTotal = {
    val __obj = js.Dynamic.literal(estimatedTotal = estimatedTotal.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[EstimatedTotal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EstimatedTotal] (val x: Self) extends AnyVal {
    
    inline def setEstimatedTotal(value: Double): Self = StObject.set(x, "estimatedTotal", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Array[RawResult]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: RawResult*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
