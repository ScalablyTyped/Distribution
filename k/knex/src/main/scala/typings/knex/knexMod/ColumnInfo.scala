package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Configurations
//
trait ColumnInfo extends js.Object {
  var defaultValue: Value
  var maxLength: Double
  var nullable: Boolean
  var `type`: String
}

object ColumnInfo {
  @scala.inline
  def apply(defaultValue: Value, maxLength: Double, nullable: Boolean, `type`: String): ColumnInfo = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInfo]
  }
}

