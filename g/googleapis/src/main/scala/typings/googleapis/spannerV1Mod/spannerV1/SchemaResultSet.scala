package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Results from Read or ExecuteSql.
  */
@js.native
trait SchemaResultSet extends StObject {
  
  /**
    * Metadata about the result set, such as row type information.
    */
  var metadata: js.UndefOr[SchemaResultSetMetadata] = js.native
  
  /**
    * Each element in `rows` is a row whose format is defined by
    * metadata.row_type. The ith element in each row matches the ith field in
    * metadata.row_type. Elements are encoded based on type as described here.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    * Query plan and execution statistics for the SQL statement that produced
    * this result set. These can be requested by setting
    * ExecuteSqlRequest.query_mode. DML statements always produce stats
    * containing the number of rows modified, unless executed using the
    * ExecuteSqlRequest.QueryMode.PLAN ExecuteSqlRequest.query_mode. Other
    * fields may or may not be populated, based on the
    * ExecuteSqlRequest.query_mode.
    */
  var stats: js.UndefOr[SchemaResultSetStats] = js.native
}
object SchemaResultSet {
  
  @scala.inline
  def apply(): SchemaResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultSet]
  }
  
  @scala.inline
  implicit class SchemaResultSetMutableBuilder[Self <: SchemaResultSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: SchemaResultSetMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[js.Array[_]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: SchemaResultSetStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
  }
}
