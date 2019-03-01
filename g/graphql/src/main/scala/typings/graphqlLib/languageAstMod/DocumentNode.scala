package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentNode extends ASTNode {
  val definitions: js.Array[DefinitionNode]
  val kind: graphqlLib.graphqlLibStrings.Document
  val loc: js.UndefOr[Location] = js.undefined
}

object DocumentNode {
  @scala.inline
  def apply(
    definitions: js.Array[DefinitionNode],
    kind: graphqlLib.graphqlLibStrings.Document,
    loc: Location = null
  ): DocumentNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("definitions")(definitions)
    __obj.updateDynamic("kind")(kind)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[DocumentNode]
  }
}

