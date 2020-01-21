package typings.graphql.astMod

import typings.graphql.graphqlStrings.NullValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullValueNode
  extends ASTNode
     with ValueNode {
  val kind: NullValue
  val loc: js.UndefOr[Location] = js.undefined
}

object NullValueNode {
  @scala.inline
  def apply(kind: NullValue, loc: Location = null): NullValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullValueNode]
  }
}

