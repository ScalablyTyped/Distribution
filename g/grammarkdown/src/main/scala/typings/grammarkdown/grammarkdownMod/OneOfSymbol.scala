package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distNodesMod.LexicalSymbol
import typings.grammarkdown.distTokensMod.SyntaxKind.OfKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OneOfSymbol")
@js.native
class OneOfSymbol protected ()
  extends typings.grammarkdown.distNodesMod.OneOfSymbol {
  def this(oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword]) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.distNodesMod.Token[OfKeyword]
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    symbols: js.Array[LexicalSymbol]
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.distNodesMod.Token[OfKeyword],
    symbols: js.Array[LexicalSymbol]
  ) = this()
}

