package typings
package ibmUnderscoreDbLib.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeObject extends js.Object {
  var column: js.UndefOr[java.lang.String] = js.undefined
  var database: java.lang.String
  var schema: js.UndefOr[java.lang.String] = js.undefined
  var table: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DescribeObject {
  @scala.inline
  def apply(
    database: java.lang.String,
    column: java.lang.String = null,
    schema: java.lang.String = null,
    table: java.lang.String = null,
    `type`: java.lang.String = null
  ): DescribeObject = {
    val __obj = js.Dynamic.literal(database = database)
    if (column != null) __obj.updateDynamic("column")(column)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (table != null) __obj.updateDynamic("table")(table)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DescribeObject]
  }
}

