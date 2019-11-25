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
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldNode]
  }
}

