package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.anon.Directives
import typings.graphql.anon.MaxErrors
import typings.graphql.astMod.DirectiveNode
import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.VariableDefinitionNode
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.directivesMod.GraphQLDirective
import typings.graphql.maybeMod.Maybe
import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/values", JSImport.Namespace)
@js.native
object valuesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.anon.Coerced
    - typings.graphql.anon.Errors
  */
  trait CoercedVariableValues extends js.Object
  
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
  def getDirectiveValues(directiveDef: GraphQLDirective, node: Directives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(directiveDef: GraphQLDirective, node: Directives, variableValues: Maybe[StringDictionary[_]]): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getVariableValues(
    schema: GraphQLSchema,
    varDefNodes: js.Array[VariableDefinitionNode],
    inputs: StringDictionary[js.Any]
  ): CoercedVariableValues = js.native
  def getVariableValues(
    schema: GraphQLSchema,
    varDefNodes: js.Array[VariableDefinitionNode],
    inputs: StringDictionary[js.Any],
    options: MaxErrors
  ): CoercedVariableValues = js.native
}

