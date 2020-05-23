package typings.json2csv.flattenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenOptions extends js.Object {
  var arrays: js.UndefOr[Boolean] = js.undefined
  var objects: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object FlattenOptions {
  @scala.inline
  def apply(
    arrays: js.UndefOr[Boolean] = js.undefined,
    objects: js.UndefOr[Boolean] = js.undefined,
    separator: String = null
  ): FlattenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrays)) __obj.updateDynamic("arrays")(arrays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objects)) __obj.updateDynamic("objects")(objects.get.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenOptions]
  }
}

