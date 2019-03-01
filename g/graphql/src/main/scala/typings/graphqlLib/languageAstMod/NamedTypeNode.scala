package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedTypeNode
  extends ASTNode
     with TypeNode {
  val kind: graphqlLib.graphqlLibStrings.NamedType
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

object NamedTypeNode {
  @scala.inline
  def apply(kind: graphqlLib.graphqlLibStrings.NamedType, name: NameNode, loc: Location = null): NamedTypeNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NamedTypeNode]
  }
}

