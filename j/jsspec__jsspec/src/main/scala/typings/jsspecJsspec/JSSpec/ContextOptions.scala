package typings.jsspecJsspec.JSSpec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  /**
    * Run the contained Examples/Contexts in random order?
    * - Run in random order if `true`
    * - Run in definition order if `false`
    */
  var random: js.UndefOr[Boolean] = js.undefined
  /**
    * fail the test after _timeout_ milliseconds
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object ContextOptions {
  @scala.inline
  def apply(random: js.UndefOr[Boolean] = js.undefined, timeout: js.UndefOr[Double] = js.undefined): ContextOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(random)) __obj.updateDynamic("random")(random.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
}

