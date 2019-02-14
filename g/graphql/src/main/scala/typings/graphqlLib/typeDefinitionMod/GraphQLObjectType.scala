package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext, TArgs] protected () extends js.Object {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
  var astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ObjectTypeDefinitionNode] = js.native
  var description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = js.native
  var extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.ObjectTypeExtensionNode]] = js.native
  var isTypeOf: graphqlLib.tsutilsMaybeMod.Maybe[GraphQLIsTypeOfFn[TSource, TContext]] = js.native
  var name: java.lang.String = js.native
  def getFields(): GraphQLFieldMap[_, TContext, TArgs] = js.native
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
  def inspect(): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
}

