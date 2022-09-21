package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStandardRolloutPolicy extends StObject {
  
  /**
    * Number of blue nodes to drain in a batch.
    */
  var batchNodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Percentage of the bool pool nodes to drain in a batch. The range of this field should be (0.0, 1.0].
    */
  var batchPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Soak time after each batch gets drained. Default to zero.
    */
  var batchSoakDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaStandardRolloutPolicy {
  
  inline def apply(): SchemaStandardRolloutPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardRolloutPolicy]
  }
  
  extension [Self <: SchemaStandardRolloutPolicy](x: Self) {
    
    inline def setBatchNodeCount(value: Double): Self = StObject.set(x, "batchNodeCount", value.asInstanceOf[js.Any])
    
    inline def setBatchNodeCountNull: Self = StObject.set(x, "batchNodeCount", null)
    
    inline def setBatchNodeCountUndefined: Self = StObject.set(x, "batchNodeCount", js.undefined)
    
    inline def setBatchPercentage(value: Double): Self = StObject.set(x, "batchPercentage", value.asInstanceOf[js.Any])
    
    inline def setBatchPercentageNull: Self = StObject.set(x, "batchPercentage", null)
    
    inline def setBatchPercentageUndefined: Self = StObject.set(x, "batchPercentage", js.undefined)
    
    inline def setBatchSoakDuration(value: String): Self = StObject.set(x, "batchSoakDuration", value.asInstanceOf[js.Any])
    
    inline def setBatchSoakDurationNull: Self = StObject.set(x, "batchSoakDuration", null)
    
    inline def setBatchSoakDurationUndefined: Self = StObject.set(x, "batchSoakDuration", js.undefined)
  }
}
