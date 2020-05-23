package typings.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonOptions extends js.Object {
  /**
    * A function that influences how the `info` is stringified.
    */
  var replacer: js.UndefOr[js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]] = js.undefined
  /**
    * The number of white space used to format the json.
    */
  var space: js.UndefOr[Double] = js.undefined
}

object JsonOptions {
  @scala.inline
  def apply(
    replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _] = null,
    space: js.UndefOr[Double] = js.undefined
  ): JsonOptions = {
    val __obj = js.Dynamic.literal()
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonOptions]
  }
}

