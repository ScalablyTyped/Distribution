package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.OfKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OneOfList")
@js.native
class OneOfList protected ()
  extends typings.grammarkdown.nodesMod.OneOfList {
  def this(
    oneKeyword: typings.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[typings.grammarkdown.nodesMod.Token[OfKeyword]],
    indented: Boolean
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.nodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[typings.grammarkdown.nodesMod.Token[OfKeyword]],
    indented: Boolean,
    terminals: js.Array[typings.grammarkdown.nodesMod.Terminal]
  ) = this()
}

