package typings.hyphen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<hyphen.hyphen.FactoryOptions> */
trait ReadonlyFactoryOptions extends js.Object {
  val async: js.UndefOr[Boolean] = js.undefined
  val debug: js.UndefOr[Boolean] = js.undefined
  val html: js.UndefOr[Boolean] = js.undefined
  val hyphenChar: js.UndefOr[String] = js.undefined
  val minWordLength: js.UndefOr[Double] = js.undefined
}

object ReadonlyFactoryOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined,
    hyphenChar: String = null,
    minWordLength: js.UndefOr[Double] = js.undefined
  ): ReadonlyFactoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.get.asInstanceOf[js.Any])
    if (hyphenChar != null) __obj.updateDynamic("hyphenChar")(hyphenChar.asInstanceOf[js.Any])
    if (!js.isUndefined(minWordLength)) __obj.updateDynamic("minWordLength")(minWordLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFactoryOptions]
  }
}

