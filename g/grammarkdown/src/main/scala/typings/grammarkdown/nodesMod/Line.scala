package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind.AtToken
import typings.grammarkdown.tokensMod.SyntaxKind.DefaultKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.LineKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Line")
@js.native
class Line protected ()
  extends MetaElementBase[typings.grammarkdown.tokensMod.SyntaxKind.Line]
     with MetaElement {
  def this(atToken: Token[AtToken], lineKeyword: Token[LineKeyword]) = this()
  def this(atToken: Token[AtToken], lineKeyword: Token[LineKeyword], number: NumberLiteral) = this()
  def this(atToken: Token[AtToken], lineKeyword: Token[LineKeyword], number: Token[DefaultKeyword]) = this()
  def this(atToken: Token[AtToken], lineKeyword: Token[LineKeyword], number: Unit, path: StringLiteral) = this()
  def this(
    atToken: Token[AtToken],
    lineKeyword: Token[LineKeyword],
    number: NumberLiteral,
    path: StringLiteral
  ) = this()
  def this(
    atToken: Token[AtToken],
    lineKeyword: Token[LineKeyword],
    number: Token[DefaultKeyword],
    path: StringLiteral
  ) = this()
  
  val lineKeyword: Token[LineKeyword] = js.native
  
  val number: js.UndefOr[NumberLiteral | Token[DefaultKeyword]] = js.native
  
  val path: js.UndefOr[StringLiteral] = js.native
}
