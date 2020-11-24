package typings.grammarkdown.tokensMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends js.Object
@JSImport("grammarkdown/dist/tokens", "SyntaxKind")
@js.native
object SyntaxKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind with Double] = js.native
  
  @js.native
  sealed trait Argument extends SyntaxKind
  /* 64 */ @js.native
  object Argument extends TopLevel[Argument with Double]
  
  @js.native
  sealed trait ArgumentList extends SyntaxKind
  /* 65 */ @js.native
  object ArgumentList extends TopLevel[ArgumentList with Double]
  
  @js.native
  sealed trait AtToken
    extends PunctuationKind
       with SyntaxKind
  /* 6 */ @js.native
  object AtToken extends TopLevel[AtToken with Double]
  
  @js.native
  sealed trait ButKeyword
    extends KeywordKind
       with SyntaxKind
  /* 30 */ @js.native
  object ButKeyword extends TopLevel[ButKeyword with Double]
  
  @js.native
  sealed trait ButNotSymbol
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 73 */ @js.native
  object ButNotSymbol extends TopLevel[ButNotSymbol with Double]
  
  @js.native
  sealed trait CloseBraceToken
    extends PunctuationKind
       with SyntaxKind
  /* 8 */ @js.native
  object CloseBraceToken extends TopLevel[CloseBraceToken with Double]
  
  @js.native
  sealed trait CloseBracketToken
    extends PunctuationKind
       with SyntaxKind
  /* 11 */ @js.native
  object CloseBracketToken extends TopLevel[CloseBracketToken with Double]
  
  @js.native
  sealed trait CloseParenToken
    extends PunctuationKind
       with SyntaxKind
  /* 14 */ @js.native
  object CloseParenToken extends TopLevel[CloseParenToken with Double]
  
  @js.native
  sealed trait ColonColonColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 17 */ @js.native
  object ColonColonColonToken extends TopLevel[ColonColonColonToken with Double]
  
  @js.native
  sealed trait ColonColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 16 */ @js.native
  object ColonColonToken extends TopLevel[ColonColonToken with Double]
  
  @js.native
  sealed trait ColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 15 */ @js.native
  object ColonToken extends TopLevel[ColonToken with Double]
  
  @js.native
  sealed trait CommaToken
    extends PunctuationKind
       with SyntaxKind
  /* 18 */ @js.native
  object CommaToken extends TopLevel[CommaToken with Double]
  
  @js.native
  sealed trait Constraints extends SyntaxKind
  /* 70 */ @js.native
  object Constraints extends TopLevel[Constraints with Double]
  
  @js.native
  sealed trait DefaultKeyword
    extends KeywordKind
       with SyntaxKind
  /* 32 */ @js.native
  object DefaultKeyword extends TopLevel[DefaultKeyword with Double]
  
  @js.native
  sealed trait Define
    extends MetaElementKind
       with SyntaxKind
  /* 59 */ @js.native
  object Define extends TopLevel[Define with Double]
  
  @js.native
  sealed trait DefineKeyword
    extends KeywordKind
       with SyntaxKind
  /* 31 */ @js.native
  object DefineKeyword extends TopLevel[DefineKeyword with Double]
  
  @js.native
  sealed trait ElementOfToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 28 */ @js.native
  object ElementOfToken extends TopLevel[ElementOfToken with Double]
  
  @js.native
  sealed trait EmptyAssertion
    extends AssertionKind
       with SyntaxKind
  /* 79 */ @js.native
  object EmptyAssertion extends TopLevel[EmptyAssertion with Double]
  
  @js.native
  sealed trait EmptyKeyword
    extends KeywordKind
       with SyntaxKind
  /* 33 */ @js.native
  object EmptyKeyword extends TopLevel[EmptyKeyword with Double]
  
  @js.native
  sealed trait EndOfFileToken
    extends SyntaxKind
       with TokenKind
  /* 5 */ @js.native
  object EndOfFileToken extends TopLevel[EndOfFileToken with Double]
  
  @js.native
  sealed trait EqualsEqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 23 */ @js.native
  object EqualsEqualsToken extends TopLevel[EqualsEqualsToken with Double]
  
  @js.native
  sealed trait EqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 22 */ @js.native
  object EqualsToken extends TopLevel[EqualsToken with Double]
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 24 */ @js.native
  object ExclamationEqualsToken extends TopLevel[ExclamationEqualsToken with Double]
  
  @js.native
  sealed trait FalseKeyword
    extends KeywordKind
       with SyntaxKind
       with BooleanKind
  /* 34 */ @js.native
  object FalseKeyword extends TopLevel[FalseKeyword with Double]
  
  @js.native
  sealed trait FirstCommentTrivia extends SyntaxKind
  /* 1 */ @js.native
  object FirstCommentTrivia extends TopLevel[FirstCommentTrivia with Double]
  
  @js.native
  sealed trait FirstErrorNode extends SyntaxKind
  /* 84 */ @js.native
  object FirstErrorNode extends TopLevel[FirstErrorNode with Double]
  
  @js.native
  sealed trait FirstHtmlTrivia extends SyntaxKind
  /* 3 */ @js.native
  object FirstHtmlTrivia extends TopLevel[FirstHtmlTrivia with Double]
  
  @js.native
  sealed trait FirstKeyword extends SyntaxKind
  /* 30 */ @js.native
  object FirstKeyword extends TopLevel[FirstKeyword with Double]
  
  @js.native
  sealed trait FirstLiteral extends SyntaxKind
  /* 48 */ @js.native
  object FirstLiteral extends TopLevel[FirstLiteral with Double]
  
  @js.native
  sealed trait FirstProseFragmentLiteral extends SyntaxKind
  /* 52 */ @js.native
  object FirstProseFragmentLiteral extends TopLevel[FirstProseFragmentLiteral with Double]
  
  @js.native
  sealed trait FirstPunctuation extends SyntaxKind
  /* 6 */ @js.native
  object FirstPunctuation extends TopLevel[FirstPunctuation with Double]
  
  @js.native
  sealed trait FirstTextContent extends SyntaxKind
  /* 48 */ @js.native
  object FirstTextContent extends TopLevel[FirstTextContent with Double]
  
  @js.native
  sealed trait FirstToken extends SyntaxKind
  /* 5 */ @js.native
  object FirstToken extends TopLevel[FirstToken with Double]
  
  @js.native
  sealed trait FirstTrivia extends SyntaxKind
  /* 1 */ @js.native
  object FirstTrivia extends TopLevel[FirstTrivia with Double]
  
  @js.native
  sealed trait GoalKeyword
    extends KeywordKind
       with SyntaxKind
  /* 35 */ @js.native
  object GoalKeyword extends TopLevel[GoalKeyword with Double]
  
  @js.native
  sealed trait GreaterThanToken
    extends PunctuationKind
       with SyntaxKind
  /* 12 */ @js.native
  object GreaterThanToken extends TopLevel[GreaterThanToken with Double]
  
  @js.native
  sealed trait HereKeyword
    extends KeywordKind
       with SyntaxKind
  /* 36 */ @js.native
  object HereKeyword extends TopLevel[HereKeyword with Double]
  
  @js.native
  sealed trait HtmlCloseTagTrivia
    extends HtmlTriviaKind
       with SyntaxKind
  /* 4 */ @js.native
  object HtmlCloseTagTrivia extends TopLevel[HtmlCloseTagTrivia with Double]
  
  @js.native
  sealed trait HtmlOpenTagTrivia
    extends HtmlTriviaKind
       with SyntaxKind
  /* 3 */ @js.native
  object HtmlOpenTagTrivia extends TopLevel[HtmlOpenTagTrivia with Double]
  
  @js.native
  sealed trait Identifier
    extends SyntaxKind
       with TextContentKind
  /* 56 */ @js.native
  object Identifier extends TopLevel[Identifier with Double]
  
  @js.native
  sealed trait Import
    extends MetaElementKind
       with SyntaxKind
  /* 58 */ @js.native
  object Import extends TopLevel[Import with Double]
  
  @js.native
  sealed trait ImportKeyword
    extends KeywordKind
       with SyntaxKind
  /* 37 */ @js.native
  object ImportKeyword extends TopLevel[ImportKeyword with Double]
  
  @js.native
  sealed trait InvalidAssertion
    extends AssertionKind
       with SyntaxKind
  /* 85 */ @js.native
  object InvalidAssertion extends TopLevel[InvalidAssertion with Double]
  
  @js.native
  sealed trait InvalidSymbol
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 84 */ @js.native
  object InvalidSymbol extends TopLevel[InvalidSymbol with Double]
  
  @js.native
  sealed trait LastCommentTrivia extends SyntaxKind
  /* 2 */ @js.native
  object LastCommentTrivia extends TopLevel[LastCommentTrivia with Double]
  
  @js.native
  sealed trait LastErrorNode extends SyntaxKind
  /* 85 */ @js.native
  object LastErrorNode extends TopLevel[LastErrorNode with Double]
  
  @js.native
  sealed trait LastHtmlTrivia extends SyntaxKind
  /* 4 */ @js.native
  object LastHtmlTrivia extends TopLevel[LastHtmlTrivia with Double]
  
  @js.native
  sealed trait LastKeyword extends SyntaxKind
  /* 47 */ @js.native
  object LastKeyword extends TopLevel[LastKeyword with Double]
  
  @js.native
  sealed trait LastLiteral extends SyntaxKind
  /* 51 */ @js.native
  object LastLiteral extends TopLevel[LastLiteral with Double]
  
  @js.native
  sealed trait LastProseFragmentLiteral extends SyntaxKind
  /* 55 */ @js.native
  object LastProseFragmentLiteral extends TopLevel[LastProseFragmentLiteral with Double]
  
  @js.native
  sealed trait LastPunctuation extends SyntaxKind
  /* 29 */ @js.native
  object LastPunctuation extends TopLevel[LastPunctuation with Double]
  
  @js.native
  sealed trait LastTextContent extends SyntaxKind
  /* 55 */ @js.native
  object LastTextContent extends TopLevel[LastTextContent with Double]
  
  @js.native
  sealed trait LastToken extends SyntaxKind
  /* 47 */ @js.native
  object LastToken extends TopLevel[LastToken with Double]
  
  @js.native
  sealed trait LastTrivia extends SyntaxKind
  /* 4 */ @js.native
  object LastTrivia extends TopLevel[LastTrivia with Double]
  
  @js.native
  sealed trait LessThanExclamationToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 25 */ @js.native
  object LessThanExclamationToken extends TopLevel[LessThanExclamationToken with Double]
  
  @js.native
  sealed trait LessThanMinusToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 26 */ @js.native
  object LessThanMinusToken extends TopLevel[LessThanMinusToken with Double]
  
  @js.native
  sealed trait LexicalGoalAssertion
    extends AssertionKind
       with SyntaxKind
  /* 81 */ @js.native
  object LexicalGoalAssertion extends TopLevel[LexicalGoalAssertion with Double]
  
  @js.native
  sealed trait LexicalKeyword
    extends KeywordKind
       with SyntaxKind
  /* 38 */ @js.native
  object LexicalKeyword extends TopLevel[LexicalKeyword with Double]
  
  @js.native
  sealed trait Line
    extends MetaElementKind
       with SyntaxKind
  /* 60 */ @js.native
  object Line extends TopLevel[Line with Double]
  
  @js.native
  sealed trait LineKeyword
    extends KeywordKind
       with SyntaxKind
  /* 39 */ @js.native
  object LineKeyword extends TopLevel[LineKeyword with Double]
  
  @js.native
  sealed trait LinkReference extends SyntaxKind
  /* 66 */ @js.native
  object LinkReference extends TopLevel[LinkReference with Double]
  
  @js.native
  sealed trait LookaheadAssertion
    extends AssertionKind
       with SyntaxKind
  /* 80 */ @js.native
  object LookaheadAssertion extends TopLevel[LookaheadAssertion with Double]
  
  @js.native
  sealed trait LookaheadKeyword
    extends KeywordKind
       with SyntaxKind
  /* 40 */ @js.native
  object LookaheadKeyword extends TopLevel[LookaheadKeyword with Double]
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends CommentTriviaKind
       with SyntaxKind
  /* 2 */ @js.native
  object MultiLineCommentTrivia extends TopLevel[MultiLineCommentTrivia with Double]
  
  @js.native
  sealed trait NoKeyword
    extends KeywordKind
       with SyntaxKind
  /* 41 */ @js.native
  object NoKeyword extends TopLevel[NoKeyword with Double]
  
  @js.native
  sealed trait NoSymbolHereAssertion
    extends AssertionKind
       with SyntaxKind
  /* 82 */ @js.native
  object NoSymbolHereAssertion extends TopLevel[NoSymbolHereAssertion with Double]
  
  @js.native
  sealed trait Nonterminal
    extends SyntaxKind
       with OptionalSymbolKind
       with ProseFragmentKind
  /* 77 */ @js.native
  object Nonterminal extends TopLevel[Nonterminal with Double]
  
  @js.native
  sealed trait NotAnElementOfToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 29 */ @js.native
  object NotAnElementOfToken extends TopLevel[NotAnElementOfToken with Double]
  
  @js.native
  sealed trait NotEqualToToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 27 */ @js.native
  object NotEqualToToken extends TopLevel[NotEqualToToken with Double]
  
  @js.native
  sealed trait NotKeyword
    extends KeywordKind
       with SyntaxKind
  /* 42 */ @js.native
  object NotKeyword extends TopLevel[NotKeyword with Double]
  
  @js.native
  sealed trait NumberLiteral
    extends SyntaxKind
       with TextContentKind
  /* 49 */ @js.native
  object NumberLiteral extends TopLevel[NumberLiteral with Double]
  
  @js.native
  sealed trait OfKeyword
    extends KeywordKind
       with SyntaxKind
  /* 43 */ @js.native
  object OfKeyword extends TopLevel[OfKeyword with Double]
  
  @js.native
  sealed trait OneKeyword
    extends KeywordKind
       with SyntaxKind
  /* 44 */ @js.native
  object OneKeyword extends TopLevel[OneKeyword with Double]
  
  @js.native
  sealed trait OneOfList
    extends SyntaxKind
       with ProductionBodyKind
  /* 67 */ @js.native
  object OneOfList extends TopLevel[OneOfList with Double]
  
  @js.native
  sealed trait OneOfSymbol
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 75 */ @js.native
  object OneOfSymbol extends TopLevel[OneOfSymbol with Double]
  
  @js.native
  sealed trait OpenBraceToken
    extends PunctuationKind
       with SyntaxKind
  /* 7 */ @js.native
  object OpenBraceToken extends TopLevel[OpenBraceToken with Double]
  
  @js.native
  sealed trait OpenBracketGreaterThanToken
    extends PunctuationKind
       with SyntaxKind
  /* 10 */ @js.native
  object OpenBracketGreaterThanToken extends TopLevel[OpenBracketGreaterThanToken with Double]
  
  @js.native
  sealed trait OpenBracketToken
    extends PunctuationKind
       with SyntaxKind
  /* 9 */ @js.native
  object OpenBracketToken extends TopLevel[OpenBracketToken with Double]
  
  @js.native
  sealed trait OpenParenToken
    extends PunctuationKind
       with SyntaxKind
  /* 13 */ @js.native
  object OpenParenToken extends TopLevel[OpenParenToken with Double]
  
  @js.native
  sealed trait OrKeyword
    extends KeywordKind
       with SyntaxKind
  /* 45 */ @js.native
  object OrKeyword extends TopLevel[OrKeyword with Double]
  
  @js.native
  sealed trait Parameter extends SyntaxKind
  /* 62 */ @js.native
  object Parameter extends TopLevel[Parameter with Double]
  
  @js.native
  sealed trait ParameterList extends SyntaxKind
  /* 63 */ @js.native
  object ParameterList extends TopLevel[ParameterList with Double]
  
  @js.native
  sealed trait PlaceholderSymbol
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 76 */ @js.native
  object PlaceholderSymbol extends TopLevel[PlaceholderSymbol with Double]
  
  @js.native
  sealed trait PlusToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
  /* 19 */ @js.native
  object PlusToken extends TopLevel[PlusToken with Double]
  
  @js.native
  sealed trait Production
    extends SyntaxKind
       with SourceElementKind
  /* 61 */ @js.native
  object Production extends TopLevel[Production with Double]
  
  @js.native
  sealed trait Prose
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 78 */ @js.native
  object Prose extends TopLevel[Prose with Double]
  
  @js.native
  sealed trait ProseAssertion
    extends AssertionKind
       with SyntaxKind
  /* 83 */ @js.native
  object ProseAssertion extends TopLevel[ProseAssertion with Double]
  
  @js.native
  sealed trait ProseFull
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 55 */ @js.native
  object ProseFull extends TopLevel[ProseFull with Double]
  
  @js.native
  sealed trait ProseHead
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 52 */ @js.native
  object ProseHead extends TopLevel[ProseHead with Double]
  
  @js.native
  sealed trait ProseMiddle
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 53 */ @js.native
  object ProseMiddle extends TopLevel[ProseMiddle with Double]
  
  @js.native
  sealed trait ProseTail
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 54 */ @js.native
  object ProseTail extends TopLevel[ProseTail with Double]
  
  @js.native
  sealed trait QuestionToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
  /* 21 */ @js.native
  object QuestionToken extends TopLevel[QuestionToken with Double]
  
  @js.native
  sealed trait RightHandSide
    extends SyntaxKind
       with ProductionBodyKind
  /* 69 */ @js.native
  object RightHandSide extends TopLevel[RightHandSide with Double]
  
  @js.native
  sealed trait RightHandSideList
    extends SyntaxKind
       with ProductionBodyKind
  /* 68 */ @js.native
  object RightHandSideList extends TopLevel[RightHandSideList with Double]
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends CommentTriviaKind
       with SyntaxKind
  /* 1 */ @js.native
  object SingleLineCommentTrivia extends TopLevel[SingleLineCommentTrivia with Double]
  
  @js.native
  sealed trait SourceFile extends SyntaxKind
  /* 57 */ @js.native
  object SourceFile extends TopLevel[SourceFile with Double]
  
  @js.native
  sealed trait StringLiteral
    extends SyntaxKind
       with TextContentKind
  /* 48 */ @js.native
  object StringLiteral extends TopLevel[StringLiteral with Double]
  
  @js.native
  sealed trait SymbolSet extends SyntaxKind
  /* 72 */ @js.native
  object SymbolSet extends TopLevel[SymbolSet with Double]
  
  @js.native
  sealed trait SymbolSpan extends SyntaxKind
  /* 71 */ @js.native
  object SymbolSpan extends TopLevel[SymbolSpan with Double]
  
  @js.native
  sealed trait Terminal
    extends SyntaxKind
       with OptionalSymbolKind
       with ProseFragmentKind
       with TextContentKind
  /* 50 */ @js.native
  object Terminal extends TopLevel[Terminal with Double]
  
  @js.native
  sealed trait ThroughKeyword
    extends KeywordKind
       with SyntaxKind
  /* 46 */ @js.native
  object ThroughKeyword extends TopLevel[ThroughKeyword with Double]
  
  @js.native
  sealed trait TildeToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
  /* 20 */ @js.native
  object TildeToken extends TopLevel[TildeToken with Double]
  
  @js.native
  sealed trait TrueKeyword
    extends KeywordKind
       with SyntaxKind
       with BooleanKind
  /* 47 */ @js.native
  object TrueKeyword extends TopLevel[TrueKeyword with Double]
  
  @js.native
  sealed trait UnicodeCharacterLiteral
    extends SyntaxKind
       with OptionalSymbolKind
       with TextContentKind
  /* 51 */ @js.native
  object UnicodeCharacterLiteral extends TopLevel[UnicodeCharacterLiteral with Double]
  
  @js.native
  sealed trait UnicodeCharacterRange
    extends SyntaxKind
       with _LexicalSymbolKind
  /* 74 */ @js.native
  object UnicodeCharacterRange extends TopLevel[UnicodeCharacterRange with Double]
  
  @js.native
  sealed trait Unknown extends SyntaxKind
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
