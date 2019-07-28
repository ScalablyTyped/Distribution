package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distNodesMod.LexicalSymbol
import typings.grammarkdown.distTokensMod.SyntaxKind.ButKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.NotKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ButNotSymbol")
@js.native
class ButNotSymbol protected ()
  extends typings.grammarkdown.distNodesMod.ButNotSymbol {
  def this(left: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: typings.grammarkdown.distNodesMod.Token[ButKeyword]) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: typings.grammarkdown.distNodesMod.Token[NotKeyword]
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typings.grammarkdown.distNodesMod.Token[ButKeyword],
    notKeyword: typings.grammarkdown.distNodesMod.Token[NotKeyword]
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: js.UndefOr[scala.Nothing],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: typings.grammarkdown.distNodesMod.Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typings.grammarkdown.distNodesMod.Token[ButKeyword],
    notKeyword: js.UndefOr[scala.Nothing],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typings.grammarkdown.distNodesMod.Token[ButKeyword],
    notKeyword: typings.grammarkdown.distNodesMod.Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
}

