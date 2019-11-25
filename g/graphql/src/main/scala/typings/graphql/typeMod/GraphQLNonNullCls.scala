package typings.graphql.typeMod

import typings.graphql.typeDefinitionMod.GraphQLNullableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLNonNull")
@js.native
class GraphQLNonNullCls protected ()
  extends typings.graphql.typeDefinitionMod.GraphQLNonNull[GraphQLNullableType] {
  def this(`type`: GraphQLNullableType) = this()
  /* CompleteClass */
  override val ofType: GraphQLNullableType = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def toJSON(): String = js.native
}

