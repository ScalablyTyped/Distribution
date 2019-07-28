package typings.grammarkdown.distEmitterEmitterMod

import typings.grammarkdown.distCheckerMod.Resolver
import typings.grammarkdown.distCoreMod.TextRange
import typings.grammarkdown.distDiagnosticsMod.DiagnosticMessages
import typings.grammarkdown.distNodesMod.Argument
import typings.grammarkdown.distNodesMod.ArgumentList
import typings.grammarkdown.distNodesMod.ButNotSymbol
import typings.grammarkdown.distNodesMod.Constraints
import typings.grammarkdown.distNodesMod.EmptyAssertion
import typings.grammarkdown.distNodesMod.Identifier
import typings.grammarkdown.distNodesMod.Import
import typings.grammarkdown.distNodesMod.LexicalGoalAssertion
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
import typings.grammarkdown.distNodesMod.SymbolSet
import typings.grammarkdown.distNodesMod.SymbolSpan
import typings.grammarkdown.distNodesMod.Terminal
import typings.grammarkdown.distNodesMod.TextContent
import typings.grammarkdown.distNodesMod.UnicodeCharacterLiteral
import typings.grammarkdown.distNodesMod.UnicodeCharacterRange
import typings.grammarkdown.distOptionsMod.CompilerOptions
import typings.grammarkdown.distStringwriterMod.StringWriter
import typings.grammarkdown.distTokensMod.ProseFragmentLiteralKind
import typings.grammarkdown.distTokensMod.SyntaxKind
import typings.prex.prexMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/emitter/emitter", "Emitter")
@js.native
class Emitter protected () extends js.Object {
  def this(options: CompilerOptions) = this()
  var cancellationToken: js.Any = js.native
  var diagnostics: js.Any = js.native
  var extension: String = js.native
  var options: CompilerOptions = js.native
  var resolver: Resolver = js.native
  var sourceFile: js.Any = js.native
  var triviaPos: js.Any = js.native
  var writer: StringWriter = js.native
  /* protected */ def afterEmitNode(node: Node[SyntaxKind]): Unit = js.native
  /* protected */ def beforeEmitNode(node: Node[SyntaxKind]): Unit = js.native
  /* protected */ def createWriter(options: CompilerOptions): StringWriter = js.native
  def emit(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ String, 
      /* text */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      Unit | js.Promise[Unit]
    ]
  ): Unit | js.Promise[Unit] = js.native
  def emit(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ String, 
      /* text */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      Unit | js.Promise[Unit]
    ],
    cancellationToken: CancellationToken
  ): Unit | js.Promise[Unit] = js.native
  /* protected */ def emitArgument(node: Argument): Unit = js.native
  /* protected */ def emitArgumentList(node: ArgumentList): Unit = js.native
  /* protected */ def emitButNotSymbol(node: ButNotSymbol): Unit = js.native
  /* protected */ def emitConstraints(node: Constraints): Unit = js.native
  /* protected */ def emitEmptyAssertion(node: EmptyAssertion): Unit = js.native
  /* protected */ def emitHtmlTrivia(range: TextRange): Unit = js.native
  /* protected */ def emitIdentifier(node: Identifier): Unit = js.native
  /* protected */ def emitImport(node: Import): Unit = js.native
  /* protected */ def emitKeyword(node: Node[SyntaxKind]): Unit = js.native
  /* protected */ def emitLeadingHtmlTriviaOfNode(node: Node[SyntaxKind]): Unit = js.native
  /* protected */ def emitLexicalGoalAssertion(node: LexicalGoalAssertion): Unit = js.native
  /* protected */ def emitLookaheadAssertion(node: LookaheadAssertion): Unit = js.native
  /* protected */ def emitNoSymbolHereAssertion(node: NoSymbolHereAssertion): Unit = js.native
  /* protected */ def emitNode(): Unit = js.native
  /* protected */ def emitNode(node: Node[SyntaxKind]): Unit = js.native
  /* protected */ def emitNonterminal(node: Nonterminal): Unit = js.native
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
  /* protected */ def emitSourceFile(node: SourceFile): Unit = js.native
  def emitString(node: SourceFile, resolver: Resolver, diagnostics: DiagnosticMessages): String = js.native
  def emitString(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    cancellationToken: CancellationToken
  ): String = js.native
  /* protected */ def emitSymbolSet(node: SymbolSet): Unit = js.native
  /* protected */ def emitSymbolSpan(node: SymbolSpan): Unit = js.native
  def emitSync(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ String, 
      /* text */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      Unit
    ]
  ): Unit = js.native
  def emitSync(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ String, 
      /* text */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      Unit
    ],
    cancellationToken: CancellationToken
  ): Unit = js.native
  /* protected */ def emitTerminal(node: Terminal): Unit = js.native
  /* protected */ def emitTextContent(node: TextContent): Unit = js.native
  /* protected */ def emitToken(): Unit = js.native
  /* protected */ def emitToken(node: Node[SyntaxKind]): Unit = js.native
  /* protected */ def emitTrailingHtmlTriviaOfNode(node: Node[SyntaxKind]): Unit = js.native
  /* protected */ def emitUnicodeCharacterLiteral(node: UnicodeCharacterLiteral): Unit = js.native
  /* protected */ def emitUnicodeCharacterRange(node: UnicodeCharacterRange): Unit = js.native
  /* protected */ def encode(text: String): String = js.native
  /* protected */ def getOutputFilename(node: SourceFile): String = js.native
}

