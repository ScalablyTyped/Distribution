package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InterfaceTypeExtensionNode extends js.Object {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val fields: js.UndefOr[js.Array[FieldDefinitionNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.InterfaceTypeExtension
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

