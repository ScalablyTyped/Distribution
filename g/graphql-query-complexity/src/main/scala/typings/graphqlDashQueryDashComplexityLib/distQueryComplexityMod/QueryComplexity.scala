package typings
package graphqlDashQueryDashComplexityLib.distQueryComplexityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryComplexity extends js.Object {
  var OperationDefinition: js.Object = js.native
  var complexity: scala.Double = js.native
  var context: graphqlLib.graphqlMod.ValidationContext = js.native
  var fragments: ScalablyTyped.runtime.StringDictionary[graphqlLib.languageAstMod.FragmentDefinitionNode] = js.native
  var options: QueryComplexityOptions = js.native
  def createError(): graphqlLib.graphqlMod.GraphQLError = js.native
  def getDefaultComplexity(args: js.Object, childScore: scala.Double): scala.Double = js.native
  def nodeComplexity(node: graphqlLib.languageAstMod.FieldNode, typeDef: graphqlLib.graphqlMod.GraphQLInterfaceType): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.FieldNode,
    typeDef: graphqlLib.graphqlMod.GraphQLInterfaceType,
    complexity: scala.Double
  ): scala.Double = js.native
  def nodeComplexity(node: graphqlLib.languageAstMod.FieldNode, typeDef: graphqlLib.graphqlMod.GraphQLObjectType): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.FieldNode,
    typeDef: graphqlLib.graphqlMod.GraphQLObjectType,
    complexity: scala.Double
  ): scala.Double = js.native
  def nodeComplexity(node: graphqlLib.languageAstMod.FieldNode, typeDef: graphqlLib.graphqlMod.GraphQLUnionType): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.FieldNode,
    typeDef: graphqlLib.graphqlMod.GraphQLUnionType,
    complexity: scala.Double
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.FragmentDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLInterfaceType
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.FragmentDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLInterfaceType,
    complexity: scala.Double
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.FragmentDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLObjectType
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.FragmentDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLObjectType,
    complexity: scala.Double
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.FragmentDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLUnionType
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.FragmentDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLUnionType,
    complexity: scala.Double
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.InlineFragmentNode,
    typeDef: graphqlLib.graphqlMod.GraphQLInterfaceType
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.InlineFragmentNode,
    typeDef: graphqlLib.graphqlMod.GraphQLInterfaceType,
    complexity: scala.Double
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.InlineFragmentNode,
    typeDef: graphqlLib.graphqlMod.GraphQLObjectType
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.InlineFragmentNode,
    typeDef: graphqlLib.graphqlMod.GraphQLObjectType,
    complexity: scala.Double
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.InlineFragmentNode,
    typeDef: graphqlLib.graphqlMod.GraphQLUnionType
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.InlineFragmentNode,
    typeDef: graphqlLib.graphqlMod.GraphQLUnionType,
    complexity: scala.Double
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.OperationDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLInterfaceType
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.OperationDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLInterfaceType,
    complexity: scala.Double
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.OperationDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLObjectType
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.OperationDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLObjectType,
    complexity: scala.Double
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.OperationDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLUnionType
  ): scala.Double = js.native
  def nodeComplexity(
    node: graphqlLib.languageAstMod.OperationDefinitionNode,
    typeDef: graphqlLib.graphqlMod.GraphQLUnionType,
    complexity: scala.Double
  ): scala.Double = js.native
  def onOperationDefinitionEnter(operation: graphqlLib.languageAstMod.OperationDefinitionNode): scala.Unit = js.native
  def onOperationDefinitionLeave(): js.UndefOr[graphqlLib.graphqlMod.GraphQLError] = js.native
}

