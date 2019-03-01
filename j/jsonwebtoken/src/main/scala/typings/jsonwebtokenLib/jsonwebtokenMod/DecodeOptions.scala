package typings
package jsonwebtokenLib.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeOptions extends js.Object {
  var complete: js.UndefOr[scala.Boolean] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
}

object DecodeOptions {
  @scala.inline
  def apply(complete: js.UndefOr[scala.Boolean] = js.undefined, json: js.UndefOr[scala.Boolean] = js.undefined): DecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(complete)) __obj.updateDynamic("complete")(complete)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    __obj.asInstanceOf[DecodeOptions]
  }
}

