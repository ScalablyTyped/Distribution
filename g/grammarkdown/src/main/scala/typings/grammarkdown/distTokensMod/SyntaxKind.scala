package typings.grammarkdown.distTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyntaxKind extends js.Object

@JSImport("grammarkdown/dist/tokens", "SyntaxKind")
@js.native
object SyntaxKind extends js.Object {
  @js.native
  sealed trait Argument extends SyntaxKind
  
  @js.native
  sealed trait ArgumentList extends SyntaxKind
  
  @js.native
  sealed trait AtToken
    extends PunctuationKind
       with SyntaxKind
  
  @js.native
  sealed trait ButKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait ButNotSymbol extends SyntaxKind
  
  @js.native
  sealed trait CloseBraceToken
    extends PunctuationKind
       with SyntaxKind
  
  @js.native
  sealed trait CloseBracketToken
    extends PunctuationKind
       with SyntaxKind
  
  @js.native
  sealed trait CloseParenToken
    extends PunctuationKind
       with SyntaxKind
  
  @js.native
  sealed trait ColonColonColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  
  @js.native
  sealed trait ColonColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  
  @js.native
  sealed trait ColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  
  @js.native
  sealed trait CommaToken
    extends PunctuationKind
       with SyntaxKind
  
  @js.native
  sealed trait Constraints extends SyntaxKind
  
  @js.native
  sealed trait Define extends SyntaxKind
  
  @js.native
  sealed trait DefineKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait ElementOfToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  
  @js.native
  sealed trait EmptyAssertion extends SyntaxKind
  
  @js.native
  sealed trait EmptyKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait EndOfFileToken
    extends SyntaxKind
       with TokenKind
  
  @js.native
  sealed trait EqualsEqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  
  @js.native
  sealed trait EqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  
  @js.native
  sealed trait FalseKeyword
    extends KeywordKind
       with SyntaxKind
       with BooleanKind
  
  @js.native
  sealed trait FirstCommentTrivia extends SyntaxKind
  
  @js.native
  sealed trait FirstErrorNode extends SyntaxKind
  
  @js.native
  sealed trait FirstHtmlTrivia extends SyntaxKind
  
  @js.native
  sealed trait FirstKeyword extends SyntaxKind
  
  @js.native
  sealed trait FirstLiteral extends SyntaxKind
  
  @js.native
  sealed trait FirstProseFragmentLiteral extends SyntaxKind
  
  @js.native
  sealed trait FirstPunctuation extends SyntaxKind
  
  @js.native
  sealed trait FirstTextContent extends SyntaxKind
  
  @js.native
  sealed trait FirstToken extends SyntaxKind
  
  @js.native
  sealed trait FirstTrivia extends SyntaxKind
  
  @js.native
  sealed trait GoalKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait GreaterThanToken
    extends PunctuationKind
       with SyntaxKind
  
  @js.native
  sealed trait HereKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait HtmlCloseTagTrivia
    extends HtmlTriviaKind
       with SyntaxKind
  
  @js.native
  sealed trait HtmlOpenTagTrivia
    extends HtmlTriviaKind
       with SyntaxKind
  
  @js.native
  sealed trait Identifier
    extends SyntaxKind
       with TextContentKind
  
  @js.native
  sealed trait Import extends SyntaxKind
  
  @js.native
  sealed trait ImportKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait InvalidAssertion extends SyntaxKind
  
  @js.native
  sealed trait InvalidSymbol extends SyntaxKind
  
  @js.native
  sealed trait LastCommentTrivia extends SyntaxKind
  
  @js.native
  sealed trait LastErrorNode extends SyntaxKind
  
  @js.native
  sealed trait LastHtmlTrivia extends SyntaxKind
  
  @js.native
  sealed trait LastKeyword extends SyntaxKind
  
  @js.native
  sealed trait LastLiteral extends SyntaxKind
  
  @js.native
  sealed trait LastProseFragmentLiteral extends SyntaxKind
  
