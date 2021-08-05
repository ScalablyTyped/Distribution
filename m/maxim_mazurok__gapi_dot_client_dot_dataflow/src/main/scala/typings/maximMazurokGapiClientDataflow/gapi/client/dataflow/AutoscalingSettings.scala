package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingSettings extends StObject {
  
  /** The algorithm to use for autoscaling. */
  var algorithm: js.UndefOr[String] = js.undefined
  
  /** The maximum number of workers to cap scaling at. */
  var maxNumWorkers: js.UndefOr[Double] = js.undefined
}
object AutoscalingSettings {
  
  inline def apply(): AutoscalingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingSettings]
  }
  
  extension [Self <: AutoscalingSettings](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setMaxNumWorkers(value: Double): Self = StObject.set(x, "maxNumWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxNumWorkersUndefined: Self = StObject.set(x, "maxNumWorkers", js.undefined)
  }
}
