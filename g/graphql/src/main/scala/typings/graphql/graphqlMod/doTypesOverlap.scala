package typings.graphql.graphqlMod

import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "doTypesOverlap")
@js.native
object doTypesOverlap extends js.Object {
  def apply(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    typeA: GraphQLCompositeType,
    typeB: GraphQLCompositeType
  ): Boolean = js.native
}

