package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLInterfaceType")
@js.native
class GraphQLInterfaceType protected () extends js.Object {
  def this(config: GraphQLInterfaceTypeConfig[_, _]) = this()
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.InterfaceTypeDefinitionNode]
  ] = js.native
  var description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = js.native
  var extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.InterfaceTypeExtensionNode]] = js.native
  var name: java.lang.String = js.native
  var resolveType: graphqlLib.tsutilsMaybeMod.Maybe[GraphQLTypeResolver[_, _]] = js.native
  def getFields(): GraphQLFieldMap[_, _] = js.native
  def inspect(): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
}

