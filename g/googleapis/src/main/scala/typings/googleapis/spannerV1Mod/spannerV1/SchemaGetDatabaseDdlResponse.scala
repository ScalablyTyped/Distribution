package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for GetDatabaseDdl.
  */
@js.native
trait SchemaGetDatabaseDdlResponse extends js.Object {
  /**
    * A list of formatted DDL statements defining the schema of the database
    * specified in the request.
    */
  var statements: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGetDatabaseDdlResponse {
  @scala.inline
  def apply(statements: js.Array[String] = null): SchemaGetDatabaseDdlResponse = {
    val __obj = js.Dynamic.literal()
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetDatabaseDdlResponse]
  }
}

