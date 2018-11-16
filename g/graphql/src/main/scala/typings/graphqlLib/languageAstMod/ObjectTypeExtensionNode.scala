package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectTypeExtensionNode extends js.Object {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val fields: js.UndefOr[js.Array[FieldDefinitionNode]] = js.undefined
  val interfaces: js.UndefOr[js.Array[NamedTypeNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.ObjectTypeExtension
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
}

