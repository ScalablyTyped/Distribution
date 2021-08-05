package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationProgress extends StObject {
  
  /**
    * Progress metric bundle, for example: metrics: [{name: "nodes done", int_value: 15}, {name: "nodes total", int_value: 32}] or metrics: [{name: "progress", double_value: 0.56}, {name:
    * "progress scale", double_value: 1.0}]
    */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  
  /** A non-parameterized string describing an operation stage. Unset for single-stage operations. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Substages of an operation or a stage. */
  var stages: js.UndefOr[js.Array[OperationProgress]] = js.undefined
  
  /** Status of an operation stage. Unset for single-stage operations. */
  var status: js.UndefOr[String] = js.undefined
}
object OperationProgress {
  
  inline def apply(): OperationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationProgress]
  }
  
  extension [Self <: OperationProgress](x: Self) {
    
    inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStages(value: js.Array[OperationProgress]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: OperationProgress*): Self = StObject.set(x, "stages", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
