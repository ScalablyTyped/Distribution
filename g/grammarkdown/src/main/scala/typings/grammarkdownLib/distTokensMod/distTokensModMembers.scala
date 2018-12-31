package typings
package grammarkdownLib.distTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/tokens", JSImport.Namespace)
@js.native
object distTokensModMembers extends js.Object {
  def isCommentTriviaKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.CommentTriviaKind */ scala.Boolean = js.native
  def isHtmlTriviaKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.HtmlTriviaKind */ scala.Boolean = js.native
  def isKeywordKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.KeywordKind */ scala.Boolean = js.native
  def isProseFragmentLiteralKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentLiteralKind */ scala.Boolean = js.native
  def isPunctuationKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.PunctuationKind */ scala.Boolean = js.native
  def isTextContentKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TextContentKind */ scala.Boolean = js.native
  def isTokenKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TokenKind */ scala.Boolean = js.native
  def isTriviaKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TriviaKind */ scala.Boolean = js.native
  def stringToToken(text: java.lang.String): js.UndefOr[SyntaxKind] = js.native
  def tokenToString(kind: SyntaxKind): java.lang.String = js.native
  def tokenToString(kind: SyntaxKind, quoted: scala.Boolean): java.lang.String = js.native
  def tokenToString(kind: java.lang.String): java.lang.String = js.native
  def tokenToString(kind: java.lang.String, quoted: scala.Boolean): java.lang.String = js.native
}

