package typings.massive.massiveMod

import typings.massive.massiveStrings.ASC
import typings.massive.massiveStrings.DESC
import typings.massive.massiveStrings.FIRST
import typings.massive.massiveStrings.LAST
import typings.massive.massiveStrings.asc
import typings.massive.massiveStrings.desc
import typings.massive.massiveStrings.first
import typings.massive.massiveStrings.last
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderingOptions extends js.Object {
  var direction: js.UndefOr[ASC | asc | DESC | desc] = js.undefined
  var expr: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[String] = js.undefined
  var nulls: js.UndefOr[FIRST | first | LAST | last] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object OrderingOptions {
  @scala.inline
  def apply(
    direction: ASC | asc | DESC | desc = null,
    expr: String = null,
    field: String = null,
    last: String = null,
    nulls: FIRST | first | LAST | last = null,
    `type`: String = null
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

