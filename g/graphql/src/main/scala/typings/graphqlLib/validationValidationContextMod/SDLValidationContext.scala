package typings
package graphqlLib.validationValidationContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "SDLValidationContext")
@js.native
class SDLValidationContext protected () extends ASTValidationContext {
  def this(ast: graphqlLib.languageAstMod.DocumentNode) = this()
  def this(ast: graphqlLib.languageAstMod.DocumentNode, schema: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeSchemaMod.GraphQLSchema]) = this()
  def getSchema(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeSchemaMod.GraphQLSchema] = js.native
}

