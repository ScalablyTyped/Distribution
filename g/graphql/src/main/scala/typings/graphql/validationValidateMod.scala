package typings.graphql

import typings.graphql.anon.MaxErrors
import typings.graphql.astMod.DocumentNode
import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.maybeMod.Maybe
import typings.graphql.schemaMod.GraphQLSchema
import typings.graphql.typeInfoMod.TypeInfo
import typings.graphql.validationContextMod.SDLValidationRule
import typings.graphql.validationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/validate", JSImport.Namespace)
@js.native
object validationValidateMod extends js.Object {
  def assertValidSDL(documentAST: DocumentNode): Unit = js.native
  def assertValidSDLExtension(documentAST: DocumentNode, schema: GraphQLSchema): Unit = js.native
  def validate(schema: GraphQLSchema, documentAST: DocumentNode): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.UndefOr[scala.Nothing],
    typeInfo: js.UndefOr[scala.Nothing],
    options: MaxErrors
  ): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.UndefOr[scala.Nothing],
    typeInfo: TypeInfo
  ): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.UndefOr[scala.Nothing],
    typeInfo: TypeInfo,
    options: MaxErrors
  ): js.Array[GraphQLError] = js.native
  def validate(schema: GraphQLSchema, documentAST: DocumentNode, rules: js.Array[ValidationRule]): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: js.UndefOr[scala.Nothing],
    options: MaxErrors
  ): js.Array[GraphQLError] = js.native
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
    options: MaxErrors
  ): js.Array[GraphQLError] = js.native
  def validateSDL(documentAST: DocumentNode): js.Array[GraphQLError] = js.native
  def validateSDL(
    documentAST: DocumentNode,
    schemaToExtend: js.UndefOr[Maybe[GraphQLSchema]],
    rules: js.Array[SDLValidationRule]
  ): js.Array[GraphQLError] = js.native
  def validateSDL(documentAST: DocumentNode, schemaToExtend: Maybe[GraphQLSchema]): js.Array[GraphQLError] = js.native
}

