package typings.graphql.executionValuesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.Anon_Directives
import typings.graphql.Anon_MaxErrors
import typings.graphql.languageAstMod.DirectiveNode
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.VariableDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDirectivesMod.GraphQLDirective
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/values", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getArgumentValues(`def`: GraphQLField[_, _, StringDictionary[_]], node: DirectiveNode): StringDictionary[js.Any] = js.native
  def getArgumentValues(
    `def`: GraphQLField[_, _, StringDictionary[_]],
    node: DirectiveNode,
    variableValues: Maybe[StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  def getArgumentValues(`def`: GraphQLField[_, _, StringDictionary[_]], node: FieldNode): StringDictionary[js.Any] = js.native
  def getArgumentValues(
    `def`: GraphQLField[_, _, StringDictionary[_]],
    node: FieldNode,
    variableValues: Maybe[StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: DirectiveNode): StringDictionary[js.Any] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: DirectiveNode, variableValues: Maybe[StringDictionary[_]]): StringDictionary[js.Any] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: FieldNode): StringDictionary[js.Any] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: FieldNode, variableValues: Maybe[StringDictionary[_]]): StringDictionary[js.Any] = js.native
  def getDirectiveValues(directiveDef: GraphQLDirective, node: Anon_Directives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(directiveDef: GraphQLDirective, node: Anon_Directives, variableValues: Maybe[StringDictionary[_]]): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getVariableValues(
    schema: GraphQLSchema,
    varDefNodes: js.Array[VariableDefinitionNode],
    inputs: StringDictionary[js.Any]
  ): CoercedVariableValues = js.native
  def getVariableValues(
    schema: GraphQLSchema,
    varDefNodes: js.Array[VariableDefinitionNode],
    inputs: StringDictionary[js.Any],
    options: Anon_MaxErrors
  ): CoercedVariableValues = js.native
}

