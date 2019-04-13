package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Configurations
//
trait ColumnInfo extends js.Object {
  var defaultValue: knexLib.Value
  var maxLength: scala.Double
  var nullable: scala.Boolean
  var `type`: java.lang.String
}

object ColumnInfo {
  @scala.inline
  def apply(
    defaultValue: knexLib.Value,
    maxLength: scala.Double,
    nullable: scala.Boolean,
    `type`: java.lang.String
  ): ColumnInfo = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], maxLength = maxLength, nullable = nullable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnInfo]
  }
}

