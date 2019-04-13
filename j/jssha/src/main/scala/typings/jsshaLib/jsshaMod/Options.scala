package typings
package jsshaLib.jsshaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends EncodingOptions {
  var numRounds: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(encoding: java.lang.String = null, numRounds: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (numRounds != null) __obj.updateDynamic("numRounds")(numRounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

