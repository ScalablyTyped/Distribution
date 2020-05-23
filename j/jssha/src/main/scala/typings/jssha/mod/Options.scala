package typings.jssha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends EncodingOptions {
  var numRounds: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(encoding: String = null, numRounds: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(numRounds)) __obj.updateDynamic("numRounds")(numRounds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

