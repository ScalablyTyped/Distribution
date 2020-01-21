package typings.graphql.astMod

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
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentNode]
  }
}

