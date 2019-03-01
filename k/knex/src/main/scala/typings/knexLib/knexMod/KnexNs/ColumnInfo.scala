package typings
package knexLib.knexMod.KnexNs

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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.updateDynamic("maxLength")(maxLength)
    __obj.updateDynamic("nullable")(nullable)
    __obj.asInstanceOf[ColumnInfo]
  }
}

