package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderingOptions extends js.Object {
  var direction: js.UndefOr[
    massiveLib.massiveLibStrings.ASC | massiveLib.massiveLibStrings.asc | massiveLib.massiveLibStrings.DESC | massiveLib.massiveLibStrings.desc
  ] = js.undefined
  var expr: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var last: js.UndefOr[java.lang.String] = js.undefined
  var nulls: js.UndefOr[
    massiveLib.massiveLibStrings.FIRST | massiveLib.massiveLibStrings.first | massiveLib.massiveLibStrings.LAST | massiveLib.massiveLibStrings.last
  ] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object OrderingOptions {
  @scala.inline
  def apply(
    direction: massiveLib.massiveLibStrings.ASC | massiveLib.massiveLibStrings.asc | massiveLib.massiveLibStrings.DESC | massiveLib.massiveLibStrings.desc = null,
    expr: java.lang.String = null,
    field: java.lang.String = null,
    last: java.lang.String = null,
    nulls: massiveLib.massiveLibStrings.FIRST | massiveLib.massiveLibStrings.first | massiveLib.massiveLibStrings.LAST | massiveLib.massiveLibStrings.last = null,
    `type`: java.lang.String = null
  ): OrderingOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (expr != null) __obj.updateDynamic("expr")(expr)
    if (field != null) __obj.updateDynamic("field")(field)
    if (last != null) __obj.updateDynamic("last")(last)
    if (nulls != null) __obj.updateDynamic("nulls")(nulls.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OrderingOptions]
  }
}

