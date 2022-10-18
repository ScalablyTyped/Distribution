package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typings.grammarkdown.distTokensMod.SyntaxKind.DefaultKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.LineKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Line")
@js.native
open class Line protected ()
  extends typings.grammarkdown.distNodesMod.Line {
  def this(
    atToken: typings.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.distNodesMod.Token[LineKeyword]
  ) = this()
  def this(
    atToken: typings.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.distNodesMod.Token[LineKeyword],
    number: typings.grammarkdown.distNodesMod.NumberLiteral
  ) = this()
  def this(
    atToken: typings.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.distNodesMod.Token[LineKeyword],
    number: typings.grammarkdown.distNodesMod.Token[DefaultKeyword]
  ) = this()
  def this(
    atToken: typings.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.distNodesMod.Token[LineKeyword],
    number: Unit,
    path: typings.grammarkdown.distNodesMod.StringLiteral
  ) = this()
  def this(
    atToken: typings.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.distNodesMod.Token[LineKeyword],
    number: typings.grammarkdown.distNodesMod.NumberLiteral,
    path: typings.grammarkdown.distNodesMod.StringLiteral
  ) = this()
  def this(
    atToken: typings.grammarkdown.distNodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.distNodesMod.Token[LineKeyword],
    number: typings.grammarkdown.distNodesMod.Token[DefaultKeyword],
    path: typings.grammarkdown.distNodesMod.StringLiteral
  ) = this()
}
