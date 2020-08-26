package typings.graphqlToolsMerge

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DefinitionNode
import typings.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/typedefs-mergers/merge-nodes", JSImport.Namespace)
@js.native
object mergeNodesMod extends js.Object {
  def mergeGraphQLNodes(nodes: js.Array[DefinitionNode]): MergedResultMap = js.native
  def mergeGraphQLNodes(nodes: js.Array[DefinitionNode], config: Config): MergedResultMap = js.native
  type MergedResultMap = StringDictionary[DefinitionNode]
}

