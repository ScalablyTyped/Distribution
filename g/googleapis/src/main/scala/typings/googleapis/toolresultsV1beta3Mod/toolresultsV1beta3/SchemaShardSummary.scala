package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShardSummary extends StObject {
  
  /**
    * Summaries of the steps belonging to the shard. With flaky_test_attempts enabled from TestExecutionService, more than one run (Step) can present. And the runs will be sorted by multistep_number.
    */
  var runs: js.UndefOr[js.Array[SchemaStepSummary]] = js.undefined
  
  /**
    * Merged result of the shard.
    */
  var shardResult: js.UndefOr[SchemaMergedResult] = js.undefined
}
object SchemaShardSummary {
  
  inline def apply(): SchemaShardSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShardSummary]
  }
  
  extension [Self <: SchemaShardSummary](x: Self) {
    
    inline def setRuns(value: js.Array[SchemaStepSummary]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    inline def setRunsUndefined: Self = StObject.set(x, "runs", js.undefined)
    
    inline def setRunsVarargs(value: SchemaStepSummary*): Self = StObject.set(x, "runs", js.Array(value*))
    
    inline def setShardResult(value: SchemaMergedResult): Self = StObject.set(x, "shardResult", value.asInstanceOf[js.Any])
    
    inline def setShardResultUndefined: Self = StObject.set(x, "shardResult", js.undefined)
  }
}
