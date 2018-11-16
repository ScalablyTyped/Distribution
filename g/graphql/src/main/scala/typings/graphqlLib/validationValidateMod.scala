package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/validate", JSImport.Namespace)
@js.native
object validationValidateMod extends js.Object {
  def assertValidSDL(documentAST: graphqlLib.languageAstMod.DocumentNode): js.UndefOr[scala.Nothing] = js.native
  def assertValidSDLExtension(
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    schema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.UndefOr[scala.Nothing] = js.native
  def validate(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    documentAST: graphqlLib.languageAstMod.DocumentNode
  ): js.Array[graphqlLib.errorMod.GraphQLError] = js.native
  def validate(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    rules: js.Array[graphqlLib.validationValidationContextMod.ValidationRule]
  ): js.Array[graphqlLib.errorMod.GraphQLError] = js.native
  def validate(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    rules: js.Array[graphqlLib.validationValidationContextMod.ValidationRule],
    typeInfo: graphqlLib.utilitiesTypeInfoMod.TypeInfo
  ): js.Array[graphqlLib.errorMod.GraphQLError] = js.native
}

