package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results from Read or ExecuteSql.
  */
@js.native
trait SchemaResultSet extends js.Object {
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
  implicit class SchemaResultSetOps[Self <: SchemaResultSet] (val x: Self) extends AnyVal {
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
    def setMetadata(value: SchemaResultSetMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[_]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setStats(value: SchemaResultSetStats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
  
}

