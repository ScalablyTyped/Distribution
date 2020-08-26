package typings.graphqlToolsStitch

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.SelectionSetNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/stitch/selectionSetArgs", JSImport.Namespace)
@js.native
object selectionSetArgsMod extends js.Object {
  def forwardArgsToSelectionSet(selectionSet: String): js.Function1[/* field */ FieldNode, SelectionSetNode] = js.native
  def forwardArgsToSelectionSet(selectionSet: String, mapping: Record[String, js.Array[String]]): js.Function1[/* field */ FieldNode, SelectionSetNode] = js.native
}

