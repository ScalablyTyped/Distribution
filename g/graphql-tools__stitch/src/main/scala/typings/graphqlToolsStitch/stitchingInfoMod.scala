package typings.graphqlToolsStitch

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.graphqlToolsStitch.typesMod.MergeTypeCandidate
import typings.graphqlToolsStitch.typesMod.MergeTypeFilter
import typings.graphqlToolsStitch.typesMod.StitchingInfo
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/stitch/stitchingInfo", JSImport.Namespace)
@js.native
object stitchingInfoMod extends js.Object {
  def addStitchingInfo(stitchedSchema: GraphQLSchema, stitchingInfo: StitchingInfo): GraphQLSchema = js.native
  def completeStitchingInfo(stitchingInfo: StitchingInfo, resolvers: IResolvers[_, _, Record[String, _], _]): StitchingInfo = js.native
  def createStitchingInfo(
    transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema],
    typeCandidates: Record[String, js.Array[MergeTypeCandidate]]
  ): StitchingInfo = js.native
  def createStitchingInfo(
    transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema],
    typeCandidates: Record[String, js.Array[MergeTypeCandidate]],
    mergeTypes: js.Array[String]
  ): StitchingInfo = js.native
  def createStitchingInfo(
    transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema],
    typeCandidates: Record[String, js.Array[MergeTypeCandidate]],
    mergeTypes: Boolean
  ): StitchingInfo = js.native
  def createStitchingInfo(
    transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema],
    typeCandidates: Record[String, js.Array[MergeTypeCandidate]],
    mergeTypes: MergeTypeFilter
  ): StitchingInfo = js.native
}

