package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.IntValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntValueNode
  extends ASTNode
     with ValueNode {
  val kind: IntValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: String
}

object IntValueNode {
  @scala.inline
  def apply(kind: IntValue, value: String, loc: Location = null): IntValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntValueNode]
  }
}

