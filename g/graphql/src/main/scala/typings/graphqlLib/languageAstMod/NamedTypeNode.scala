package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedTypeNode extends js.Object {
  val kind: graphqlLib.graphqlLibStrings.NamedType
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

