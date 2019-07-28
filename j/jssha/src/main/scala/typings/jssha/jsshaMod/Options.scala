package typings.jssha.jsshaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends EncodingOptions {
  var numRounds: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(encoding: String = null, numRounds: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (numRounds != null) __obj.updateDynamic("numRounds")(numRounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

