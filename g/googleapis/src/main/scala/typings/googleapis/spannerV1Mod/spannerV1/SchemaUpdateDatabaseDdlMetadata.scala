package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateDatabaseDdlMetadata extends StObject {
  
  /**
    * Reports the commit timestamps of all statements that have succeeded so far, where `commit_timestamps[i]` is the commit timestamp for the statement `statements[i]`.
    */
  var commitTimestamps: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The database being modified.
    */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The progress of the UpdateDatabaseDdl operations. Currently, only index creation statements will have a continuously updating progress. For non-index creation statements, `progress[i]` will have start time and end time populated with commit timestamp of operation, as well as a progress of 100% once the operation has completed. `progress[i]` is the operation progress for `statements[i]`.
    */
  var progress: js.UndefOr[js.Array[SchemaOperationProgress]] = js.undefined
  
  /**
    * For an update this list contains all the statements. For an individual statement, this list contains only that statement.
    */
  var statements: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. When true, indicates that the operation is throttled e.g due to resource constraints. When resources become available the operation will resume and this field will be false again.
    */
  var throttled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaUpdateDatabaseDdlMetadata {
  
  inline def apply(): SchemaUpdateDatabaseDdlMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDatabaseDdlMetadata]
  }
  
  extension [Self <: SchemaUpdateDatabaseDdlMetadata](x: Self) {
    
    inline def setCommitTimestamps(value: js.Array[String]): Self = StObject.set(x, "commitTimestamps", value.asInstanceOf[js.Any])
    
    inline def setCommitTimestampsNull: Self = StObject.set(x, "commitTimestamps", null)
    
    inline def setCommitTimestampsUndefined: Self = StObject.set(x, "commitTimestamps", js.undefined)
    
    inline def setCommitTimestampsVarargs(value: String*): Self = StObject.set(x, "commitTimestamps", js.Array(value*))
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setProgress(value: js.Array[SchemaOperationProgress]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setProgressVarargs(value: SchemaOperationProgress*): Self = StObject.set(x, "progress", js.Array(value*))
    
    inline def setStatements(value: js.Array[String]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsNull: Self = StObject.set(x, "statements", null)
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setStatementsVarargs(value: String*): Self = StObject.set(x, "statements", js.Array(value*))
    
    inline def setThrottled(value: Boolean): Self = StObject.set(x, "throttled", value.asInstanceOf[js.Any])
    
    inline def setThrottledNull: Self = StObject.set(x, "throttled", null)
    
    inline def setThrottledUndefined: Self = StObject.set(x, "throttled", js.undefined)
  }
}
