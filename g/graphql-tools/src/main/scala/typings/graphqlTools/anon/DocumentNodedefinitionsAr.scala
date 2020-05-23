package typings.graphqlTools.anon

import typings.graphql.astMod.DefinitionNode
import typings.graphql.astMod.Location
import typings.graphqlTools.graphqlToolsStrings.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.DocumentNode & {  definitions  :std.Array<graphql.graphql.DefinitionNode>} */
trait DocumentNodedefinitionsAr extends js.Object {
  val definitions: js.Array[DefinitionNode]
  val kind: Document
  val loc: js.UndefOr[Location] = js.undefined
}

object DocumentNodedefinitionsAr {
  @scala.inline
  def apply(definitions: js.Array[DefinitionNode], kind: Document, loc: Location = null): DocumentNodedefinitionsAr = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentNodedefinitionsAr]
  }
}

