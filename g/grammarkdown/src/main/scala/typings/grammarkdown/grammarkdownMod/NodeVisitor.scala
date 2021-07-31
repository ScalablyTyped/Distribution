package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "NodeVisitor")
@js.native
abstract class NodeVisitor () extends StObject {
  
  def visit[T /* <: Node2[SyntaxKind] */](): js.UndefOr[T] = js.native
  def visit[T /* <: Node2[SyntaxKind] */](node: T): T = js.native
  
  def visitArgument(node: Argument): Argument = js.native
  
  def visitArgumentList(node: ArgumentList): ArgumentList = js.native
  
  def visitButNotSymbol(node: ButNotSymbol): ButNotSymbol = js.native
  
  def visitConstraints(node: Constraints): Constraints = js.native
  
  def visitDefine(node: Define): Define = js.native
  
  def visitEach[T /* <: Node2[SyntaxKind] */](): js.UndefOr[js.Array[T]] = js.native
  def visitEach[T /* <: Node2[SyntaxKind] */](nodes: js.Array[T]): js.Array[T] = js.native
  @JSName("visitEach")
  def visitEach_T_Node2SyntaxKind_Union[T /* <: Node2[SyntaxKind] */](nodes: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  
  def visitEmptyAssertion(node: EmptyAssertion): EmptyAssertion = js.native
  
  def visitExtension[T /* <: Node2[SyntaxKind] */](node: T): T = js.native
  
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
  def visit_T_Node2SyntaxKind_Union[T /* <: Node2[SyntaxKind] */](node: T): js.UndefOr[T] = js.native
}
