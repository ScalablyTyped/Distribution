package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind.OfKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OneOfList")
@js.native
class OneOfList protected ()
  extends typings.grammarkdown.distNodesMod.OneOfList {
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    indented: Boolean
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.distNodesMod.Token[OfKeyword],
    indented: Boolean
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    indented: Boolean,
    terminals: js.Array[typings.grammarkdown.distNodesMod.Terminal]
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.distNodesMod.Token[OfKeyword],
    indented: Boolean,
    terminals: js.Array[typings.grammarkdown.distNodesMod.Terminal]
  ) = this()
}

