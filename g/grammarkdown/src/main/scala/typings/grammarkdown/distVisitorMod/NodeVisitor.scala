package typings.grammarkdown.distVisitorMod

import typings.grammarkdown.distNodesMod.Argument
import typings.grammarkdown.distNodesMod.ArgumentList
import typings.grammarkdown.distNodesMod.ButNotSymbol
import typings.grammarkdown.distNodesMod.Constraints
import typings.grammarkdown.distNodesMod.Define
import typings.grammarkdown.distNodesMod.EmptyAssertion
import typings.grammarkdown.distNodesMod.Identifier
import typings.grammarkdown.distNodesMod.Import
import typings.grammarkdown.distNodesMod.InvalidAssertion
import typings.grammarkdown.distNodesMod.InvalidSymbol
import typings.grammarkdown.distNodesMod.LexicalGoalAssertion
import typings.grammarkdown.distNodesMod.LinkReference
import typings.grammarkdown.distNodesMod.LookaheadAssertion
import typings.grammarkdown.distNodesMod.NoSymbolHereAssertion
import typings.grammarkdown.distNodesMod.Node
import typings.grammarkdown.distNodesMod.Nonterminal
import typings.grammarkdown.distNodesMod.OneOfList
import typings.grammarkdown.distNodesMod.OneOfSymbol
import typings.grammarkdown.distNodesMod.Parameter
import typings.grammarkdown.distNodesMod.ParameterList
import typings.grammarkdown.distNodesMod.PlaceholderSymbol
import typings.grammarkdown.distNodesMod.Production
import typings.grammarkdown.distNodesMod.Prose
import typings.grammarkdown.distNodesMod.ProseAssertion
import typings.grammarkdown.distNodesMod.ProseFragmentLiteral
import typings.grammarkdown.distNodesMod.RightHandSide
import typings.grammarkdown.distNodesMod.RightHandSideList
import typings.grammarkdown.distNodesMod.SourceFile
import typings.grammarkdown.distNodesMod.StringLiteral
import typings.grammarkdown.distNodesMod.SymbolSet
import typings.grammarkdown.distNodesMod.SymbolSpan
import typings.grammarkdown.distNodesMod.Terminal
import typings.grammarkdown.distNodesMod.Token
import typings.grammarkdown.distNodesMod.UnicodeCharacterLiteral
import typings.grammarkdown.distNodesMod.UnicodeCharacterRange
import typings.grammarkdown.distTokensMod.ProseFragmentLiteralKind
import typings.grammarkdown.distTokensMod.SyntaxKind
import typings.grammarkdown.distTokensMod.TokenKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/visitor", "NodeVisitor")
@js.native
abstract class NodeVisitor () extends js.Object {
  def visit[T /* <: Node[SyntaxKind] */](): js.UndefOr[T] = js.native
  def visit[T /* <: Node[SyntaxKind] */](node: T): T = js.native
  def visitArgument(node: Argument): Argument = js.native
  def visitArgumentList(node: ArgumentList): ArgumentList = js.native
  def visitButNotSymbol(node: ButNotSymbol): ButNotSymbol = js.native
  def visitConstraints(node: Constraints): Constraints = js.native
  def visitDefine(node: Define): Define = js.native
  def visitEach[T /* <: Node[SyntaxKind] */](): js.UndefOr[js.Array[T]] = js.native
  def visitEach[T /* <: Node[SyntaxKind] */](nodes: js.Array[T]): js.Array[T] = js.native
  @JSName("visitEach")
  def visitEach_T_NodeSyntaxKind_Union[T /* <: Node[SyntaxKind] */](nodes: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  def visitEmptyAssertion(node: EmptyAssertion): EmptyAssertion = js.native
  def visitExtension[T /* <: Node[SyntaxKind] */](node: T): T = js.native
  def visitIdentifier(node: Identifier): Identifier = js.native
  def visitImport(node: Import): Import = js.native
  def visitInvalidAssertion(node: InvalidAssertion): InvalidAssertion = js.native
  def visitInvalidSymbol(node: InvalidSymbol): InvalidSymbol = js.native
  def visitLexicalGoalAssertion(node: LexicalGoalAssertion): LexicalGoalAssertion = js.native
  def visitLinkReference(node: LinkReference): LinkReference = js.native
  def visitLookaheadAssertion(node: LookaheadAssertion): LookaheadAssertion = js.native
  def visitNoSymbolHereAssertion(node: NoSymbolHereAssertion): NoSymbolHereAssertion = js.native
  def visitNonterminal(node: Nonterminal): Nonterminal = js.native
  def visitOneOfList(node: OneOfList): OneOfList = js.native
  def visitOneOfSymbol(node: OneOfSymbol): OneOfSymbol = js.native
  def visitParameter(node: Parameter): Parameter = js.native
  def visitParameterList(node: ParameterList): ParameterList = js.native
  def visitPlaceholderSymbol(node: PlaceholderSymbol): PlaceholderSymbol = js.native
  def visitProduction(node: Production): Production = js.native
  def visitProse(node: Prose): Prose = js.native
  def visitProseAssertion(node: ProseAssertion): ProseAssertion = js.native
  def visitProseFragmentLiteral(node: ProseFragmentLiteral[ProseFragmentLiteralKind]): ProseFragmentLiteral[ProseFragmentLiteralKind] = js.native
  def visitRightHandSide(node: RightHandSide): RightHandSide = js.native
  def visitRightHandSideList(node: RightHandSideList): RightHandSideList = js.native
  def visitSourceFile(node: SourceFile): SourceFile = js.native
  def visitStringLiteral(node: StringLiteral): StringLiteral = js.native
  def visitSymbolSet(node: SymbolSet): SymbolSet = js.native
  def visitSymbolSpan(node: SymbolSpan): SymbolSpan = js.native
  def visitTerminal(node: Terminal): Terminal = js.native
  def visitToken[TKind /* <: TokenKind */](node: Token[TKind]): Token[TKind] = js.native
  def visitUnicodeCharacterLiteral(node: UnicodeCharacterLiteral): UnicodeCharacterLiteral = js.native
  def visitUnicodeCharacterRange(node: UnicodeCharacterRange): UnicodeCharacterRange = js.native
  @JSName("visit")
  def visit_T_NodeSyntaxKind_Union[T /* <: Node[SyntaxKind] */](node: T): js.UndefOr[T] = js.native
}

