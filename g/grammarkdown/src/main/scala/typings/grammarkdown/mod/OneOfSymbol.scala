package typings.grammarkdown.mod

import typings.grammarkdown.distNodesMod.LexicalSymbol
import typings.grammarkdown.distTokensMod.SyntaxKind.OfKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.OneKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "OneOfSymbol")
@js.native
open class OneOfSymbol protected ()
  extends typings.grammarkdown.distNodesMod.OneOfSymbol {
  def this(oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword]) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.distNodesMod.Token[OfKeyword]
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: Unit,
    symbols: js.Array[LexicalSymbol]
  ) = this()
  def this(
    oneKeyword: typings.grammarkdown.distNodesMod.Token[OneKeyword],
    ofKeyword: typings.grammarkdown.distNodesMod.Token[OfKeyword],
    symbols: js.Array[LexicalSymbol]
  ) = this()
}
