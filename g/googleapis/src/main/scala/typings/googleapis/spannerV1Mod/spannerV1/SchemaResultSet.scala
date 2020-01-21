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
  def apply(
    metadata: SchemaResultSetMetadata = null,
    rows: js.Array[js.Array[_]] = null,
    stats: SchemaResultSetStats = null
  ): SchemaResultSet = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResultSet]
  }
}

