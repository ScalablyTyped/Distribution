package typings.hyphen.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactoryOptions extends js.Object {
  /**
    * If true the factory returns an asynchronous hyphenation function.
    * @default false
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean indicating, if the hyphenation function should output debug info to the console.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * If true the hyphenation function is going to ignore HTML tags in the text.
    * @default false
    */
  var html: js.UndefOr[Boolean] = js.undefined
  /**
    * The value of the hyphen character that is inserted into the text.
    * @default \\u00AD
    */
  var hyphenChar: js.UndefOr[String] = js.undefined
  /**
    * The minimum length for a word to get hyphenated. Can't be less than 5.
    * @default 5
    */
  var minWordLength: js.UndefOr[Double] = js.undefined
}

object FactoryOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined,
    hyphenChar: String = null,
    minWordLength: js.UndefOr[Double] = js.undefined
  ): FactoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.get.asInstanceOf[js.Any])
    if (hyphenChar != null) __obj.updateDynamic("hyphenChar")(hyphenChar.asInstanceOf[js.Any])
    if (!js.isUndefined(minWordLength)) __obj.updateDynamic("minWordLength")(minWordLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactoryOptions]
  }
}

