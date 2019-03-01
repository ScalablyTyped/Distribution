package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveNode extends ASTNode {
  val arguments: js.UndefOr[js.Array[ArgumentNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.Directive
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object DirectiveNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.Directive,
    name: NameNode,
    arguments: js.Array[ArgumentNode] = null,
    loc: Location = null
  ): DirectiveNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[DirectiveNode]
  }
}

