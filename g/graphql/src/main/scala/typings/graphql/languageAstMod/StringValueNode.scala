package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.StringValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringValueNode
  extends ASTNode
     with ValueNode {
  val block: js.UndefOr[Boolean] = js.undefined
  val kind: StringValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: String
}

object StringValueNode {
  @scala.inline
  def apply(kind: StringValue, value: String, block: js.UndefOr[Boolean] = js.undefined, loc: Location = null): StringValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringValueNode]
  }
}

