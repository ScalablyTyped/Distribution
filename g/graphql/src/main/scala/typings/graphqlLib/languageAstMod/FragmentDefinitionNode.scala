package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentDefinitionNode
  extends ExecutableDefinitionNode
     with ASTNode
     with graphqlLib.validationValidationContextMod.NodeWithSelectionSet {
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

object FragmentDefinitionNode {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.FragmentDefinition,
    name: NameNode,
    selectionSet: SelectionSetNode,
    typeCondition: NamedTypeNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    variableDefinitions: js.Array[VariableDefinitionNode] = null
  ): FragmentDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, selectionSet = selectionSet, typeCondition = typeCondition)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (variableDefinitions != null) __obj.updateDynamic("variableDefinitions")(variableDefinitions)
    __obj.asInstanceOf[FragmentDefinitionNode]
  }
}

