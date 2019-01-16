package typings
package graphqlLib.utilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BreakingChangeType: graphqlLib.utilitiesFindBreakingChangesMod._BreakingChangeType = js.native
  val DangerousChangeType: graphqlLib.utilitiesFindBreakingChangesMod._DangerousChangeType = js.native
  val introspectionQuery: java.lang.String = js.native
  def assertValidName(name: java.lang.String): java.lang.String = js.native
  def astFromValue(value: js.Any, `type`: graphqlLib.typeDefinitionMod.GraphQLInputType): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ValueNode] = js.native
  def buildASTSchema(documentAST: graphqlLib.languageAstMod.DocumentNode): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildASTSchema(
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    options: graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionQuery): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildClientSchema(
    introspection: graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionQuery,
    options: graphqlLib.utilitiesBuildClientSchemaMod.Options
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: graphqlLib.languageSourceMod.Source): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(
    source: graphqlLib.languageSourceMod.Source,
    options: graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions with graphqlLib.languageParserMod.ParseOptions
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: java.lang.String): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(
    source: java.lang.String,
    options: graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions with graphqlLib.languageParserMod.ParseOptions
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def coerceValue(value: js.Any, `type`: graphqlLib.typeDefinitionMod.GraphQLInputType): graphqlLib.utilitiesCoerceValueMod.CoercedValue = js.native
  def coerceValue(
    value: js.Any,
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    blameNode: graphqlLib.languageAstMod.ASTNode
  ): graphqlLib.utilitiesCoerceValueMod.CoercedValue = js.native
  def coerceValue(
    value: js.Any,
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    blameNode: graphqlLib.languageAstMod.ASTNode,
    path: graphqlLib.utilitiesCoerceValueMod.Path
  ): graphqlLib.utilitiesCoerceValueMod.CoercedValue = js.native
  def concatAST(asts: js.Array[graphqlLib.languageAstMod.DocumentNode]): graphqlLib.languageAstMod.DocumentNode = js.native
  def doTypesOverlap(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    typeA: graphqlLib.typeDefinitionMod.GraphQLCompositeType,
    typeB: graphqlLib.typeDefinitionMod.GraphQLCompositeType
  ): scala.Boolean = js.native
  def extendSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    documentAST: graphqlLib.languageAstMod.DocumentNode
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def extendSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    options: graphqlLib.utilitiesExtendSchemaMod.Options
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def findBreakingChanges(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findDangerousChanges(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.DangerousChange] = js.native
  def findDeprecatedUsages(schema: graphqlLib.typeSchemaMod.GraphQLSchema, ast: graphqlLib.languageAstMod.DocumentNode): js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
  def getDescription(
    node: graphqlLib.Anon_Description,
    options: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions]
  ): js.UndefOr[java.lang.String] = js.native
  def getIntrospectionQuery(): java.lang.String = js.native
  def getIntrospectionQuery(options: graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionOptions): java.lang.String = js.native
  def getOperationAST(
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.OperationDefinitionNode] = js.native
  def getOperationRootType(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    operation: graphqlLib.languageAstMod.OperationDefinitionNode
  ): graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _] = js.native
  def getOperationRootType(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    operation: graphqlLib.languageAstMod.OperationTypeDefinitionNode
  ): graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _] = js.native
  def introspectionFromSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionQuery = js.native
  def introspectionFromSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    options: graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionOptions
  ): graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionQuery = js.native
  def isEqualType(typeA: graphqlLib.typeDefinitionMod.GraphQLType, typeB: graphqlLib.typeDefinitionMod.GraphQLType): scala.Boolean = js.native
  def isTypeSubTypeOf(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    maybeSubType: graphqlLib.typeDefinitionMod.GraphQLType,
    superType: graphqlLib.typeDefinitionMod.GraphQLType
  ): scala.Boolean = js.native
  def isValidJSValue(value: js.Any, `type`: graphqlLib.typeDefinitionMod.GraphQLInputType): js.Array[java.lang.String] = js.native
  def isValidLiteralValue(
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    valueNode: graphqlLib.languageAstMod.ValueNode
  ): js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: java.lang.String): js.UndefOr[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: java.lang.String, node: graphqlLib.languageAstMod.ASTNode): js.UndefOr[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
  def lexicographicSortSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def printIntrospectionSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): java.lang.String = js.native
  def printIntrospectionSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    options: graphqlLib.utilitiesSchemaPrinterMod.Options
  ): java.lang.String = js.native
  def printSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): java.lang.String = js.native
  def printSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    options: graphqlLib.utilitiesSchemaPrinterMod.Options
  ): java.lang.String = js.native
  def printType(`type`: graphqlLib.typeDefinitionMod.GraphQLNamedType): java.lang.String = js.native
  def printType(
    `type`: graphqlLib.typeDefinitionMod.GraphQLNamedType,
    options: graphqlLib.utilitiesSchemaPrinterMod.Options
  ): java.lang.String = js.native
  def separateOperations(documentAST: graphqlLib.languageAstMod.DocumentNode): org.scalablytyped.runtime.StringDictionary[graphqlLib.languageAstMod.DocumentNode] = js.native
  def typeFromAST(schema: graphqlLib.typeSchemaMod.GraphQLSchema, typeNode: graphqlLib.languageAstMod.ListTypeNode): js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLList[_]] = js.native
  def typeFromAST(schema: graphqlLib.typeSchemaMod.GraphQLSchema, typeNode: graphqlLib.languageAstMod.NamedTypeNode): js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def typeFromAST(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    typeNode: graphqlLib.languageAstMod.NonNullTypeNode
  ): js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLNonNull[_]] = js.native
  def valueFromAST(
    valueNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ValueNode],
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType
  ): js.Any = js.native
  def valueFromAST(
    valueNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ValueNode],
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    variables: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): js.Any = js.native
  def valueFromASTUntyped(valueNode: graphqlLib.languageAstMod.ValueNode): js.Any = js.native
  def valueFromASTUntyped(
    valueNode: graphqlLib.languageAstMod.ValueNode,
    variables: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): js.Any = js.native
}

