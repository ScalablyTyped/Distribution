package typings.iarnaToml.parseAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The amount text to parser per pass through the event loop. Defaults to 40kb. */
  var blocksize: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(blocksize: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocksize)) __obj.updateDynamic("blocksize")(blocksize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

