package typings.graphql.validationMod

import typings.graphql.errorMod.GraphQLError
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.typeSchemaMod.GraphQLSchema
import typings.graphql.utilitiesTypeInfoMod.TypeInfo
import typings.graphql.validationValidationContextMod.ASTValidationContext
import typings.graphql.validationValidationContextMod.SDLValidationContext
import typings.graphql.validationValidationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val specifiedRules: js.Array[ValidationRule] = js.native
  def FieldsOnCorrectTypeRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def FragmentsOnCompositeTypesRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownArgumentNamesRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownDirectivesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownDirectivesRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownFragmentNamesRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownTypeNamesRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def LoneAnonymousOperationRule(context: ASTValidationContext): ASTVisitor = js.native
  def NoFragmentCyclesRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUndefinedVariablesRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUnusedFragmentsRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUnusedVariablesRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def OverlappingFieldsCanBeMergedRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def PossibleFragmentSpreadsRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def ProvidedRequiredArgumentsRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def ScalarLeafsRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def SingleFieldSubscriptionsRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueArgumentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueDirectivesPerLocationRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueFragmentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueInputFieldNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueOperationNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueVariableNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def ValuesOfCorrectTypeRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def VariablesAreInputTypesRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def VariablesInAllowedPositionRule(context: typings.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def validate(schema: GraphQLSchema, documentAST: DocumentNode): js.Array[GraphQLError] = js.native
  def validate(schema: GraphQLSchema, documentAST: DocumentNode, rules: js.Array[ValidationRule]): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: TypeInfo
  ): js.Array[GraphQLError] = js.native
}

