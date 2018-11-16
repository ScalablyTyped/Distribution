package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FragmentDefinitionNode extends js.Object {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.FragmentDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val selectionSet: SelectionSetNode
  val typeCondition: NamedTypeNode
  // Note: fragment variable definitions are experimental and may be changed
  // or removed in the future.
  val variableDefinitions: js.UndefOr[js.Array[VariableDefinitionNode]] = js.undefined
}

