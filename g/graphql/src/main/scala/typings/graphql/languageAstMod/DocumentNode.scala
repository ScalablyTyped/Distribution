package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentNode extends ASTNode {
  val definitions: js.Array[DefinitionNode]
  val kind: Document
  val loc: js.UndefOr[Location] = js.undefined
}

object DocumentNode {
  @scala.inline
  def apply(definitions: js.Array[DefinitionNode], kind: Document, loc: Location = null): DocumentNode = {
    val __obj = js.Dynamic.literal(definitions = definitions, kind = kind)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[DocumentNode]
  }
}

