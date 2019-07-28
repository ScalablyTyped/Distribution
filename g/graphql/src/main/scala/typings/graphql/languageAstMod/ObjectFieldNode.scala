package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.ObjectField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectFieldNode extends ASTNode {
  val kind: ObjectField
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val value: ValueNode
}

object ObjectFieldNode {
  @scala.inline
  def apply(kind: ObjectField, name: NameNode, value: ValueNode, loc: Location = null): ObjectFieldNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ObjectFieldNode]
  }
}

