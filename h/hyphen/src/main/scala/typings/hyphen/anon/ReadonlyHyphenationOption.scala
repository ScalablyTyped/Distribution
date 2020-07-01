package typings.hyphen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<hyphen.hyphen.HyphenationOptions> */
trait ReadonlyHyphenationOption extends js.Object {
  val debug: js.UndefOr[Boolean] = js.undefined
  val hyphenChar: js.UndefOr[String] = js.undefined
  val minWordLength: js.UndefOr[Double] = js.undefined
}

object ReadonlyHyphenationOption {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    hyphenChar: String = null,
    minWordLength: js.UndefOr[Double] = js.undefined
  ): ReadonlyHyphenationOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (hyphenChar != null) __obj.updateDynamic("hyphenChar")(hyphenChar.asInstanceOf[js.Any])
    if (!js.isUndefined(minWordLength)) __obj.updateDynamic("minWordLength")(minWordLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyHyphenationOption]
  }
}

