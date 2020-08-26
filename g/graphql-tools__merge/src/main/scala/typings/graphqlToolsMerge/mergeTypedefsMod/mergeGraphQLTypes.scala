package typings.graphqlToolsMerge.mergeTypedefsMod

import typings.graphql.astMod.DefinitionNode
import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/typedefs-mergers/merge-typedefs", "mergeGraphQLTypes")
@js.native
object mergeGraphQLTypes extends js.Object {
  def apply(types: js.Array[String | Source | DocumentNode | GraphQLSchema], config: Config): js.Array[DefinitionNode] = js.native
}

