package typings.graphql.typeDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "getNullableType")
@js.native
object getNullableType extends js.Object {
  def apply(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def apply(`type`: GraphQLEnumType): GraphQLEnumType = js.native
  def apply(`type`: GraphQLInputObjectType): GraphQLInputObjectType = js.native
  def apply(`type`: GraphQLInterfaceType): GraphQLInterfaceType = js.native
  def apply(`type`: GraphQLScalarType): GraphQLScalarType = js.native
  def apply(`type`: GraphQLUnionType): GraphQLUnionType = js.native
  def apply[T /* <: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLList[_] */](`type`: T): T = js.native
  def apply[T /* <: GraphQLNullableType */](`type`: GraphQLNonNull[T]): T = js.native
}

