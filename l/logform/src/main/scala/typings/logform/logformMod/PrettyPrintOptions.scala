package typings.logform.logformMod

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
  def apply(colorize: js.UndefOr[Boolean] = js.undefined, depth: Int | Double = null): PrettyPrintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorize)) __obj.updateDynamic("colorize")(colorize.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrettyPrintOptions]
  }
}

