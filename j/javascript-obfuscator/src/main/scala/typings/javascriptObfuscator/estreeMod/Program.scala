package typings.javascriptObfuscator.estreeMod

import typings.eslintScope.mod.Scope
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program extends BaseNode {
  var scope: js.UndefOr[Scope | Null] = js.undefined
}

object Program {
  @scala.inline
  def apply(
    metadata: BaseNodeMetadata = null,
    parentNode: Node = null,
    scope: js.UndefOr[Null | Scope] = js.undefined
  ): Program = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (!js.isUndefined(scope)) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
}

