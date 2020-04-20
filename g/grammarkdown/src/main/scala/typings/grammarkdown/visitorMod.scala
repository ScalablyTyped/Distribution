package typings.grammarkdown

import typings.grammarkdown.nodesMod.Argument
import typings.grammarkdown.nodesMod.ArgumentList
import typings.grammarkdown.nodesMod.ButNotSymbol
import typings.grammarkdown.nodesMod.Constraints
import typings.grammarkdown.nodesMod.Define
import typings.grammarkdown.nodesMod.EmptyAssertion
import typings.grammarkdown.nodesMod.Identifier
import typings.grammarkdown.nodesMod.Import
import typings.grammarkdown.nodesMod.InvalidAssertion
import typings.grammarkdown.nodesMod.InvalidSymbol
import typings.grammarkdown.nodesMod.LexicalGoalAssertion
import typings.grammarkdown.nodesMod.LinkReference
import typings.grammarkdown.nodesMod.LookaheadAssertion
import typings.grammarkdown.nodesMod.NoSymbolHereAssertion
import typings.grammarkdown.nodesMod.Node
import typings.grammarkdown.nodesMod.Nonterminal
import typings.grammarkdown.nodesMod.OneOfList
import typings.grammarkdown.nodesMod.OneOfSymbol
import typings.grammarkdown.nodesMod.Parameter
import typings.grammarkdown.nodesMod.ParameterList
import typings.grammarkdown.nodesMod.PlaceholderSymbol
import typings.grammarkdown.nodesMod.Production
import typings.grammarkdown.nodesMod.Prose
import typings.grammarkdown.nodesMod.ProseAssertion
import typings.grammarkdown.nodesMod.ProseFragmentLiteral
import typings.grammarkdown.nodesMod.RightHandSide
import typings.grammarkdown.nodesMod.RightHandSideList
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.nodesMod.StringLiteral
import typings.grammarkdown.nodesMod.SymbolSet
import typings.grammarkdown.nodesMod.SymbolSpan
import typings.grammarkdown.nodesMod.Terminal
import typings.grammarkdown.nodesMod.Token
import typings.grammarkdown.nodesMod.UnicodeCharacterLiteral
import typings.grammarkdown.nodesMod.UnicodeCharacterRange
import typings.grammarkdown.tokensMod.ProseFragmentLiteralKind
import typings.grammarkdown.tokensMod.SyntaxKind
import typings.grammarkdown.tokensMod.TokenKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/visitor", JSImport.Namespace)
@js.native
object visitorMod extends js.Object {
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
  
}

