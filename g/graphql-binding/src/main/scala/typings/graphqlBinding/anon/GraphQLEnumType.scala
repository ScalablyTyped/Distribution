package typings.graphqlBinding.anon

import typings.graphql.mod.GraphQLInputObjectType
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLScalarType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLEnumType extends js.Object {
  def GraphQLEnumType(`type`: typings.graphql.mod.GraphQLEnumType): String = js.native
  def GraphQLIDType(`type`: GraphQLScalarType): String = js.native
  def GraphQLInputObjectType(`type`: typings.graphql.mod.GraphQLInputObjectType): String = js.native
  def GraphQLInputObjectType(`type`: GraphQLInterfaceType): String = js.native
  def GraphQLInputObjectType(`type`: GraphQLObjectType[_, _]): String = js.native
  def GraphQLInterfaceType(`type`: GraphQLInputObjectType): String = js.native
  def GraphQLInterfaceType(`type`: typings.graphql.mod.GraphQLInterfaceType): String = js.native
  def GraphQLInterfaceType(`type`: GraphQLObjectType[_, _]): String = js.native
  def GraphQLObjectType(`type`: GraphQLInputObjectType): String = js.native
  def GraphQLObjectType(`type`: GraphQLInterfaceType): String = js.native
  def GraphQLObjectType(`type`: typings.graphql.mod.GraphQLObjectType[_, _]): String = js.native
  def GraphQLScalarType(`type`: typings.graphql.mod.GraphQLScalarType): String = js.native
  def GraphQLUnionType(`type`: typings.graphql.mod.GraphQLUnionType): String = js.native
}

