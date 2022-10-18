package typings.grammarkdown

import typings.esfxCancelable.mod.Cancelable
import typings.grammarkdown.distBinderMod.BindingTable
import typings.grammarkdown.distDiagnosticsMod.DiagnosticMessages
import typings.grammarkdown.distLineOffsetMapMod.LineOffsetMap
import typings.grammarkdown.distNavigatorMod.NodeNavigator
import typings.grammarkdown.distNodesMod.Declaration
import typings.grammarkdown.distNodesMod.Identifier
import typings.grammarkdown.distNodesMod.Node
import typings.grammarkdown.distNodesMod.RightHandSide
import typings.grammarkdown.distNodesMod.SourceFile
import typings.grammarkdown.distOptionsMod.CompilerOptions
import typings.grammarkdown.distSymbolsMod.Symbol
import typings.grammarkdown.distSymbolsMod.SymbolKind
import typings.grammarkdown.distSymbolsMod.SymbolKind.Parameter
import typings.grammarkdown.distSymbolsMod.SymbolKind.Production
import typings.grammarkdown.distTokensMod.SyntaxKind
import typings.grammarkdown.distTypesMod.Position
import typings.grammarkdown.distTypesMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCheckerMod {
  
  @JSImport("grammarkdown/dist/checker", "Checker")
  @js.native
  open class Checker () extends StObject {
    def this(options: CompilerOptions) = this()
    def this(options: Unit, lineOffsetMap: LineOffsetMap) = this()
    def this(options: CompilerOptions, lineOffsetMap: LineOffsetMap) = this()
    
    /* private */ var _bindings: Any = js.native
    
    /* private */ var _cancelToken: Any = js.native
    
    /* private */ var _checkedFileSet: Any = js.native
    
    /* private */ var _defineOverrideMap: Any = js.native
    
    /* private */ var _defines: Any = js.native
    
    /* private */ var _diagnostics: Any = js.native
    
    /* private */ var _lineOffsetMap: Any = js.native
    
    /* private */ var _noChecks: Any = js.native
    
    /* private */ var _nodeLinks: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _productionParametersByName: Any = js.native
    
    /* private */ var _sourceFile: Any = js.native
    
    /* private */ var _symbolLinks: Any = js.native
    
    /* private */ var checkArgument: Any = js.native
    
    /* private */ var checkArgumentList: Any = js.native
    
    /* private */ var checkAssertion: Any = js.native
    
    /* private */ var checkButNotSymbol: Any = js.native
    
    /* private */ var checkButNotSymbolOrHigher: Any = js.native
    
    /* private */ var checkConstraints: Any = js.native
    
    /* private */ var checkEmptyAssertion: Any = js.native
    
    /* private */ var checkGrammarArgument: Any = js.native
    
    /* private */ var checkGrammarArgumentList: Any = js.native
    
    /* private */ var checkGrammarAssertionHead: Any = js.native
    
    /* private */ var checkGrammarAssertionTail: Any = js.native
    
    /* private */ var checkGrammarButNotSymbol: Any = js.native
    
    /* private */ var checkGrammarConstraints: Any = js.native
    
    /* private */ var checkGrammarDefine: Any = js.native
    
    /* private */ var checkGrammarEmptyAssertion: Any = js.native
    
    /* private */ var checkGrammarIdentifier: Any = js.native
    
    /* private */ var checkGrammarLexicalGoalAssertion: Any = js.native
    
    /* private */ var checkGrammarLine: Any = js.native
    
    /* private */ var checkGrammarLinkReference: Any = js.native
    
    /* private */ var checkGrammarLookaheadAssertion: Any = js.native
    
    /* private */ var checkGrammarNoSymbolHereAssertion: Any = js.native
    
    /* private */ var checkGrammarNonTerminal: Any = js.native
    
    /* private */ var checkGrammarOneOfList: Any = js.native
    
    /* private */ var checkGrammarOneOfSymbol: Any = js.native
    
    /* private */ var checkGrammarOptionalSymbol: Any = js.native
    
    /* private */ var checkGrammarParameterList: Any = js.native
    
    /* private */ var checkGrammarProduction: Any = js.native
    
    /* private */ var checkGrammarProseAssertionHead: Any = js.native
    
    /* private */ var checkGrammarRightHandSide: Any = js.native
    
    /* private */ var checkGrammarRightHandSideList: Any = js.native
    
    /* private */ var checkGrammarSymbolSet: Any = js.native
    
    /* private */ var checkGrammarSymbolSpan: Any = js.native
    
    /* private */ var checkGrammarSymbolSpanRest: Any = js.native
    
    /* private */ var checkGrammarTerminalLiteral: Any = js.native
    
    /* private */ var checkGrammarUnicodeCharacterLiteral: Any = js.native
    
    /* private */ var checkGrammarUnicodeCharacterRange: Any = js.native
    
    /* private */ var checkIdentifier: Any = js.native
    
    /* private */ var checkLexicalGoalAssertion: Any = js.native
    
    /* private */ var checkLinkReference: Any = js.native
    
    /* private */ var checkLookaheadAssertion: Any = js.native
    
    /* private */ var checkNoSymbolHereAssertion: Any = js.native
    
    /* private */ var checkNonterminal: Any = js.native
    
    /* private */ var checkNonterminalNonStrict: Any = js.native
    
    /* private */ var checkNonterminalStrict: Any = js.native
    
    /* private */ var checkOneOfList: Any = js.native
    
    /* private */ var checkOneOfSymbol: Any = js.native
    
    /* private */ var checkOptionalSymbolOrHigher: Any = js.native
    
    /* private */ var checkParameter: Any = js.native
    
    /* private */ var checkParameterList: Any = js.native
    
    /* private */ var checkPlaceholder: Any = js.native
    
    /* private */ var checkPrimarySymbol: Any = js.native
    
    /* private */ var checkProduction: Any = js.native
    
    /* private */ var checkProductionNonStrict: Any = js.native
    
    /* private */ var checkProductionStrict: Any = js.native
    
    /* private */ var checkProse: Any = js.native
    
    /* private */ var checkProseAssertion: Any = js.native
    
    /* private */ var checkProseFragment: Any = js.native
    
    /* private */ var checkProseFragmentLiteral: Any = js.native
    
    /* private */ var checkRightHandSide: Any = js.native
    
    /* private */ var checkRightHandSideList: Any = js.native
    
    /* private */ var checkSourceElement: Any = js.native
    
    def checkSourceFile(sourceFile: SourceFile, bindings: BindingTable, diagnostics: DiagnosticMessages): Unit = js.native
    def checkSourceFile(
      sourceFile: SourceFile,
      bindings: BindingTable,
      diagnostics: DiagnosticMessages,
      cancelable: Cancelable
    ): Unit = js.native
    
    /* private */ var checkSymbolOrHigher: Any = js.native
    
    /* private */ var checkSymbolSet: Any = js.native
    
    /* private */ var checkSymbolSpan: Any = js.native
    
    /* private */ var checkSymbolSpanOrHigher: Any = js.native
    
    /* private */ var checkSymbolSpanRest: Any = js.native
    
    /* private */ var checkTerminal: Any = js.native
    
    /* private */ var checkTerminalLiteral: Any = js.native
    
    /* private */ var checkUnarySymbolOrHigher: Any = js.native
    
    /* private */ var checkUnicodeCharacterLiteral: Any = js.native
    
    /* private */ var checkUnicodeCharacterRange: Any = js.native
    
    /* private */ var getDefine: Any = js.native
    
    /* private */ var getNodeLinks: Any = js.native
    
    /* private */ var getProductionParametersByName: Any = js.native
    
    /* private */ var getSymbolLinks: Any = js.native
    
    /* private */ var markSymbolAsReferenced: Any = js.native
    
    /* private */ var preprocessDefine: Any = js.native
    
    /* private */ var preprocessLine: Any = js.native
    
    /* private */ var preprocessSourceElement: Any = js.native
    
    /* private */ var reportError: Any = js.native
    
    /* private */ var reportGrammarError: Any = js.native
    
    /* private */ var reportGrammarErrorForNode: Any = js.native
    
    /* private */ var reportGrammarErrorForNodeOrPos: Any = js.native
    
    /* private */ var reportInvalidAssertion: Any = js.native
    
    /* private */ var reportInvalidHtmlTrivia: Any = js.native
    
    /* private */ var reportInvalidSymbol: Any = js.native
    
    /* private */ var resolveIdentifier: Any = js.native
    
    /* private */ var resolveProduction: Any = js.native
    
    /* private */ var resolveSymbol: Any = js.native
  }
  
  @JSImport("grammarkdown/dist/checker", "Resolver")
  @js.native
  open class Resolver protected () extends StObject {
    def this(bindings: BindingTable) = this()
    def this(bindings: BindingTable, lineOffsetMap: LineOffsetMap) = this()
    
    /* private */ var _lineOffsetMap: Any = js.native
    
    val bindings: BindingTable = js.native
    
    /**
      * Creates a `NodeNavigator` pointing at `node`. Returns `undefined` if `node` does not have a `SourceFile` as an ancestor.
      */
    def createNavigator(node: Node[SyntaxKind]): js.UndefOr[NodeNavigator] = js.native
    
    /**
      * Gets the declarations for `name` at the provided `location` that have the given `meaning`.
      */
    def getDeclarations(name: String, meaning: Parameter, location: Node[SyntaxKind]): js.Array[typings.grammarkdown.distNodesMod.Parameter] = js.native
    /**
      * Gets the declarations for `name` at the provided `location` that have the given `meaning`.
      */
    def getDeclarations(name: String, meaning: Production, location: Node[SyntaxKind]): js.Array[typings.grammarkdown.distNodesMod.Production] = js.native
    /**
      * Gets the declarations for `name` at the provided `location` that have the given `meaning`.
      */
    def getDeclarations(
      name: String,
      meaning: typings.grammarkdown.distSymbolsMod.SymbolKind.SourceFile,
      location: Node[SyntaxKind]
    ): js.Array[SourceFile] = js.native
    /**
      * Gets the declarations for `name` at the provided `location` that have the given `meaning`.
      */
    def getDeclarations(name: String, meaning: SymbolKind, location: Node[SyntaxKind]): js.Array[Declaration] = js.native
    /**
      * Gets the declarations for the provided identifier.
      */
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
    
    /**
      * Gets the parent `Node` for `node`.
      */
    def getParent(node: Node[SyntaxKind]): js.UndefOr[Node[SyntaxKind]] = js.native
    
    /**
      * Get the link id for the `Production` to which the provided `node` resolves.
      */
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
    
    /**
      * Gets the references to `name` at the provided `location` that have the given `meaning`.
      */
    def getReferences(name: String, meaning: SymbolKind, location: Node[SyntaxKind]): js.Array[Node[SyntaxKind]] = js.native
    /**
      * Gets the references to the provided identifier.
      */
    def getReferences(node: Identifier): js.Array[Node[SyntaxKind]] = js.native
    
    /**
      * Gets the right-hand-side link id for the provided `RightHandSide`.
      * @param includePrefix When `true`, prepends the production link id.
      */
    def getRightHandSideLinkId(node: RightHandSide, includePrefix: Boolean): String = js.native
    
    /**
      * Gets the `SourceFile` of `node`, if it belongs to one.
      */
    def getSourceFileOfNode(node: Node[SyntaxKind]): js.UndefOr[SourceFile] = js.native
    
    /**
      * Gets the `Symbol` for `node`, if it has one.
      */
    def getSymbolOfNode(): js.UndefOr[Symbol] = js.native
    def getSymbolOfNode(node: Node[SyntaxKind]): js.UndefOr[Symbol] = js.native
    
    /**
      * Resolves a `Symbol` for the provided `name` at the given `location` that has the provided `meaning`.
      */
    def resolveSymbol(location: Node[SyntaxKind], name: String, meaning: SymbolKind): js.UndefOr[Symbol] = js.native
  }
}
