package typings
package graphqlLib.validationValidationContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "ValidationContext")
@js.native
class ValidationContext protected () extends ASTValidationContext {
  def this(schema: graphqlLib.typeSchemaMod.GraphQLSchema, ast: graphqlLib.languageAstMod.DocumentNode, typeInfo: graphqlLib.utilitiesTypeInfoMod.TypeInfo) = this()
  def getArgument(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLArgument] = js.native
  def getDirective(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDirectivesMod.GraphQLDirective] = js.native
  def getFieldDef(): graphqlLib.tsutilsMaybeMod.Maybe[
    graphqlLib.typeDefinitionMod.GraphQLField[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.native
  def getFragment(name: java.lang.String): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.FragmentDefinitionNode] = js.native
  def getFragmentSpreads(node: graphqlLib.languageAstMod.SelectionSetNode): js.Array[graphqlLib.languageAstMod.FragmentSpreadNode] = js.native
  def getInputType(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLInputType] = js.native
  def getParentInputType(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLInputType] = js.native
  def getParentType(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLCompositeType] = js.native
  def getRecursiveVariableUsages(operation: graphqlLib.languageAstMod.OperationDefinitionNode): js.Array[VariableUsage] = js.native
  def getRecursivelyReferencedFragments(operation: graphqlLib.languageAstMod.OperationDefinitionNode): js.Array[graphqlLib.languageAstMod.FragmentDefinitionNode] = js.native
  def getSchema(): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def getType(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLOutputType] = js.native
  def getVariableUsages(node: NodeWithSelectionSet): js.Array[VariableUsage] = js.native
}

