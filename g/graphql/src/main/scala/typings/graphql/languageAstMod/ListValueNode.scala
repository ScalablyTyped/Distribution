package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.ListValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListValueNode
  extends ASTNode
     with ValueNode {
  val kind: ListValue
  val loc: js.UndefOr[Location] = js.undefined
  val values: js.Array[ValueNode]
}

object ListValueNode {
  @scala.inline
  def apply(kind: ListValue, values: js.Array[ValueNode], loc: Location = null): ListValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListValueNode]
  }
}

