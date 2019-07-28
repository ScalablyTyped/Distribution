package typings.graphqlDashQueryDashComplexity.distQueryComplexityMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLError
import typings.graphql.graphqlMod.GraphQLInterfaceType
import typings.graphql.graphqlMod.GraphQLObjectType
import typings.graphql.graphqlMod.GraphQLUnionType
import typings.graphql.graphqlMod.ValidationContext
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.FragmentDefinitionNode
import typings.graphql.languageAstMod.InlineFragmentNode
import typings.graphql.languageAstMod.OperationDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryComplexity extends js.Object {
  var OperationDefinition: js.Object = js.native
  var complexity: Double = js.native
  var context: ValidationContext = js.native
  var fragments: StringDictionary[FragmentDefinitionNode] = js.native
  var options: QueryComplexityOptions = js.native
  def createError(): GraphQLError = js.native
  def getDefaultComplexity(args: js.Object, childScore: Double): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]], complexity: Double): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(
    node: FragmentDefinitionNode,
    typeDef: GraphQLObjectType[_, _, StringDictionary[_]],
    complexity: Double
  ): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(
    node: InlineFragmentNode,
    typeDef: GraphQLObjectType[_, _, StringDictionary[_]],
    complexity: Double
  ): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(
    node: OperationDefinitionNode,
    typeDef: GraphQLObjectType[_, _, StringDictionary[_]],
    complexity: Double
  ): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def onOperationDefinitionEnter(operation: OperationDefinitionNode): Unit = js.native
  def onOperationDefinitionLeave(): js.UndefOr[GraphQLError] = js.native
}

