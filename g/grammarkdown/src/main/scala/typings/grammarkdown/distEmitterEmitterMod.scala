package typings.grammarkdown

import typings.esfxAsyncCanceltoken.mod.CancelToken
import typings.esfxCancelable.mod.Cancelable
import typings.grammarkdown.distCheckerMod.Resolver
import typings.grammarkdown.distDiagnosticsMod.DiagnosticMessages
import typings.grammarkdown.distNodesMod.Argument
import typings.grammarkdown.distNodesMod.ArgumentList
import typings.grammarkdown.distNodesMod.ButNotSymbol
import typings.grammarkdown.distNodesMod.Constraints
import typings.grammarkdown.distNodesMod.Define
import typings.grammarkdown.distNodesMod.EmptyAssertion
import typings.grammarkdown.distNodesMod.HtmlCloseTagTrivia
import typings.grammarkdown.distNodesMod.HtmlCommentTrivia
import typings.grammarkdown.distNodesMod.HtmlOpenTagTrivia
import typings.grammarkdown.distNodesMod.Identifier
import typings.grammarkdown.distNodesMod.Import
import typings.grammarkdown.distNodesMod.LexicalGoalAssertion
import typings.grammarkdown.distNodesMod.Line
import typings.grammarkdown.distNodesMod.LinkReference
import typings.grammarkdown.distNodesMod.LookaheadAssertion
import typings.grammarkdown.distNodesMod.MultiLineCommentTrivia
import typings.grammarkdown.distNodesMod.NoSymbolHereAssertion
import typings.grammarkdown.distNodesMod.Node
import typings.grammarkdown.distNodesMod.Nonterminal
import typings.grammarkdown.distNodesMod.NumberLiteral
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
import typings.grammarkdown.distNodesMod.SingleLineCommentTrivia
import typings.grammarkdown.distNodesMod.SourceFile
import typings.grammarkdown.distNodesMod.StringLiteral
import typings.grammarkdown.distNodesMod.SymbolSet
import typings.grammarkdown.distNodesMod.SymbolSpan
import typings.grammarkdown.distNodesMod.Terminal
import typings.grammarkdown.distNodesMod.TerminalLiteral
import typings.grammarkdown.distNodesMod.TextContent
import typings.grammarkdown.distNodesMod.Trivia
import typings.grammarkdown.distNodesMod.UnicodeCharacterLiteral
import typings.grammarkdown.distNodesMod.UnicodeCharacterRange
import typings.grammarkdown.distOptionsMod.CompilerOptions
import typings.grammarkdown.distStringwriterMod.StringWriter
import typings.grammarkdown.distTokensMod.ProseFragmentLiteralKind
import typings.grammarkdown.distTokensMod.SyntaxKind
import typings.grammarkdown.distTypesMod.TextRange
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEmitterEmitterMod {
  
  @JSImport("grammarkdown/dist/emitter/emitter", "Emitter")
  @js.native
  open class Emitter protected () extends StObject {
    def this(options: CompilerOptions) = this()
    
    /* private */ var _cancelToken: Any = js.native
    
    /* private */ var _diagnostics: Any = js.native
    
    /* private */ var _sourceFile: Any = js.native
    
    /* private */ var _triviaPos: Any = js.native
    
    /* protected */ def afterEmitNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def afterEmitTrivia(node: Trivia): Unit = js.native
    
    /* protected */ def beforeEmitNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def beforeEmitTrivia(node: Trivia): Unit = js.native
    
    /* protected */ def createWriter(options: CompilerOptions): StringWriter = js.native
    
    def emit(
      node: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      writeFile: js.Function3[
          /* file */ String, 
          /* text */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit | PromiseLike[Unit]
        ]
    ): js.Promise[Unit] = js.native
    def emit(
      node: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      writeFile: js.Function3[
          /* file */ String, 
          /* text */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit | PromiseLike[Unit]
        ],
      cancelable: Cancelable
    ): js.Promise[Unit] = js.native
    
    /* protected */ def emitArgument(node: Argument): Unit = js.native
    
    /* protected */ def emitArgumentList(node: ArgumentList): Unit = js.native
    
    /* protected */ def emitButNotSymbol(node: ButNotSymbol): Unit = js.native
    
    /* protected */ def emitChildren(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitConstraints(node: Constraints): Unit = js.native
    
    /* protected */ def emitDefine(node: Define): Unit = js.native
    
    /* protected */ def emitDetachedTriviaOfNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitEmptyAssertion(node: EmptyAssertion): Unit = js.native
    
    /* protected */ def emitHtmlCloseTagTrivia(node: HtmlCloseTagTrivia): Unit = js.native
    
    /* protected */ def emitHtmlCommentTrivia(node: HtmlCommentTrivia): Unit = js.native
    
    /* protected */ def emitHtmlOpenTagTrivia(node: HtmlOpenTagTrivia): Unit = js.native
    
    /* protected */ def emitIdentifier(node: Identifier): Unit = js.native
    
    /* protected */ def emitImport(node: Import): Unit = js.native
    
    /* protected */ def emitKeyword(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitLeadingTriviaOfNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitLexicalGoalAssertion(node: LexicalGoalAssertion): Unit = js.native
    
    /* protected */ def emitLine(node: Line): Unit = js.native
    
    /* protected */ def emitLinkReference(node: LinkReference): Unit = js.native
    
    /* protected */ def emitLookaheadAssertion(node: LookaheadAssertion): Unit = js.native
    
    /* protected */ def emitMultiLineCommentTrivia(node: MultiLineCommentTrivia): Unit = js.native
    
    /* protected */ def emitNoSymbolHereAssertion(node: NoSymbolHereAssertion): Unit = js.native
    
    /* protected */ def emitNode(): Unit = js.native
    /* protected */ def emitNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitNodeCore(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitNodes(nodes: js.Iterable[Node[SyntaxKind]]): Unit = js.native
    
    /* protected */ def emitNonterminal(node: Nonterminal): Unit = js.native
    
    /* protected */ def emitNumberLiteral(node: NumberLiteral): Unit = js.native
    
    /* protected */ def emitOneOfList(node: OneOfList): Unit = js.native
    
    /* protected */ def emitOneOfSymbol(node: OneOfSymbol): Unit = js.native
    
    /* protected */ def emitParameter(node: Parameter): Unit = js.native
    
    /* protected */ def emitParameterList(node: ParameterList): Unit = js.native
    
    /* protected */ def emitPlaceholder(node: PlaceholderSymbol): Unit = js.native
    
    /* protected */ def emitProduction(node: Production): Unit = js.native
    
    /* protected */ def emitProse(node: Prose): Unit = js.native
    
    /* protected */ def emitProseAssertion(node: ProseAssertion): Unit = js.native
    
    /* protected */ def emitProseFragmentLiteral(node: ProseFragmentLiteral[ProseFragmentLiteralKind]): Unit = js.native
    
    /* protected */ def emitRightHandSide(node: RightHandSide): Unit = js.native
    
    /* protected */ def emitRightHandSideList(node: RightHandSideList): Unit = js.native
    
    /* protected */ def emitSingleLineCommentTrivia(node: SingleLineCommentTrivia): Unit = js.native
    
    /* protected */ def emitSourceFile(node: SourceFile): Unit = js.native
    
    def emitString(sourceFile: SourceFile, resolver: Resolver, diagnostics: DiagnosticMessages): String = js.native
    def emitString(
      sourceFile: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      cancelable: Unit,
      node: Node[SyntaxKind]
    ): String = js.native
    def emitString(
      sourceFile: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      cancelable: Cancelable
    ): String = js.native
    def emitString(
      sourceFile: SourceFile,
      resolver: Resolver,
      diagnostics: DiagnosticMessages,
      cancelable: Cancelable,
      node: Node[SyntaxKind]
    ): String = js.native
    
    /* protected */ def emitStringLiteral(node: StringLiteral): Unit = js.native
    
    /* protected */ def emitSymbolSet(node: SymbolSet): Unit = js.native
    
    /* protected */ def emitSymbolSpan(node: SymbolSpan): Unit = js.native
    
    /* protected */ def emitTerminal(node: Terminal): Unit = js.native
    
    /* protected */ def emitTerminalLiteral(node: TerminalLiteral): Unit = js.native
    
    /* protected */ def emitTextContent(node: TextContent): Unit = js.native
    
    /* protected */ def emitTextRange(range: TextRange): Unit = js.native
    
    /* protected */ def emitToken(): Unit = js.native
    /* protected */ def emitToken(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitTokenKind(kind: SyntaxKind): Unit = js.native
    
    /* protected */ def emitTrailingTriviaOfNode(node: Node[SyntaxKind]): Unit = js.native
    
    /* protected */ def emitTrivia(node: Trivia): Unit = js.native
    
    /* protected */ def emitTriviaCore(node: Trivia): Unit = js.native
    
    /* protected */ def emitTriviaNodes(): Unit = js.native
    /* protected */ def emitTriviaNodes(nodes: js.Array[Trivia]): Unit = js.native
    
    /* protected */ def emitUnicodeCharacterLiteral(node: UnicodeCharacterLiteral): Unit = js.native
    
    /* protected */ def emitUnicodeCharacterRange(node: UnicodeCharacterRange): Unit = js.native
    
    /* protected */ def encode(text: String): String = js.native
    
    /* protected */ var `extension`: String = js.native
    
    /* protected */ def getOutputFilename(node: SourceFile): String = js.native
    
    /* protected */ var options: CompilerOptions = js.native
    
    /* protected */ var resolver: Resolver = js.native
    
    /* protected */ def sourceFile: js.UndefOr[SourceFile] = js.native
    
    /* protected */ var writer: StringWriter = js.native
  }
}
