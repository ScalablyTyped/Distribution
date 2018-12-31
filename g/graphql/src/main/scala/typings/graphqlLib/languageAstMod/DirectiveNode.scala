package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveNode extends js.Object {
  val arguments: js.UndefOr[js.Array[ArgumentNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.Directive
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

