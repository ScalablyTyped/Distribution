package typings.graphql.mod

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "ValidationContext")
@js.native
class ValidationContext protected ()
  extends typings.graphql.validationMod.ValidationContext {
  def this(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typings.graphql.typeInfoMod.TypeInfo
  ) = this()
  def this(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typings.graphql.typeInfoMod.TypeInfo,
    onError: js.Function1[/* err */ typings.graphql.graphQLErrorMod.GraphQLError, Unit]
  ) = this()
}

