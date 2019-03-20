package typings
package graphqlDashComposeLib.libTypeMapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/TypeMapper", "TypeMapper")
@js.native
class TypeMapper () extends js.Object {
  var basicScalars: stdLib.Map[java.lang.String, graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def convertArgConfig(composeAC: graphqlDashComposeLib.libTypeComposerMod.ComposeArgumentConfig): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfig(
    composeAC: graphqlDashComposeLib.libTypeComposerMod.ComposeArgumentConfig,
    argName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfig(
    composeAC: graphqlDashComposeLib.libTypeComposerMod.ComposeArgumentConfig,
    argName: java.lang.String,
    fieldName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfig(
    composeAC: graphqlDashComposeLib.libTypeComposerMod.ComposeArgumentConfig,
    argName: java.lang.String,
    fieldName: java.lang.String,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def convertArgConfigMap(composeArgsConfigMap: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigArgumentMap[_]): graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap = js.native
  def convertArgConfigMap(
    composeArgsConfigMap: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigArgumentMap[_],
    fieldName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap = js.native
  def convertArgConfigMap(
    composeArgsConfigMap: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigArgumentMap[_],
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
  def convertOutputFieldConfig[TSource, TContext](composeFC: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfig[TSource, TContext, _]): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfig[TSource, TContext](
    composeFC: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfig[TSource, TContext, _],
    fieldName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfig[TSource, TContext](
    composeFC: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfig[TSource, TContext, _],
    fieldName: java.lang.String,
    typeName: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfigMap[TSource, TContext](
    composeFields: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigMap[TSource, TContext, _]
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def convertOutputFieldConfigMap[TSource, TContext](
    composeFields: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigMap[TSource, TContext, _],
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
  def createType(str: TypeDefinitionString): graphqlLib.typeDefinitionMod.GraphQLNamedType | scala.Null = js.native
  def get(name: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLNamedType | scala.Null = js.native
  def getWrapped(str: TypeNameString | TypeWrappedString): graphqlLib.typeDefinitionMod.GraphQLType | scala.Null = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def parseTypesFromAst(astDocument: graphqlLib.languageAstMod.DocumentNode): graphqlDashComposeLib.libTypeStorageMod.TypeStorage[graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def parseTypesFromString(str: java.lang.String): graphqlDashComposeLib.libTypeStorageMod.TypeStorage[graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def set(name: java.lang.String, `type`: graphqlLib.typeDefinitionMod.GraphQLNamedType): scala.Unit = js.native
}

