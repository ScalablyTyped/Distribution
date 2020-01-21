package typings.jsonwebtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeOptions extends js.Object {
  var complete: js.UndefOr[Boolean] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
}

object DecodeOptions {
  @scala.inline
  def apply(complete: js.UndefOr[Boolean] = js.undefined, json: js.UndefOr[Boolean] = js.undefined): DecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(complete)) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeOptions]
  }
}

