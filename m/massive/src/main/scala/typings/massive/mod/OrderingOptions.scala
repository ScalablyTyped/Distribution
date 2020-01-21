package typings.massive.mod

import typings.massive.massiveStrings.ASC
import typings.massive.massiveStrings.DESC
import typings.massive.massiveStrings.FIRST
import typings.massive.massiveStrings.LAST
import typings.massive.massiveStrings.asc_
import typings.massive.massiveStrings.desc_
import typings.massive.massiveStrings.first_
import typings.massive.massiveStrings.last_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderingOptions extends js.Object {
  var direction: js.UndefOr[ASC | asc_ | DESC | desc_] = js.undefined
  var expr: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[String] = js.undefined
  var nulls: js.UndefOr[FIRST | first_ | LAST | last_] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object OrderingOptions {
  @scala.inline
  def apply(
    direction: ASC | asc_ | DESC | desc_ = null,
    expr: String = null,
    field: String = null,
    last: String = null,
    nulls: FIRST | first_ | LAST | last_ = null,
    `type`: String = null
  ): OrderingOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (expr != null) __obj.updateDynamic("expr")(expr.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (nulls != null) __obj.updateDynamic("nulls")(nulls.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderingOptions]
  }
}