  @js.native
  sealed trait LastPunctuation extends SyntaxKind
  
  @js.native
  sealed trait LastTextContent extends SyntaxKind
  
  @js.native
  sealed trait LastToken extends SyntaxKind
  
  @js.native
  sealed trait LastTrivia extends SyntaxKind
  
  @js.native
  sealed trait LessThanExclamationToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  
  @js.native
  sealed trait LessThanMinusToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  
  @js.native
  sealed trait LexicalGoalAssertion extends SyntaxKind
  
  @js.native
  sealed trait LexicalKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait LinkReference extends SyntaxKind
  
  @js.native
  sealed trait LookaheadAssertion extends SyntaxKind
  
  @js.native
  sealed trait LookaheadKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends CommentTriviaKind
       with SyntaxKind
  
  @js.native
  sealed trait NoKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait NoSymbolHereAssertion extends SyntaxKind
  
  @js.native
  sealed trait Nonterminal extends SyntaxKind
  
  @js.native
  sealed trait NotAnElementOfToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  
  @js.native
  sealed trait NotEqualToToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  
  @js.native
  sealed trait NotKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait OfKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait OneKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait OneOfList extends SyntaxKind
  
  @js.native
  sealed trait OneOfSymbol extends SyntaxKind
  
  @js.native
  sealed trait OpenBraceToken
    extends PunctuationKind
       with SyntaxKind
  
  @js.native
  sealed trait OpenBracketGreaterThanToken
    extends PunctuationKind
       with SyntaxKind
  
  @js.native
  sealed trait OpenBracketToken
    extends PunctuationKind
       with SyntaxKind
  
  @js.native
  sealed trait OpenParenToken
    extends PunctuationKind
       with SyntaxKind
  
  @js.native
  sealed trait OrKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait Parameter extends SyntaxKind
  
  @js.native
  sealed trait ParameterList extends SyntaxKind
  
  @js.native
  sealed trait PlaceholderSymbol extends SyntaxKind
  
  @js.native
  sealed trait PlusToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
  
  @js.native
  sealed trait Production extends SyntaxKind
  
  @js.native
  sealed trait Prose extends SyntaxKind
  
  @js.native
  sealed trait ProseAssertion extends SyntaxKind
  
  @js.native
  sealed trait ProseFull
    extends ProseFragmentLiteralKind
       with SyntaxKind
  
  @js.native
  sealed trait ProseHead
    extends ProseFragmentLiteralKind
       with SyntaxKind
  
  @js.native
  sealed trait ProseMiddle
    extends ProseFragmentLiteralKind
       with SyntaxKind
  
  @js.native
  sealed trait ProseTail
    extends ProseFragmentLiteralKind
       with SyntaxKind
  
  @js.native
  sealed trait QuestionToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
  
  @js.native
  sealed trait RightHandSide extends SyntaxKind
  
  @js.native
  sealed trait RightHandSideList extends SyntaxKind
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends CommentTriviaKind
       with SyntaxKind
  
  @js.native
  sealed trait SourceFile extends SyntaxKind
  
  @js.native
  sealed trait StringLiteral
    extends SyntaxKind
       with TextContentKind
  
  @js.native
  sealed trait SymbolSet extends SyntaxKind
  
  @js.native
  sealed trait SymbolSpan extends SyntaxKind
  
  @js.native
  sealed trait Terminal
    extends SyntaxKind
       with TextContentKind
  
  @js.native
  sealed trait ThroughKeyword
    extends KeywordKind
       with SyntaxKind
  
  @js.native
  sealed trait TildeToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
  
  @js.native
  sealed trait TrueKeyword
    extends KeywordKind
       with SyntaxKind
       with BooleanKind
  
  @js.native
  sealed trait UnicodeCharacterLiteral
    extends SyntaxKind
       with TextContentKind
  
  @js.native
  sealed trait UnicodeCharacterRange extends SyntaxKind
  
