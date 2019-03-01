package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameNode extends ASTNode {
  val kind: graphqlLib.graphqlLibStrings.Name
  val loc: js.UndefOr[Location] = js.undefined
  val value: java.lang.String
}

object NameNode {
  @scala.inline
  def apply(kind: graphqlLib.graphqlLibStrings.Name, value: java.lang.String, loc: Location = null): NameNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("value")(value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NameNode]
  }
}

