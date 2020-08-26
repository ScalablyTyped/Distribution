package typings.graphqlToolsStitch

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphqlToolsStitch.typesMod.MergeTypeCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/stitch/mergeCandidates", JSImport.Namespace)
@js.native
object mergeCandidatesMod extends js.Object {
  def mergeCandidates(typeName: String, candidates: js.Array[MergeTypeCandidate]): GraphQLNamedType = js.native
}

