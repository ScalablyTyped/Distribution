package typings.graphqlToolsStitch.anon

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphqlToolsStitch.typesMod.MergeTypeCandidate
import typings.graphqlToolsStitch.typesMod.MergeTypeFilter
import typings.graphqlToolsStitch.typesMod.OnTypeConflict
import typings.graphqlToolsStitch.typesMod.StitchingInfo
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeTypes extends js.Object {
  var mergeTypes: Boolean | js.Array[String] | MergeTypeFilter = js.native
  @JSName("onTypeConflict")
  var onTypeConflict_Original: OnTypeConflict = js.native
  var operationTypeNames: Record[String, _] = js.native
  var stitchingInfo: StitchingInfo = js.native
  var typeCandidates: Record[String, js.Array[MergeTypeCandidate]] = js.native
  def onTypeConflict(left: GraphQLNamedType, right: GraphQLNamedType): GraphQLNamedType = js.native
  def onTypeConflict(left: GraphQLNamedType, right: GraphQLNamedType, info: Left): GraphQLNamedType = js.native
}

