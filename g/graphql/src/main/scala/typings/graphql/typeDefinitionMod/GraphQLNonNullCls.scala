package typings.graphql.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLNonNull")
@js.native
class GraphQLNonNullCls protected () extends GraphQLNonNull[GraphQLNullableType] {
  def this(`type`: GraphQLNullableType) = this()
  /* CompleteClass */
  override val ofType: GraphQLNullableType = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def toJSON(): String = js.native
}

