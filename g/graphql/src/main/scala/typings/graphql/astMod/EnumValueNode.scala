package typings.graphql.astMod

import typings.graphql.graphqlStrings.EnumValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValueNode
  extends ASTNode
     with ValueNode {
  val kind: EnumValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: String
}

object EnumValueNode {
  @scala.inline
  def apply(kind: EnumValue, value: String, loc: Location = null): EnumValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValueNode]
  }
}

