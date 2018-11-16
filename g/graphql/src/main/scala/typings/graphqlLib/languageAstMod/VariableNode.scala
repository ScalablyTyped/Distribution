package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VariableNode extends js.Object {
  val kind: graphqlLib.graphqlLibStrings.Variable
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

