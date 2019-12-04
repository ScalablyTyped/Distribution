package typings.javascriptDashObfuscator.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierNodeMetadata extends BaseNodeMetadata {
  var renamedIdentifier: js.UndefOr[Boolean] = js.undefined
}

object IdentifierNodeMetadata {
  @scala.inline
  def apply(
    ignoredNode: js.UndefOr[Boolean] = js.undefined,
    renamedIdentifier: js.UndefOr[Boolean] = js.undefined
  ): IdentifierNodeMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoredNode)) __obj.updateDynamic("ignoredNode")(ignoredNode.asInstanceOf[js.Any])
    if (!js.isUndefined(renamedIdentifier)) __obj.updateDynamic("renamedIdentifier")(renamedIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierNodeMetadata]
  }
}

