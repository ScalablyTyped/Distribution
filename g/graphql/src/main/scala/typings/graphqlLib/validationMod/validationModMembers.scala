package typings
package graphqlLib.validationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation", JSImport.Namespace)
@js.native
object validationModMembers extends js.Object {
  val specifiedRules: js.Array[graphqlLib.validationValidationContextMod.ValidationRule] = js.native
  def FieldsOnCorrectTypeRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def FragmentsOnCompositeTypesRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def KnownArgumentNamesRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def KnownDirectivesRule(context: graphqlLib.validationValidationContextMod.SDLValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def KnownDirectivesRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def KnownFragmentNamesRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def KnownTypeNamesRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def LoneAnonymousOperationRule(context: graphqlLib.validationValidationContextMod.ASTValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def NoFragmentCyclesRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def NoUndefinedVariablesRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def NoUnusedFragmentsRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def NoUnusedVariablesRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def OverlappingFieldsCanBeMergedRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def PossibleFragmentSpreadsRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def ProvidedRequiredArgumentsRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def ScalarLeafsRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def SingleFieldSubscriptionsRule(context: graphqlLib.validationValidationContextMod.ASTValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def UniqueArgumentNamesRule(context: graphqlLib.validationValidationContextMod.ASTValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def UniqueDirectivesPerLocationRule(context: graphqlLib.validationValidationContextMod.ASTValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def UniqueFragmentNamesRule(context: graphqlLib.validationValidationContextMod.ASTValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def UniqueInputFieldNamesRule(context: graphqlLib.validationValidationContextMod.ASTValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def UniqueOperationNamesRule(context: graphqlLib.validationValidationContextMod.ASTValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def UniqueVariableNamesRule(context: graphqlLib.validationValidationContextMod.ASTValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def ValuesOfCorrectTypeRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def VariablesAreInputTypesRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def VariablesInAllowedPositionRule(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
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

