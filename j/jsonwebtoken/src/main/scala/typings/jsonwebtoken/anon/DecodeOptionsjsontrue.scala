package typings.jsonwebtoken.anon

import typings.jsonwebtoken.jsonwebtokenBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jsonwebtoken.jsonwebtoken.DecodeOptions & {  json  :true} */
trait DecodeOptionsjsontrue extends js.Object {
  var complete: js.UndefOr[Boolean] = js.undefined
  var json: js.UndefOr[Boolean with `true`] = js.undefined
}

object DecodeOptionsjsontrue {
  @scala.inline
  def apply(complete: js.UndefOr[Boolean] = js.undefined, json: js.UndefOr[Boolean with `true`] = js.undefined): DecodeOptionsjsontrue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(complete)) __obj.updateDynamic("complete")(complete.get.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeOptionsjsontrue]
  }
}

