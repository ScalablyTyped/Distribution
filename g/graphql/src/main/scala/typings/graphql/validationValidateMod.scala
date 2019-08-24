package typings.graphql

import typings.graphql.errorMod.GraphQLError
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeSchemaMod.GraphQLSchema
import typings.graphql.utilitiesTypeInfoMod.TypeInfo
import typings.graphql.validationValidationContextMod.SDLValidationRule
import typings.graphql.validationValidationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/validate", JSImport.Namespace)
@js.native
object validationValidateMod extends js.Object {
  def assertValidSDL(documentAST: DocumentNode): js.UndefOr[scala.Nothing] = js.native
  def assertValidSDLExtension(documentAST: DocumentNode, schema: GraphQLSchema): js.UndefOr[scala.Nothing] = js.native
  def validate(schema: GraphQLSchema, documentAST: DocumentNode): js.Array[GraphQLError] = js.native
  def validate(schema: GraphQLSchema, documentAST: DocumentNode, rules: js.Array[ValidationRule]): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: TypeInfo
  ): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: TypeInfo,
    options: Anon_MaxErrors
  ): js.Array[GraphQLError] = js.native
  def validateSDL(documentAST: DocumentNode): js.Array[GraphQLError] = js.native
  def validateSDL(documentAST: DocumentNode, schemaToExtend: Maybe[GraphQLSchema]): js.Array[GraphQLError] = js.native
  def validateSDL(
    documentAST: DocumentNode,
    schemaToExtend: Maybe[GraphQLSchema],
    rules: js.Array[SDLValidationRule]
  ): js.Array[GraphQLError] = js.native
}

