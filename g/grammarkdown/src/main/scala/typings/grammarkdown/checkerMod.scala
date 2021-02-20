package typings.grammarkdown

import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.binderMod.BindingTable
import typings.grammarkdown.diagnosticsMod.DiagnosticMessages
import typings.grammarkdown.lineOffsetMapMod.LineOffsetMap
import typings.grammarkdown.navigatorMod.NodeNavigator
import typings.grammarkdown.nodesMod.Declaration
import typings.grammarkdown.nodesMod.Identifier
import typings.grammarkdown.nodesMod.Node
import typings.grammarkdown.nodesMod.RightHandSide
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.optionsMod.CompilerOptions
import typings.grammarkdown.tokensMod.SyntaxKind
import typings.grammarkdown.typesMod.Position
import typings.grammarkdown.typesMod.Range
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkerMod {
  
  @JSImport("grammarkdown/dist/checker", "Checker")
  @js.native
  class Checker () extends StObject {
    def this(options: CompilerOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], lineOffsetMap: LineOffsetMap) = this()
    def this(options: CompilerOptions, lineOffsetMap: LineOffsetMap) = this()
    
    var bindings: js.Any = js.native
    
    var cancelToken: js.Any = js.native
    
    var checkArgument: js.Any = js.native
    
    var checkArgumentList: js.Any = js.native
    
    var checkAssertion: js.Any = js.native
    
    var checkButNotSymbol: js.Any = js.native
    
    var checkButNotSymbolOrHigher: js.Any = js.native
    
    var checkConstraints: js.Any = js.native
    
    var checkEmptyAssertion: js.Any = js.native
    
    var checkGrammarArgument: js.Any = js.native
    
    var checkGrammarArgumentList: js.Any = js.native
    
    var checkGrammarAssertionHead: js.Any = js.native
    
    var checkGrammarAssertionTail: js.Any = js.native
    
    var checkGrammarButNotSymbol: js.Any = js.native
    
    var checkGrammarConstraints: js.Any = js.native
    
    var checkGrammarDefine: js.Any = js.native
    
    var checkGrammarEmptyAssertion: js.Any = js.native
    
    var checkGrammarIdentifier: js.Any = js.native
    
    var checkGrammarLexicalGoalAssertion: js.Any = js.native
    
    var checkGrammarLine: js.Any = js.native
    
    var checkGrammarLinkReference: js.Any = js.native
    
    var checkGrammarLookaheadAssertion: js.Any = js.native
    
    var checkGrammarNoSymbolHereAssertion: js.Any = js.native
    
    var checkGrammarNonTerminal: js.Any = js.native
    
    var checkGrammarOneOfList: js.Any = js.native
    
    var checkGrammarOneOfSymbol: js.Any = js.native
    
    var checkGrammarOptionalSymbol: js.Any = js.native
    
    var checkGrammarParameterList: js.Any = js.native
    
    var checkGrammarProduction: js.Any = js.native
    
    var checkGrammarProseAssertionHead: js.Any = js.native
    
    var checkGrammarRightHandSide: js.Any = js.native
    
    var checkGrammarRightHandSideList: js.Any = js.native
    
    var checkGrammarSymbolSet: js.Any = js.native
    
    var checkGrammarSymbolSpan: js.Any = js.native
    
    var checkGrammarSymbolSpanRest: js.Any = js.native
    
    var checkGrammarTerminal: js.Any = js.native
    
    var checkGrammarUnicodeCharacterLiteral: js.Any = js.native
    
    var checkGrammarUnicodeCharacterRange: js.Any = js.native
    
    var checkIdentifier: js.Any = js.native
    
    var checkLexicalGoalAssertion: js.Any = js.native
    
    var checkLinkReference: js.Any = js.native
    
    var checkLookaheadAssertion: js.Any = js.native
    
    var checkNoSymbolHereAssertion: js.Any = js.native
    
    var checkNonterminal: js.Any = js.native
    
    var checkNonterminalNonStrict: js.Any = js.native
    
    var checkNonterminalStrict: js.Any = js.native
    
    var checkOneOfList: js.Any = js.native
    
    var checkOneOfSymbol: js.Any = js.native
    
    var checkOptionalSymbolOrHigher: js.Any = js.native
    
    var checkParameter: js.Any = js.native
    
    var checkParameterList: js.Any = js.native
    
    var checkPlaceholder: js.Any = js.native
    
    var checkPrimarySymbol: js.Any = js.native
    
    var checkProduction: js.Any = js.native
    
    var checkProductionNonStrict: js.Any = js.native
    
    var checkProductionStrict: js.Any = js.native
    
    var checkProse: js.Any = js.native
    
    var checkProseAssertion: js.Any = js.native
    
    var checkProseFragment: js.Any = js.native
    
    var checkProseFragmentLiteral: js.Any = js.native
    
    var checkRightHandSide: js.Any = js.native
    
    var checkRightHandSideList: js.Any = js.native
    
    var checkSourceElement: js.Any = js.native
    
    def checkSourceFile(sourceFile: SourceFile, bindings: BindingTable, diagnostics: DiagnosticMessages): Unit = js.native
    def checkSourceFile(
      sourceFile: SourceFile,
      bindings: BindingTable,
      diagnostics: DiagnosticMessages,
      cancelable: Cancelable
    ): Unit = js.native
    def checkSourceFile(
      sourceFile: SourceFile,
      bindings: BindingTable,
      diagnostics: DiagnosticMessages,
      cancelable: CancellationToken
    ): Unit = js.native
    
    var checkSymbolOrHigher: js.Any = js.native
    
    var checkSymbolSet: js.Any = js.native
    
    var checkSymbolSpan: js.Any = js.native
    
    var checkSymbolSpanOrHigher: js.Any = js.native
    
    var checkSymbolSpanRest: js.Any = js.native
    
    var checkTerminal: js.Any = js.native
    
    var checkUnarySymbolOrHigher: js.Any = js.native
    
    var checkUnicodeCharacterLiteral: js.Any = js.native
    
    var checkUnicodeCharacterRange: js.Any = js.native
    
    var checkedFileSet: js.Any = js.native
    
    var defineOverrideMap: js.Any = js.native
    
    var defines: js.Any = js.native
    
    var diagnostics: js.Any = js.native
    
    var getDefine: js.Any = js.native
    
    var getNodeLinks: js.Any = js.native
    
    var getProductionParametersByName: js.Any = js.native
    
    var getSymbolLinks: js.Any = js.native
    
    var lineOffsetMap: js.Any = js.native
    
    var markSymbolAsReferenced: js.Any = js.native
    
    var noChecks: js.Any = js.native
    
    var nodeLinks: js.Any = js.native
    
    var options: js.Any = js.native
    
    var preprocessDefine: js.Any = js.native
    
    var preprocessLine: js.Any = js.native
    
    var preprocessSourceElement: js.Any = js.native
    
    var productionParametersByName: js.Any = js.native
    
    var reportError: js.Any = js.native
    
    var reportGrammarError: js.Any = js.native
    
    var reportGrammarErrorForNode: js.Any = js.native
    
    var reportGrammarErrorForNodeOrPos: js.Any = js.native
    
    var reportInvalidAssertion: js.Any = js.native
    
    var reportInvalidHtmlTrivia: js.Any = js.native
    
    var reportInvalidSymbol: js.Any = js.native
    
    var resolveIdentifier: js.Any = js.native
    
    var resolveProduction: js.Any = js.native
    
    var resolveSymbol: js.Any = js.native
    
    var sourceFile: js.Any = js.native
    
    var symbolLinks: js.Any = js.native
  }
  
  @JSImport("grammarkdown/dist/checker", "Resolver")
  @js.native
  class Resolver protected () extends StObject {
    def this(bindings: BindingTable) = this()
    def this(bindings: BindingTable, lineOffsetMap: LineOffsetMap) = this()
    
    val bindings: BindingTable = js.native
    
    def createNavigator(node: Node[SyntaxKind]): js.UndefOr[NodeNavigator] = js.native
    
    def getDeclarations(node: Identifier): js.Array[Declaration] = js.native
    
    /**
      * Gets the effective filename of a raw position within a source file, taking into account `@line` directives.
      */
    def getEffectiveFilenameAtPosition(sourceFile: SourceFile, position: Position): String = js.native
    
    /**
      * Gets the effective position of a raw position within a source file, taking into account `@line` directives.
      */
    def getEffectivePosition(sourceFile: SourceFile, position: Position): Position = js.native
    
    /**
      * Gets the effective range of a raw range within a source file, taking into account `@line` directives.
      */
    def getEffectiveRange(sourceFile: SourceFile, range: Range): Range = js.native
    
    def getParent(node: Node[SyntaxKind]): js.UndefOr[Node[SyntaxKind]] = js.native
    
    def getProductionLinkId(node: Identifier): js.UndefOr[String] = js.native
    
    /**
      * Gets the filename of a parsed grammarkdown file for the provided effective filename and position, taking into account `@line` directives.
      */
    def getRawFilenameAtEffectivePosition(filename: String, position: Position): js.UndefOr[String] = js.native
    
    /**
      * Gets the position in a parsed grammarkdown file for the provided effective filename and position, taking into account `@line` directives.
      */
    def getRawPositionFromEffectivePosition(filename: String, position: Position): js.UndefOr[Position] = js.native
    
    /**
      * Gets the range in a parsed grammarkdown file for the provided effective filename and position, taking into account `@line` directives.
      */
    def getRawRangeFromEffectiveRange(filename: String, range: Range): js.UndefOr[Range] = js.native
    
    def getReferences(node: Identifier): js.Array[Node[SyntaxKind]] = js.native
    
    def getRightHandSideLinkId(node: RightHandSide, includePrefix: Boolean): String = js.native
    
    def getSourceFileOfNode(node: Node[SyntaxKind]): SourceFile = js.native
    
    var lineOffsetMap: js.Any = js.native
  }
}
