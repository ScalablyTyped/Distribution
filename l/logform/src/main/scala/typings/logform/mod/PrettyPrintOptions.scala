package typings.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrettyPrintOptions extends js.Object {
  /**
    * Colorizes the message if set to `true`. Defaults to `false`.
    */
  var colorize: js.UndefOr[Boolean] = js.undefined
  /**
    * A `number` that specifies the maximum depth of the `info` object being stringified by
    * `util.inspect`. Defaults to `2`.
    */
  var depth: js.UndefOr[Double] = js.undefined
}

object PrettyPrintOptions {
  @scala.inline
  def apply(colorize: js.UndefOr[Boolean] = js.undefined, depth: js.UndefOr[Double] = js.undefined): PrettyPrintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorize)) __obj.updateDynamic("colorize")(colorize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrettyPrintOptions]
  }
}

