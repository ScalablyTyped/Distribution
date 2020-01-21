package typings.graphql.typeMod

import typings.graphql.definitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLList")
@js.native
class GraphQLListCls protected ()
  extends typings.graphql.definitionMod.GraphQLList[GraphQLType] {
  def this(`type`: GraphQLType) = this()
  /* CompleteClass */
  override val ofType: GraphQLType = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def toJSON(): String = js.native
}

