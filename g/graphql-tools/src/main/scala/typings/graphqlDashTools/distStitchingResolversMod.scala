package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLObjectType
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.IResolvers
import typings.graphqlDashTools.distInterfacesMod.Operation
import typings.graphqlDashTools.distInterfacesMod.Transform
import typings.graphqlDashTools.distStitchingResolversMod.Mapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/resolvers", JSImport.Namespace)
@js.native
object distStitchingResolversMod extends js.Object {
  def generateMappingFromObjectType(`type`: GraphQLObjectType[_, _, StringDictionary[_]], operation: Operation): StringDictionary[Anon_Name] = js.native
  def generateProxyingResolvers(targetSchema: GraphQLSchema, transforms: js.Array[Transform], mapping: Mapping): IResolvers[_, _] = js.native
  def generateSimpleMapping(targetSchema: GraphQLSchema): Mapping = js.native
  type Mapping = StringDictionary[StringDictionary[Anon_Name]]
}

