package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InlineFragmentNode extends js.Object {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.InlineFragment
  val loc: js.UndefOr[Location] = js.undefined
  val selectionSet: SelectionSetNode
  val typeCondition: js.UndefOr[NamedTypeNode] = js.undefined
}

