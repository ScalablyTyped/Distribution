package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommitResponse extends StObject {
  
  /**
    * The statistics about this Commit. Not returned by default. For more information, see CommitRequest.return_commit_stats.
    */
  var commitStats: js.UndefOr[SchemaCommitStats] = js.undefined
  
  /**
    * The Cloud Spanner timestamp at which the transaction committed.
    */
  var commitTimestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaCommitResponse {
  
  inline def apply(): SchemaCommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitResponse]
  }
  
  extension [Self <: SchemaCommitResponse](x: Self) {
    
    inline def setCommitStats(value: SchemaCommitStats): Self = StObject.set(x, "commitStats", value.asInstanceOf[js.Any])
    
    inline def setCommitStatsUndefined: Self = StObject.set(x, "commitStats", js.undefined)
    
    inline def setCommitTimestamp(value: String): Self = StObject.set(x, "commitTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCommitTimestampNull: Self = StObject.set(x, "commitTimestamp", null)
    
    inline def setCommitTimestampUndefined: Self = StObject.set(x, "commitTimestamp", js.undefined)
  }
}
