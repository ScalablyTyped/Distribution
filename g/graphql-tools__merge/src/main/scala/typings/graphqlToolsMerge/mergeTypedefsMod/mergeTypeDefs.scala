package typings.graphqlToolsMerge.mergeTypedefsMod

import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.Source
import typings.graphqlToolsMerge.anon.OmitPartialConfigcommentD
import typings.graphqlToolsMerge.anon.PartialConfigcommentDescr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/typedefs-mergers/merge-typedefs", "mergeTypeDefs")
@js.native
object mergeTypeDefs extends js.Object {
  def apply(types: js.Array[String | Source | DocumentNode | GraphQLSchema]): String = js.native
  def apply(types: js.Array[String | Source | DocumentNode | GraphQLSchema], config: OmitPartialConfigcommentD): DocumentNode = js.native
  def apply(types: js.Array[String | Source | DocumentNode | GraphQLSchema], config: PartialConfigcommentDescr): String = js.native
}

