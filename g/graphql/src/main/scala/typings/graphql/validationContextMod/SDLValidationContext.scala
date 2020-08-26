package typings.graphql.validationContextMod

import typings.graphql.astMod.DocumentNode
import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.maybeMod.Maybe
import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "SDLValidationContext")
@js.native
class SDLValidationContext protected () extends ASTValidationContext {
  def this(
    ast: DocumentNode,
    schema: Maybe[GraphQLSchema],
    onError: js.Function1[/* err */ GraphQLError, Unit]
  ) = this()
  def getSchema(): Maybe[GraphQLSchema] = js.native
}