  @js.native
  sealed trait Unknown extends SyntaxKind
  
  /* 60 */ val Argument: typings.grammarkdown.distTokensMod.SyntaxKind.Argument with Double = js.native
  /* 61 */ val ArgumentList: typings.grammarkdown.distTokensMod.SyntaxKind.ArgumentList with Double = js.native
  /* 6 */ val AtToken: typings.grammarkdown.distTokensMod.SyntaxKind.AtToken with Double = js.native
  /* 30 */ val ButKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.ButKeyword with Double = js.native
  /* 69 */ val ButNotSymbol: typings.grammarkdown.distTokensMod.SyntaxKind.ButNotSymbol with Double = js.native
  /* 8 */ val CloseBraceToken: typings.grammarkdown.distTokensMod.SyntaxKind.CloseBraceToken with Double = js.native
  /* 11 */ val CloseBracketToken: typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken with Double = js.native
  /* 14 */ val CloseParenToken: typings.grammarkdown.distTokensMod.SyntaxKind.CloseParenToken with Double = js.native
  /* 17 */ val ColonColonColonToken: typings.grammarkdown.distTokensMod.SyntaxKind.ColonColonColonToken with Double = js.native
  /* 16 */ val ColonColonToken: typings.grammarkdown.distTokensMod.SyntaxKind.ColonColonToken with Double = js.native
  /* 15 */ val ColonToken: typings.grammarkdown.distTokensMod.SyntaxKind.ColonToken with Double = js.native
  /* 18 */ val CommaToken: typings.grammarkdown.distTokensMod.SyntaxKind.CommaToken with Double = js.native
  /* 66 */ val Constraints: typings.grammarkdown.distTokensMod.SyntaxKind.Constraints with Double = js.native
  /* 56 */ val Define: typings.grammarkdown.distTokensMod.SyntaxKind.Define with Double = js.native
  /* 31 */ val DefineKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.DefineKeyword with Double = js.native
  /* 28 */ val ElementOfToken: typings.grammarkdown.distTokensMod.SyntaxKind.ElementOfToken with Double = js.native
  /* 75 */ val EmptyAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.EmptyAssertion with Double = js.native
  /* 32 */ val EmptyKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.EmptyKeyword with Double = js.native
  /* 5 */ val EndOfFileToken: typings.grammarkdown.distTokensMod.SyntaxKind.EndOfFileToken with Double = js.native
  /* 23 */ val EqualsEqualsToken: typings.grammarkdown.distTokensMod.SyntaxKind.EqualsEqualsToken with Double = js.native
  /* 22 */ val EqualsToken: typings.grammarkdown.distTokensMod.SyntaxKind.EqualsToken with Double = js.native
  /* 24 */ val ExclamationEqualsToken: typings.grammarkdown.distTokensMod.SyntaxKind.ExclamationEqualsToken with Double = js.native
  /* 33 */ val FalseKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.FalseKeyword with Double = js.native
  /* 1 */ val FirstCommentTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.FirstCommentTrivia with Double = js.native
  /* 80 */ val FirstErrorNode: typings.grammarkdown.distTokensMod.SyntaxKind.FirstErrorNode with Double = js.native
  /* 3 */ val FirstHtmlTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.FirstHtmlTrivia with Double = js.native
  /* 30 */ val FirstKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.FirstKeyword with Double = js.native
  /* 46 */ val FirstLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.FirstLiteral with Double = js.native
  /* 49 */ val FirstProseFragmentLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.FirstProseFragmentLiteral with Double = js.native
  /* 6 */ val FirstPunctuation: typings.grammarkdown.distTokensMod.SyntaxKind.FirstPunctuation with Double = js.native
  /* 46 */ val FirstTextContent: typings.grammarkdown.distTokensMod.SyntaxKind.FirstTextContent with Double = js.native
  /* 5 */ val FirstToken: typings.grammarkdown.distTokensMod.SyntaxKind.FirstToken with Double = js.native
  /* 1 */ val FirstTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.FirstTrivia with Double = js.native
  /* 34 */ val GoalKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.GoalKeyword with Double = js.native
  /* 12 */ val GreaterThanToken: typings.grammarkdown.distTokensMod.SyntaxKind.GreaterThanToken with Double = js.native
  /* 35 */ val HereKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.HereKeyword with Double = js.native
  /* 4 */ val HtmlCloseTagTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.HtmlCloseTagTrivia with Double = js.native
  /* 3 */ val HtmlOpenTagTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.HtmlOpenTagTrivia with Double = js.native
  /* 53 */ val Identifier: typings.grammarkdown.distTokensMod.SyntaxKind.Identifier with Double = js.native
  /* 55 */ val Import: typings.grammarkdown.distTokensMod.SyntaxKind.Import with Double = js.native
  /* 36 */ val ImportKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.ImportKeyword with Double = js.native
  /* 81 */ val InvalidAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.InvalidAssertion with Double = js.native
  /* 80 */ val InvalidSymbol: typings.grammarkdown.distTokensMod.SyntaxKind.InvalidSymbol with Double = js.native
  /* 2 */ val LastCommentTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.LastCommentTrivia with Double = js.native
  /* 81 */ val LastErrorNode: typings.grammarkdown.distTokensMod.SyntaxKind.LastErrorNode with Double = js.native
  /* 4 */ val LastHtmlTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.LastHtmlTrivia with Double = js.native
  /* 45 */ val LastKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.LastKeyword with Double = js.native
  /* 48 */ val LastLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.LastLiteral with Double = js.native
  /* 52 */ val LastProseFragmentLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.LastProseFragmentLiteral with Double = js.native
  /* 29 */ val LastPunctuation: typings.grammarkdown.distTokensMod.SyntaxKind.LastPunctuation with Double = js.native
  /* 52 */ val LastTextContent: typings.grammarkdown.distTokensMod.SyntaxKind.LastTextContent with Double = js.native
  /* 45 */ val LastToken: typings.grammarkdown.distTokensMod.SyntaxKind.LastToken with Double = js.native
  /* 4 */ val LastTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.LastTrivia with Double = js.native
  /* 25 */ val LessThanExclamationToken: typings.grammarkdown.distTokensMod.SyntaxKind.LessThanExclamationToken with Double = js.native
  /* 26 */ val LessThanMinusToken: typings.grammarkdown.distTokensMod.SyntaxKind.LessThanMinusToken with Double = js.native
  /* 77 */ val LexicalGoalAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.LexicalGoalAssertion with Double = js.native
  /* 37 */ val LexicalKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.LexicalKeyword with Double = js.native
  /* 62 */ val LinkReference: typings.grammarkdown.distTokensMod.SyntaxKind.LinkReference with Double = js.native
  /* 76 */ val LookaheadAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.LookaheadAssertion with Double = js.native
  /* 38 */ val LookaheadKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.LookaheadKeyword with Double = js.native
  /* 2 */ val MultiLineCommentTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.MultiLineCommentTrivia with Double = js.native
  /* 39 */ val NoKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.NoKeyword with Double = js.native
  /* 78 */ val NoSymbolHereAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.NoSymbolHereAssertion with Double = js.native
  /* 73 */ val Nonterminal: typings.grammarkdown.distTokensMod.SyntaxKind.Nonterminal with Double = js.native
  /* 29 */ val NotAnElementOfToken: typings.grammarkdown.distTokensMod.SyntaxKind.NotAnElementOfToken with Double = js.native
  /* 27 */ val NotEqualToToken: typings.grammarkdown.distTokensMod.SyntaxKind.NotEqualToToken with Double = js.native
  /* 40 */ val NotKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.NotKeyword with Double = js.native
  /* 41 */ val OfKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.OfKeyword with Double = js.native
  /* 42 */ val OneKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.OneKeyword with Double = js.native
  /* 63 */ val OneOfList: typings.grammarkdown.distTokensMod.SyntaxKind.OneOfList with Double = js.native
  /* 71 */ val OneOfSymbol: typings.grammarkdown.distTokensMod.SyntaxKind.OneOfSymbol with Double = js.native
  /* 7 */ val OpenBraceToken: typings.grammarkdown.distTokensMod.SyntaxKind.OpenBraceToken with Double = js.native
  /* 10 */ val OpenBracketGreaterThanToken: typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken with Double = js.native
  /* 9 */ val OpenBracketToken: typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken with Double = js.native
  /* 13 */ val OpenParenToken: typings.grammarkdown.distTokensMod.SyntaxKind.OpenParenToken with Double = js.native
  /* 43 */ val OrKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.OrKeyword with Double = js.native
  /* 58 */ val Parameter: typings.grammarkdown.distTokensMod.SyntaxKind.Parameter with Double = js.native
  /* 59 */ val ParameterList: typings.grammarkdown.distTokensMod.SyntaxKind.ParameterList with Double = js.native
  /* 72 */ val PlaceholderSymbol: typings.grammarkdown.distTokensMod.SyntaxKind.PlaceholderSymbol with Double = js.native
  /* 19 */ val PlusToken: typings.grammarkdown.distTokensMod.SyntaxKind.PlusToken with Double = js.native
  /* 57 */ val Production: typings.grammarkdown.distTokensMod.SyntaxKind.Production with Double = js.native
  /* 74 */ val Prose: typings.grammarkdown.distTokensMod.SyntaxKind.Prose with Double = js.native
  /* 79 */ val ProseAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.ProseAssertion with Double = js.native
  /* 52 */ val ProseFull: typings.grammarkdown.distTokensMod.SyntaxKind.ProseFull with Double = js.native
  /* 49 */ val ProseHead: typings.grammarkdown.distTokensMod.SyntaxKind.ProseHead with Double = js.native
  /* 50 */ val ProseMiddle: typings.grammarkdown.distTokensMod.SyntaxKind.ProseMiddle with Double = js.native
  /* 51 */ val ProseTail: typings.grammarkdown.distTokensMod.SyntaxKind.ProseTail with Double = js.native
  /* 21 */ val QuestionToken: typings.grammarkdown.distTokensMod.SyntaxKind.QuestionToken with Double = js.native
  /* 65 */ val RightHandSide: typings.grammarkdown.distTokensMod.SyntaxKind.RightHandSide with Double = js.native
  /* 64 */ val RightHandSideList: typings.grammarkdown.distTokensMod.SyntaxKind.RightHandSideList with Double = js.native
  /* 1 */ val SingleLineCommentTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.SingleLineCommentTrivia with Double = js.native
  /* 54 */ val SourceFile: typings.grammarkdown.distTokensMod.SyntaxKind.SourceFile with Double = js.native
  /* 46 */ val StringLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.StringLiteral with Double = js.native
  /* 68 */ val SymbolSet: typings.grammarkdown.distTokensMod.SyntaxKind.SymbolSet with Double = js.native
  /* 67 */ val SymbolSpan: typings.grammarkdown.distTokensMod.SyntaxKind.SymbolSpan with Double = js.native
  /* 47 */ val Terminal: typings.grammarkdown.distTokensMod.SyntaxKind.Terminal with Double = js.native
  /* 44 */ val ThroughKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.ThroughKeyword with Double = js.native
  /* 20 */ val TildeToken: typings.grammarkdown.distTokensMod.SyntaxKind.TildeToken with Double = js.native
  /* 45 */ val TrueKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.TrueKeyword with Double = js.native
  /* 48 */ val UnicodeCharacterLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.UnicodeCharacterLiteral with Double = js.native
  /* 70 */ val UnicodeCharacterRange: typings.grammarkdown.distTokensMod.SyntaxKind.UnicodeCharacterRange with Double = js.native
  /* 0 */ val Unknown: typings.grammarkdown.distTokensMod.SyntaxKind.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind with Double] = js.native
}

