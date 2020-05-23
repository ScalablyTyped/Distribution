package typings.hapiJoi.mod

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
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    if (!js.isUndefined(fallthrough)) __obj.updateDynamic("fallthrough")(fallthrough.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPatternOptions]
  }
}

