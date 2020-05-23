package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind.OfKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "OneOfList")
@js.native
class OneOfList protected ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.OneOfList] {
  def this(oneKeyword: Token[OneKeyword], ofKeyword: js.UndefOr[Token[OfKeyword]], indented: Boolean) = this()
  def this(
    oneKeyword: Token[OneKeyword],
    ofKeyword: js.UndefOr[Token[OfKeyword]],
    indented: Boolean,
    terminals: js.Array[Terminal]
  ) = this()
  val indented: Boolean = js.native
  val ofKeyword: js.UndefOr[Token[OfKeyword]] = js.native
  val oneKeyword: Token[OneKeyword] = js.native
  val terminals: js.UndefOr[js.Array[Terminal]] = js.native
  def update(): OneOfList = js.native
  def update(terminals: js.Array[Terminal]): OneOfList = js.native
}

