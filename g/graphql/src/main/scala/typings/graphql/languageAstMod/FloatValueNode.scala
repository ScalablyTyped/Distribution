package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.FloatValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatValueNode
  extends ASTNode
     with ValueNode {
  val kind: FloatValue
  val loc: js.UndefOr[Location] = js.undefined
  val value: String
}

object FloatValueNode {
  @scala.inline
  def apply(kind: FloatValue, value: String, loc: Location = null): FloatValueNode = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FloatValueNode]
  }
}

