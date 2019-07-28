package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.Directive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveNode extends ASTNode {
  val arguments: js.UndefOr[js.Array[ArgumentNode]] = js.undefined
  val kind: Directive
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object DirectiveNode {
  @scala.inline
  def apply(kind: Directive, name: NameNode, arguments: js.Array[ArgumentNode] = null, loc: Location = null): DirectiveNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[DirectiveNode]
  }
}

