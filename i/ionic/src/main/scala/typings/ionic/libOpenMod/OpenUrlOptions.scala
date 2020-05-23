package typings.ionic.libOpenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenUrlOptions extends js.Object {
  var app: js.UndefOr[String | js.Array[String]] = js.undefined
  var encode: js.UndefOr[Boolean] = js.undefined
}

object OpenUrlOptions {
  @scala.inline
  def apply(app: String | js.Array[String] = null, encode: js.UndefOr[Boolean] = js.undefined): OpenUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlOptions]
  }
}

