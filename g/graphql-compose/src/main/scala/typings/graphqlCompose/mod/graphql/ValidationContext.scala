package typings.graphqlCompose.mod.graphql

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.ValidationContext")
@js.native
class ValidationContext protected ()
  extends typings.graphqlCompose.graphqlMod.ValidationContext {
  def this(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typings.graphql.typeInfoMod.TypeInfo,
    onError: js.Function1[/* err */ typings.graphql.graphQLErrorMod.GraphQLError, Unit]
  ) = this()
}

