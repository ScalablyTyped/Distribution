package typings
package graphqlDashComposeLib.libTypeMapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type storage and type generator from `Schema Definition Language` (`SDL`).
  * This is slightly rewritten [buildASTSchema](https://github.com/graphql/graphql-js/blob/master/src/utilities/buildASTSchema.js)
  * utility from `graphql-js` that allows to create type from a string (SDL).
  */
@JSImport("graphql-compose/lib/TypeMapper", "TypeMapper")
@js.native
class TypeMapper[TContext] protected () extends js.Object {
  def this(schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext]) = this()
  var basicScalars: stdLib.Map[java.lang.String, graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext] = js.native
  def convertArgConfig(composeAC: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeArgumentConfig): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfig(
    composeAC: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeArgumentConfig,
    argName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfig(
    composeAC: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeArgumentConfig,
    argName: java.lang.String,
    fieldName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfig(
    composeAC: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeArgumentConfig,
    argName: java.lang.String,
    fieldName: java.lang.String,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfigMap(
    composeArgsConfigMap: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeFieldConfigArgumentMap[_]
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap = js.native
  def convertArgConfigMap(
    composeArgsConfigMap: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeFieldConfigArgumentMap[_],
    fieldName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap = js.native
  def convertArgConfigMap(
    composeArgsConfigMap: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeFieldConfigArgumentMap[_],
    fieldName: java.lang.String,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap = js.native
  def convertInputFieldConfig(composeIFC: graphqlDashComposeLib.libInputTypeComposerMod.ComposeInputFieldConfig): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfig = js.native
  def convertInputFieldConfig(
    composeIFC: graphqlDashComposeLib.libInputTypeComposerMod.ComposeInputFieldConfig,
    fieldName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfig = js.native
  def convertInputFieldConfig(
    composeIFC: graphqlDashComposeLib.libInputTypeComposerMod.ComposeInputFieldConfig,
    fieldName: java.lang.String,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfig = js.native
  def convertInputFieldConfigMap(composeFields: graphqlDashComposeLib.libInputTypeComposerMod.ComposeInputFieldConfigMap): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfigMap = js.native
  def convertInputFieldConfigMap(
    composeFields: graphqlDashComposeLib.libInputTypeComposerMod.ComposeInputFieldConfigMap,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfigMap = js.native
  def convertOutputFieldConfig[TSource, TContext](
    composeFC: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeFieldConfig[TSource, TContext, graphqlDashComposeLib.libObjectTypeComposerMod.ArgsMap]
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfig[TSource, TContext](
    composeFC: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeFieldConfig[TSource, TContext, graphqlDashComposeLib.libObjectTypeComposerMod.ArgsMap],
    fieldName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfig[TSource, TContext](
    composeFC: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeFieldConfig[TSource, TContext, graphqlDashComposeLib.libObjectTypeComposerMod.ArgsMap],
    fieldName: java.lang.String,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfigMap[TSource, TContext](
    composeFields: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext]
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfigMap[TSource, TContext](
    composeFields: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext],
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfigMap[TSource, TContext](
    composeFields: graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfigMap[TSource, TContext](
    composeFields: graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]],
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputType(composeType: ComposeObjectType): graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def createType(str: TypeDefinitionString): graphqlLib.typeDefinitionMod.GraphQLNamedType | scala.Unit = js.native
  def get(name: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLNamedType | scala.Unit = js.native
  def getWrapped(str: TypeNameString | TypeWrappedString): graphqlLib.typeDefinitionMod.GraphQLType | scala.Null = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def parseTypesFromAst(astDocument: graphqlLib.languageAstMod.DocumentNode): graphqlDashComposeLib.libTypeStorageMod.TypeStorage[java.lang.String, graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def parseTypesFromString(str: java.lang.String): graphqlDashComposeLib.libTypeStorageMod.TypeStorage[java.lang.String, graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def set(name: java.lang.String, `type`: graphqlLib.typeDefinitionMod.GraphQLNamedType): scala.Unit = js.native
}

