package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectValueNode
  extends ASTNode
     with ValueNode {
  val fields: js.Array[ObjectFieldNode]
  val kind: graphqlLib.graphqlLibStrings.ObjectValue
  val loc: js.UndefOr[Location] = js.undefined
}

object ObjectValueNode {
  @scala.inline
  def apply(
    fields: js.Array[ObjectFieldNode],
    kind: graphqlLib.graphqlLibStrings.ObjectValue,
    loc: Location = null
  ): ObjectValueNode = {
    val __obj = js.Dynamic.literal(fields = fields, kind = kind)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ObjectValueNode]
  }
}

