package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardRolloutPolicy extends StObject {
  
  /** Number of blue nodes to drain in a batch. */
  var batchNodeCount: js.UndefOr[Double] = js.undefined
  
  /** Percentage of the bool pool nodes to drain in a batch. The range of this field should be (0.0, 1.0]. */
  var batchPercentage: js.UndefOr[Double] = js.undefined
  
  /** Soak time after each batch gets drained. Default to zero. */
  var batchSoakDuration: js.UndefOr[String] = js.undefined
}
object StandardRolloutPolicy {
  
  inline def apply(): StandardRolloutPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardRolloutPolicy]
  }
  
  extension [Self <: StandardRolloutPolicy](x: Self) {
    
    inline def setBatchNodeCount(value: Double): Self = StObject.set(x, "batchNodeCount", value.asInstanceOf[js.Any])
    
    inline def setBatchNodeCountUndefined: Self = StObject.set(x, "batchNodeCount", js.undefined)
    
    inline def setBatchPercentage(value: Double): Self = StObject.set(x, "batchPercentage", value.asInstanceOf[js.Any])
    
    inline def setBatchPercentageUndefined: Self = StObject.set(x, "batchPercentage", js.undefined)
    
    inline def setBatchSoakDuration(value: String): Self = StObject.set(x, "batchSoakDuration", value.asInstanceOf[js.Any])
    
    inline def setBatchSoakDurationUndefined: Self = StObject.set(x, "batchSoakDuration", js.undefined)
  }
}
