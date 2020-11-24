package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.AtToken
import typings.grammarkdown.tokensMod.SyntaxKind.DefaultKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.LineKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Line")
@js.native
class Line protected ()
  extends typings.grammarkdown.nodesMod.Line {
  def this(
    atToken: typings.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.nodesMod.Token[LineKeyword]
  ) = this()
  def this(
    atToken: typings.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.nodesMod.Token[LineKeyword],
    number: typings.grammarkdown.nodesMod.NumberLiteral
  ) = this()
  def this(
    atToken: typings.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.nodesMod.Token[LineKeyword],
    number: typings.grammarkdown.nodesMod.Token[DefaultKeyword]
  ) = this()
  def this(
    atToken: typings.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.nodesMod.Token[LineKeyword],
    number: js.UndefOr[scala.Nothing],
    path: typings.grammarkdown.nodesMod.StringLiteral
  ) = this()
  def this(
    atToken: typings.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.nodesMod.Token[LineKeyword],
    number: typings.grammarkdown.nodesMod.NumberLiteral,
    path: typings.grammarkdown.nodesMod.StringLiteral
  ) = this()
  def this(
    atToken: typings.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typings.grammarkdown.nodesMod.Token[LineKeyword],
    number: typings.grammarkdown.nodesMod.Token[DefaultKeyword],
    path: typings.grammarkdown.nodesMod.StringLiteral
  ) = this()
}
