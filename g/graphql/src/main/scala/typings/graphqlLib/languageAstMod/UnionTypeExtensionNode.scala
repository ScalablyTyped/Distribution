package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionTypeExtensionNode extends js.Object {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.UnionTypeExtension
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val types: js.UndefOr[js.Array[NamedTypeNode]] = js.undefined
}

