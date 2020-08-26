package typings.graphqlToolsUtils

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLEnumType
import typings.graphql.mod.GraphQLInputObjectType
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLScalarType
import typings.graphql.mod.GraphQLUnionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/renameType", JSImport.Namespace)
@js.native
object renameTypeMod extends js.Object {
  def renameType(`type`: GraphQLNamedType, newTypeName: String): GraphQLNamedType = js.native
  def renameType(`type`: GraphQLEnumType, newTypeName: String): GraphQLEnumType = js.native
  def renameType(`type`: GraphQLInputObjectType, newTypeName: String): GraphQLInputObjectType = js.native
  def renameType(`type`: GraphQLInterfaceType, newTypeName: String): GraphQLInterfaceType = js.native
  def renameType(`type`: GraphQLObjectType[_, _], newTypeName: String): GraphQLObjectType[_, _] = js.native
  def renameType(`type`: GraphQLScalarType, newTypeName: String): GraphQLScalarType = js.native
  def renameType(`type`: GraphQLUnionType, newTypeName: String): GraphQLUnionType = js.native
}

