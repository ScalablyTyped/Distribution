package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata type for the operation returned by CreateDatabase.
  */
@js.native
trait SchemaCreateDatabaseMetadata extends js.Object {
  /**
    * The database being created.
    */
  var database: js.UndefOr[String] = js.native
}

object SchemaCreateDatabaseMetadata {
  @scala.inline
  def apply(database: String = null): SchemaCreateDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateDatabaseMetadata]
  }
}

