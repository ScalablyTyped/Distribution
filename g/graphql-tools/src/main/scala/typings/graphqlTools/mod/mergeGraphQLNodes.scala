package typings.graphqlTools.mod

import typings.graphql.astMod.DefinitionNode
import typings.graphqlToolsMerge.mergeNodesMod.MergedResultMap
import typings.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "mergeGraphQLNodes")
@js.native
object mergeGraphQLNodes extends js.Object {
  def apply(nodes: js.Array[DefinitionNode]): MergedResultMap = js.native
  def apply(nodes: js.Array[DefinitionNode], config: Config): MergedResultMap = js.native
}

