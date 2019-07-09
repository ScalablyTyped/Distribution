package typings
package jsonDashStringifyDashPrettyDashCompactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indent extends js.Object {
  var indent: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var replacer: js.UndefOr[
    (js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]) | (js.Array[scala.Double | java.lang.String]) | scala.Null
  ] = js.undefined
}

object Anon_Indent {
  @scala.inline
  def apply(
    indent: scala.Double | java.lang.String = null,
    maxLength: scala.Int | scala.Double = null,
    replacer: (js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]) | (js.Array[scala.Double | java.lang.String]) = null
  ): Anon_Indent = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Indent]
  }
}

