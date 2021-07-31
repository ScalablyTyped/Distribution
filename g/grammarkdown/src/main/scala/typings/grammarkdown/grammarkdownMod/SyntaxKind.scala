package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends StObject
@JSImport("grammarkdown/dist/grammarkdown", "SyntaxKind")
@js.native
object SyntaxKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind & Double] = js.native
  
  @js.native
  sealed trait Argument
    extends StObject
       with SyntaxKind
  /* 60 */ val Argument: typings.grammarkdown.grammarkdownMod.SyntaxKind.Argument & Double = js.native
  
  @js.native
  sealed trait ArgumentList
    extends StObject
       with SyntaxKind
  /* 61 */ val ArgumentList: typings.grammarkdown.grammarkdownMod.SyntaxKind.ArgumentList & Double = js.native
  
  @js.native
  sealed trait AtToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 6 */ val AtToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.AtToken & Double = js.native
  
  @js.native
  sealed trait ButKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 30 */ val ButKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.ButKeyword & Double = js.native
  
  @js.native
  sealed trait ButNotSymbol
    extends StObject
       with SyntaxKind
  /* 69 */ val ButNotSymbol: typings.grammarkdown.grammarkdownMod.SyntaxKind.ButNotSymbol & Double = js.native
  
  @js.native
  sealed trait CloseBraceToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 8 */ val CloseBraceToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseBraceToken & Double = js.native
  
  @js.native
  sealed trait CloseBracketToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 11 */ val CloseBracketToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseBracketToken & Double = js.native
  
  @js.native
  sealed trait CloseParenToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 14 */ val CloseParenToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseParenToken & Double = js.native
  
  @js.native
  sealed trait ColonColonColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 17 */ val ColonColonColonToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.ColonColonColonToken & Double = js.native
  
  @js.native
  sealed trait ColonColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 16 */ val ColonColonToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.ColonColonToken & Double = js.native
  
  @js.native
  sealed trait ColonToken
    extends StObject
       with SyntaxKind
       with ProductionSeperatorKind
       with PunctuationKind
  /* 15 */ val ColonToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.ColonToken & Double = js.native
  
  @js.native
  sealed trait CommaToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 18 */ val CommaToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.CommaToken & Double = js.native
  
  @js.native
  sealed trait Constraints
    extends StObject
       with SyntaxKind
  /* 66 */ val Constraints: typings.grammarkdown.grammarkdownMod.SyntaxKind.Constraints & Double = js.native
  
  @js.native
  sealed trait Define
    extends StObject
       with SyntaxKind
  /* 56 */ val Define: typings.grammarkdown.grammarkdownMod.SyntaxKind.Define & Double = js.native
  
  @js.native
  sealed trait DefineKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 31 */ val DefineKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.DefineKeyword & Double = js.native
  
  @js.native
  sealed trait ElementOfToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 28 */ val ElementOfToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.ElementOfToken & Double = js.native
  
  @js.native
  sealed trait EmptyAssertion
    extends StObject
       with SyntaxKind
  /* 75 */ val EmptyAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.EmptyAssertion & Double = js.native
  
  @js.native
  sealed trait EmptyKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 32 */ val EmptyKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.EmptyKeyword & Double = js.native
  
  @js.native
  sealed trait EndOfFileToken
    extends StObject
       with SyntaxKind
       with TokenKind
  /* 5 */ val EndOfFileToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.EndOfFileToken & Double = js.native
  
  @js.native
  sealed trait EqualsEqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 23 */ val EqualsEqualsToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.EqualsEqualsToken & Double = js.native
  
  @js.native
  sealed trait EqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 22 */ val EqualsToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.EqualsToken & Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 24 */ val ExclamationEqualsToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.ExclamationEqualsToken & Double = js.native
  
  @js.native
  sealed trait FalseKeyword
    extends StObject
       with SyntaxKind
       with BooleanKind
       with KeywordKind
  /* 33 */ val FalseKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.FalseKeyword & Double = js.native
  
  @js.native
  sealed trait FirstCommentTrivia
    extends StObject
       with SyntaxKind
  /* 1 */ val FirstCommentTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstCommentTrivia & Double = js.native
  
  @js.native
  sealed trait FirstErrorNode
    extends StObject
       with SyntaxKind
  /* 80 */ val FirstErrorNode: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstErrorNode & Double = js.native
  
  @js.native
  sealed trait FirstHtmlTrivia
    extends StObject
       with SyntaxKind
  /* 3 */ val FirstHtmlTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstHtmlTrivia & Double = js.native
  
  @js.native
  sealed trait FirstKeyword
    extends StObject
       with SyntaxKind
  /* 30 */ val FirstKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstKeyword & Double = js.native
  
  @js.native
  sealed trait FirstLiteral
    extends StObject
       with SyntaxKind
  /* 46 */ val FirstLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstLiteral & Double = js.native
  
  @js.native
  sealed trait FirstProseFragmentLiteral
    extends StObject
       with SyntaxKind
  /* 49 */ val FirstProseFragmentLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstProseFragmentLiteral & Double = js.native
  
  @js.native
  sealed trait FirstPunctuation
    extends StObject
       with SyntaxKind
  /* 6 */ val FirstPunctuation: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstPunctuation & Double = js.native
  
  @js.native
  sealed trait FirstTextContent
    extends StObject
       with SyntaxKind
  /* 46 */ val FirstTextContent: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstTextContent & Double = js.native
  
  @js.native
  sealed trait FirstToken
    extends StObject
       with SyntaxKind
  /* 5 */ val FirstToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstToken & Double = js.native
  
  @js.native
  sealed trait FirstTrivia
    extends StObject
       with SyntaxKind
  /* 1 */ val FirstTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstTrivia & Double = js.native
  
  @js.native
  sealed trait GoalKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 34 */ val GoalKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.GoalKeyword & Double = js.native
  
  @js.native
  sealed trait GreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 12 */ val GreaterThanToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.GreaterThanToken & Double = js.native
  
  @js.native
  sealed trait HereKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 35 */ val HereKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.HereKeyword & Double = js.native
  
  @js.native
  sealed trait HtmlCloseTagTrivia
    extends StObject
       with SyntaxKind
       with HtmlTriviaKind
  /* 4 */ val HtmlCloseTagTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.HtmlCloseTagTrivia & Double = js.native
  
  @js.native
  sealed trait HtmlOpenTagTrivia
    extends StObject
       with SyntaxKind
       with HtmlTriviaKind
  /* 3 */ val HtmlOpenTagTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.HtmlOpenTagTrivia & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 53 */ val Identifier: typings.grammarkdown.grammarkdownMod.SyntaxKind.Identifier & Double = js.native
  
  @js.native
  sealed trait Import
    extends StObject
       with SyntaxKind
  /* 55 */ val Import: typings.grammarkdown.grammarkdownMod.SyntaxKind.Import & Double = js.native
  
  @js.native
  sealed trait ImportKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 36 */ val ImportKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.ImportKeyword & Double = js.native
  
  @js.native
  sealed trait InvalidAssertion
    extends StObject
       with SyntaxKind
  /* 81 */ val InvalidAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.InvalidAssertion & Double = js.native
  
  @js.native
  sealed trait InvalidSymbol
    extends StObject
       with SyntaxKind
  /* 80 */ val InvalidSymbol: typings.grammarkdown.grammarkdownMod.SyntaxKind.InvalidSymbol & Double = js.native
  
  @js.native
  sealed trait LastCommentTrivia
    extends StObject
       with SyntaxKind
  /* 2 */ val LastCommentTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastCommentTrivia & Double = js.native
  
  @js.native
  sealed trait LastErrorNode
    extends StObject
       with SyntaxKind
  /* 81 */ val LastErrorNode: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastErrorNode & Double = js.native
  
  @js.native
  sealed trait LastHtmlTrivia
    extends StObject
       with SyntaxKind
  /* 4 */ val LastHtmlTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastHtmlTrivia & Double = js.native
  
  @js.native
  sealed trait LastKeyword
    extends StObject
       with SyntaxKind
  /* 45 */ val LastKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastKeyword & Double = js.native
  
  @js.native
  sealed trait LastLiteral
    extends StObject
       with SyntaxKind
  /* 48 */ val LastLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastLiteral & Double = js.native
  
  @js.native
  sealed trait LastProseFragmentLiteral
    extends StObject
       with SyntaxKind
  /* 52 */ val LastProseFragmentLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastProseFragmentLiteral & Double = js.native
  
  @js.native
  sealed trait LastPunctuation
    extends StObject
       with SyntaxKind
  /* 29 */ val LastPunctuation: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastPunctuation & Double = js.native
  
  @js.native
  sealed trait LastTextContent
    extends StObject
       with SyntaxKind
  /* 52 */ val LastTextContent: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastTextContent & Double = js.native
  
  @js.native
  sealed trait LastToken
    extends StObject
       with SyntaxKind
  /* 45 */ val LastToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastToken & Double = js.native
  
  @js.native
  sealed trait LastTrivia
    extends StObject
       with SyntaxKind
  /* 4 */ val LastTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastTrivia & Double = js.native
  
  @js.native
  sealed trait LessThanExclamationToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 25 */ val LessThanExclamationToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.LessThanExclamationToken & Double = js.native
  
  @js.native
  sealed trait LessThanMinusToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 26 */ val LessThanMinusToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.LessThanMinusToken & Double = js.native
  
  @js.native
  sealed trait LexicalGoalAssertion
    extends StObject
       with SyntaxKind
  /* 77 */ val LexicalGoalAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.LexicalGoalAssertion & Double = js.native
  
  @js.native
  sealed trait LexicalKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 37 */ val LexicalKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.LexicalKeyword & Double = js.native
  
  @js.native
  sealed trait LinkReference
    extends StObject
       with SyntaxKind
  /* 62 */ val LinkReference: typings.grammarkdown.grammarkdownMod.SyntaxKind.LinkReference & Double = js.native
  
  @js.native
  sealed trait LookaheadAssertion
    extends StObject
       with SyntaxKind
  /* 76 */ val LookaheadAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.LookaheadAssertion & Double = js.native
  
  @js.native
  sealed trait LookaheadKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 38 */ val LookaheadKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.LookaheadKeyword & Double = js.native
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentTriviaKind
  /* 2 */ val MultiLineCommentTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.MultiLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait NoKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 39 */ val NoKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.NoKeyword & Double = js.native
  
  @js.native
  sealed trait NoSymbolHereAssertion
    extends StObject
       with SyntaxKind
  /* 78 */ val NoSymbolHereAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.NoSymbolHereAssertion & Double = js.native
  
  @js.native
  sealed trait Nonterminal
    extends StObject
       with SyntaxKind
  /* 73 */ val Nonterminal: typings.grammarkdown.grammarkdownMod.SyntaxKind.Nonterminal & Double = js.native
  
  @js.native
  sealed trait NotAnElementOfToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 29 */ val NotAnElementOfToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.NotAnElementOfToken & Double = js.native
  
  @js.native
  sealed trait NotEqualToToken
    extends StObject
       with SyntaxKind
       with LookaheadOperatorKind
       with PunctuationKind
  /* 27 */ val NotEqualToToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.NotEqualToToken & Double = js.native
  
  @js.native
  sealed trait NotKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 40 */ val NotKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.NotKeyword & Double = js.native
  
  @js.native
  sealed trait OfKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 41 */ val OfKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.OfKeyword & Double = js.native
  
  @js.native
  sealed trait OneKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 42 */ val OneKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.OneKeyword & Double = js.native
  
  @js.native
  sealed trait OneOfList
    extends StObject
       with SyntaxKind
  /* 63 */ val OneOfList: typings.grammarkdown.grammarkdownMod.SyntaxKind.OneOfList & Double = js.native
  
  @js.native
  sealed trait OneOfSymbol
    extends StObject
       with SyntaxKind
  /* 71 */ val OneOfSymbol: typings.grammarkdown.grammarkdownMod.SyntaxKind.OneOfSymbol & Double = js.native
  
  @js.native
  sealed trait OpenBraceToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 7 */ val OpenBraceToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenBraceToken & Double = js.native
  
  @js.native
  sealed trait OpenBracketGreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 10 */ val OpenBracketGreaterThanToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketGreaterThanToken & Double = js.native
  
  @js.native
  sealed trait OpenBracketToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 9 */ val OpenBracketToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketToken & Double = js.native
  
  @js.native
  sealed trait OpenParenToken
    extends StObject
       with SyntaxKind
       with PunctuationKind
  /* 13 */ val OpenParenToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenParenToken & Double = js.native
  
  @js.native
  sealed trait OrKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 43 */ val OrKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.OrKeyword & Double = js.native
  
  @js.native
  sealed trait Parameter
    extends StObject
       with SyntaxKind
  /* 58 */ val Parameter: typings.grammarkdown.grammarkdownMod.SyntaxKind.Parameter & Double = js.native
  
  @js.native
  sealed trait ParameterList
    extends StObject
       with SyntaxKind
  /* 59 */ val ParameterList: typings.grammarkdown.grammarkdownMod.SyntaxKind.ParameterList & Double = js.native
  
  @js.native
  sealed trait PlaceholderSymbol
    extends StObject
       with SyntaxKind
  /* 72 */ val PlaceholderSymbol: typings.grammarkdown.grammarkdownMod.SyntaxKind.PlaceholderSymbol & Double = js.native
  
  @js.native
  sealed trait PlusToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
       with PunctuationKind
  /* 19 */ val PlusToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.PlusToken & Double = js.native
  
  @js.native
  sealed trait Production
    extends StObject
       with SyntaxKind
  /* 57 */ val Production: typings.grammarkdown.grammarkdownMod.SyntaxKind.Production & Double = js.native
  
  @js.native
  sealed trait Prose
    extends StObject
       with SyntaxKind
  /* 74 */ val Prose: typings.grammarkdown.grammarkdownMod.SyntaxKind.Prose & Double = js.native
  
  @js.native
  sealed trait ProseAssertion
    extends StObject
       with SyntaxKind
  /* 79 */ val ProseAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.ProseAssertion & Double = js.native
  
  @js.native
  sealed trait ProseFull
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 52 */ val ProseFull: typings.grammarkdown.grammarkdownMod.SyntaxKind.ProseFull & Double = js.native
  
  @js.native
  sealed trait ProseHead
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 49 */ val ProseHead: typings.grammarkdown.grammarkdownMod.SyntaxKind.ProseHead & Double = js.native
  
  @js.native
  sealed trait ProseMiddle
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 50 */ val ProseMiddle: typings.grammarkdown.grammarkdownMod.SyntaxKind.ProseMiddle & Double = js.native
  
  @js.native
  sealed trait ProseTail
    extends StObject
       with SyntaxKind
       with ProseFragmentLiteralKind
  /* 51 */ val ProseTail: typings.grammarkdown.grammarkdownMod.SyntaxKind.ProseTail & Double = js.native
  
  @js.native
  sealed trait QuestionToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with PunctuationKind
  /* 21 */ val QuestionToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.QuestionToken & Double = js.native
  
  @js.native
  sealed trait RightHandSide
    extends StObject
       with SyntaxKind
  /* 65 */ val RightHandSide: typings.grammarkdown.grammarkdownMod.SyntaxKind.RightHandSide & Double = js.native
  
  @js.native
  sealed trait RightHandSideList
    extends StObject
       with SyntaxKind
  /* 64 */ val RightHandSideList: typings.grammarkdown.grammarkdownMod.SyntaxKind.RightHandSideList & Double = js.native
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentTriviaKind
  /* 1 */ val SingleLineCommentTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.SingleLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait SourceFile
    extends StObject
       with SyntaxKind
  /* 54 */ val SourceFile: typings.grammarkdown.grammarkdownMod.SyntaxKind.SourceFile & Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 46 */ val StringLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.StringLiteral & Double = js.native
  
  @js.native
  sealed trait SymbolSet
    extends StObject
       with SyntaxKind
  /* 68 */ val SymbolSet: typings.grammarkdown.grammarkdownMod.SyntaxKind.SymbolSet & Double = js.native
  
  @js.native
  sealed trait SymbolSpan
    extends StObject
       with SyntaxKind
  /* 67 */ val SymbolSpan: typings.grammarkdown.grammarkdownMod.SyntaxKind.SymbolSpan & Double = js.native
  
  @js.native
  sealed trait Terminal
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 47 */ val Terminal: typings.grammarkdown.grammarkdownMod.SyntaxKind.Terminal & Double = js.native
  
  @js.native
  sealed trait ThroughKeyword
    extends StObject
       with SyntaxKind
       with KeywordKind
  /* 44 */ val ThroughKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.ThroughKeyword & Double = js.native
  
  @js.native
  sealed trait TildeToken
    extends StObject
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
       with PunctuationKind
  /* 20 */ val TildeToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.TildeToken & Double = js.native
  
  @js.native
  sealed trait TrueKeyword
    extends StObject
       with SyntaxKind
       with BooleanKind
       with KeywordKind
  /* 45 */ val TrueKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.TrueKeyword & Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterLiteral
    extends StObject
       with SyntaxKind
       with TextContentKind
  /* 48 */ val UnicodeCharacterLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.UnicodeCharacterLiteral & Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterRange
    extends StObject
       with SyntaxKind
  /* 70 */ val UnicodeCharacterRange: typings.grammarkdown.grammarkdownMod.SyntaxKind.UnicodeCharacterRange & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with SyntaxKind
  /* 0 */ val Unknown: typings.grammarkdown.grammarkdownMod.SyntaxKind.Unknown & Double = js.native
}
