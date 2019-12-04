package typings.javascriptDashObfuscator.estreeMod

import typings.javascriptDashObfuscator.escodegenMod.XVerbatimProperty
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral extends BaseNode {
  @JSName("metadata")
  var metadata_RegExpLiteral: js.UndefOr[LiteralNodeMetadata] = js.undefined
  var `x-verbatim-property`: js.UndefOr[XVerbatimProperty] = js.undefined
}

object RegExpLiteral {
  @scala.inline
  def apply(
    metadata: LiteralNodeMetadata = null,
    parentNode: Node = null,
    `x-verbatim-property`: XVerbatimProperty = null
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (`x-verbatim-property` != null) __obj.updateDynamic("x-verbatim-property")(`x-verbatim-property`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
}

