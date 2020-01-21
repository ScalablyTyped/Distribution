package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database list response.
  */
@js.native
trait SchemaDatabasesListResponse extends js.Object {
  /**
    * List of database resources in the instance.
    */
  var items: js.UndefOr[js.Array[SchemaDatabase]] = js.native
  /**
    * This is always sql#databasesList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDatabasesListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaDatabase] = null, kind: String = null): SchemaDatabasesListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatabasesListResponse]
  }
}

