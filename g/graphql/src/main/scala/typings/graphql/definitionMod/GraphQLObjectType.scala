package typings.graphql.definitionMod

import typings.graphql.GraphQLObjectTypeConfigan
import typings.graphql.astMod.ObjectTypeDefinitionNode
import typings.graphql.astMod.ObjectTypeExtensionNode
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext, TArgs] protected () extends js.Object {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
  var astNode: Maybe[ObjectTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[ObjectTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var isTypeOf: Maybe[GraphQLIsTypeOfFn[TSource, TContext]] = js.native
  var name: String = js.native
  def getFields(): GraphQLFieldMap[_, TContext, TArgs] = js.native
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLObjectTypeConfigan = js.native
  def toJSON(): String = js.native
}

