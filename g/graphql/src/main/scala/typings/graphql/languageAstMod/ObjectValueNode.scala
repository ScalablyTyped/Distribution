package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectValueNode
  extends ASTNode
     with ValueNode {
  val fields: js.Array[ObjectFieldNode]
  val kind: ObjectValue
  val loc: js.UndefOr[Location] = js.undefined
}

object ObjectValueNode {
  @scala.inline
  def apply(fields: js.Array[ObjectFieldNode], kind: ObjectValue, loc: Location = null): ObjectValueNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectValueNode]
  }
}

