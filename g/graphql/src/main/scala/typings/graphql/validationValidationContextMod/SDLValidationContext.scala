package typings.graphql.validationValidationContextMod

import typings.graphql.errorMod.GraphQLError
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "SDLValidationContext")
@js.native
class SDLValidationContext protected () extends ASTValidationContext {
  def this(ast: DocumentNode, schema: Maybe[GraphQLSchema]) = this()
  def this(
    ast: DocumentNode,
    schema: Maybe[GraphQLSchema],
    onError: js.Function1[/* err */ GraphQLError, Unit]
  ) = this()
  def getSchema(): Maybe[GraphQLSchema] = js.native
}

