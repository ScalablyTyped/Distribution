package typings
package graphqlLib.executionValuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/values", JSImport.Namespace)
@js.native
object executionValuesModMembers extends js.Object {
  def getArgumentValues(
    `def`: graphqlLib.typeDefinitionMod.GraphQLField[_, _, ScalablyTyped.runtime.StringDictionary[_]],
    node: graphqlLib.languageAstMod.DirectiveNode
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getArgumentValues(
    `def`: graphqlLib.typeDefinitionMod.GraphQLField[_, _, ScalablyTyped.runtime.StringDictionary[_]],
    node: graphqlLib.languageAstMod.DirectiveNode,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getArgumentValues(
    `def`: graphqlLib.typeDefinitionMod.GraphQLField[_, _, ScalablyTyped.runtime.StringDictionary[_]],
    node: graphqlLib.languageAstMod.FieldNode
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getArgumentValues(
    `def`: graphqlLib.typeDefinitionMod.GraphQLField[_, _, ScalablyTyped.runtime.StringDictionary[_]],
    node: graphqlLib.languageAstMod.FieldNode,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getArgumentValues(
    `def`: graphqlLib.typeDirectivesMod.GraphQLDirective,
    node: graphqlLib.languageAstMod.DirectiveNode
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getArgumentValues(
    `def`: graphqlLib.typeDirectivesMod.GraphQLDirective,
    node: graphqlLib.languageAstMod.DirectiveNode,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getArgumentValues(`def`: graphqlLib.typeDirectivesMod.GraphQLDirective, node: graphqlLib.languageAstMod.FieldNode): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getArgumentValues(
    `def`: graphqlLib.typeDirectivesMod.GraphQLDirective,
    node: graphqlLib.languageAstMod.FieldNode,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getDirectiveValues(directiveDef: graphqlLib.typeDirectivesMod.GraphQLDirective, node: graphqlLib.Anon_Directives): js.UndefOr[ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def getDirectiveValues(
    directiveDef: graphqlLib.typeDirectivesMod.GraphQLDirective,
    node: graphqlLib.Anon_Directives,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]
  ): js.UndefOr[ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def getVariableValues(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    varDefNodes: js.Array[graphqlLib.languageAstMod.VariableDefinitionNode],
    inputs: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): CoercedVariableValues = js.native
}

