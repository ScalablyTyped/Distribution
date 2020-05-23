package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyOptions extends js.Object {
  var each: js.UndefOr[Boolean] = js.undefined
  var once: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[Boolean] = js.undefined
  var schema: js.UndefOr[Boolean] = js.undefined
}

object ModifyOptions {
  @scala.inline
  def apply(
    each: js.UndefOr[Boolean] = js.undefined,
    once: js.UndefOr[Boolean] = js.undefined,
    ref: js.UndefOr[Boolean] = js.undefined,
    schema: js.UndefOr[Boolean] = js.undefined
  ): ModifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(each)) __obj.updateDynamic("each")(each.get.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.get.asInstanceOf[js.Any])
    if (!js.isUndefined(schema)) __obj.updateDynamic("schema")(schema.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyOptions]
  }
}

