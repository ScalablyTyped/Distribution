package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLArgument
import typings.graphql.definitionMod.GraphQLArgumentConfig
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.definitionMod.GraphQLFieldMap
import typings.graphql.definitionMod.GraphQLInputField
import typings.graphql.definitionMod.GraphQLInputFieldConfig
import typings.graphql.definitionMod.GraphQLInputFieldConfigMap
import typings.graphql.definitionMod.GraphQLInputFieldMap
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLType
import typings.graphql.mod.GraphQLDirective
import typings.graphqlTools.interfacesMod.ResolveType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/schemaRecreation", JSImport.Namespace)
@js.native
object schemaRecreationMod extends js.Object {
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

