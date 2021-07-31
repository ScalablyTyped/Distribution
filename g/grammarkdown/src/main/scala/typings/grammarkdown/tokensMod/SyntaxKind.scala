package typings.grammarkdown.tokensMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends StObject
@JSImport("grammarkdown/dist/tokens", "SyntaxKind")
@js.native
object SyntaxKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind & Double] = js.native
  
  @js.native
  sealed trait Argument
    extends StObject
       with SyntaxKind
  /* 64 */ val Argument: typings.grammarkdown.tokensMod.SyntaxKind.Argument & Double = js.native
  
  @js.native
  sealed trait ArgumentList
    extends StObject
       with SyntaxKind
  /* 65 */ val ArgumentList: typings.grammarkdown.tokensMod.SyntaxKind.ArgumentList & Double = js.native
  
  @js.native
  sealed trait AtToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 6 */ val AtToken: typings.grammarkdown.tokensMod.SyntaxKind.AtToken & Double = js.native
  
  @js.native
  sealed trait ButKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 30 */ val ButKeyword: typings.grammarkdown.tokensMod.SyntaxKind.ButKeyword & Double = js.native
  
  @js.native
  sealed trait ButNotSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 73 */ val ButNotSymbol: typings.grammarkdown.tokensMod.SyntaxKind.ButNotSymbol & Double = js.native
  
  @js.native
  sealed trait CloseBraceToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 8 */ val CloseBraceToken: typings.grammarkdown.tokensMod.SyntaxKind.CloseBraceToken & Double = js.native
  
  @js.native
  sealed trait CloseBracketToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 11 */ val CloseBracketToken: typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken & Double = js.native
  
  @js.native
  sealed trait CloseParenToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 14 */ val CloseParenToken: typings.grammarkdown.tokensMod.SyntaxKind.CloseParenToken & Double = js.native
  
  @js.native
  sealed trait ColonColonColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 17 */ val ColonColonColonToken: typings.grammarkdown.tokensMod.SyntaxKind.ColonColonColonToken & Double = js.native
  
  @js.native
  sealed trait ColonColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 16 */ val ColonColonToken: typings.grammarkdown.tokensMod.SyntaxKind.ColonColonToken & Double = js.native
  
  @js.native
  sealed trait ColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 15 */ val ColonToken: typings.grammarkdown.tokensMod.SyntaxKind.ColonToken & Double = js.native
  
  @js.native
  sealed trait CommaToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 18 */ val CommaToken: typings.grammarkdown.tokensMod.SyntaxKind.CommaToken & Double = js.native
  
  @js.native
  sealed trait Constraints
    extends StObject
       with SyntaxKind
  /* 70 */ val Constraints: typings.grammarkdown.tokensMod.SyntaxKind.Constraints & Double = js.native
  
  @js.native
  sealed trait DefaultKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 32 */ val DefaultKeyword: typings.grammarkdown.tokensMod.SyntaxKind.DefaultKeyword & Double = js.native
  
  @js.native
  sealed trait Define
    extends StObject
       with SyntaxKind
       with MetaElementKind
  /* 59 */ val Define: typings.grammarkdown.tokensMod.SyntaxKind.Define & Double = js.native
  
  @js.native
  sealed trait DefineKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 31 */ val DefineKeyword: typings.grammarkdown.tokensMod.SyntaxKind.DefineKeyword & Double = js.native
  
  @js.native
  sealed trait ElementOfToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 28 */ val ElementOfToken: typings.grammarkdown.tokensMod.SyntaxKind.ElementOfToken & Double = js.native
  
  @js.native
  sealed trait EmptyAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 79 */ val EmptyAssertion: typings.grammarkdown.tokensMod.SyntaxKind.EmptyAssertion & Double = js.native
  
  @js.native
  sealed trait EmptyKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 33 */ val EmptyKeyword: typings.grammarkdown.tokensMod.SyntaxKind.EmptyKeyword & Double = js.native
  
  @js.native
  sealed trait EndOfFileToken
    extends StObject
       with SyntaxKind
       with TokenKind
  /* 5 */ val EndOfFileToken: typings.grammarkdown.tokensMod.SyntaxKind.EndOfFileToken & Double = js.native
  
  @js.native
  sealed trait EqualsEqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 23 */ val EqualsEqualsToken: typings.grammarkdown.tokensMod.SyntaxKind.EqualsEqualsToken & Double = js.native
  
  @js.native
  sealed trait EqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 22 */ val EqualsToken: typings.grammarkdown.tokensMod.SyntaxKind.EqualsToken & Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 24 */ val ExclamationEqualsToken: typings.grammarkdown.tokensMod.SyntaxKind.ExclamationEqualsToken & Double = js.native
  
  @js.native
  sealed trait FalseKeyword
    extends StObject
       with SyntaxKind
       with BooleanKind
       with KeywordKind
  /* 34 */ val FalseKeyword: typings.grammarkdown.tokensMod.SyntaxKind.FalseKeyword & Double = js.native
  
  @js.native
  sealed trait FirstCommentTrivia
    extends StObject
       with SyntaxKind
  /* 1 */ val FirstCommentTrivia: typings.grammarkdown.tokensMod.SyntaxKind.FirstCommentTrivia & Double = js.native
  
  @js.native
  sealed trait FirstErrorNode
    extends StObject
       with SyntaxKind
  /* 84 */ val FirstErrorNode: typings.grammarkdown.tokensMod.SyntaxKind.FirstErrorNode & Double = js.native
  
  @js.native
  sealed trait FirstHtmlTrivia
    extends StObject
       with SyntaxKind
  /* 3 */ val FirstHtmlTrivia: typings.grammarkdown.tokensMod.SyntaxKind.FirstHtmlTrivia & Double = js.native
  
  @js.native
  sealed trait FirstKeyword
    extends StObject
       with SyntaxKind
  /* 30 */ val FirstKeyword: typings.grammarkdown.tokensMod.SyntaxKind.FirstKeyword & Double = js.native
  
  @js.native
  sealed trait FirstLiteral
    extends StObject
       with SyntaxKind
  /* 48 */ val FirstLiteral: typings.grammarkdown.tokensMod.SyntaxKind.FirstLiteral & Double = js.native
  
  @js.native
  sealed trait FirstProseFragmentLiteral
    extends StObject
       with SyntaxKind
  /* 52 */ val FirstProseFragmentLiteral: typings.grammarkdown.tokensMod.SyntaxKind.FirstProseFragmentLiteral & Double = js.native
  
  @js.native
  sealed trait FirstPunctuation
    extends StObject
       with SyntaxKind
  /* 6 */ val FirstPunctuation: typings.grammarkdown.tokensMod.SyntaxKind.FirstPunctuation & Double = js.native
  
  @js.native
  sealed trait FirstTextContent
    extends StObject
       with SyntaxKind
  /* 48 */ val FirstTextContent: typings.grammarkdown.tokensMod.SyntaxKind.FirstTextContent & Double = js.native
  
  @js.native
  sealed trait FirstToken
    extends StObject
       with SyntaxKind
  /* 5 */ val FirstToken: typings.grammarkdown.tokensMod.SyntaxKind.FirstToken & Double = js.native
  
  @js.native
  sealed trait FirstTrivia
    extends StObject
       with SyntaxKind
  /* 1 */ val FirstTrivia: typings.grammarkdown.tokensMod.SyntaxKind.FirstTrivia & Double = js.native
  
  @js.native
  sealed trait GoalKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 35 */ val GoalKeyword: typings.grammarkdown.tokensMod.SyntaxKind.GoalKeyword & Double = js.native
  
  @js.native
  sealed trait GreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 12 */ val GreaterThanToken: typings.grammarkdown.tokensMod.SyntaxKind.GreaterThanToken & Double = js.native
  
  @js.native
  sealed trait HereKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 36 */ val HereKeyword: typings.grammarkdown.tokensMod.SyntaxKind.HereKeyword & Double = js.native
  
  @js.native
  sealed trait HtmlCloseTagTrivia
    extends StObject
       with SyntaxKind
       with HtmlTriviaKind
  /* 4 */ val HtmlCloseTagTrivia: typings.grammarkdown.tokensMod.SyntaxKind.HtmlCloseTagTrivia & Double = js.native
  
  @js.native
  sealed trait HtmlOpenTagTrivia
    extends StObject
       with SyntaxKind
       with HtmlTriviaKind
  /* 3 */ val HtmlOpenTagTrivia: typings.grammarkdown.tokensMod.SyntaxKind.HtmlOpenTagTrivia & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 56 */ val Identifier: typings.grammarkdown.tokensMod.SyntaxKind.Identifier & Double = js.native
  
  @js.native
  sealed trait Import
    extends StObject
       with SyntaxKind
       with MetaElementKind
  /* 58 */ val Import: typings.grammarkdown.tokensMod.SyntaxKind.Import & Double = js.native
  
  @js.native
  sealed trait ImportKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 37 */ val ImportKeyword: typings.grammarkdown.tokensMod.SyntaxKind.ImportKeyword & Double = js.native
  
  @js.native
  sealed trait InvalidAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 85 */ val InvalidAssertion: typings.grammarkdown.tokensMod.SyntaxKind.InvalidAssertion & Double = js.native
  
  @js.native
  sealed trait InvalidSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 84 */ val InvalidSymbol: typings.grammarkdown.tokensMod.SyntaxKind.InvalidSymbol & Double = js.native
  
  @js.native
  sealed trait LastCommentTrivia
    extends StObject
       with SyntaxKind
  /* 2 */ val LastCommentTrivia: typings.grammarkdown.tokensMod.SyntaxKind.LastCommentTrivia & Double = js.native
  
  @js.native
  sealed trait LastErrorNode
    extends StObject
       with SyntaxKind
  /* 85 */ val LastErrorNode: typings.grammarkdown.tokensMod.SyntaxKind.LastErrorNode & Double = js.native
  
  @js.native
  sealed trait LastHtmlTrivia
    extends StObject
       with SyntaxKind
  /* 4 */ val LastHtmlTrivia: typings.grammarkdown.tokensMod.SyntaxKind.LastHtmlTrivia & Double = js.native
  
  @js.native
  sealed trait LastKeyword
    extends StObject
       with SyntaxKind
  /* 47 */ val LastKeyword: typings.grammarkdown.tokensMod.SyntaxKind.LastKeyword & Double = js.native
  
  @js.native
  sealed trait LastLiteral
    extends StObject
       with SyntaxKind
  /* 51 */ val LastLiteral: typings.grammarkdown.tokensMod.SyntaxKind.LastLiteral & Double = js.native
  
  @js.native
  sealed trait LastProseFragmentLiteral
    extends StObject
       with SyntaxKind
  /* 55 */ val LastProseFragmentLiteral: typings.grammarkdown.tokensMod.SyntaxKind.LastProseFragmentLiteral & Double = js.native
  
  @js.native
  sealed trait LastPunctuation
    extends StObject
       with SyntaxKind
  /* 29 */ val LastPunctuation: typings.grammarkdown.tokensMod.SyntaxKind.LastPunctuation & Double = js.native
  
  @js.native
  sealed trait LastTextContent
    extends StObject
       with SyntaxKind
  /* 55 */ val LastTextContent: typings.grammarkdown.tokensMod.SyntaxKind.LastTextContent & Double = js.native
  
  @js.native
  sealed trait LastToken
    extends StObject
       with SyntaxKind
  /* 47 */ val LastToken: typings.grammarkdown.tokensMod.SyntaxKind.LastToken & Double = js.native
  
  @js.native
  sealed trait LastTrivia
    extends StObject
       with SyntaxKind
  /* 4 */ val LastTrivia: typings.grammarkdown.tokensMod.SyntaxKind.LastTrivia & Double = js.native
  
  @js.native
  sealed trait LessThanExclamationToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 25 */ val LessThanExclamationToken: typings.grammarkdown.tokensMod.SyntaxKind.LessThanExclamationToken & Double = js.native
  
  @js.native
  sealed trait LessThanMinusToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 26 */ val LessThanMinusToken: typings.grammarkdown.tokensMod.SyntaxKind.LessThanMinusToken & Double = js.native
  
  @js.native
  sealed trait LexicalGoalAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 81 */ val LexicalGoalAssertion: typings.grammarkdown.tokensMod.SyntaxKind.LexicalGoalAssertion & Double = js.native
  
  @js.native
  sealed trait LexicalKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 38 */ val LexicalKeyword: typings.grammarkdown.tokensMod.SyntaxKind.LexicalKeyword & Double = js.native
  
  @js.native
  sealed trait Line
    extends StObject
       with SyntaxKind
       with MetaElementKind
  /* 60 */ val Line: typings.grammarkdown.tokensMod.SyntaxKind.Line & Double = js.native
  
  @js.native
  sealed trait LineKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 39 */ val LineKeyword: typings.grammarkdown.tokensMod.SyntaxKind.LineKeyword & Double = js.native
  
  @js.native
  sealed trait LinkReference
    extends StObject
       with SyntaxKind
  /* 66 */ val LinkReference: typings.grammarkdown.tokensMod.SyntaxKind.LinkReference & Double = js.native
  
  @js.native
  sealed trait LookaheadAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 80 */ val LookaheadAssertion: typings.grammarkdown.tokensMod.SyntaxKind.LookaheadAssertion & Double = js.native
  
  @js.native
  sealed trait LookaheadKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 40 */ val LookaheadKeyword: typings.grammarkdown.tokensMod.SyntaxKind.LookaheadKeyword & Double = js.native
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentTriviaKind
  /* 2 */ val MultiLineCommentTrivia: typings.grammarkdown.tokensMod.SyntaxKind.MultiLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait NoKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 41 */ val NoKeyword: typings.grammarkdown.tokensMod.SyntaxKind.NoKeyword & Double = js.native
  
  @js.native
  sealed trait NoSymbolHereAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 82 */ val NoSymbolHereAssertion: typings.grammarkdown.tokensMod.SyntaxKind.NoSymbolHereAssertion & Double = js.native
  
  @js.native
  sealed trait Nonterminal
    extends StObject
       with SyntaxKind
       with OptionalSymbolKind
       with ProseFragmentKind
  /* 77 */ val Nonterminal: typings.grammarkdown.tokensMod.SyntaxKind.Nonterminal & Double = js.native
  
  @js.native
  sealed trait NotAnElementOfToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 29 */ val NotAnElementOfToken: typings.grammarkdown.tokensMod.SyntaxKind.NotAnElementOfToken & Double = js.native
  
  @js.native
  sealed trait NotEqualToToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 27 */ val NotEqualToToken: typings.grammarkdown.tokensMod.SyntaxKind.NotEqualToToken & Double = js.native
  
  @js.native
  sealed trait NotKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 42 */ val NotKeyword: typings.grammarkdown.tokensMod.SyntaxKind.NotKeyword & Double = js.native
  
  @js.native
  sealed trait NumberLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 49 */ val NumberLiteral: typings.grammarkdown.tokensMod.SyntaxKind.NumberLiteral & Double = js.native
  
  @js.native
  sealed trait OfKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 43 */ val OfKeyword: typings.grammarkdown.tokensMod.SyntaxKind.OfKeyword & Double = js.native
  
  @js.native
  sealed trait OneKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 44 */ val OneKeyword: typings.grammarkdown.tokensMod.SyntaxKind.OneKeyword & Double = js.native
  
  @js.native
  sealed trait OneOfList
    extends StObject
       with SyntaxKind
       with ProductionBodyKind
  /* 67 */ val OneOfList: typings.grammarkdown.tokensMod.SyntaxKind.OneOfList & Double = js.native
  
  @js.native
  sealed trait OneOfSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 75 */ val OneOfSymbol: typings.grammarkdown.tokensMod.SyntaxKind.OneOfSymbol & Double = js.native
  
  @js.native
  sealed trait OpenBraceToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 7 */ val OpenBraceToken: typings.grammarkdown.tokensMod.SyntaxKind.OpenBraceToken & Double = js.native
  
  @js.native
  sealed trait OpenBracketGreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 10 */ val OpenBracketGreaterThanToken: typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken & Double = js.native
  
  @js.native
  sealed trait OpenBracketToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 9 */ val OpenBracketToken: typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken & Double = js.native
  
  @js.native
  sealed trait OpenParenToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 13 */ val OpenParenToken: typings.grammarkdown.tokensMod.SyntaxKind.OpenParenToken & Double = js.native
  
  @js.native
  sealed trait OrKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 45 */ val OrKeyword: typings.grammarkdown.tokensMod.SyntaxKind.OrKeyword & Double = js.native
  
  @js.native
  sealed trait Parameter
    extends StObject
       with SyntaxKind
  /* 62 */ val Parameter: typings.grammarkdown.tokensMod.SyntaxKind.Parameter & Double = js.native
  
  @js.native
  sealed trait ParameterList
    extends StObject
       with SyntaxKind
  /* 63 */ val ParameterList: typings.grammarkdown.tokensMod.SyntaxKind.ParameterList & Double = js.native
  
  @js.native
  sealed trait PlaceholderSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 76 */ val PlaceholderSymbol: typings.grammarkdown.tokensMod.SyntaxKind.PlaceholderSymbol & Double = js.native
  
  @js.native
  sealed trait PlusToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
       with PunctuationKind
  /* 19 */ val PlusToken: typings.grammarkdown.tokensMod.SyntaxKind.PlusToken & Double = js.native
  
  @js.native
  sealed trait Production
    extends StObject
       with SyntaxKind
       with SourceElementKind
  /* 61 */ val Production: typings.grammarkdown.tokensMod.SyntaxKind.Production & Double = js.native
  
  @js.native
  sealed trait Prose
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 78 */ val Prose: typings.grammarkdown.tokensMod.SyntaxKind.Prose & Double = js.native
  
  @js.native
  sealed trait ProseAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 83 */ val ProseAssertion: typings.grammarkdown.tokensMod.SyntaxKind.ProseAssertion & Double = js.native
  
  @js.native
  sealed trait ProseFull
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 55 */ val ProseFull: typings.grammarkdown.tokensMod.SyntaxKind.ProseFull & Double = js.native
  
  @js.native
  sealed trait ProseHead
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 52 */ val ProseHead: typings.grammarkdown.tokensMod.SyntaxKind.ProseHead & Double = js.native
  
  @js.native
  sealed trait ProseMiddle
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 53 */ val ProseMiddle: typings.grammarkdown.tokensMod.SyntaxKind.ProseMiddle & Double = js.native
  
  @js.native
  sealed trait ProseTail
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 54 */ val ProseTail: typings.grammarkdown.tokensMod.SyntaxKind.ProseTail & Double = js.native
  
  @js.native
  sealed trait QuestionToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with PunctuationKind
  /* 21 */ val QuestionToken: typings.grammarkdown.tokensMod.SyntaxKind.QuestionToken & Double = js.native
  
  @js.native
  sealed trait RightHandSide
    extends StObject
       with SyntaxKind
       with ProductionBodyKind
  /* 69 */ val RightHandSide: typings.grammarkdown.tokensMod.SyntaxKind.RightHandSide & Double = js.native
  
  @js.native
  sealed trait RightHandSideList
    extends StObject
       with SyntaxKind
       with ProductionBodyKind
  /* 68 */ val RightHandSideList: typings.grammarkdown.tokensMod.SyntaxKind.RightHandSideList & Double = js.native
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentTriviaKind
  /* 1 */ val SingleLineCommentTrivia: typings.grammarkdown.tokensMod.SyntaxKind.SingleLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait SourceFile
    extends StObject
       with SyntaxKind
  /* 57 */ val SourceFile: typings.grammarkdown.tokensMod.SyntaxKind.SourceFile & Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 48 */ val StringLiteral: typings.grammarkdown.tokensMod.SyntaxKind.StringLiteral & Double = js.native
  
  @js.native
  sealed trait SymbolSet
    extends StObject
       with SyntaxKind
  /* 72 */ val SymbolSet: typings.grammarkdown.tokensMod.SyntaxKind.SymbolSet & Double = js.native
  
  @js.native
  sealed trait SymbolSpan
    extends StObject
       with SyntaxKind
  /* 71 */ val SymbolSpan: typings.grammarkdown.tokensMod.SyntaxKind.SymbolSpan & Double = js.native
  
  @js.native
  sealed trait Terminal
    extends StObject
       with SyntaxKind
       with OptionalSymbolKind
       with ProseFragmentKind
       with TextContentKind
  /* 50 */ val Terminal: typings.grammarkdown.tokensMod.SyntaxKind.Terminal & Double = js.native
  
  @js.native
  sealed trait ThroughKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 46 */ val ThroughKeyword: typings.grammarkdown.tokensMod.SyntaxKind.ThroughKeyword & Double = js.native
  
  @js.native
  sealed trait TildeToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
       with PunctuationKind
  /* 20 */ val TildeToken: typings.grammarkdown.tokensMod.SyntaxKind.TildeToken & Double = js.native
  
  @js.native
  sealed trait TrueKeyword
    extends StObject
       with SyntaxKind
       with BooleanKind
       with KeywordKind
  /* 47 */ val TrueKeyword: typings.grammarkdown.tokensMod.SyntaxKind.TrueKeyword & Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterLiteral
    extends StObject
       with SyntaxKind
       with OptionalSymbolKind
       with TextContentKind
  /* 51 */ val UnicodeCharacterLiteral: typings.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterLiteral & Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterRange
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 74 */ val UnicodeCharacterRange: typings.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterRange & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with SyntaxKind
  /* 0 */ val Unknown: typings.grammarkdown.tokensMod.SyntaxKind.Unknown & Double = js.native
}
