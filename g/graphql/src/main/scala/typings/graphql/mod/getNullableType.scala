package typings.graphql.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLNullableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getNullableType")
@js.native
object getNullableType extends js.Object {
  def apply(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def apply(`type`: typings.graphql.definitionMod.GraphQLEnumType): typings.graphql.definitionMod.GraphQLEnumType = js.native
  def apply(`type`: typings.graphql.definitionMod.GraphQLInputObjectType): typings.graphql.definitionMod.GraphQLInputObjectType = js.native
  def apply(`type`: typings.graphql.definitionMod.GraphQLInterfaceType): typings.graphql.definitionMod.GraphQLInterfaceType = js.native
  def apply(`type`: typings.graphql.definitionMod.GraphQLScalarType): typings.graphql.definitionMod.GraphQLScalarType = js.native
  def apply(`type`: typings.graphql.definitionMod.GraphQLUnionType): typings.graphql.definitionMod.GraphQLUnionType = js.native
  def apply[T /* <: (typings.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]]) | typings.graphql.definitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def apply[T /* <: GraphQLNullableType */](`type`: typings.graphql.definitionMod.GraphQLNonNull[T]): T = js.native
}

