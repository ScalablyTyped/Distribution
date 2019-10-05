package typings.graphql.executionValuesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.DirectiveNode
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDirectivesMod.GraphQLDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/values", "getArgumentValues")
@js.native
object getArgumentValues extends js.Object {
  def apply(`def`: GraphQLField[_, _, StringDictionary[_]], node: DirectiveNode): StringDictionary[js.Any] = js.native
  def apply(
    `def`: GraphQLField[_, _, StringDictionary[_]],
    node: DirectiveNode,
    variableValues: Maybe[StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  def apply(`def`: GraphQLField[_, _, StringDictionary[_]], node: FieldNode): StringDictionary[js.Any] = js.native
  def apply(
    `def`: GraphQLField[_, _, StringDictionary[_]],
    node: FieldNode,
    variableValues: Maybe[StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  def apply(`def`: GraphQLDirective, node: DirectiveNode): StringDictionary[js.Any] = js.native
  def apply(`def`: GraphQLDirective, node: DirectiveNode, variableValues: Maybe[StringDictionary[_]]): StringDictionary[js.Any] = js.native
  def apply(`def`: GraphQLDirective, node: FieldNode): StringDictionary[js.Any] = js.native
  def apply(`def`: GraphQLDirective, node: FieldNode, variableValues: Maybe[StringDictionary[_]]): StringDictionary[js.Any] = js.native
}

