package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.BooleanValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanValueNode
  extends ASTNode
     with ValueNode {
  val kind: BooleanValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: Boolean
}

object BooleanValueNode {
  @scala.inline
  def apply(kind: BooleanValue, value: Boolean, loc: Location = null): BooleanValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanValueNode]
  }
}

