package typings.graphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLList
import typings.graphql.typeDefinitionMod.GraphQLNonNull
import typings.graphql.typeDefinitionMod.GraphQLNullableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getNullableType")
@js.native
object getNullableType extends js.Object {
  def apply(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def apply(`type`: typings.graphql.typeDefinitionMod.GraphQLEnumType): typings.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  def apply(`type`: typings.graphql.typeDefinitionMod.GraphQLInputObjectType): typings.graphql.typeDefinitionMod.GraphQLInputObjectType = js.native
  def apply(`type`: typings.graphql.typeDefinitionMod.GraphQLInterfaceType): typings.graphql.typeDefinitionMod.GraphQLInterfaceType = js.native
  def apply(`type`: typings.graphql.typeDefinitionMod.GraphQLScalarType): typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  def apply(`type`: typings.graphql.typeDefinitionMod.GraphQLUnionType): typings.graphql.typeDefinitionMod.GraphQLUnionType = js.native
  def apply[T /* <: (typings.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLList[_] */](`type`: T): T = js.native
  def apply[T /* <: GraphQLNullableType */](`type`: GraphQLNonNull[T]): T = js.native
}

