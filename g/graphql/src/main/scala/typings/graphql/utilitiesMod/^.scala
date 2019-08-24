package typings.graphql.utilitiesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.Anon_Description
import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.graphql.jsutilsPathMod.Path
import typings.graphql.languageAstMod.ASTNode
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageAstMod.ListTypeNode
import typings.graphql.languageAstMod.NamedTypeNode
import typings.graphql.languageAstMod.NonNullTypeNode
import typings.graphql.languageAstMod.OperationDefinitionNode
import typings.graphql.languageAstMod.OperationTypeDefinitionNode
import typings.graphql.languageAstMod.ValueNode
import typings.graphql.languageParserMod.ParseOptions
import typings.graphql.languageSourceMod.Source
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLList
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLNonNull
import typings.graphql.typeDefinitionMod.GraphQLObjectType
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphql.typeSchemaMod.GraphQLSchema
import typings.graphql.utilitiesBuildASTSchemaMod.BuildSchemaOptions
import typings.graphql.utilitiesBuildClientSchemaMod.Options
import typings.graphql.utilitiesCoerceInputValueMod.OnErrorCB
import typings.graphql.utilitiesCoerceValueMod.CoercedValue
import typings.graphql.utilitiesFindBreakingChangesMod.BreakingChange
import typings.graphql.utilitiesFindBreakingChangesMod.DangerousChange
import typings.graphql.utilitiesFindBreakingChangesMod._BreakingChangeType
import typings.graphql.utilitiesFindBreakingChangesMod._DangerousChangeType
import typings.graphql.utilitiesIntrospectionQueryMod.IntrospectionOptions
import typings.graphql.utilitiesIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BreakingChangeType: _BreakingChangeType = js.native
  val DangerousChangeType: _DangerousChangeType = js.native
  val introspectionQuery: String = js.native
  def assertValidName(name: String): String = js.native
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
  def buildASTSchema(documentAST: DocumentNode): GraphQLSchema = js.native
  def buildASTSchema(documentAST: DocumentNode, options: BuildSchemaOptions): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery, options: Options): GraphQLSchema = js.native
  def buildSchema(source: String): GraphQLSchema = js.native
  def buildSchema(source: String, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def buildSchema(source: Source): GraphQLSchema = js.native
  def buildSchema(source: Source, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode, path: Path): CoercedValue = js.native
  def concatAST(asts: js.Array[DocumentNode]): DocumentNode = js.native
  def doTypesOverlap(schema: GraphQLSchema, typeA: GraphQLCompositeType, typeB: GraphQLCompositeType): Boolean = js.native
  def extendSchema(schema: GraphQLSchema, documentAST: DocumentNode): GraphQLSchema = js.native
  def extendSchema(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    options: typings.graphql.utilitiesExtendSchemaMod.Options
  ): GraphQLSchema = js.native
  def findBreakingChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findDangerousChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[DangerousChange] = js.native
  def findDeprecatedUsages(schema: GraphQLSchema, ast: DocumentNode): js.Array[GraphQLError] = js.native
  def getDescription(node: Anon_Description, options: Maybe[BuildSchemaOptions]): js.UndefOr[String] = js.native
  def getIntrospectionQuery(): String = js.native
  def getIntrospectionQuery(options: IntrospectionOptions): String = js.native
  def getOperationAST(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
  def getOperationRootType(schema: GraphQLSchema, operation: OperationDefinitionNode): GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getOperationRootType(schema: GraphQLSchema, operation: OperationTypeDefinitionNode): GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def introspectionFromSchema(schema: GraphQLSchema): IntrospectionQuery = js.native
  def introspectionFromSchema(schema: GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
  def isEqualType(typeA: GraphQLType, typeB: GraphQLType): Boolean = js.native
  def isTypeSubTypeOf(schema: GraphQLSchema, maybeSubType: GraphQLType, superType: GraphQLType): Boolean = js.native
  def isValidJSValue(value: js.Any, `type`: GraphQLInputType): js.Array[String] = js.native
  def isValidLiteralValue(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[GraphQLError] = js.native
  def isValidNameError(name: String): js.UndefOr[GraphQLError] = js.native
  def isValidNameError(name: String, node: ASTNode): js.UndefOr[GraphQLError] = js.native
  def lexicographicSortSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def printIntrospectionSchema(schema: GraphQLSchema): String = js.native
  def printIntrospectionSchema(schema: GraphQLSchema, options: typings.graphql.utilitiesSchemaPrinterMod.Options): String = js.native
  def printSchema(schema: GraphQLSchema): String = js.native
  def printSchema(schema: GraphQLSchema, options: typings.graphql.utilitiesSchemaPrinterMod.Options): String = js.native
  def printType(`type`: GraphQLNamedType): String = js.native
  def printType(`type`: GraphQLNamedType, options: typings.graphql.utilitiesSchemaPrinterMod.Options): String = js.native
  def separateOperations(documentAST: DocumentNode): StringDictionary[DocumentNode] = js.native
  def stripIgnoredCharacters(source: String): String = js.native
  def stripIgnoredCharacters(source: Source): String = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[GraphQLList[_]] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[GraphQLNonNull[_]] = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): js.Any = js.native
}

