package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStatistics extends StObject {
  
  /** Results for all completed iterations. */
  var iterationResults: js.UndefOr[js.Array[IterationResult]] = js.undefined
  
  /** Maximum number of iterations specified as max_iterations in the 'CREATE MODEL' query. The actual number of iterations may be less than this number due to early stop. */
  var maxIterations: js.UndefOr[String] = js.undefined
}
object MlStatistics {
  
  inline def apply(): MlStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlStatistics]
  }
  
  extension [Self <: MlStatistics](x: Self) {
    
    inline def setIterationResults(value: js.Array[IterationResult]): Self = StObject.set(x, "iterationResults", value.asInstanceOf[js.Any])
    
    inline def setIterationResultsUndefined: Self = StObject.set(x, "iterationResults", js.undefined)
    
    inline def setIterationResultsVarargs(value: IterationResult*): Self = StObject.set(x, "iterationResults", js.Array(value*))
    
    inline def setMaxIterations(value: String): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    inline def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
  }
}
