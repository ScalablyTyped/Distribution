package typings.graphqlToolsWrap.anon

import typings.graphql.astMod.FragmentDefinitionNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphqlToolsWrap.transformQueryMod.QueryTransformer
import typings.graphqlToolsWrap.transformQueryMod.ResultTransformer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorPathTransformer extends js.Object {
  var errorPathTransformer: js.UndefOr[typings.graphqlToolsWrap.transformQueryMod.ErrorPathTransformer] = js.native
  var fragments: js.UndefOr[Record[String, FragmentDefinitionNode]] = js.native
  var path: js.Array[String] = js.native
  @JSName("queryTransformer")
  var queryTransformer_Original: QueryTransformer = js.native
  var resultTransformer: js.UndefOr[ResultTransformer] = js.native
  def queryTransformer(selectionSet: SelectionSetNode, fragments: Record[String, FragmentDefinitionNode]): SelectionSetNode = js.native
}

