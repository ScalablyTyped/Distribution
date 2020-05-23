package typings.jsonStringifyPrettyCompact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indent extends js.Object {
  var indent: js.UndefOr[Double | String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var replacer: js.UndefOr[
    (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String]) | Null
  ] = js.undefined
}

object Indent {
  @scala.inline
  def apply(
    indent: Double | String = null,
    maxLength: js.UndefOr[Double] = js.undefined,
    replacer: js.UndefOr[
      Null | (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String])
    ] = js.undefined
  ): Indent = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replacer)) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent]
  }
}

