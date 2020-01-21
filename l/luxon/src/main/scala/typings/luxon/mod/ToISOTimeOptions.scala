package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToISOTimeOptions extends js.Object {
  var includeOffset: js.UndefOr[Boolean] = js.undefined
  var suppressMilliseconds: js.UndefOr[Boolean] = js.undefined
  var suppressSeconds: js.UndefOr[Boolean] = js.undefined
}

object ToISOTimeOptions {
  @scala.inline
  def apply(
    includeOffset: js.UndefOr[Boolean] = js.undefined,
    suppressMilliseconds: js.UndefOr[Boolean] = js.undefined,
    suppressSeconds: js.UndefOr[Boolean] = js.undefined
  ): ToISOTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeOffset)) __obj.updateDynamic("includeOffset")(includeOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMilliseconds)) __obj.updateDynamic("suppressMilliseconds")(suppressMilliseconds.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressSeconds)) __obj.updateDynamic("suppressSeconds")(suppressSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToISOTimeOptions]
  }
}

