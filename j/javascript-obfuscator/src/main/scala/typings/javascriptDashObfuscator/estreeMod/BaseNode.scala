package typings.javascriptDashObfuscator.estreeMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseNode extends js.Object {
  var metadata: js.UndefOr[BaseNodeMetadata] = js.undefined
  var parentNode: js.UndefOr[Node] = js.undefined
}

object BaseNode {
  @scala.inline
  def apply(metadata: BaseNodeMetadata = null, parentNode: Node = null): BaseNode = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
}

