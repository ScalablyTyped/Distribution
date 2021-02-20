package typings.grammarkdown.tokensMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends StObject
@JSImport("grammarkdown/dist/tokens", "SyntaxKind")
@js.native
object SyntaxKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind with Double] = js.native
  
  @js.native
  sealed trait Argument extends SyntaxKind
  /* 64 */ val Argument: typings.grammarkdown.tokensMod.SyntaxKind.Argument with Double = js.native
  
  @js.native
  sealed trait ArgumentList extends SyntaxKind
  /* 65 */ val ArgumentList: typings.grammarkdown.tokensMod.SyntaxKind.ArgumentList with Double = js.native
  
  @js.native
  sealed trait AtToken
    extends PunctuationKind
       with SyntaxKind
  /* 6 */ val AtToken: typings.grammarkdown.tokensMod.SyntaxKind.AtToken with Double = js.native
  
  @js.native
  sealed trait ButKeyword
    extends KeywordKind
       with SyntaxKind
  /* 30 */ val ButKeyword: typings.grammarkdown.tokensMod.SyntaxKind.ButKeyword with Double = js.native
  
  @js.native
  sealed trait ButNotSymbol
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 73 */ val ButNotSymbol: typings.grammarkdown.tokensMod.SyntaxKind.ButNotSymbol with Double = js.native
  
  @js.native
  sealed trait CloseBraceToken
    extends PunctuationKind
       with SyntaxKind
  /* 8 */ val CloseBraceToken: typings.grammarkdown.tokensMod.SyntaxKind.CloseBraceToken with Double = js.native
  
  @js.native
  sealed trait CloseBracketToken
    extends PunctuationKind
       with SyntaxKind
  /* 11 */ val CloseBracketToken: typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken with Double = js.native
  
  @js.native
  sealed trait CloseParenToken
    extends PunctuationKind
       with SyntaxKind
  /* 14 */ val CloseParenToken: typings.grammarkdown.tokensMod.SyntaxKind.CloseParenToken with Double = js.native
  
  @js.native
  sealed trait ColonColonColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 17 */ val ColonColonColonToken: typings.grammarkdown.tokensMod.SyntaxKind.ColonColonColonToken with Double = js.native
  
  @js.native
  sealed trait ColonColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 16 */ val ColonColonToken: typings.grammarkdown.tokensMod.SyntaxKind.ColonColonToken with Double = js.native
  
  @js.native
  sealed trait ColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 15 */ val ColonToken: typings.grammarkdown.tokensMod.SyntaxKind.ColonToken with Double = js.native
  
  @js.native
  sealed trait CommaToken
    extends PunctuationKind
       with SyntaxKind
  /* 18 */ val CommaToken: typings.grammarkdown.tokensMod.SyntaxKind.CommaToken with Double = js.native
  
  @js.native
  sealed trait Constraints extends SyntaxKind
  /* 70 */ val Constraints: typings.grammarkdown.tokensMod.SyntaxKind.Constraints with Double = js.native
  
  @js.native
  sealed trait DefaultKeyword
    extends KeywordKind
       with SyntaxKind
  /* 32 */ val DefaultKeyword: typings.grammarkdown.tokensMod.SyntaxKind.DefaultKeyword with Double = js.native
  
  @js.native
  sealed trait Define
    extends MetaElementKind
       with SyntaxKind
  /* 59 */ val Define: typings.grammarkdown.tokensMod.SyntaxKind.Define with Double = js.native
  
  @js.native
  sealed trait DefineKeyword
    extends KeywordKind
       with SyntaxKind
  /* 31 */ val DefineKeyword: typings.grammarkdown.tokensMod.SyntaxKind.DefineKeyword with Double = js.native
  
  @js.native
  sealed trait ElementOfToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 28 */ val ElementOfToken: typings.grammarkdown.tokensMod.SyntaxKind.ElementOfToken with Double = js.native
  
  @js.native
  sealed trait EmptyAssertion
    extends AssertionKind
       with SyntaxKind
  /* 79 */ val EmptyAssertion: typings.grammarkdown.tokensMod.SyntaxKind.EmptyAssertion with Double = js.native
  
  @js.native
  sealed trait EmptyKeyword
    extends KeywordKind
       with SyntaxKind
  /* 33 */ val EmptyKeyword: typings.grammarkdown.tokensMod.SyntaxKind.EmptyKeyword with Double = js.native
  
  @js.native
  sealed trait EndOfFileToken
    extends SyntaxKind
       with TokenKind
  /* 5 */ val EndOfFileToken: typings.grammarkdown.tokensMod.SyntaxKind.EndOfFileToken with Double = js.native
  
  @js.native
  sealed trait EqualsEqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 23 */ val EqualsEqualsToken: typings.grammarkdown.tokensMod.SyntaxKind.EqualsEqualsToken with Double = js.native
  
  @js.native
  sealed trait EqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 22 */ val EqualsToken: typings.grammarkdown.tokensMod.SyntaxKind.EqualsToken with Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 24 */ val ExclamationEqualsToken: typings.grammarkdown.tokensMod.SyntaxKind.ExclamationEqualsToken with Double = js.native
  
  @js.native
  sealed trait FalseKeyword
    extends KeywordKind
       with SyntaxKind
       with BooleanKind
  /* 34 */ val FalseKeyword: typings.grammarkdown.tokensMod.SyntaxKind.FalseKeyword with Double = js.native
  
  @js.native
  sealed trait FirstCommentTrivia extends SyntaxKind
  /* 1 */ val FirstCommentTrivia: typings.grammarkdown.tokensMod.SyntaxKind.FirstCommentTrivia with Double = js.native
  
  @js.native
  sealed trait FirstErrorNode extends SyntaxKind
  /* 84 */ val FirstErrorNode: typings.grammarkdown.tokensMod.SyntaxKind.FirstErrorNode with Double = js.native
  
  @js.native
  sealed trait FirstHtmlTrivia extends SyntaxKind
  /* 3 */ val FirstHtmlTrivia: typings.grammarkdown.tokensMod.SyntaxKind.FirstHtmlTrivia with Double = js.native
  
  @js.native
  sealed trait FirstKeyword extends SyntaxKind
  /* 30 */ val FirstKeyword: typings.grammarkdown.tokensMod.SyntaxKind.FirstKeyword with Double = js.native
  
  @js.native
  sealed trait FirstLiteral extends SyntaxKind
  /* 48 */ val FirstLiteral: typings.grammarkdown.tokensMod.SyntaxKind.FirstLiteral with Double = js.native
  
  @js.native
  sealed trait FirstProseFragmentLiteral extends SyntaxKind
  /* 52 */ val FirstProseFragmentLiteral: typings.grammarkdown.tokensMod.SyntaxKind.FirstProseFragmentLiteral with Double = js.native
  
  @js.native
  sealed trait FirstPunctuation extends SyntaxKind
  /* 6 */ val FirstPunctuation: typings.grammarkdown.tokensMod.SyntaxKind.FirstPunctuation with Double = js.native
  
  @js.native
  sealed trait FirstTextContent extends SyntaxKind
  /* 48 */ val FirstTextContent: typings.grammarkdown.tokensMod.SyntaxKind.FirstTextContent with Double = js.native
  
  @js.native
  sealed trait FirstToken extends SyntaxKind
  /* 5 */ val FirstToken: typings.grammarkdown.tokensMod.SyntaxKind.FirstToken with Double = js.native
  
  @js.native
  sealed trait FirstTrivia extends SyntaxKind
  /* 1 */ val FirstTrivia: typings.grammarkdown.tokensMod.SyntaxKind.FirstTrivia with Double = js.native
  
  @js.native
  sealed trait GoalKeyword
    extends KeywordKind
       with SyntaxKind
  /* 35 */ val GoalKeyword: typings.grammarkdown.tokensMod.SyntaxKind.GoalKeyword with Double = js.native
  
  @js.native
  sealed trait GreaterThanToken
    extends PunctuationKind
       with SyntaxKind
  /* 12 */ val GreaterThanToken: typings.grammarkdown.tokensMod.SyntaxKind.GreaterThanToken with Double = js.native
  
  @js.native
  sealed trait HereKeyword
    extends KeywordKind
       with SyntaxKind
  /* 36 */ val HereKeyword: typings.grammarkdown.tokensMod.SyntaxKind.HereKeyword with Double = js.native
  
  @js.native
  sealed trait HtmlCloseTagTrivia
    extends HtmlTriviaKind
       with SyntaxKind
  /* 4 */ val HtmlCloseTagTrivia: typings.grammarkdown.tokensMod.SyntaxKind.HtmlCloseTagTrivia with Double = js.native
  
  @js.native
  sealed trait HtmlOpenTagTrivia
    extends HtmlTriviaKind
       with SyntaxKind
  /* 3 */ val HtmlOpenTagTrivia: typings.grammarkdown.tokensMod.SyntaxKind.HtmlOpenTagTrivia with Double = js.native
  
  @js.native
  sealed trait Identifier
    extends SyntaxKind
       with TextContentKind
  /* 56 */ val Identifier: typings.grammarkdown.tokensMod.SyntaxKind.Identifier with Double = js.native
  
  @js.native
  sealed trait Import
    extends MetaElementKind
       with SyntaxKind
  /* 58 */ val Import: typings.grammarkdown.tokensMod.SyntaxKind.Import with Double = js.native
  
  @js.native
  sealed trait ImportKeyword
    extends KeywordKind
       with SyntaxKind
  /* 37 */ val ImportKeyword: typings.grammarkdown.tokensMod.SyntaxKind.ImportKeyword with Double = js.native
  
  @js.native
  sealed trait InvalidAssertion
    extends AssertionKind
       with SyntaxKind
  /* 85 */ val InvalidAssertion: typings.grammarkdown.tokensMod.SyntaxKind.InvalidAssertion with Double = js.native
  
  @js.native
  sealed trait InvalidSymbol
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 84 */ val InvalidSymbol: typings.grammarkdown.tokensMod.SyntaxKind.InvalidSymbol with Double = js.native
  
  @js.native
  sealed trait LastCommentTrivia extends SyntaxKind
  /* 2 */ val LastCommentTrivia: typings.grammarkdown.tokensMod.SyntaxKind.LastCommentTrivia with Double = js.native
  
  @js.native
  sealed trait LastErrorNode extends SyntaxKind
  /* 85 */ val LastErrorNode: typings.grammarkdown.tokensMod.SyntaxKind.LastErrorNode with Double = js.native
  
  @js.native
  sealed trait LastHtmlTrivia extends SyntaxKind
  /* 4 */ val LastHtmlTrivia: typings.grammarkdown.tokensMod.SyntaxKind.LastHtmlTrivia with Double = js.native
  
  @js.native
  sealed trait LastKeyword extends SyntaxKind
  /* 47 */ val LastKeyword: typings.grammarkdown.tokensMod.SyntaxKind.LastKeyword with Double = js.native
  
  @js.native
  sealed trait LastLiteral extends SyntaxKind
  /* 51 */ val LastLiteral: typings.grammarkdown.tokensMod.SyntaxKind.LastLiteral with Double = js.native
  
  @js.native
  sealed trait LastProseFragmentLiteral extends SyntaxKind
  /* 55 */ val LastProseFragmentLiteral: typings.grammarkdown.tokensMod.SyntaxKind.LastProseFragmentLiteral with Double = js.native
  
  @js.native
  sealed trait LastPunctuation extends SyntaxKind
  /* 29 */ val LastPunctuation: typings.grammarkdown.tokensMod.SyntaxKind.LastPunctuation with Double = js.native
  
  @js.native
  sealed trait LastTextContent extends SyntaxKind
  /* 55 */ val LastTextContent: typings.grammarkdown.tokensMod.SyntaxKind.LastTextContent with Double = js.native
  
  @js.native
  sealed trait LastToken extends SyntaxKind
  /* 47 */ val LastToken: typings.grammarkdown.tokensMod.SyntaxKind.LastToken with Double = js.native
  
  @js.native
  sealed trait LastTrivia extends SyntaxKind
  /* 4 */ val LastTrivia: typings.grammarkdown.tokensMod.SyntaxKind.LastTrivia with Double = js.native
  
  @js.native
  sealed trait LessThanExclamationToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 25 */ val LessThanExclamationToken: typings.grammarkdown.tokensMod.SyntaxKind.LessThanExclamationToken with Double = js.native
  
  @js.native
  sealed trait LessThanMinusToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 26 */ val LessThanMinusToken: typings.grammarkdown.tokensMod.SyntaxKind.LessThanMinusToken with Double = js.native
  
  @js.native
  sealed trait LexicalGoalAssertion
    extends AssertionKind
       with SyntaxKind
  /* 81 */ val LexicalGoalAssertion: typings.grammarkdown.tokensMod.SyntaxKind.LexicalGoalAssertion with Double = js.native
  
  @js.native
  sealed trait LexicalKeyword
    extends KeywordKind
       with SyntaxKind
  /* 38 */ val LexicalKeyword: typings.grammarkdown.tokensMod.SyntaxKind.LexicalKeyword with Double = js.native
  
  @js.native
  sealed trait Line
    extends MetaElementKind
       with SyntaxKind
  /* 60 */ val Line: typings.grammarkdown.tokensMod.SyntaxKind.Line with Double = js.native
  
  @js.native
  sealed trait LineKeyword
    extends KeywordKind
       with SyntaxKind
  /* 39 */ val LineKeyword: typings.grammarkdown.tokensMod.SyntaxKind.LineKeyword with Double = js.native
  
  @js.native
  sealed trait LinkReference extends SyntaxKind
  /* 66 */ val LinkReference: typings.grammarkdown.tokensMod.SyntaxKind.LinkReference with Double = js.native
  
  @js.native
  sealed trait LookaheadAssertion
    extends AssertionKind
       with SyntaxKind
  /* 80 */ val LookaheadAssertion: typings.grammarkdown.tokensMod.SyntaxKind.LookaheadAssertion with Double = js.native
  
  @js.native
  sealed trait LookaheadKeyword
    extends KeywordKind
       with SyntaxKind
  /* 40 */ val LookaheadKeyword: typings.grammarkdown.tokensMod.SyntaxKind.LookaheadKeyword with Double = js.native
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends CommentTriviaKind
       with SyntaxKind
  /* 2 */ val MultiLineCommentTrivia: typings.grammarkdown.tokensMod.SyntaxKind.MultiLineCommentTrivia with Double = js.native
  
  @js.native
  sealed trait NoKeyword
    extends KeywordKind
       with SyntaxKind
  /* 41 */ val NoKeyword: typings.grammarkdown.tokensMod.SyntaxKind.NoKeyword with Double = js.native
  
  @js.native
  sealed trait NoSymbolHereAssertion
    extends AssertionKind
       with SyntaxKind
  /* 82 */ val NoSymbolHereAssertion: typings.grammarkdown.tokensMod.SyntaxKind.NoSymbolHereAssertion with Double = js.native
  
  @js.native
  sealed trait Nonterminal
    extends SyntaxKind
       with OptionalSymbolKind
       with ProseFragmentKind
  /* 77 */ val Nonterminal: typings.grammarkdown.tokensMod.SyntaxKind.Nonterminal with Double = js.native
  
  @js.native
  sealed trait NotAnElementOfToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 29 */ val NotAnElementOfToken: typings.grammarkdown.tokensMod.SyntaxKind.NotAnElementOfToken with Double = js.native
  
  @js.native
  sealed trait NotEqualToToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 27 */ val NotEqualToToken: typings.grammarkdown.tokensMod.SyntaxKind.NotEqualToToken with Double = js.native
  
  @js.native
  sealed trait NotKeyword
    extends KeywordKind
       with SyntaxKind
  /* 42 */ val NotKeyword: typings.grammarkdown.tokensMod.SyntaxKind.NotKeyword with Double = js.native
  
  @js.native
  sealed trait NumberLiteral
    extends SyntaxKind
       with TextContentKind
  /* 49 */ val NumberLiteral: typings.grammarkdown.tokensMod.SyntaxKind.NumberLiteral with Double = js.native
  
  @js.native
  sealed trait OfKeyword
    extends KeywordKind
       with SyntaxKind
  /* 43 */ val OfKeyword: typings.grammarkdown.tokensMod.SyntaxKind.OfKeyword with Double = js.native
  
  @js.native
  sealed trait OneKeyword
    extends KeywordKind
       with SyntaxKind
  /* 44 */ val OneKeyword: typings.grammarkdown.tokensMod.SyntaxKind.OneKeyword with Double = js.native
  
  @js.native
  sealed trait OneOfList
    extends SyntaxKind
       with ProductionBodyKind
  /* 67 */ val OneOfList: typings.grammarkdown.tokensMod.SyntaxKind.OneOfList with Double = js.native
  
  @js.native
  sealed trait OneOfSymbol
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 75 */ val OneOfSymbol: typings.grammarkdown.tokensMod.SyntaxKind.OneOfSymbol with Double = js.native
  
  @js.native
  sealed trait OpenBraceToken
    extends PunctuationKind
       with SyntaxKind
  /* 7 */ val OpenBraceToken: typings.grammarkdown.tokensMod.SyntaxKind.OpenBraceToken with Double = js.native
  
  @js.native
  sealed trait OpenBracketGreaterThanToken
    extends PunctuationKind
       with SyntaxKind
  /* 10 */ val OpenBracketGreaterThanToken: typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken with Double = js.native
  
  @js.native
  sealed trait OpenBracketToken
    extends PunctuationKind
       with SyntaxKind
  /* 9 */ val OpenBracketToken: typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken with Double = js.native
  
  @js.native
  sealed trait OpenParenToken
    extends PunctuationKind
       with SyntaxKind
  /* 13 */ val OpenParenToken: typings.grammarkdown.tokensMod.SyntaxKind.OpenParenToken with Double = js.native
  
  @js.native
  sealed trait OrKeyword
    extends KeywordKind
       with SyntaxKind
  /* 45 */ val OrKeyword: typings.grammarkdown.tokensMod.SyntaxKind.OrKeyword with Double = js.native
  
  @js.native
  sealed trait Parameter extends SyntaxKind
  /* 62 */ val Parameter: typings.grammarkdown.tokensMod.SyntaxKind.Parameter with Double = js.native
  
  @js.native
  sealed trait ParameterList extends SyntaxKind
  /* 63 */ val ParameterList: typings.grammarkdown.tokensMod.SyntaxKind.ParameterList with Double = js.native
  
  @js.native
  sealed trait PlaceholderSymbol
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 76 */ val PlaceholderSymbol: typings.grammarkdown.tokensMod.SyntaxKind.PlaceholderSymbol with Double = js.native
  
  @js.native
  sealed trait PlusToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
  /* 19 */ val PlusToken: typings.grammarkdown.tokensMod.SyntaxKind.PlusToken with Double = js.native
  
  @js.native
  sealed trait Production
    extends SyntaxKind
       with SourceElementKind
  /* 61 */ val Production: typings.grammarkdown.tokensMod.SyntaxKind.Production with Double = js.native
  
  @js.native
  sealed trait Prose
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 78 */ val Prose: typings.grammarkdown.tokensMod.SyntaxKind.Prose with Double = js.native
  
  @js.native
  sealed trait ProseAssertion
    extends AssertionKind
       with SyntaxKind
  /* 83 */ val ProseAssertion: typings.grammarkdown.tokensMod.SyntaxKind.ProseAssertion with Double = js.native
  
  @js.native
  sealed trait ProseFull
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 55 */ val ProseFull: typings.grammarkdown.tokensMod.SyntaxKind.ProseFull with Double = js.native
  
  @js.native
  sealed trait ProseHead
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 52 */ val ProseHead: typings.grammarkdown.tokensMod.SyntaxKind.ProseHead with Double = js.native
  
  @js.native
  sealed trait ProseMiddle
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 53 */ val ProseMiddle: typings.grammarkdown.tokensMod.SyntaxKind.ProseMiddle with Double = js.native
  
  @js.native
  sealed trait ProseTail
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 54 */ val ProseTail: typings.grammarkdown.tokensMod.SyntaxKind.ProseTail with Double = js.native
  
  @js.native
  sealed trait QuestionToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
  /* 21 */ val QuestionToken: typings.grammarkdown.tokensMod.SyntaxKind.QuestionToken with Double = js.native
  
  @js.native
  sealed trait RightHandSide
    extends SyntaxKind
       with ProductionBodyKind
  /* 69 */ val RightHandSide: typings.grammarkdown.tokensMod.SyntaxKind.RightHandSide with Double = js.native
  
  @js.native
  sealed trait RightHandSideList
    extends SyntaxKind
       with ProductionBodyKind
  /* 68 */ val RightHandSideList: typings.grammarkdown.tokensMod.SyntaxKind.RightHandSideList with Double = js.native
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends CommentTriviaKind
       with SyntaxKind
  /* 1 */ val SingleLineCommentTrivia: typings.grammarkdown.tokensMod.SyntaxKind.SingleLineCommentTrivia with Double = js.native
  
  @js.native
  sealed trait SourceFile extends SyntaxKind
  /* 57 */ val SourceFile: typings.grammarkdown.tokensMod.SyntaxKind.SourceFile with Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends SyntaxKind
       with TextContentKind
  /* 48 */ val StringLiteral: typings.grammarkdown.tokensMod.SyntaxKind.StringLiteral with Double = js.native
  
  @js.native
  sealed trait SymbolSet extends SyntaxKind
  /* 72 */ val SymbolSet: typings.grammarkdown.tokensMod.SyntaxKind.SymbolSet with Double = js.native
  
  @js.native
  sealed trait SymbolSpan extends SyntaxKind
  /* 71 */ val SymbolSpan: typings.grammarkdown.tokensMod.SyntaxKind.SymbolSpan with Double = js.native
  
  @js.native
  sealed trait Terminal
    extends SyntaxKind
       with OptionalSymbolKind
       with ProseFragmentKind
       with TextContentKind
  /* 50 */ val Terminal: typings.grammarkdown.tokensMod.SyntaxKind.Terminal with Double = js.native
  
  @js.native
  sealed trait ThroughKeyword
    extends KeywordKind
       with SyntaxKind
  /* 46 */ val ThroughKeyword: typings.grammarkdown.tokensMod.SyntaxKind.ThroughKeyword with Double = js.native
  
  @js.native
  sealed trait TildeToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
  /* 20 */ val TildeToken: typings.grammarkdown.tokensMod.SyntaxKind.TildeToken with Double = js.native
  
  @js.native
  sealed trait TrueKeyword
    extends KeywordKind
       with SyntaxKind
       with BooleanKind
  /* 47 */ val TrueKeyword: typings.grammarkdown.tokensMod.SyntaxKind.TrueKeyword with Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterLiteral
    extends SyntaxKind
       with OptionalSymbolKind
       with TextContentKind
  /* 51 */ val UnicodeCharacterLiteral: typings.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterLiteral with Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterRange
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 74 */ val UnicodeCharacterRange: typings.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterRange with Double = js.native
  
  @js.native
  sealed trait Unknown extends SyntaxKind
  /* 0 */ val Unknown: typings.grammarkdown.tokensMod.SyntaxKind.Unknown with Double = js.native
}
