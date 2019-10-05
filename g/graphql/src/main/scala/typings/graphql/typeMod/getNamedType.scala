package typings.graphql.typeMod

import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "getNamedType")
@js.native
object getNamedType extends js.Object {
  def apply(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def apply(`type`: GraphQLType): GraphQLNamedType = js.native
}

