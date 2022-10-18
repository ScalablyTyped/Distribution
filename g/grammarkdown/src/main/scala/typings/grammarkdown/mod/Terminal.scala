package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.SyntaxKind.QuestionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Terminal")
@js.native
open class Terminal protected ()
  extends typings.grammarkdown.distNodesMod.Terminal {
  def this(literal: typings.grammarkdown.distNodesMod.TerminalLiteral) = this()
  def this(literal: typings.grammarkdown.distNodesMod.UnicodeCharacterLiteral) = this()
  def this(
    literal: typings.grammarkdown.distNodesMod.TerminalLiteral,
    questionToken: typings.grammarkdown.distNodesMod.Token[QuestionToken]
  ) = this()
  def this(
    literal: typings.grammarkdown.distNodesMod.UnicodeCharacterLiteral,
    questionToken: typings.grammarkdown.distNodesMod.Token[QuestionToken]
  ) = this()
}
