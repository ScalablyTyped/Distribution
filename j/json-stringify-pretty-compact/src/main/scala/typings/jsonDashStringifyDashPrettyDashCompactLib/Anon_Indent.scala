package typings
package jsonDashStringifyDashPrettyDashCompactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indent extends js.Object {
  var indent: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var margins: js.UndefOr[scala.Boolean] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Indent {
  @scala.inline
  def apply(
    indent: scala.Double | java.lang.String = null,
    margins: js.UndefOr[scala.Boolean] = js.undefined,
    maxLength: scala.Int | scala.Double = null
  ): Anon_Indent = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(margins)) __obj.updateDynamic("margins")(margins)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Indent]
  }
}

