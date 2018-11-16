package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLUnionType")
@js.native
class GraphQLUnionType protected () extends js.Object {
  def this(config: GraphQLUnionTypeConfig[_, _]) = this()
  var astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.UnionTypeDefinitionNode] = js.native
  var description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = js.native
  var extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.UnionTypeExtensionNode]] = js.native
  var name: java.lang.String = js.native
  var resolveType: graphqlLib.tsutilsMaybeMod.Maybe[GraphQLTypeResolver[_, _]] = js.native
  def getTypes(): js.Array[GraphQLObjectType] = js.native
  def inspect(): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
}

