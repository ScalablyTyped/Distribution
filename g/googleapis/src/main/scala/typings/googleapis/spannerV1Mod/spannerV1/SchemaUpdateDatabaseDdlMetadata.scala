package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata type for the operation returned by UpdateDatabaseDdl.
  */
@js.native
trait SchemaUpdateDatabaseDdlMetadata extends StObject {
  
  /**
    * Reports the commit timestamps of all statements that have succeeded so
    * far, where `commit_timestamps[i]` is the commit timestamp for the
    * statement `statements[i]`.
    */
  var commitTimestamps: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The database being modified.
    */
  var database: js.UndefOr[String] = js.native
  
  /**
    * For an update this list contains all the statements. For an individual
    * statement, this list contains only that statement.
    */
  var statements: js.UndefOr[js.Array[String]] = js.native
}
object SchemaUpdateDatabaseDdlMetadata {
  
  @scala.inline
  def apply(): SchemaUpdateDatabaseDdlMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDatabaseDdlMetadata]
  }
  
  @scala.inline
  implicit class SchemaUpdateDatabaseDdlMetadataMutableBuilder[Self <: SchemaUpdateDatabaseDdlMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitTimestamps(value: js.Array[String]): Self = StObject.set(x, "commitTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTimestampsUndefined: Self = StObject.set(x, "commitTimestamps", js.undefined)
    
    @scala.inline
    def setCommitTimestampsVarargs(value: String*): Self = StObject.set(x, "commitTimestamps", js.Array(value :_*))
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setStatements(value: js.Array[String]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    @scala.inline
    def setStatementsVarargs(value: String*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
