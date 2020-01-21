package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a response to an sql statement.
  */
@js.native
trait SchemaSqlresponse extends js.Object {
  /**
    * Columns in the table.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  /**
    * Type name: a template for an individual table.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The rows in the table. For each cell we print out whatever cell value
    * (e.g., numeric, string) exists. Thus it is important that each cell
    * contains only one value.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object SchemaSqlresponse {
  @scala.inline
  def apply(columns: js.Array[String] = null, kind: String = null, rows: js.Array[js.Array[_]] = null): SchemaSqlresponse = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSqlresponse]
  }
}

