package typings.jsonDashStringifyDashPrettyDashCompact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indent extends js.Object {
  var indent: js.UndefOr[Double | String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var replacer: js.UndefOr[
    (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String]) | Null
  ] = js.undefined
}

object Anon_Indent {
  @scala.inline
  def apply(
    indent: Double | String = null,
    maxLength: Int | Double = null,
    replacer: (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String]) = null
  ): Anon_Indent = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Indent]
  }
}

