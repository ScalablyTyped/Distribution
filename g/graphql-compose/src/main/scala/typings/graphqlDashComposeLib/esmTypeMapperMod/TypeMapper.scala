package typings
package graphqlDashComposeLib.esmTypeMapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type storage and type generator from `Schema Definition Language` (`SDL`).
  * This is slightly rewritten [buildASTSchema](https://github.com/graphql/graphql-js/blob/master/src/utilities/buildASTSchema.js)
  * utility from `graphql-js` that allows to create type from a string (SDL).
  */
@JSImport("graphql-compose/esm/TypeMapper", "TypeMapper")
@js.native
class TypeMapper[TContext] protected () extends js.Object {
  def this(schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
  var basicScalars: stdLib.Map[java.lang.String, graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  var schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext] = js.native
  def convertArgConfig(composeAC: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeArgumentConfig): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfig(
    composeAC: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeArgumentConfig,
    argName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfig(
    composeAC: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeArgumentConfig,
    argName: java.lang.String,
    fieldName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfig(
    composeAC: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeArgumentConfig,
    argName: java.lang.String,
    fieldName: java.lang.String,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfigMap(
    composeArgsConfigMap: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigArgumentMap[_]
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap = js.native
  def convertArgConfigMap(
    composeArgsConfigMap: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigArgumentMap[_],
    fieldName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap = js.native
  def convertArgConfigMap(
    composeArgsConfigMap: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigArgumentMap[_],
    fieldName: java.lang.String,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap = js.native
  def convertInputFieldConfig(composeIFC: graphqlDashComposeLib.esmInputTypeComposerMod.ComposeInputFieldConfig): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfig = js.native
  def convertInputFieldConfig(
    composeIFC: graphqlDashComposeLib.esmInputTypeComposerMod.ComposeInputFieldConfig,
    fieldName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfig = js.native
  def convertInputFieldConfig(
    composeIFC: graphqlDashComposeLib.esmInputTypeComposerMod.ComposeInputFieldConfig,
    fieldName: java.lang.String,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfig = js.native
  def convertInputFieldConfigMap(composeFields: graphqlDashComposeLib.esmInputTypeComposerMod.ComposeInputFieldConfigMap): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfigMap = js.native
  def convertInputFieldConfigMap(
    composeFields: graphqlDashComposeLib.esmInputTypeComposerMod.ComposeInputFieldConfigMap,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfigMap = js.native
  def convertOutputFieldConfig[TSource, TContext](
    composeFC: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfig[TSource, TContext, graphqlDashComposeLib.esmObjectTypeComposerMod.ArgsMap]
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfig[TSource, TContext](
    composeFC: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfig[TSource, TContext, graphqlDashComposeLib.esmObjectTypeComposerMod.ArgsMap],
    fieldName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfig[TSource, TContext](
    composeFC: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfig[TSource, TContext, graphqlDashComposeLib.esmObjectTypeComposerMod.ArgsMap],
    fieldName: java.lang.String,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfigMap[TSource, TContext](
    composeFields: (graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext]) | (graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]])
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfigMap[TSource, TContext](
    composeFields: (graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext]) | (graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]),
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputType(composeType: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeObjectType): graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def createGraphQLType(str: TypeDefinitionString): graphqlLib.typeDefinitionMod.GraphQLType | scala.Unit = js.native
  def createType(str: TypeDefinitionString): graphqlDashComposeLib.esmSchemaComposerMod.AnyComposeType[TContext] | scala.Unit = js.native
  def get(name: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLNamedType | scala.Unit = js.native
  def getWrapped(str: TypeNameString | TypeWrappedString): graphqlLib.typeDefinitionMod.GraphQLType | scala.Null = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def parseTypesFromAst(astDocument: graphqlLib.languageAstMod.DocumentNode): graphqlDashComposeLib.esmTypeStorageMod.TypeStorage[java.lang.String, graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def parseTypesFromString(str: java.lang.String): graphqlDashComposeLib.esmTypeStorageMod.TypeStorage[
    java.lang.String, 
    graphqlDashComposeLib.esmSchemaComposerMod.AnyComposeType[TContext]
  ] = js.native
  def set(name: java.lang.String, `type`: graphqlDashComposeLib.esmSchemaComposerMod.AnyType[_]): scala.Unit = js.native
}

/* static members */
@JSImport("graphql-compose/esm/TypeMapper", "TypeMapper")
@js.native
object TypeMapper extends js.Object {
  /**
    * Checks that string is EnumType SDL definition
    * eg. `enum Sort { ASC DESC }`
    */
  def isEnumTypeDefinitionString(str: java.lang.String): scala.Boolean = js.native
  /**
    * Checks that string is InputType SDL definition
    * eg. `input Filter { minAge: Int }`
    */
  def isInputTypeDefinitionString(str: java.lang.String): scala.Boolean = js.native
  /**
    * Checks that string is InterfaceType SDL definition
    * eg. `interface User { name: String }`
    */
  def isInterfaceTypeDefinitionString(str: java.lang.String): scala.Boolean = js.native
  /**
    * Checks that string is OutputType SDL definition
    * eg. `type Out { name: String! }`
    */
  def isOutputTypeDefinitionString(str: java.lang.String): scala.Boolean = js.native
  /**
    * Checks that string is ScalarType SDL definition
    * eg. `scalar UInt`
    */
  def isScalarTypeDefinitionString(str: java.lang.String): scala.Boolean = js.native
  /**
    * Checks that string is SDL definition of some type
    * eg. `type Out { name: String! }` or `input Filter { minAge: Int }` etc.
    */
  def isTypeDefinitionString(str: java.lang.String): scala.Boolean = js.native
  /**
    * Check that string is a valid GraphQL Type name.
    * According to spec valid mask is `/^[_A-Za-z][_0-9A-Za-z]*$/`.
    */
  def isTypeNameString(str: java.lang.String): scala.Boolean = js.native
}

