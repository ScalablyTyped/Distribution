package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonNullTypeNode extends js.Object {
  val kind: graphqlLib.graphqlLibStrings.NonNullType
  val loc: js.UndefOr[Location] = js.undefined
  val `type`: NamedTypeNode | ListTypeNode
}

