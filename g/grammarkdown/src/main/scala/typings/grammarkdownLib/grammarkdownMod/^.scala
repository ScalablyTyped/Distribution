package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Diagnostics: grammarkdownLib.Anon_0expected = js.native
  def forEachChild[T](
    node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind],
    cbNode: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
  def forEachChild[T](
    node: js.UndefOr[scala.Nothing],
    cbNode: js.Function1[
      /* node */ grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
  def formatList(tokens: js.Array[grammarkdownLib.distTokensMod.SyntaxKind | java.lang.String]): java.lang.String = js.native
  def formatString(format: java.lang.String): java.lang.String = js.native
  def formatString(format: java.lang.String, args: js.Any*): java.lang.String = js.native
  def formatString(format: java.lang.String, args: js.Array[_]): java.lang.String = js.native
  def getDefaultOptions(): grammarkdownLib.distOptionsMod.CompilerOptions = js.native
  def isCommentTriviaKind(kind: grammarkdownLib.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.CommentTriviaKind */ scala.Boolean = js.native
  def isHtmlTriviaKind(kind: grammarkdownLib.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.HtmlTriviaKind */ scala.Boolean = js.native
  def isKeywordKind(kind: grammarkdownLib.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.KeywordKind */ scala.Boolean = js.native
  def isProseFragmentLiteralKind(kind: grammarkdownLib.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.ProseFragmentLiteralKind */ scala.Boolean = js.native
  def isPunctuationKind(kind: grammarkdownLib.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.PunctuationKind */ scala.Boolean = js.native
  def isTextContentKind(kind: grammarkdownLib.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TextContentKind */ scala.Boolean = js.native
  def isTokenKind(kind: grammarkdownLib.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TokenKind */ scala.Boolean = js.native
  def isTriviaKind(kind: grammarkdownLib.distTokensMod.SyntaxKind): /* is grammarkdown.grammarkdown/dist/tokens.TriviaKind */ scala.Boolean = js.native
  def parse[T /* <: grammarkdownLib.distOptionsMod.ParsedArguments */](options: grammarkdownLib.distOptionsMod.KnownOptions): js.UndefOr[T] = js.native
  def parse[T /* <: grammarkdownLib.distOptionsMod.ParsedArguments */](options: grammarkdownLib.distOptionsMod.KnownOptions, args: js.Array[java.lang.String]): js.UndefOr[T] = js.native
  def scanHtmlTrivia(text: java.lang.String, pos: scala.Double, end: scala.Double): js.UndefOr[js.Array[grammarkdownLib.distNodesMod.HtmlTrivia]] = js.native
  def skipTrivia(text: java.lang.String, pos: scala.Double, end: scala.Double): scala.Double = js.native
  def skipTrivia(
    text: java.lang.String,
    pos: scala.Double,
    end: scala.Double,
    htmlTrivia: js.Array[grammarkdownLib.distNodesMod.HtmlTrivia]
  ): scala.Double = js.native
  def skipTrivia(
    text: java.lang.String,
    pos: scala.Double,
    end: scala.Double,
    htmlTrivia: js.Array[grammarkdownLib.distNodesMod.HtmlTrivia],
    commentTrivia: js.Array[grammarkdownLib.distNodesMod.CommentTrivia]
  ): scala.Double = js.native
  def stringToToken(text: java.lang.String): js.UndefOr[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  def tokenToString(kind: grammarkdownLib.distTokensMod.SyntaxKind): java.lang.String = js.native
  def tokenToString(kind: grammarkdownLib.distTokensMod.SyntaxKind, quoted: scala.Boolean): java.lang.String = js.native
  def tokenToString(kind: java.lang.String): java.lang.String = js.native
  def tokenToString(kind: java.lang.String, quoted: scala.Boolean): java.lang.String = js.native
  def usage(options: grammarkdownLib.distOptionsMod.KnownOptions): scala.Unit = js.native
  def usage(options: grammarkdownLib.distOptionsMod.KnownOptions, margin: scala.Double): scala.Unit = js.native
  def usage(
    options: grammarkdownLib.distOptionsMod.KnownOptions,
    margin: scala.Double,
    printHeader: js.Function1[/* writer */ grammarkdownLib.distOptionsMod.UsageWriter, scala.Unit]
  ): scala.Unit = js.native
}

