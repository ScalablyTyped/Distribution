package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about operation (or operation stage) progress.
  */
trait SchemaOperationProgress extends StObject {
  
  /**
    * Progress metric bundle, for example:   metrics: [{name: &quot;nodes
    * done&quot;,     int_value: 15},             {name: &quot;nodes
    * total&quot;,    int_value: 32}] or   metrics: [{name:
    * &quot;progress&quot;,       double_value: 0.56},             {name:
    * &quot;progress scale&quot;, double_value: 1.0}]
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
  
  /**
    * A non-parameterized string describing an operation stage. Unset for
    * single-stage operations.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Substages of an operation or a stage.
    */
  var stages: js.UndefOr[js.Array[SchemaOperationProgress]] = js.undefined
  
  /**
    * Status of an operation stage. Unset for single-stage operations.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaOperationProgress {
  
  inline def apply(): SchemaOperationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationProgress]
  }
  
  extension [Self <: SchemaOperationProgress](x: Self) {
    
    inline def setMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStages(value: js.Array[SchemaOperationProgress]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: SchemaOperationProgress*): Self = StObject.set(x, "stages", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
