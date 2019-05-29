package typings
package grammarkdownLib.distVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/visitor", "NodeVisitor")
@js.native
abstract class NodeVisitor () extends js.Object {
  def visit[T /* <: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind] */](): js.UndefOr[T] = js.native
  def visit[T /* <: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind] */](node: T): T = js.native
  def visitArgument(node: grammarkdownLib.distNodesMod.Argument): grammarkdownLib.distNodesMod.Argument = js.native
  def visitArgumentList(node: grammarkdownLib.distNodesMod.ArgumentList): grammarkdownLib.distNodesMod.ArgumentList = js.native
  def visitButNotSymbol(node: grammarkdownLib.distNodesMod.ButNotSymbol): grammarkdownLib.distNodesMod.ButNotSymbol = js.native
  def visitConstraints(node: grammarkdownLib.distNodesMod.Constraints): grammarkdownLib.distNodesMod.Constraints = js.native
  def visitDefine(node: grammarkdownLib.distNodesMod.Define): grammarkdownLib.distNodesMod.Define = js.native
  def visitEach[T /* <: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind] */](): js.UndefOr[js.Array[T]] = js.native
  def visitEach[T /* <: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind] */](nodes: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  @JSName("visitEach")
  def visitEach_TNodeArray[T /* <: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind] */](nodes: js.Array[T]): js.Array[T] = js.native
  def visitEmptyAssertion(node: grammarkdownLib.distNodesMod.EmptyAssertion): grammarkdownLib.distNodesMod.EmptyAssertion = js.native
  def visitExtension[T /* <: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind] */](node: T): T = js.native
  def visitIdentifier(node: grammarkdownLib.distNodesMod.Identifier): grammarkdownLib.distNodesMod.Identifier = js.native
  def visitImport(node: grammarkdownLib.distNodesMod.Import): grammarkdownLib.distNodesMod.Import = js.native
  def visitInvalidAssertion(node: grammarkdownLib.distNodesMod.InvalidAssertion): grammarkdownLib.distNodesMod.InvalidAssertion = js.native
  def visitInvalidSymbol(node: grammarkdownLib.distNodesMod.InvalidSymbol): grammarkdownLib.distNodesMod.InvalidSymbol = js.native
  def visitLexicalGoalAssertion(node: grammarkdownLib.distNodesMod.LexicalGoalAssertion): grammarkdownLib.distNodesMod.LexicalGoalAssertion = js.native
  def visitLinkReference(node: grammarkdownLib.distNodesMod.LinkReference): grammarkdownLib.distNodesMod.LinkReference = js.native
  def visitLookaheadAssertion(node: grammarkdownLib.distNodesMod.LookaheadAssertion): grammarkdownLib.distNodesMod.LookaheadAssertion = js.native
  def visitNoSymbolHereAssertion(node: grammarkdownLib.distNodesMod.NoSymbolHereAssertion): grammarkdownLib.distNodesMod.NoSymbolHereAssertion = js.native
  def visitNonterminal(node: grammarkdownLib.distNodesMod.Nonterminal): grammarkdownLib.distNodesMod.Nonterminal = js.native
  def visitOneOfList(node: grammarkdownLib.distNodesMod.OneOfList): grammarkdownLib.distNodesMod.OneOfList = js.native
  def visitOneOfSymbol(node: grammarkdownLib.distNodesMod.OneOfSymbol): grammarkdownLib.distNodesMod.OneOfSymbol = js.native
  def visitParameter(node: grammarkdownLib.distNodesMod.Parameter): grammarkdownLib.distNodesMod.Parameter = js.native
  def visitParameterList(node: grammarkdownLib.distNodesMod.ParameterList): grammarkdownLib.distNodesMod.ParameterList = js.native
  def visitPlaceholderSymbol(node: grammarkdownLib.distNodesMod.PlaceholderSymbol): grammarkdownLib.distNodesMod.PlaceholderSymbol = js.native
  def visitProduction(node: grammarkdownLib.distNodesMod.Production): grammarkdownLib.distNodesMod.Production = js.native
  def visitProse(node: grammarkdownLib.distNodesMod.Prose): grammarkdownLib.distNodesMod.Prose = js.native
  def visitProseAssertion(node: grammarkdownLib.distNodesMod.ProseAssertion): grammarkdownLib.distNodesMod.ProseAssertion = js.native
  def visitProseFragmentLiteral(
    node: grammarkdownLib.distNodesMod.ProseFragmentLiteral[grammarkdownLib.distTokensMod.ProseFragmentLiteralKind]
  ): grammarkdownLib.distNodesMod.ProseFragmentLiteral[grammarkdownLib.distTokensMod.ProseFragmentLiteralKind] = js.native
  def visitRightHandSide(node: grammarkdownLib.distNodesMod.RightHandSide): grammarkdownLib.distNodesMod.RightHandSide = js.native
  def visitRightHandSideList(node: grammarkdownLib.distNodesMod.RightHandSideList): grammarkdownLib.distNodesMod.RightHandSideList = js.native
  def visitSourceFile(node: grammarkdownLib.distNodesMod.SourceFile): grammarkdownLib.distNodesMod.SourceFile = js.native
  def visitStringLiteral(node: grammarkdownLib.distNodesMod.StringLiteral): grammarkdownLib.distNodesMod.StringLiteral = js.native
  def visitSymbolSet(node: grammarkdownLib.distNodesMod.SymbolSet): grammarkdownLib.distNodesMod.SymbolSet = js.native
  def visitSymbolSpan(node: grammarkdownLib.distNodesMod.SymbolSpan): grammarkdownLib.distNodesMod.SymbolSpan = js.native
  def visitTerminal(node: grammarkdownLib.distNodesMod.Terminal): grammarkdownLib.distNodesMod.Terminal = js.native
  def visitToken[TKind /* <: grammarkdownLib.distTokensMod.TokenKind */](node: grammarkdownLib.distNodesMod.Token[TKind]): grammarkdownLib.distNodesMod.Token[TKind] = js.native
  def visitUnicodeCharacterLiteral(node: grammarkdownLib.distNodesMod.UnicodeCharacterLiteral): grammarkdownLib.distNodesMod.UnicodeCharacterLiteral = js.native
  def visitUnicodeCharacterRange(node: grammarkdownLib.distNodesMod.UnicodeCharacterRange): grammarkdownLib.distNodesMod.UnicodeCharacterRange = js.native
  @JSName("visit")
  def `visit_TNode<union>`[T /* <: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind] */](node: T): js.UndefOr[T] = js.native
}

