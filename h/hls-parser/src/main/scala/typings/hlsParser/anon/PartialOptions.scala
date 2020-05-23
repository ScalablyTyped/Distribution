package typings.hlsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hls-parser.hls-parser.Options> */
trait PartialOptions extends js.Object {
  var strictMode: js.UndefOr[Boolean] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(strictMode: js.UndefOr[Boolean] = js.undefined): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

