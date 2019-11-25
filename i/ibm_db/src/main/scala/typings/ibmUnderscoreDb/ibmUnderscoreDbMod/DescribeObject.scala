package typings.ibmUnderscoreDb.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeObject extends js.Object {
  var column: js.UndefOr[String] = js.undefined
  var database: String
  var schema: js.UndefOr[String] = js.undefined
  var table: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DescribeObject {
  @scala.inline
  def apply(
    database: String,
    column: String = null,
    schema: String = null,
    table: String = null,
    `type`: String = null
  ): DescribeObject = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObject]
  }
}

