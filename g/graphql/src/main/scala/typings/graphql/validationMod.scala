package typings.graphql

import typings.graphql.astMod.DocumentNode
import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.schemaMod.GraphQLSchema
import typings.graphql.typeInfoMod.TypeInfo
import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.validationContextMod.ValidationRule
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation", JSImport.Namespace)
@js.native
object validationMod extends js.Object {
  @js.native
  class ValidationContext protected ()
    extends typings.graphql.validationContextMod.ValidationContext {
    def this(schema: GraphQLSchema, ast: DocumentNode, typeInfo: TypeInfo) = this()
    def this(
      schema: GraphQLSchema,
      ast: DocumentNode,
      typeInfo: TypeInfo,
      onError: js.Function1[/* err */ GraphQLError, Unit]
    ) = this()
  }
  
  val specifiedRules: js.Array[ValidationRule] = js.native
  def FieldsOnCorrectTypeRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def FragmentsOnCompositeTypesRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownArgumentNamesRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownDirectivesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownDirectivesRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownFragmentNamesRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownTypeNamesRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def LoneAnonymousOperationRule(context: ASTValidationContext): ASTVisitor = js.native
  def NoFragmentCyclesRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUndefinedVariablesRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUnusedFragmentsRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUnusedVariablesRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def OverlappingFieldsCanBeMergedRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def PossibleFragmentSpreadsRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def ProvidedRequiredArgumentsRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def ScalarLeafsRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def SingleFieldSubscriptionsRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueArgumentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueDirectivesPerLocationRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueFragmentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueInputFieldNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueOperationNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueVariableNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def ValuesOfCorrectTypeRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def VariablesAreInputTypesRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def VariablesInAllowedPositionRule(context: typings.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
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
    options: AnonMaxErrors
  ): js.Array[GraphQLError] = js.native
}

