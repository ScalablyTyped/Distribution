package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distNodesMod.CommentTrivia
import typings.grammarkdown.distNodesMod.HtmlTrivia
import typings.grammarkdown.distOptionsMod.CompilerOptions
import typings.grammarkdown.distOptionsMod.KnownOptions
import typings.grammarkdown.distOptionsMod.ParsedArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def forEachChild[T](
    node: js.UndefOr[scala.Nothing],
    cbNode: js.Function1[
      /* node */ typings.grammarkdown.distNodesMod.Node[typings.grammarkdown.distTokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
  def forEachChild[T](
    node: typings.grammarkdown.distNodesMod.Node[typings.grammarkdown.distTokensMod.SyntaxKind],
    cbNode: js.Function1[
      /* node */ typings.grammarkdown.distNodesMod.Node[typings.grammarkdown.distTokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
  def formatList(tokens: js.Array[typings.grammarkdown.distTokensMod.SyntaxKind | String]): String = js.native
  def formatString(format: String): String = js.native
  def formatString(format: String, args: js.Any*): String = js.native
  def formatString(format: String, args: js.Array[_]): String = js.native
  def getDefaultOptions(): CompilerOptions = js.native
  def isCommentTriviaKind(kind: typings.grammarkdown.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.CommentTriviaKind */ Boolean = js.native
  def isHtmlTriviaKind(kind: typings.grammarkdown.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.HtmlTriviaKind */ Boolean = js.native
  def isKeywordKind(kind: typings.grammarkdown.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.KeywordKind */ Boolean = js.native
  def isProseFragmentLiteralKind(kind: typings.grammarkdown.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentLiteralKind */ Boolean = js.native
  def isPunctuationKind(kind: typings.grammarkdown.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.PunctuationKind */ Boolean = js.native
  def isTextContentKind(kind: typings.grammarkdown.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TextContentKind */ Boolean = js.native
  def isTokenKind(kind: typings.grammarkdown.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TokenKind */ Boolean = js.native
  def isTriviaKind(kind: typings.grammarkdown.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TriviaKind */ Boolean = js.native
  def parse[T /* <: ParsedArguments */](options: KnownOptions): js.UndefOr[T] = js.native
  def parse[T /* <: ParsedArguments */](options: KnownOptions, args: js.Array[String]): js.UndefOr[T] = js.native
  def scanHtmlTrivia(text: String, pos: Double, end: Double): js.UndefOr[js.Array[HtmlTrivia]] = js.native
  def skipTrivia(text: String, pos: Double, end: Double): Double = js.native
  def skipTrivia(text: String, pos: Double, end: Double, htmlTrivia: js.Array[HtmlTrivia]): Double = js.native
  def skipTrivia(
    text: String,
    pos: Double,
    end: Double,
    htmlTrivia: js.Array[HtmlTrivia],
    commentTrivia: js.Array[CommentTrivia]
  ): Double = js.native
  def stringToToken(text: String): js.UndefOr[typings.grammarkdown.distTokensMod.SyntaxKind] = js.native
  def tokenToString(kind: String): String = js.native
  def tokenToString(kind: String, quoted: Boolean): String = js.native
  def tokenToString(kind: typings.grammarkdown.distTokensMod.SyntaxKind): String = js.native
  def tokenToString(kind: typings.grammarkdown.distTokensMod.SyntaxKind, quoted: Boolean): String = js.native
  def usage(options: KnownOptions): Unit = js.native
  def usage(options: KnownOptions, margin: Double): Unit = js.native
  def usage(
    options: KnownOptions,
    margin: Double,
    printHeader: js.Function1[/* writer */ typings.grammarkdown.distOptionsMod.UsageWriter, Unit]
  ): Unit = js.native
}

