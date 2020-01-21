package typings.javascriptObfuscator.estreeMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier extends BaseNode {
  @JSName("metadata")
  var metadata_Identifier: js.UndefOr[IdentifierNodeMetadata] = js.undefined
}

object Identifier {
  @scala.inline
  def apply(metadata: IdentifierNodeMetadata = null, parentNode: Node = null): Identifier = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

