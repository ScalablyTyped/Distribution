package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableNode
  extends ASTNode
     with ValueNode {
  val kind: graphqlLib.graphqlLibStrings.Variable
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object VariableNode {
  @scala.inline
  def apply(kind: graphqlLib.graphqlLibStrings.Variable, name: NameNode, loc: Location = null): VariableNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[VariableNode]
  }
}

