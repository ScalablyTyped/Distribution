package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectFieldNode extends ASTNode {
  val kind: graphqlLib.graphqlLibStrings.ObjectField
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val value: ValueNode
}

object ObjectFieldNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.ObjectField,
    name: NameNode,
    value: ValueNode,
    loc: Location = null
  ): ObjectFieldNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ObjectFieldNode]
  }
}

