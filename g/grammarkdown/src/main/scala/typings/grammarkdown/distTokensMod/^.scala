package typings.grammarkdown.distTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/tokens", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isCommentTriviaKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.CommentTriviaKind */ Boolean = js.native
  def isHtmlTriviaKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.HtmlTriviaKind */ Boolean = js.native
  def isKeywordKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.KeywordKind */ Boolean = js.native
  def isProseFragmentLiteralKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentLiteralKind */ Boolean = js.native
  def isPunctuationKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.PunctuationKind */ Boolean = js.native
  def isTextContentKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TextContentKind */ Boolean = js.native
  def isTokenKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TokenKind */ Boolean = js.native
  def isTriviaKind(kind: SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TriviaKind */ Boolean = js.native
  def stringToToken(text: String): js.UndefOr[SyntaxKind] = js.native
  def tokenToString(kind: String): String = js.native
  def tokenToString(kind: String, quoted: Boolean): String = js.native
  def tokenToString(kind: SyntaxKind): String = js.native
  def tokenToString(kind: SyntaxKind, quoted: Boolean): String = js.native
}

