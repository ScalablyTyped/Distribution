package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoscalingSettings extends StObject {
  
  /**
    * The algorithm to use for autoscaling.
    */
  var algorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of workers to cap scaling at.
    */
  var maxNumWorkers: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAutoscalingSettings {
  
  inline def apply(): SchemaAutoscalingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingSettings]
  }
  
  extension [Self <: SchemaAutoscalingSettings](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNull: Self = StObject.set(x, "algorithm", null)
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setMaxNumWorkers(value: Double): Self = StObject.set(x, "maxNumWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxNumWorkersNull: Self = StObject.set(x, "maxNumWorkers", null)
    
    inline def setMaxNumWorkersUndefined: Self = StObject.set(x, "maxNumWorkers", js.undefined)
  }
}
