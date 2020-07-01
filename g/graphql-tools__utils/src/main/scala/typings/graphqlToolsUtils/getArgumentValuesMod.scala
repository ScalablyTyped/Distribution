package typings.graphqlToolsUtils

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DirectiveNode
import typings.graphql.astMod.FieldNode
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.mod.GraphQLDirective
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/getArgumentValues", JSImport.Namespace)
@js.native
object getArgumentValuesMod extends js.Object {
  def getArgumentValues(`def`: GraphQLField[_, _, StringDictionary[_]], node: DirectiveNode): Record[String, _] = js.native
  def getArgumentValues(
    `def`: GraphQLField[_, _, StringDictionary[_]],
    node: DirectiveNode,
    variableValues: Record[String, _]
  ): Record[String, _] = js.native
  def getArgumentValues(`def`: GraphQLField[_, _, StringDictionary[_]], node: FieldNode): Record[String, _] = js.native
  def getArgumentValues(`def`: GraphQLField[_, _, StringDictionary[_]], node: FieldNode, variableValues: Record[String, _]): Record[String, _] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: DirectiveNode): Record[String, _] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: DirectiveNode, variableValues: Record[String, _]): Record[String, _] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: FieldNode): Record[String, _] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: FieldNode, variableValues: Record[String, _]): Record[String, _] = js.native
}

