package typings.graphqlToolsUtils

import typings.graphql.astMod.InlineFragmentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/fragments", JSImport.Namespace)
@js.native
object fragmentsMod extends js.Object {
  def concatInlineFragments(`type`: String, fragments: js.Array[InlineFragmentNode]): InlineFragmentNode = js.native
  def parseFragmentToInlineFragment(definitions: String): InlineFragmentNode = js.native
}

