package typings.javascriptObfuscator.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseNodeMetadata extends js.Object {
  var ignoredNode: js.UndefOr[Boolean] = js.undefined
}

object BaseNodeMetadata {
  @scala.inline
  def apply(ignoredNode: js.UndefOr[Boolean] = js.undefined): BaseNodeMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoredNode)) __obj.updateDynamic("ignoredNode")(ignoredNode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNodeMetadata]
  }
}

