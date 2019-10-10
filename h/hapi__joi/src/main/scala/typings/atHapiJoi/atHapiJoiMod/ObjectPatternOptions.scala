package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPatternOptions extends js.Object {
  var fallthrough: js.UndefOr[Boolean] = js.undefined
  var matches: SchemaLike | Reference
}

object ObjectPatternOptions {
  @scala.inline
  def apply(fallthrough: js.UndefOr[Boolean] = js.undefined, matches: SchemaLike | Reference = null): ObjectPatternOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fallthrough)) __obj.updateDynamic("fallthrough")(fallthrough)
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPatternOptions]
  }
}

