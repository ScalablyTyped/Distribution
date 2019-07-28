package typings.graphql.typeMod

import typings.graphql.typeDefinitionMod.GraphQLList
import typings.graphql.typeDefinitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLList")
@js.native
class GraphQLListCls protected () extends GraphQLList[GraphQLType] {
  def this(`type`: GraphQLType) = this()
  /* CompleteClass */
  override val ofType: GraphQLType = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def toJSON(): String = js.native
}

