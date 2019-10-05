package typings.graphqlDashCompose

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLObjectType
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeDefinitionMod.GraphQLArgumentConfig
import typings.graphql.typeDefinitionMod.GraphQLFieldConfig
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigArgumentMap
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigMap
import typings.graphql.typeDefinitionMod.GraphQLInputFieldConfig
import typings.graphql.typeDefinitionMod.GraphQLInputFieldConfigMap
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphqlDashCompose.esmInputTypeComposerMod.ComposeInputFieldConfig
import typings.graphqlDashCompose.esmInputTypeComposerMod.ComposeInputFieldConfigMap
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ArgsMap
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ComposeArgumentConfig
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ComposeFieldConfig
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ComposeFieldConfigArgumentMap
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ComposeFieldConfigMap
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ComposeObjectType
import typings.graphqlDashCompose.esmSchemaComposerMod.AnyComposeType
import typings.graphqlDashCompose.esmSchemaComposerMod.AnyType
import typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer
import typings.graphqlDashCompose.esmTypeMapperMod.TypeDefinitionString
import typings.graphqlDashCompose.esmTypeMapperMod.TypeNameString
import typings.graphqlDashCompose.esmTypeMapperMod.TypeWrappedString
import typings.graphqlDashCompose.esmTypeStorageMod.TypeStorage
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/TypeMapper", JSImport.Namespace)
@js.native
object esmTypeMapperMod extends js.Object {
  /**
    * Type storage and type generator from `Schema Definition Language` (`SDL`).
    * This is slightly rewritten [buildASTSchema](https://github.com/graphql/graphql-js/blob/master/src/utilities/buildASTSchema.js)
    * utility from `graphql-js` that allows to create type from a string (SDL).
    */
  @js.native
  class TypeMapper[TContext] protected () extends js.Object {
    def this(schemaComposer: SchemaComposer[TContext]) = this()
    var basicScalars: Map[String, GraphQLNamedType] = js.native
    var schemaComposer: SchemaComposer[TContext] = js.native
    def convertArgConfig(composeAC: ComposeArgumentConfig): GraphQLArgumentConfig = js.native
    def convertArgConfig(composeAC: ComposeArgumentConfig, argName: String): GraphQLArgumentConfig = js.native
    def convertArgConfig(composeAC: ComposeArgumentConfig, argName: String, fieldName: String): GraphQLArgumentConfig = js.native
    def convertArgConfig(composeAC: ComposeArgumentConfig, argName: String, fieldName: String, typeName: String): GraphQLArgumentConfig = js.native
    def convertArgConfigMap(composeArgsConfigMap: ComposeFieldConfigArgumentMap[_]): GraphQLFieldConfigArgumentMap = js.native
    def convertArgConfigMap(composeArgsConfigMap: ComposeFieldConfigArgumentMap[_], fieldName: String): GraphQLFieldConfigArgumentMap = js.native
    def convertArgConfigMap(composeArgsConfigMap: ComposeFieldConfigArgumentMap[_], fieldName: String, typeName: String): GraphQLFieldConfigArgumentMap = js.native
    def convertInputFieldConfig(composeIFC: ComposeInputFieldConfig): GraphQLInputFieldConfig = js.native
    def convertInputFieldConfig(composeIFC: ComposeInputFieldConfig, fieldName: String): GraphQLInputFieldConfig = js.native
    def convertInputFieldConfig(composeIFC: ComposeInputFieldConfig, fieldName: String, typeName: String): GraphQLInputFieldConfig = js.native
    def convertInputFieldConfigMap(composeFields: ComposeInputFieldConfigMap): GraphQLInputFieldConfigMap = js.native
    def convertInputFieldConfigMap(composeFields: ComposeInputFieldConfigMap, typeName: String): GraphQLInputFieldConfigMap = js.native
    def convertOutputFieldConfig[TSource, TContext](composeFC: ComposeFieldConfig[TSource, TContext, ArgsMap]): GraphQLFieldConfig[TSource, TContext, StringDictionary[_]] = js.native
    def convertOutputFieldConfig[TSource, TContext](composeFC: ComposeFieldConfig[TSource, TContext, ArgsMap], fieldName: String): GraphQLFieldConfig[TSource, TContext, StringDictionary[_]] = js.native
    def convertOutputFieldConfig[TSource, TContext](composeFC: ComposeFieldConfig[TSource, TContext, ArgsMap], fieldName: String, typeName: String): GraphQLFieldConfig[TSource, TContext, StringDictionary[_]] = js.native
    def convertOutputFieldConfigMap[TSource, TContext](
      composeFields: (ComposeFieldConfigMap[TSource, TContext]) | (GraphQLFieldConfigMap[TSource, TContext, StringDictionary[_]])
    ): GraphQLFieldConfigMap[TSource, TContext, StringDictionary[_]] = js.native
    def convertOutputFieldConfigMap[TSource, TContext](
      composeFields: (ComposeFieldConfigMap[TSource, TContext]) | (GraphQLFieldConfigMap[TSource, TContext, StringDictionary[_]]),
      typeName: String
    ): GraphQLFieldConfigMap[TSource, TContext, StringDictionary[_]] = js.native
    def convertOutputType(composeType: ComposeObjectType): GraphQLObjectType[_, _, StringDictionary[_]] = js.native
    def createGraphQLType(str: TypeDefinitionString): GraphQLType | Unit = js.native
    def createType(str: TypeDefinitionString): AnyComposeType[TContext] | Unit = js.native
    def get(name: String): GraphQLNamedType | Unit = js.native
    def getWrapped(str: TypeNameString | TypeWrappedString): GraphQLType | Null = js.native
    def has(name: String): Boolean = js.native
    def parseTypesFromAst(astDocument: DocumentNode): TypeStorage[String, GraphQLNamedType] = js.native
    def parseTypesFromString(str: String): TypeStorage[String, AnyComposeType[TContext]] = js.native
    def set(name: String, `type`: AnyType[_]): Unit = js.native
  }
  
  /* static members */
  @js.native
  object TypeMapper extends js.Object {
    /**
      * Checks that string is EnumType SDL definition
      * eg. `enum Sort { ASC DESC }`
      */
    def isEnumTypeDefinitionString(str: String): Boolean = js.native
    /**
      * Checks that string is InputType SDL definition
      * eg. `input Filter { minAge: Int }`
      */
    def isInputTypeDefinitionString(str: String): Boolean = js.native
    /**
      * Checks that string is InterfaceType SDL definition
      * eg. `interface User { name: String }`
      */
    def isInterfaceTypeDefinitionString(str: String): Boolean = js.native
    /**
      * Checks that string is OutputType SDL definition
      * eg. `type Out { name: String! }`
      */
    def isOutputTypeDefinitionString(str: String): Boolean = js.native
    /**
      * Checks that string is ScalarType SDL definition
      * eg. `scalar UInt`
      */
    def isScalarTypeDefinitionString(str: String): Boolean = js.native
    /**
      * Checks that string is SDL definition of some type
      * eg. `type Out { name: String! }` or `input Filter { minAge: Int }` etc.
      */
    def isTypeDefinitionString(str: String): Boolean = js.native
    /**
      * Check that string is a valid GraphQL Type name.
      * According to spec valid mask is `/^[_A-Za-z][_0-9A-Za-z]*$/`.
      */
    def isTypeNameString(str: String): Boolean = js.native
  }
  
  type TypeAsString = TypeDefinitionString | TypeWrappedString | TypeNameString
  type TypeDefinitionString = String
  type TypeNameString = String
  type TypeWrappedString = String
}

