package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    commitTimestamps: js.Array[String] = null,
    database: String = null,
    statements: js.Array[String] = null
  ): SchemaUpdateDatabaseDdlMetadata = {
    val __obj = js.Dynamic.literal()
    if (commitTimestamps != null) __obj.updateDynamic("commitTimestamps")(commitTimestamps.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateDatabaseDdlMetadata]
  }
}

