package typings.graphql.validationMod

import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeSchemaMod.GraphQLSchema
import typings.graphql.utilitiesTypeInfoMod.TypeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation", "ValidationContext")
@js.native
class ValidationContext protected ()
  extends typings.graphql.validationValidationContextMod.ValidationContext {
  def this(schema: GraphQLSchema, ast: DocumentNode, typeInfo: TypeInfo) = this()
  def this(
    schema: GraphQLSchema,
    ast: DocumentNode,
    typeInfo: TypeInfo,
    onError: js.Function1[/* err */ GraphQLError, Unit]
  ) = this()
}

