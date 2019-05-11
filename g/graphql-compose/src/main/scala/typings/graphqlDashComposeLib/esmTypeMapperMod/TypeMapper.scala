package typings
package graphqlDashComposeLib.esmTypeMapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def convertOutputType(composeType: ComposeObjectType): graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def createType(str: TypeDefinitionString): graphqlLib.typeDefinitionMod.GraphQLNamedType | scala.Unit = js.native
  def get(name: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLNamedType | scala.Unit = js.native
  def getWrapped(str: TypeNameString | TypeWrappedString): graphqlLib.typeDefinitionMod.GraphQLType | scala.Null = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def parseTypesFromAst(astDocument: graphqlLib.languageAstMod.DocumentNode): graphqlDashComposeLib.esmTypeStorageMod.TypeStorage[java.lang.String, graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def parseTypesFromString(str: java.lang.String): graphqlDashComposeLib.esmTypeStorageMod.TypeStorage[java.lang.String, graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def set(name: java.lang.String, `type`: graphqlLib.typeDefinitionMod.GraphQLNamedType): scala.Unit = js.native
}

