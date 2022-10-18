package typings.grammarkdown.mod

import typings.grammarkdown.distNodesMod.LexicalSymbol
import typings.grammarkdown.distTokensMod.SyntaxKind.ButKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.NotKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "ButNotSymbol")
@js.native
open class ButNotSymbol protected ()
  extends typings.grammarkdown.distNodesMod.ButNotSymbol {
  def this(left: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: typings.grammarkdown.distNodesMod.Token[ButKeyword]) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: Unit,
    notKeyword: typings.grammarkdown.distNodesMod.Token[NotKeyword]
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typings.grammarkdown.distNodesMod.Token[ButKeyword],
    notKeyword: typings.grammarkdown.distNodesMod.Token[NotKeyword]
  ) = this()
  def this(left: LexicalSymbol, butKeyword: Unit, notKeyword: Unit, right: LexicalSymbol) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: Unit,
    notKeyword: typings.grammarkdown.distNodesMod.Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typings.grammarkdown.distNodesMod.Token[ButKeyword],
    notKeyword: Unit,
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typings.grammarkdown.distNodesMod.Token[ButKeyword],
    notKeyword: typings.grammarkdown.distNodesMod.Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
}
