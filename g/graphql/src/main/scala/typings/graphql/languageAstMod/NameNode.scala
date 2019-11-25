package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameNode extends ASTNode {
  val kind: Name
  val loc: js.UndefOr[Location] = js.undefined
  val value: String
}

object NameNode {
  @scala.inline
  def apply(kind: Name, value: String, loc: Location = null): NameNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameNode]
  }
}

