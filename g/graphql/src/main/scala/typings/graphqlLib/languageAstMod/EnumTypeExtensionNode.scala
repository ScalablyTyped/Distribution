package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EnumTypeExtensionNode extends js.Object {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.EnumTypeExtension
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val values: js.UndefOr[js.Array[EnumValueDefinitionNode]] = js.undefined
}

