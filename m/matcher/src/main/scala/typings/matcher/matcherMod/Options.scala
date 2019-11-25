package typings.matcher.matcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Treat uppercase and lowercase characters as being the same.
  		Ensure you use this correctly. For example, files and directories should be matched case-insensitively, while most often, object keys should be matched case-sensitively.
  		@default false
  		*/
  val caseSensitive: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(caseSensitive: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

