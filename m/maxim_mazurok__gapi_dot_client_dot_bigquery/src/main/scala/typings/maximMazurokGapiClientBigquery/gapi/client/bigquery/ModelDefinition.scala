package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDefinition extends StObject {
  
  /**
    * [Output-only, Beta] Model options used for the first training run. These options are immutable for subsequent training runs. Default values are used for any options not specified in
    * the input query.
    */
  var modelOptions: js.UndefOr[Labels] = js.undefined
  
  /**
    * [Output-only, Beta] Information about ml training runs, each training run comprises of multiple iterations and there may be multiple training runs for the model if warm start is
    * used or if a user decides to continue a previously cancelled query.
    */
  var trainingRuns: js.UndefOr[js.Array[BqmlTrainingRun]] = js.undefined
}
object ModelDefinition {
  
  inline def apply(): ModelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDefinition]
  }
  
  extension [Self <: ModelDefinition](x: Self) {
    
    inline def setModelOptions(value: Labels): Self = StObject.set(x, "modelOptions", value.asInstanceOf[js.Any])
    
    inline def setModelOptionsUndefined: Self = StObject.set(x, "modelOptions", js.undefined)
    
    inline def setTrainingRuns(value: js.Array[BqmlTrainingRun]): Self = StObject.set(x, "trainingRuns", value.asInstanceOf[js.Any])
    
    inline def setTrainingRunsUndefined: Self = StObject.set(x, "trainingRuns", js.undefined)
    
    inline def setTrainingRunsVarargs(value: BqmlTrainingRun*): Self = StObject.set(x, "trainingRuns", js.Array(value*))
  }
}
