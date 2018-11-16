package typings
package grammarkdownLib.distEmitterEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/emitter/emitter", "Emitter")
@js.native
class Emitter protected () extends js.Object {
  def this(options: grammarkdownLib.distOptionsMod.CompilerOptions) = this()
  var cancellationToken: js.Any = js.native
  var diagnostics: js.Any = js.native
  var extension: java.lang.String = js.native
  var options: grammarkdownLib.distOptionsMod.CompilerOptions = js.native
  var resolver: grammarkdownLib.distCheckerMod.Resolver = js.native
  var sourceFile: js.Any = js.native
  var triviaPos: js.Any = js.native
  var writer: grammarkdownLib.distStringwriterMod.StringWriter = js.native
  /* protected */ def afterEmitNode(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): scala.Unit = js.native
  /* protected */ def beforeEmitNode(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): scala.Unit = js.native
  /* protected */ def createWriter(options: grammarkdownLib.distOptionsMod.CompilerOptions): grammarkdownLib.distStringwriterMod.StringWriter = js.native
  def emit(
    node: grammarkdownLib.distNodesMod.SourceFile,
    resolver: grammarkdownLib.distCheckerMod.Resolver,
    diagnostics: grammarkdownLib.distDiagnosticsMod.DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ java.lang.String, 
      /* text */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      scala.Unit | stdLib.Promise[scala.Unit]
    ]
  ): scala.Unit | stdLib.Promise[scala.Unit] = js.native
  def emit(
    node: grammarkdownLib.distNodesMod.SourceFile,
    resolver: grammarkdownLib.distCheckerMod.Resolver,
    diagnostics: grammarkdownLib.distDiagnosticsMod.DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ java.lang.String, 
      /* text */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      scala.Unit | stdLib.Promise[scala.Unit]
    ],
    cancellationToken: prexLib.prexMod.CancellationToken
  ): scala.Unit | stdLib.Promise[scala.Unit] = js.native
  /* protected */ def emitArgument(node: grammarkdownLib.distNodesMod.Argument): scala.Unit = js.native
  /* protected */ def emitArgumentList(node: grammarkdownLib.distNodesMod.ArgumentList): scala.Unit = js.native
  /* protected */ def emitButNotSymbol(node: grammarkdownLib.distNodesMod.ButNotSymbol): scala.Unit = js.native
  /* protected */ def emitConstraints(node: grammarkdownLib.distNodesMod.Constraints): scala.Unit = js.native
  /* protected */ def emitEmptyAssertion(node: grammarkdownLib.distNodesMod.EmptyAssertion): scala.Unit = js.native
  /* protected */ def emitHtmlTrivia(range: grammarkdownLib.distCoreMod.TextRange): scala.Unit = js.native
  /* protected */ def emitIdentifier(node: grammarkdownLib.distNodesMod.Identifier): scala.Unit = js.native
  /* protected */ def emitImport(node: grammarkdownLib.distNodesMod.Import): scala.Unit = js.native
  /* protected */ def emitKeyword(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): scala.Unit = js.native
  /* protected */ def emitLeadingHtmlTriviaOfNode(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): scala.Unit = js.native
  /* protected */ def emitLexicalGoalAssertion(node: grammarkdownLib.distNodesMod.LexicalGoalAssertion): scala.Unit = js.native
  /* protected */ def emitLookaheadAssertion(node: grammarkdownLib.distNodesMod.LookaheadAssertion): scala.Unit = js.native
  /* protected */ def emitNoSymbolHereAssertion(node: grammarkdownLib.distNodesMod.NoSymbolHereAssertion): scala.Unit = js.native
  /* protected */ def emitNode(): scala.Unit = js.native
  /* protected */ def emitNode(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): scala.Unit = js.native
  /* protected */ def emitNonterminal(node: grammarkdownLib.distNodesMod.Nonterminal): scala.Unit = js.native
  /* protected */ def emitOneOfList(node: grammarkdownLib.distNodesMod.OneOfList): scala.Unit = js.native
  /* protected */ def emitOneOfSymbol(node: grammarkdownLib.distNodesMod.OneOfSymbol): scala.Unit = js.native
  /* protected */ def emitParameter(node: grammarkdownLib.distNodesMod.Parameter): scala.Unit = js.native
  /* protected */ def emitParameterList(node: grammarkdownLib.distNodesMod.ParameterList): scala.Unit = js.native
  /* protected */ def emitPlaceholder(node: grammarkdownLib.distNodesMod.PlaceholderSymbol): scala.Unit = js.native
  /* protected */ def emitProduction(node: grammarkdownLib.distNodesMod.Production): scala.Unit = js.native
  /* protected */ def emitProse(node: grammarkdownLib.distNodesMod.Prose): scala.Unit = js.native
  /* protected */ def emitProseAssertion(node: grammarkdownLib.distNodesMod.ProseAssertion): scala.Unit = js.native
  /* protected */ def emitProseFragmentLiteral(
    node: grammarkdownLib.distNodesMod.ProseFragmentLiteral[grammarkdownLib.distTokensMod.ProseFragmentLiteralKind]
  ): scala.Unit = js.native
  /* protected */ def emitRightHandSide(node: grammarkdownLib.distNodesMod.RightHandSide): scala.Unit = js.native
  /* protected */ def emitRightHandSideList(node: grammarkdownLib.distNodesMod.RightHandSideList): scala.Unit = js.native
  /* protected */ def emitSourceFile(node: grammarkdownLib.distNodesMod.SourceFile): scala.Unit = js.native
  def emitString(
    node: grammarkdownLib.distNodesMod.SourceFile,
    resolver: grammarkdownLib.distCheckerMod.Resolver,
    diagnostics: grammarkdownLib.distDiagnosticsMod.DiagnosticMessages
  ): java.lang.String = js.native
  def emitString(
    node: grammarkdownLib.distNodesMod.SourceFile,
    resolver: grammarkdownLib.distCheckerMod.Resolver,
    diagnostics: grammarkdownLib.distDiagnosticsMod.DiagnosticMessages,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): java.lang.String = js.native
  /* protected */ def emitSymbolSet(node: grammarkdownLib.distNodesMod.SymbolSet): scala.Unit = js.native
  /* protected */ def emitSymbolSpan(node: grammarkdownLib.distNodesMod.SymbolSpan): scala.Unit = js.native
  def emitSync(
    node: grammarkdownLib.distNodesMod.SourceFile,
    resolver: grammarkdownLib.distCheckerMod.Resolver,
    diagnostics: grammarkdownLib.distDiagnosticsMod.DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ java.lang.String, 
      /* text */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def emitSync(
    node: grammarkdownLib.distNodesMod.SourceFile,
    resolver: grammarkdownLib.distCheckerMod.Resolver,
    diagnostics: grammarkdownLib.distDiagnosticsMod.DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ java.lang.String, 
      /* text */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      scala.Unit
    ],
    cancellationToken: prexLib.prexMod.CancellationToken
  ): scala.Unit = js.native
  /* protected */ def emitTerminal(node: grammarkdownLib.distNodesMod.Terminal): scala.Unit = js.native
  /* protected */ def emitTextContent(node: grammarkdownLib.distNodesMod.TextContent): scala.Unit = js.native
  /* protected */ def emitToken(): scala.Unit = js.native
  /* protected */ def emitToken(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): scala.Unit = js.native
  /* protected */ def emitTrailingHtmlTriviaOfNode(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): scala.Unit = js.native
  /* protected */ def emitUnicodeCharacterLiteral(node: grammarkdownLib.distNodesMod.UnicodeCharacterLiteral): scala.Unit = js.native
  /* protected */ def emitUnicodeCharacterRange(node: grammarkdownLib.distNodesMod.UnicodeCharacterRange): scala.Unit = js.native
  /* protected */ def encode(text: java.lang.String): java.lang.String = js.native
  /* protected */ def getOutputFilename(node: grammarkdownLib.distNodesMod.SourceFile): java.lang.String = js.native
}

