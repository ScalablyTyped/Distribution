package typings.grammarkdown.distTokensMod

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
  /* 65 */ val Argument: typings.grammarkdown.distTokensMod.SyntaxKind.Argument & Double = js.native
  
  @js.native
  sealed trait ArgumentList
    extends StObject
       with SyntaxKind
  /* 66 */ val ArgumentList: typings.grammarkdown.distTokensMod.SyntaxKind.ArgumentList & Double = js.native
  
  @js.native
  sealed trait AtToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 7 */ val AtToken: typings.grammarkdown.distTokensMod.SyntaxKind.AtToken & Double = js.native
  
  @js.native
  sealed trait ButKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 31 */ val ButKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.ButKeyword & Double = js.native
  
  @js.native
  sealed trait ButNotSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 74 */ val ButNotSymbol: typings.grammarkdown.distTokensMod.SyntaxKind.ButNotSymbol & Double = js.native
  
  @js.native
  sealed trait CloseBraceToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 9 */ val CloseBraceToken: typings.grammarkdown.distTokensMod.SyntaxKind.CloseBraceToken & Double = js.native
  
  @js.native
  sealed trait CloseBracketToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 12 */ val CloseBracketToken: typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken & Double = js.native
  
  @js.native
  sealed trait CloseParenToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 15 */ val CloseParenToken: typings.grammarkdown.distTokensMod.SyntaxKind.CloseParenToken & Double = js.native
  
  @js.native
  sealed trait ColonColonColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 18 */ val ColonColonColonToken: typings.grammarkdown.distTokensMod.SyntaxKind.ColonColonColonToken & Double = js.native
  
  @js.native
  sealed trait ColonColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 17 */ val ColonColonToken: typings.grammarkdown.distTokensMod.SyntaxKind.ColonColonToken & Double = js.native
  
  @js.native
  sealed trait ColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 16 */ val ColonToken: typings.grammarkdown.distTokensMod.SyntaxKind.ColonToken & Double = js.native
  
  @js.native
  sealed trait CommaToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 19 */ val CommaToken: typings.grammarkdown.distTokensMod.SyntaxKind.CommaToken & Double = js.native
  
  @js.native
  sealed trait Constraints
    extends StObject
       with SyntaxKind
  /* 71 */ val Constraints: typings.grammarkdown.distTokensMod.SyntaxKind.Constraints & Double = js.native
  
  @js.native
  sealed trait DefaultKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 33 */ val DefaultKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.DefaultKeyword & Double = js.native
  
  @js.native
  sealed trait Define
    extends StObject
       with SyntaxKind
       with MetaElementKind
  /* 60 */ val Define: typings.grammarkdown.distTokensMod.SyntaxKind.Define & Double = js.native
  
  @js.native
  sealed trait DefineKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 32 */ val DefineKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.DefineKeyword & Double = js.native
  
  @js.native
  sealed trait ElementOfToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 29 */ val ElementOfToken: typings.grammarkdown.distTokensMod.SyntaxKind.ElementOfToken & Double = js.native
  
  @js.native
  sealed trait EmptyAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 81 */ val EmptyAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.EmptyAssertion & Double = js.native
  
  @js.native
  sealed trait EmptyKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 34 */ val EmptyKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.EmptyKeyword & Double = js.native
  
  @js.native
  sealed trait EndOfFileToken
    extends StObject
       with SyntaxKind
       with TokenKind
  /* 6 */ val EndOfFileToken: typings.grammarkdown.distTokensMod.SyntaxKind.EndOfFileToken & Double = js.native
  
  @js.native
  sealed trait EqualsEqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 24 */ val EqualsEqualsToken: typings.grammarkdown.distTokensMod.SyntaxKind.EqualsEqualsToken & Double = js.native
  
  @js.native
  sealed trait EqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 23 */ val EqualsToken: typings.grammarkdown.distTokensMod.SyntaxKind.EqualsToken & Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 25 */ val ExclamationEqualsToken: typings.grammarkdown.distTokensMod.SyntaxKind.ExclamationEqualsToken & Double = js.native
  
  @js.native
  sealed trait FalseKeyword
    extends StObject
       with SyntaxKind
       with BooleanKind
       with KeywordKind
  /* 35 */ val FalseKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.FalseKeyword & Double = js.native
  
  @js.native
  sealed trait FirstCommentTrivia
    extends StObject
       with SyntaxKind
  /* 1 */ val FirstCommentTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.FirstCommentTrivia & Double = js.native
  
  @js.native
  sealed trait FirstErrorNode
    extends StObject
       with SyntaxKind
  /* 86 */ val FirstErrorNode: typings.grammarkdown.distTokensMod.SyntaxKind.FirstErrorNode & Double = js.native
  
  @js.native
  sealed trait FirstHtmlTagTrivia
    extends StObject
       with SyntaxKind
  /* 4 */ val FirstHtmlTagTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.FirstHtmlTagTrivia & Double = js.native
  
  @js.native
  sealed trait FirstHtmlTrivia
    extends StObject
       with SyntaxKind
  /* 3 */ val FirstHtmlTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.FirstHtmlTrivia & Double = js.native
  
  @js.native
  sealed trait FirstKeyword
    extends StObject
       with SyntaxKind
  /* 31 */ val FirstKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.FirstKeyword & Double = js.native
  
  @js.native
  sealed trait FirstLiteral
    extends StObject
       with SyntaxKind
  /* 49 */ val FirstLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.FirstLiteral & Double = js.native
  
  @js.native
  sealed trait FirstProseFragmentLiteral
    extends StObject
       with SyntaxKind
  /* 53 */ val FirstProseFragmentLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.FirstProseFragmentLiteral & Double = js.native
  
  @js.native
  sealed trait FirstPunctuation
    extends StObject
       with SyntaxKind
  /* 7 */ val FirstPunctuation: typings.grammarkdown.distTokensMod.SyntaxKind.FirstPunctuation & Double = js.native
  
  @js.native
  sealed trait FirstTextContent
    extends StObject
       with SyntaxKind
  /* 49 */ val FirstTextContent: typings.grammarkdown.distTokensMod.SyntaxKind.FirstTextContent & Double = js.native
  
  @js.native
  sealed trait FirstToken
    extends StObject
       with SyntaxKind
  /* 6 */ val FirstToken: typings.grammarkdown.distTokensMod.SyntaxKind.FirstToken & Double = js.native
  
  @js.native
  sealed trait FirstTrivia
    extends StObject
       with SyntaxKind
  /* 1 */ val FirstTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.FirstTrivia & Double = js.native
  
  @js.native
  sealed trait GoalKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 36 */ val GoalKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.GoalKeyword & Double = js.native
  
  @js.native
  sealed trait GreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 13 */ val GreaterThanToken: typings.grammarkdown.distTokensMod.SyntaxKind.GreaterThanToken & Double = js.native
  
  @js.native
  sealed trait HereKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 37 */ val HereKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.HereKeyword & Double = js.native
  
  @js.native
  sealed trait HtmlCloseTagTrivia
    extends StObject
       with SyntaxKind
       with HtmlTagTriviaKind
       with HtmlTriviaKind
  /* 5 */ val HtmlCloseTagTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.HtmlCloseTagTrivia & Double = js.native
  
  @js.native
  sealed trait HtmlCommentTrivia
    extends StObject
       with SyntaxKind
       with HtmlTriviaKind
  /* 3 */ val HtmlCommentTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.HtmlCommentTrivia & Double = js.native
  
  @js.native
  sealed trait HtmlOpenTagTrivia
    extends StObject
       with SyntaxKind
       with HtmlTagTriviaKind
       with HtmlTriviaKind
  /* 4 */ val HtmlOpenTagTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.HtmlOpenTagTrivia & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 57 */ val Identifier: typings.grammarkdown.distTokensMod.SyntaxKind.Identifier & Double = js.native
  
  @js.native
  sealed trait Import
    extends StObject
       with SyntaxKind
       with MetaElementKind
  /* 59 */ val Import: typings.grammarkdown.distTokensMod.SyntaxKind.Import & Double = js.native
  
  @js.native
  sealed trait ImportKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 38 */ val ImportKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.ImportKeyword & Double = js.native
  
  @js.native
  sealed trait InvalidAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 87 */ val InvalidAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.InvalidAssertion & Double = js.native
  
  @js.native
  sealed trait InvalidSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 86 */ val InvalidSymbol: typings.grammarkdown.distTokensMod.SyntaxKind.InvalidSymbol & Double = js.native
  
  @js.native
  sealed trait LastCommentTrivia
    extends StObject
       with SyntaxKind
  /* 2 */ val LastCommentTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.LastCommentTrivia & Double = js.native
  
  @js.native
  sealed trait LastErrorNode
    extends StObject
       with SyntaxKind
  /* 87 */ val LastErrorNode: typings.grammarkdown.distTokensMod.SyntaxKind.LastErrorNode & Double = js.native
  
  @js.native
  sealed trait LastHtmlTagTrivia
    extends StObject
       with SyntaxKind
  /* 5 */ val LastHtmlTagTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.LastHtmlTagTrivia & Double = js.native
  
  @js.native
  sealed trait LastHtmlTrivia
    extends StObject
       with SyntaxKind
  /* 5 */ val LastHtmlTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.LastHtmlTrivia & Double = js.native
  
  @js.native
  sealed trait LastKeyword
    extends StObject
       with SyntaxKind
  /* 48 */ val LastKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.LastKeyword & Double = js.native
  
  @js.native
  sealed trait LastLiteral
    extends StObject
       with SyntaxKind
  /* 52 */ val LastLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.LastLiteral & Double = js.native
  
  @js.native
  sealed trait LastProseFragmentLiteral
    extends StObject
       with SyntaxKind
  /* 56 */ val LastProseFragmentLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.LastProseFragmentLiteral & Double = js.native
  
  @js.native
  sealed trait LastPunctuation
    extends StObject
       with SyntaxKind
  /* 30 */ val LastPunctuation: typings.grammarkdown.distTokensMod.SyntaxKind.LastPunctuation & Double = js.native
  
  @js.native
  sealed trait LastTextContent
    extends StObject
       with SyntaxKind
  /* 57 */ val LastTextContent: typings.grammarkdown.distTokensMod.SyntaxKind.LastTextContent & Double = js.native
  
  @js.native
  sealed trait LastToken
    extends StObject
       with SyntaxKind
  /* 48 */ val LastToken: typings.grammarkdown.distTokensMod.SyntaxKind.LastToken & Double = js.native
  
  @js.native
  sealed trait LastTrivia
    extends StObject
       with SyntaxKind
  /* 5 */ val LastTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.LastTrivia & Double = js.native
  
  @js.native
  sealed trait LessThanExclamationToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 26 */ val LessThanExclamationToken: typings.grammarkdown.distTokensMod.SyntaxKind.LessThanExclamationToken & Double = js.native
  
  @js.native
  sealed trait LessThanMinusToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 27 */ val LessThanMinusToken: typings.grammarkdown.distTokensMod.SyntaxKind.LessThanMinusToken & Double = js.native
  
  @js.native
  sealed trait LexicalGoalAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 83 */ val LexicalGoalAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.LexicalGoalAssertion & Double = js.native
  
  @js.native
  sealed trait LexicalKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 39 */ val LexicalKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.LexicalKeyword & Double = js.native
  
  @js.native
  sealed trait Line
    extends StObject
       with SyntaxKind
       with MetaElementKind
  /* 61 */ val Line: typings.grammarkdown.distTokensMod.SyntaxKind.Line & Double = js.native
  
  @js.native
  sealed trait LineKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 40 */ val LineKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.LineKeyword & Double = js.native
  
  @js.native
  sealed trait LinkReference
    extends StObject
       with SyntaxKind
  /* 67 */ val LinkReference: typings.grammarkdown.distTokensMod.SyntaxKind.LinkReference & Double = js.native
  
  @js.native
  sealed trait LookaheadAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 82 */ val LookaheadAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.LookaheadAssertion & Double = js.native
  
  @js.native
  sealed trait LookaheadKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 41 */ val LookaheadKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.LookaheadKeyword & Double = js.native
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentTriviaKind
  /* 2 */ val MultiLineCommentTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.MultiLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait NoKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 42 */ val NoKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.NoKeyword & Double = js.native
  
  @js.native
  sealed trait NoSymbolHereAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 84 */ val NoSymbolHereAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.NoSymbolHereAssertion & Double = js.native
  
  @js.native
  sealed trait Nonterminal
    extends StObject
       with SyntaxKind
       with OptionalSymbolKind
       with ProseFragmentKind
  /* 78 */ val Nonterminal: typings.grammarkdown.distTokensMod.SyntaxKind.Nonterminal & Double = js.native
  
  @js.native
  sealed trait NotAnElementOfToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 30 */ val NotAnElementOfToken: typings.grammarkdown.distTokensMod.SyntaxKind.NotAnElementOfToken & Double = js.native
  
  @js.native
  sealed trait NotEqualToToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 28 */ val NotEqualToToken: typings.grammarkdown.distTokensMod.SyntaxKind.NotEqualToToken & Double = js.native
  
  @js.native
  sealed trait NotKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 43 */ val NotKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.NotKeyword & Double = js.native
  
  @js.native
  sealed trait NumberLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 50 */ val NumberLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.NumberLiteral & Double = js.native
  
  @js.native
  sealed trait OfKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 44 */ val OfKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.OfKeyword & Double = js.native
  
  @js.native
  sealed trait OneKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 45 */ val OneKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.OneKeyword & Double = js.native
  
  @js.native
  sealed trait OneOfList
    extends StObject
       with SyntaxKind
       with ProductionBodyKind
  /* 68 */ val OneOfList: typings.grammarkdown.distTokensMod.SyntaxKind.OneOfList & Double = js.native
  
  @js.native
  sealed trait OneOfSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 76 */ val OneOfSymbol: typings.grammarkdown.distTokensMod.SyntaxKind.OneOfSymbol & Double = js.native
  
  @js.native
  sealed trait OpenBraceToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 8 */ val OpenBraceToken: typings.grammarkdown.distTokensMod.SyntaxKind.OpenBraceToken & Double = js.native
  
  @js.native
  sealed trait OpenBracketGreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 11 */ val OpenBracketGreaterThanToken: typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken & Double = js.native
  
  @js.native
  sealed trait OpenBracketToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 10 */ val OpenBracketToken: typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken & Double = js.native
  
  @js.native
  sealed trait OpenParenToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 14 */ val OpenParenToken: typings.grammarkdown.distTokensMod.SyntaxKind.OpenParenToken & Double = js.native
  
  @js.native
  sealed trait OrKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 46 */ val OrKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.OrKeyword & Double = js.native
  
  @js.native
  sealed trait Parameter
    extends StObject
       with SyntaxKind
  /* 63 */ val Parameter: typings.grammarkdown.distTokensMod.SyntaxKind.Parameter & Double = js.native
  
  @js.native
  sealed trait ParameterList
    extends StObject
       with SyntaxKind
  /* 64 */ val ParameterList: typings.grammarkdown.distTokensMod.SyntaxKind.ParameterList & Double = js.native
  
  @js.native
  sealed trait PlaceholderSymbol
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 77 */ val PlaceholderSymbol: typings.grammarkdown.distTokensMod.SyntaxKind.PlaceholderSymbol & Double = js.native
  
  @js.native
  sealed trait PlusToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
       with PunctuationKind
  /* 20 */ val PlusToken: typings.grammarkdown.distTokensMod.SyntaxKind.PlusToken & Double = js.native
  
  @js.native
  sealed trait Production
    extends StObject
       with SyntaxKind
       with SourceElementKind
  /* 62 */ val Production: typings.grammarkdown.distTokensMod.SyntaxKind.Production & Double = js.native
  
  @js.native
  sealed trait Prose
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 80 */ val Prose: typings.grammarkdown.distTokensMod.SyntaxKind.Prose & Double = js.native
  
  @js.native
  sealed trait ProseAssertion
    extends StObject
       with SyntaxKind
       with AssertionKind
  /* 85 */ val ProseAssertion: typings.grammarkdown.distTokensMod.SyntaxKind.ProseAssertion & Double = js.native
  
  @js.native
  sealed trait ProseFull
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 56 */ val ProseFull: typings.grammarkdown.distTokensMod.SyntaxKind.ProseFull & Double = js.native
  
  @js.native
  sealed trait ProseHead
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 53 */ val ProseHead: typings.grammarkdown.distTokensMod.SyntaxKind.ProseHead & Double = js.native
  
  @js.native
  sealed trait ProseMiddle
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 54 */ val ProseMiddle: typings.grammarkdown.distTokensMod.SyntaxKind.ProseMiddle & Double = js.native
  
  @js.native
  sealed trait ProseTail
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 55 */ val ProseTail: typings.grammarkdown.distTokensMod.SyntaxKind.ProseTail & Double = js.native
  
  @js.native
  sealed trait QuestionToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with PunctuationKind
  /* 22 */ val QuestionToken: typings.grammarkdown.distTokensMod.SyntaxKind.QuestionToken & Double = js.native
  
  @js.native
  sealed trait RightHandSide
    extends StObject
       with SyntaxKind
       with ProductionBodyKind
  /* 70 */ val RightHandSide: typings.grammarkdown.distTokensMod.SyntaxKind.RightHandSide & Double = js.native
  
  @js.native
  sealed trait RightHandSideList
    extends StObject
       with SyntaxKind
       with ProductionBodyKind
  /* 69 */ val RightHandSideList: typings.grammarkdown.distTokensMod.SyntaxKind.RightHandSideList & Double = js.native
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentTriviaKind
  /* 1 */ val SingleLineCommentTrivia: typings.grammarkdown.distTokensMod.SyntaxKind.SingleLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait SourceFile
    extends StObject
       with SyntaxKind
  /* 58 */ val SourceFile: typings.grammarkdown.distTokensMod.SyntaxKind.SourceFile & Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 49 */ val StringLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.StringLiteral & Double = js.native
  
  @js.native
  sealed trait SymbolSet
    extends StObject
       with SyntaxKind
  /* 73 */ val SymbolSet: typings.grammarkdown.distTokensMod.SyntaxKind.SymbolSet & Double = js.native
  
  @js.native
  sealed trait SymbolSpan
    extends StObject
       with SyntaxKind
  /* 72 */ val SymbolSpan: typings.grammarkdown.distTokensMod.SyntaxKind.SymbolSpan & Double = js.native
  
  @js.native
  sealed trait Terminal
    extends StObject
       with SyntaxKind
       with OptionalSymbolKind
       with ProseFragmentKind
  /* 79 */ val Terminal: typings.grammarkdown.distTokensMod.SyntaxKind.Terminal & Double = js.native
  
  @js.native
  sealed trait TerminalLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 51 */ val TerminalLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.TerminalLiteral & Double = js.native
  
  @js.native
  sealed trait ThroughKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 47 */ val ThroughKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.ThroughKeyword & Double = js.native
  
  @js.native
  sealed trait TildeToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
       with PunctuationKind
  /* 21 */ val TildeToken: typings.grammarkdown.distTokensMod.SyntaxKind.TildeToken & Double = js.native
  
  @js.native
  sealed trait TrueKeyword
    extends StObject
       with SyntaxKind
       with BooleanKind
       with KeywordKind
  /* 48 */ val TrueKeyword: typings.grammarkdown.distTokensMod.SyntaxKind.TrueKeyword & Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 52 */ val UnicodeCharacterLiteral: typings.grammarkdown.distTokensMod.SyntaxKind.UnicodeCharacterLiteral & Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterRange
    extends StObject
       with SyntaxKind
       with _LexicalSymbolKind
  /* 75 */ val UnicodeCharacterRange: typings.grammarkdown.distTokensMod.SyntaxKind.UnicodeCharacterRange & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with SyntaxKind
  /* 0 */ val Unknown: typings.grammarkdown.distTokensMod.SyntaxKind.Unknown & Double = js.native
}
