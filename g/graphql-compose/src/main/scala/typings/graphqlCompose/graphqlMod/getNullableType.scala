package typings.graphqlCompose.graphqlMod

import typings.graphql.definitionMod.GraphQLNullableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "getNullableType")
@js.native
object getNullableType extends js.Object {
  def apply(`type`: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
  def apply(`type`: typings.graphql.definitionMod.GraphQLEnumType): typings.graphql.definitionMod.GraphQLEnumType = js.native
  def apply(`type`: typings.graphql.definitionMod.GraphQLInputObjectType): typings.graphql.definitionMod.GraphQLInputObjectType = js.native
  def apply(`type`: typings.graphql.definitionMod.GraphQLInterfaceType): typings.graphql.definitionMod.GraphQLInterfaceType = js.native
  def apply(`type`: typings.graphql.definitionMod.GraphQLScalarType): typings.graphql.definitionMod.GraphQLScalarType = js.native
  def apply(`type`: typings.graphql.definitionMod.GraphQLUnionType): typings.graphql.definitionMod.GraphQLUnionType = js.native
  def apply[T /* <: (typings.graphql.definitionMod.GraphQLObjectType[_, _]) | typings.graphql.definitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def apply[T /* <: GraphQLNullableType */](
    // FIXME Disabled because of https://github.com/yaacovCR/graphql-tools-fork/issues/40#issuecomment-586671219
  // eslint-disable-next-line @typescript-eslint/unified-signatures
  `type`: typings.graphql.definitionMod.GraphQLNonNull[T]
  ): T = js.native
}

