package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.Argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentNode extends ASTNode {
  val kind: Argument
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val value: ValueNode
}

object ArgumentNode {
  @scala.inline
  def apply(kind: Argument, name: NameNode, value: ValueNode, loc: Location = null): ArgumentNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ArgumentNode]
  }
}

