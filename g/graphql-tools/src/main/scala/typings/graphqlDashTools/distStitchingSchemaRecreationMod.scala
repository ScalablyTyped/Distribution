package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLDirective
import typings.graphql.typeDefinitionMod.GraphQLArgument
import typings.graphql.typeDefinitionMod.GraphQLArgumentConfig
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLFieldConfig
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigArgumentMap
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigMap
import typings.graphql.typeDefinitionMod.GraphQLFieldMap
import typings.graphql.typeDefinitionMod.GraphQLInputField
import typings.graphql.typeDefinitionMod.GraphQLInputFieldConfig
import typings.graphql.typeDefinitionMod.GraphQLInputFieldConfigMap
import typings.graphql.typeDefinitionMod.GraphQLInputFieldMap
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphqlDashTools.distInterfacesMod.ResolveType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/schemaRecreation", JSImport.Namespace)
@js.native
object distStitchingSchemaRecreationMod extends js.Object {
  def argsToFieldConfigArgumentMap(args: js.Array[GraphQLArgument], resolveType: ResolveType[_]): GraphQLFieldConfigArgumentMap = js.native
  def argumentToArgumentConfig(argument: GraphQLArgument, resolveType: ResolveType[_]): (js.Tuple2[String, GraphQLArgumentConfig]) | Null = js.native
  def createResolveType(getType: js.Function2[/* name */ String, /* type */ GraphQLType, GraphQLType | Null]): ResolveType[_] = js.native
  def fieldMapToFieldConfigMap(
    fields: GraphQLFieldMap[_, _, StringDictionary[_]],
    resolveType: ResolveType[_],
    keepResolvers: Boolean
  ): GraphQLFieldConfigMap[_, _, StringDictionary[_]] = js.native
  def fieldToFieldConfig(
    field: GraphQLField[_, _, StringDictionary[_]],
    resolveType: ResolveType[_],
    keepResolvers: Boolean
  ): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def inputFieldMapToFieldConfigMap(fields: GraphQLInputFieldMap, resolveType: ResolveType[_]): GraphQLInputFieldConfigMap = js.native
  def inputFieldToFieldConfig(field: GraphQLInputField, resolveType: ResolveType[_]): GraphQLInputFieldConfig = js.native
  def recreateDirective(directive: GraphQLDirective, resolveType: ResolveType[_]): GraphQLDirective = js.native
  def recreateType(`type`: GraphQLNamedType, resolveType: ResolveType[_], keepResolvers: Boolean): GraphQLNamedType = js.native
}

