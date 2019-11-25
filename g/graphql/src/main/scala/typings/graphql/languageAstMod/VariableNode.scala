package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableNode
  extends ASTNode
     with ValueNode {
  val kind: Variable
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object VariableNode {
  @scala.inline
  def apply(kind: Variable, name: NameNode, loc: Location = null): VariableNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableNode]
  }
}

