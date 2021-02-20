package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends StObject
@JSImport("grammarkdown/dist/grammarkdown", "SyntaxKind")
@js.native
object SyntaxKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind with Double] = js.native
  
  @js.native
  sealed trait Argument extends SyntaxKind
  /* 60 */ val Argument: typings.grammarkdown.grammarkdownMod.SyntaxKind.Argument with Double = js.native
  
  @js.native
  sealed trait ArgumentList extends SyntaxKind
  /* 61 */ val ArgumentList: typings.grammarkdown.grammarkdownMod.SyntaxKind.ArgumentList with Double = js.native
  
  @js.native
  sealed trait AtToken
    extends PunctuationKind
       with SyntaxKind
  /* 6 */ val AtToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.AtToken with Double = js.native
  
  @js.native
  sealed trait ButKeyword
    extends KeywordKind
       with SyntaxKind
  /* 30 */ val ButKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.ButKeyword with Double = js.native
  
  @js.native
  sealed trait ButNotSymbol extends SyntaxKind
  /* 69 */ val ButNotSymbol: typings.grammarkdown.grammarkdownMod.SyntaxKind.ButNotSymbol with Double = js.native
  
  @js.native
  sealed trait CloseBraceToken
    extends PunctuationKind
       with SyntaxKind
  /* 8 */ val CloseBraceToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseBraceToken with Double = js.native
  
  @js.native
  sealed trait CloseBracketToken
    extends PunctuationKind
       with SyntaxKind
  /* 11 */ val CloseBracketToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseBracketToken with Double = js.native
  
  @js.native
  sealed trait CloseParenToken
    extends PunctuationKind
       with SyntaxKind
  /* 14 */ val CloseParenToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseParenToken with Double = js.native
  
  @js.native
  sealed trait ColonColonColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 17 */ val ColonColonColonToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.ColonColonColonToken with Double = js.native
  
  @js.native
  sealed trait ColonColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 16 */ val ColonColonToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.ColonColonToken with Double = js.native
  
  @js.native
  sealed trait ColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 15 */ val ColonToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.ColonToken with Double = js.native
  
  @js.native
  sealed trait CommaToken
    extends PunctuationKind
       with SyntaxKind
  /* 18 */ val CommaToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.CommaToken with Double = js.native
  
  @js.native
  sealed trait Constraints extends SyntaxKind
  /* 66 */ val Constraints: typings.grammarkdown.grammarkdownMod.SyntaxKind.Constraints with Double = js.native
  
  @js.native
  sealed trait Define extends SyntaxKind
  /* 56 */ val Define: typings.grammarkdown.grammarkdownMod.SyntaxKind.Define with Double = js.native
  
  @js.native
  sealed trait DefineKeyword
    extends KeywordKind
       with SyntaxKind
  /* 31 */ val DefineKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.DefineKeyword with Double = js.native
  
  @js.native
  sealed trait ElementOfToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 28 */ val ElementOfToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.ElementOfToken with Double = js.native
  
  @js.native
  sealed trait EmptyAssertion extends SyntaxKind
  /* 75 */ val EmptyAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.EmptyAssertion with Double = js.native
  
  @js.native
  sealed trait EmptyKeyword
    extends KeywordKind
       with SyntaxKind
  /* 32 */ val EmptyKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.EmptyKeyword with Double = js.native
  
  @js.native
  sealed trait EndOfFileToken
    extends SyntaxKind
       with TokenKind
  /* 5 */ val EndOfFileToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.EndOfFileToken with Double = js.native
  
  @js.native
  sealed trait EqualsEqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 23 */ val EqualsEqualsToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.EqualsEqualsToken with Double = js.native
  
  @js.native
  sealed trait EqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 22 */ val EqualsToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.EqualsToken with Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 24 */ val ExclamationEqualsToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.ExclamationEqualsToken with Double = js.native
  
  @js.native
  sealed trait FalseKeyword
    extends KeywordKind
       with SyntaxKind
       with BooleanKind
  /* 33 */ val FalseKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.FalseKeyword with Double = js.native
  
  @js.native
  sealed trait FirstCommentTrivia extends SyntaxKind
  /* 1 */ val FirstCommentTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstCommentTrivia with Double = js.native
  
  @js.native
  sealed trait FirstErrorNode extends SyntaxKind
  /* 80 */ val FirstErrorNode: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstErrorNode with Double = js.native
  
  @js.native
  sealed trait FirstHtmlTrivia extends SyntaxKind
  /* 3 */ val FirstHtmlTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstHtmlTrivia with Double = js.native
  
  @js.native
  sealed trait FirstKeyword extends SyntaxKind
  /* 30 */ val FirstKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstKeyword with Double = js.native
  
  @js.native
  sealed trait FirstLiteral extends SyntaxKind
  /* 46 */ val FirstLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstLiteral with Double = js.native
  
  @js.native
  sealed trait FirstProseFragmentLiteral extends SyntaxKind
  /* 49 */ val FirstProseFragmentLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstProseFragmentLiteral with Double = js.native
  
  @js.native
  sealed trait FirstPunctuation extends SyntaxKind
  /* 6 */ val FirstPunctuation: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstPunctuation with Double = js.native
  
  @js.native
  sealed trait FirstTextContent extends SyntaxKind
  /* 46 */ val FirstTextContent: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstTextContent with Double = js.native
  
  @js.native
  sealed trait FirstToken extends SyntaxKind
  /* 5 */ val FirstToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstToken with Double = js.native
  
  @js.native
  sealed trait FirstTrivia extends SyntaxKind
  /* 1 */ val FirstTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.FirstTrivia with Double = js.native
  
  @js.native
  sealed trait GoalKeyword
    extends KeywordKind
       with SyntaxKind
  /* 34 */ val GoalKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.GoalKeyword with Double = js.native
  
  @js.native
  sealed trait GreaterThanToken
    extends PunctuationKind
       with SyntaxKind
  /* 12 */ val GreaterThanToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.GreaterThanToken with Double = js.native
  
  @js.native
  sealed trait HereKeyword
    extends KeywordKind
       with SyntaxKind
  /* 35 */ val HereKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.HereKeyword with Double = js.native
  
  @js.native
  sealed trait HtmlCloseTagTrivia
    extends HtmlTriviaKind
       with SyntaxKind
  /* 4 */ val HtmlCloseTagTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.HtmlCloseTagTrivia with Double = js.native
  
  @js.native
  sealed trait HtmlOpenTagTrivia
    extends HtmlTriviaKind
       with SyntaxKind
  /* 3 */ val HtmlOpenTagTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.HtmlOpenTagTrivia with Double = js.native
  
  @js.native
  sealed trait Identifier
    extends SyntaxKind
       with TextContentKind
  /* 53 */ val Identifier: typings.grammarkdown.grammarkdownMod.SyntaxKind.Identifier with Double = js.native
  
  @js.native
  sealed trait Import extends SyntaxKind
  /* 55 */ val Import: typings.grammarkdown.grammarkdownMod.SyntaxKind.Import with Double = js.native
  
  @js.native
  sealed trait ImportKeyword
    extends KeywordKind
       with SyntaxKind
  /* 36 */ val ImportKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.ImportKeyword with Double = js.native
  
  @js.native
  sealed trait InvalidAssertion extends SyntaxKind
  /* 81 */ val InvalidAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.InvalidAssertion with Double = js.native
  
  @js.native
  sealed trait InvalidSymbol extends SyntaxKind
  /* 80 */ val InvalidSymbol: typings.grammarkdown.grammarkdownMod.SyntaxKind.InvalidSymbol with Double = js.native
  
  @js.native
  sealed trait LastCommentTrivia extends SyntaxKind
  /* 2 */ val LastCommentTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastCommentTrivia with Double = js.native
  
  @js.native
  sealed trait LastErrorNode extends SyntaxKind
  /* 81 */ val LastErrorNode: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastErrorNode with Double = js.native
  
  @js.native
  sealed trait LastHtmlTrivia extends SyntaxKind
  /* 4 */ val LastHtmlTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastHtmlTrivia with Double = js.native
  
  @js.native
  sealed trait LastKeyword extends SyntaxKind
  /* 45 */ val LastKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastKeyword with Double = js.native
  
  @js.native
  sealed trait LastLiteral extends SyntaxKind
  /* 48 */ val LastLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastLiteral with Double = js.native
  
  @js.native
  sealed trait LastProseFragmentLiteral extends SyntaxKind
  /* 52 */ val LastProseFragmentLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastProseFragmentLiteral with Double = js.native
  
  @js.native
  sealed trait LastPunctuation extends SyntaxKind
  /* 29 */ val LastPunctuation: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastPunctuation with Double = js.native
  
  @js.native
  sealed trait LastTextContent extends SyntaxKind
  /* 52 */ val LastTextContent: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastTextContent with Double = js.native
  
  @js.native
  sealed trait LastToken extends SyntaxKind
  /* 45 */ val LastToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastToken with Double = js.native
  
  @js.native
  sealed trait LastTrivia extends SyntaxKind
  /* 4 */ val LastTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.LastTrivia with Double = js.native
  
  @js.native
  sealed trait LessThanExclamationToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 25 */ val LessThanExclamationToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.LessThanExclamationToken with Double = js.native
  
  @js.native
  sealed trait LessThanMinusToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 26 */ val LessThanMinusToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.LessThanMinusToken with Double = js.native
  
  @js.native
  sealed trait LexicalGoalAssertion extends SyntaxKind
  /* 77 */ val LexicalGoalAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.LexicalGoalAssertion with Double = js.native
  
  @js.native
  sealed trait LexicalKeyword
    extends KeywordKind
       with SyntaxKind
  /* 37 */ val LexicalKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.LexicalKeyword with Double = js.native
  
  @js.native
  sealed trait LinkReference extends SyntaxKind
  /* 62 */ val LinkReference: typings.grammarkdown.grammarkdownMod.SyntaxKind.LinkReference with Double = js.native
  
  @js.native
  sealed trait LookaheadAssertion extends SyntaxKind
  /* 76 */ val LookaheadAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.LookaheadAssertion with Double = js.native
  
  @js.native
  sealed trait LookaheadKeyword
    extends KeywordKind
       with SyntaxKind
  /* 38 */ val LookaheadKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.LookaheadKeyword with Double = js.native
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends CommentTriviaKind
       with SyntaxKind
  /* 2 */ val MultiLineCommentTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.MultiLineCommentTrivia with Double = js.native
  
  @js.native
  sealed trait NoKeyword
    extends KeywordKind
       with SyntaxKind
  /* 39 */ val NoKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.NoKeyword with Double = js.native
  
  @js.native
  sealed trait NoSymbolHereAssertion extends SyntaxKind
  /* 78 */ val NoSymbolHereAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.NoSymbolHereAssertion with Double = js.native
  
  @js.native
  sealed trait Nonterminal extends SyntaxKind
  /* 73 */ val Nonterminal: typings.grammarkdown.grammarkdownMod.SyntaxKind.Nonterminal with Double = js.native
  
  @js.native
  sealed trait NotAnElementOfToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 29 */ val NotAnElementOfToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.NotAnElementOfToken with Double = js.native
  
  @js.native
  sealed trait NotEqualToToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 27 */ val NotEqualToToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.NotEqualToToken with Double = js.native
  
  @js.native
  sealed trait NotKeyword
    extends KeywordKind
       with SyntaxKind
  /* 40 */ val NotKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.NotKeyword with Double = js.native
  
  @js.native
  sealed trait OfKeyword
    extends KeywordKind
       with SyntaxKind
  /* 41 */ val OfKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.OfKeyword with Double = js.native
  
  @js.native
  sealed trait OneKeyword
    extends KeywordKind
       with SyntaxKind
  /* 42 */ val OneKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.OneKeyword with Double = js.native
  
  @js.native
  sealed trait OneOfList extends SyntaxKind
  /* 63 */ val OneOfList: typings.grammarkdown.grammarkdownMod.SyntaxKind.OneOfList with Double = js.native
  
  @js.native
  sealed trait OneOfSymbol extends SyntaxKind
  /* 71 */ val OneOfSymbol: typings.grammarkdown.grammarkdownMod.SyntaxKind.OneOfSymbol with Double = js.native
  
  @js.native
  sealed trait OpenBraceToken
    extends PunctuationKind
       with SyntaxKind
  /* 7 */ val OpenBraceToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenBraceToken with Double = js.native
  
  @js.native
  sealed trait OpenBracketGreaterThanToken
    extends PunctuationKind
       with SyntaxKind
  /* 10 */ val OpenBracketGreaterThanToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketGreaterThanToken with Double = js.native
  
  @js.native
  sealed trait OpenBracketToken
    extends PunctuationKind
       with SyntaxKind
  /* 9 */ val OpenBracketToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketToken with Double = js.native
  
  @js.native
  sealed trait OpenParenToken
    extends PunctuationKind
       with SyntaxKind
  /* 13 */ val OpenParenToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenParenToken with Double = js.native
  
  @js.native
  sealed trait OrKeyword
    extends KeywordKind
       with SyntaxKind
  /* 43 */ val OrKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.OrKeyword with Double = js.native
  
  @js.native
  sealed trait Parameter extends SyntaxKind
  /* 58 */ val Parameter: typings.grammarkdown.grammarkdownMod.SyntaxKind.Parameter with Double = js.native
  
  @js.native
  sealed trait ParameterList extends SyntaxKind
  /* 59 */ val ParameterList: typings.grammarkdown.grammarkdownMod.SyntaxKind.ParameterList with Double = js.native
  
  @js.native
  sealed trait PlaceholderSymbol extends SyntaxKind
  /* 72 */ val PlaceholderSymbol: typings.grammarkdown.grammarkdownMod.SyntaxKind.PlaceholderSymbol with Double = js.native
  
  @js.native
  sealed trait PlusToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
  /* 19 */ val PlusToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.PlusToken with Double = js.native
  
  @js.native
  sealed trait Production extends SyntaxKind
  /* 57 */ val Production: typings.grammarkdown.grammarkdownMod.SyntaxKind.Production with Double = js.native
  
  @js.native
  sealed trait Prose extends SyntaxKind
  /* 74 */ val Prose: typings.grammarkdown.grammarkdownMod.SyntaxKind.Prose with Double = js.native
  
  @js.native
  sealed trait ProseAssertion extends SyntaxKind
  /* 79 */ val ProseAssertion: typings.grammarkdown.grammarkdownMod.SyntaxKind.ProseAssertion with Double = js.native
  
  @js.native
  sealed trait ProseFull
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 52 */ val ProseFull: typings.grammarkdown.grammarkdownMod.SyntaxKind.ProseFull with Double = js.native
  
  @js.native
  sealed trait ProseHead
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 49 */ val ProseHead: typings.grammarkdown.grammarkdownMod.SyntaxKind.ProseHead with Double = js.native
  
  @js.native
  sealed trait ProseMiddle
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 50 */ val ProseMiddle: typings.grammarkdown.grammarkdownMod.SyntaxKind.ProseMiddle with Double = js.native
  
  @js.native
  sealed trait ProseTail
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 51 */ val ProseTail: typings.grammarkdown.grammarkdownMod.SyntaxKind.ProseTail with Double = js.native
  
  @js.native
  sealed trait QuestionToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
  /* 21 */ val QuestionToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.QuestionToken with Double = js.native
  
  @js.native
  sealed trait RightHandSide extends SyntaxKind
  /* 65 */ val RightHandSide: typings.grammarkdown.grammarkdownMod.SyntaxKind.RightHandSide with Double = js.native
  
  @js.native
  sealed trait RightHandSideList extends SyntaxKind
  /* 64 */ val RightHandSideList: typings.grammarkdown.grammarkdownMod.SyntaxKind.RightHandSideList with Double = js.native
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends CommentTriviaKind
       with SyntaxKind
  /* 1 */ val SingleLineCommentTrivia: typings.grammarkdown.grammarkdownMod.SyntaxKind.SingleLineCommentTrivia with Double = js.native
  
  @js.native
  sealed trait SourceFile extends SyntaxKind
  /* 54 */ val SourceFile: typings.grammarkdown.grammarkdownMod.SyntaxKind.SourceFile with Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends SyntaxKind
       with TextContentKind
  /* 46 */ val StringLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.StringLiteral with Double = js.native
  
  @js.native
  sealed trait SymbolSet extends SyntaxKind
  /* 68 */ val SymbolSet: typings.grammarkdown.grammarkdownMod.SyntaxKind.SymbolSet with Double = js.native
  
  @js.native
  sealed trait SymbolSpan extends SyntaxKind
  /* 67 */ val SymbolSpan: typings.grammarkdown.grammarkdownMod.SyntaxKind.SymbolSpan with Double = js.native
  
  @js.native
  sealed trait Terminal
    extends SyntaxKind
       with TextContentKind
  /* 47 */ val Terminal: typings.grammarkdown.grammarkdownMod.SyntaxKind.Terminal with Double = js.native
  
  @js.native
  sealed trait ThroughKeyword
    extends KeywordKind
       with SyntaxKind
  /* 44 */ val ThroughKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.ThroughKeyword with Double = js.native
  
  @js.native
  sealed trait TildeToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
  /* 20 */ val TildeToken: typings.grammarkdown.grammarkdownMod.SyntaxKind.TildeToken with Double = js.native
  
  @js.native
  sealed trait TrueKeyword
    extends KeywordKind
       with SyntaxKind
       with BooleanKind
  /* 45 */ val TrueKeyword: typings.grammarkdown.grammarkdownMod.SyntaxKind.TrueKeyword with Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterLiteral
    extends SyntaxKind
       with TextContentKind
  /* 48 */ val UnicodeCharacterLiteral: typings.grammarkdown.grammarkdownMod.SyntaxKind.UnicodeCharacterLiteral with Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterRange extends SyntaxKind
  /* 70 */ val UnicodeCharacterRange: typings.grammarkdown.grammarkdownMod.SyntaxKind.UnicodeCharacterRange with Double = js.native
  
  @js.native
  sealed trait Unknown extends SyntaxKind
  /* 0 */ val Unknown: typings.grammarkdown.grammarkdownMod.SyntaxKind.Unknown with Double = js.native
}
