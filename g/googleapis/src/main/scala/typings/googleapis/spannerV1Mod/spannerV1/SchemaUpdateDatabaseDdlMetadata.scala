package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata type for the operation returned by UpdateDatabaseDdl.
  */
@js.native
trait SchemaUpdateDatabaseDdlMetadata extends js.Object {
  
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
  implicit class SchemaUpdateDatabaseDdlMetadataOps[Self <: SchemaUpdateDatabaseDdlMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommitTimestampsVarargs(value: String*): Self = this.set("commitTimestamps", js.Array(value :_*))
    
    @scala.inline
    def setCommitTimestamps(value: js.Array[String]): Self = this.set("commitTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitTimestamps: Self = this.set("commitTimestamps", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setStatementsVarargs(value: String*): Self = this.set("statements", js.Array(value :_*))
    
    @scala.inline
    def setStatements(value: js.Array[String]): Self = this.set("statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatements: Self = this.set("statements", js.undefined)
  }
}
