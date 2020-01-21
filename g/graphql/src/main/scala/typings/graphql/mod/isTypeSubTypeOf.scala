package typings.graphql.mod

import typings.graphql.definitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "isTypeSubTypeOf")
@js.native
object isTypeSubTypeOf extends js.Object {
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema, maybeSubType: GraphQLType, superType: GraphQLType): Boolean = js.native
}

