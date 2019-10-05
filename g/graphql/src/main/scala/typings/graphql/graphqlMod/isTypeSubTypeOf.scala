package typings.graphql.graphqlMod

import typings.graphql.typeDefinitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "isTypeSubTypeOf")
@js.native
object isTypeSubTypeOf extends js.Object {
  def apply(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    maybeSubType: GraphQLType,
    superType: GraphQLType
  ): Boolean = js.native
}

