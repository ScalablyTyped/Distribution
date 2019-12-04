package typings.javascriptDashObfuscator.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralNodeMetadata extends BaseNodeMetadata {
  var replacedLiteral: js.UndefOr[Boolean] = js.undefined
}

object LiteralNodeMetadata {
  @scala.inline
  def apply(
    ignoredNode: js.UndefOr[Boolean] = js.undefined,
    replacedLiteral: js.UndefOr[Boolean] = js.undefined
  ): LiteralNodeMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoredNode)) __obj.updateDynamic("ignoredNode")(ignoredNode.asInstanceOf[js.Any])
    if (!js.isUndefined(replacedLiteral)) __obj.updateDynamic("replacedLiteral")(replacedLiteral.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralNodeMetadata]
  }
}

