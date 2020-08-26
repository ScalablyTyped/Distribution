package typings.graphql.definitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "getNullableType")
@js.native
object getNullableType extends js.Object {
  def apply(`type`: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
  def apply(`type`: GraphQLEnumType): GraphQLEnumType = js.native
  def apply(`type`: GraphQLInputObjectType): GraphQLInputObjectType = js.native
  def apply(`type`: GraphQLInterfaceType): GraphQLInterfaceType = js.native
  def apply(`type`: GraphQLScalarType): GraphQLScalarType = js.native
  def apply(`type`: GraphQLUnionType): GraphQLUnionType = js.native
  def apply[T /* <: (GraphQLObjectType[_, _]) | GraphQLList[_] */](`type`: T): T = js.native
  def apply[T /* <: GraphQLNullableType */](
    // FIXME Disabled because of https://github.com/yaacovCR/graphql-tools-fork/issues/40#issuecomment-586671219
  // eslint-disable-next-line @typescript-eslint/unified-signatures
  `type`: GraphQLNonNull[T]
  ): T = js.native
}

