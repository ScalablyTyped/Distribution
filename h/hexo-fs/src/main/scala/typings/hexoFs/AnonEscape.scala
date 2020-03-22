package typings.hexoFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEscape extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var escape: js.UndefOr[Boolean] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
}

object AnonEscape {
  @scala.inline
  def apply(encoding: String = null, escape: js.UndefOr[Boolean] = js.undefined, flag: String = null): AnonEscape = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEscape]
  }
}

