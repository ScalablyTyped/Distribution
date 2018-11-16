package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FieldNode extends js.Object {
  val alias: js.UndefOr[NameNode] = js.undefined
  val arguments: js.UndefOr[js.Array[ArgumentNode]] = js.undefined
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.Field
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val selectionSet: js.UndefOr[SelectionSetNode] = js.undefined
}

