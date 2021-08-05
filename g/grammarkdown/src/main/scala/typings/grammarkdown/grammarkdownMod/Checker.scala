package typings.grammarkdown.grammarkdownMod

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Checker")
@js.native
class Checker () extends StObject {
  def this(options: CompilerOptions) = this()
  
  /* private */ var bindings: js.Any = js.native
  
  /* private */ var cancelToken: js.Any = js.native
  
  /* private */ var checkArgument: js.Any = js.native
  
  /* private */ var checkArgumentList: js.Any = js.native
  
  /* private */ var checkAssertion: js.Any = js.native
  
  /* private */ var checkButNotSymbol: js.Any = js.native
  
  /* private */ var checkButNotSymbolOrHigher: js.Any = js.native
  
  /* private */ var checkConstraints: js.Any = js.native
  
  /* private */ var checkEmptyAssertion: js.Any = js.native
  
  /* private */ var checkGrammarArgument: js.Any = js.native
  
  /* private */ var checkGrammarArgumentList: js.Any = js.native
  
  /* private */ var checkGrammarAssertionHead: js.Any = js.native
  
  /* private */ var checkGrammarAssertionTail: js.Any = js.native
  
  /* private */ var checkGrammarButNotSymbol: js.Any = js.native
  
  /* private */ var checkGrammarConstraints: js.Any = js.native
  
  /* private */ var checkGrammarDefine: js.Any = js.native
  
  /* private */ var checkGrammarEmptyAssertion: js.Any = js.native
  
  /* private */ var checkGrammarIdentifier: js.Any = js.native
  
  /* private */ var checkGrammarLexicalGoalAssertion: js.Any = js.native
  
  /* private */ var checkGrammarLinkReference: js.Any = js.native
  
  /* private */ var checkGrammarLookaheadAssertion: js.Any = js.native
  
  /* private */ var checkGrammarNoSymbolHereAssertion: js.Any = js.native
  
  /* private */ var checkGrammarOneOfList: js.Any = js.native
  
  /* private */ var checkGrammarOneOfSymbol: js.Any = js.native
  
  /* private */ var checkGrammarOptionalSymbol: js.Any = js.native
  
  /* private */ var checkGrammarParameterList: js.Any = js.native
  
  /* private */ var checkGrammarProduction: js.Any = js.native
  
  /* private */ var checkGrammarProseAssertionHead: js.Any = js.native
  
  /* private */ var checkGrammarRightHandSide: js.Any = js.native
  
  /* private */ var checkGrammarRightHandSideList: js.Any = js.native
  
  /* private */ var checkGrammarSymbolSet: js.Any = js.native
  
  /* private */ var checkGrammarSymbolSpan: js.Any = js.native
  
  /* private */ var checkGrammarSymbolSpanRest: js.Any = js.native
  
  /* private */ var checkGrammarTerminal: js.Any = js.native
  
  /* private */ var checkGrammarUnicodeCharacterLiteral: js.Any = js.native
  
  /* private */ var checkGrammarUnicodeCharacterRange: js.Any = js.native
  
  /* private */ var checkIdentifier: js.Any = js.native
  
  /* private */ var checkLexicalGoalAssertion: js.Any = js.native
  
  /* private */ var checkLinkReference: js.Any = js.native
  
  /* private */ var checkLookaheadAssertion: js.Any = js.native
  
  /* private */ var checkNoSymbolHereAssertion: js.Any = js.native
  
  /* private */ var checkNonterminal: js.Any = js.native
  
  /* private */ var checkNonterminalNonStrict: js.Any = js.native
  
  /* private */ var checkNonterminalStrict: js.Any = js.native
  
  /* private */ var checkOneOfList: js.Any = js.native
  
  /* private */ var checkOneOfSymbol: js.Any = js.native
  
  /* private */ var checkOptionalSymbolOrHigher: js.Any = js.native
  
  /* private */ var checkParameter: js.Any = js.native
  
  /* private */ var checkParameterList: js.Any = js.native
  
  /* private */ var checkPlaceholder: js.Any = js.native
  
  /* private */ var checkPrimarySymbol: js.Any = js.native
  
  /* private */ var checkProduction: js.Any = js.native
  
  /* private */ var checkProductionNonStrict: js.Any = js.native
  
  /* private */ var checkProductionStrict: js.Any = js.native
  
  /* private */ var checkProse: js.Any = js.native
  
  /* private */ var checkProseAssertion: js.Any = js.native
  
  /* private */ var checkProseFragment: js.Any = js.native
  
  /* private */ var checkProseFragmentLiteral: js.Any = js.native
  
  /* private */ var checkRightHandSide: js.Any = js.native
  
  /* private */ var checkRightHandSideList: js.Any = js.native
  
  /* private */ var checkSourceElement: js.Any = js.native
  
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
  
  /* private */ var checkSymbolOrHigher: js.Any = js.native
  
  /* private */ var checkSymbolSet: js.Any = js.native
  
  /* private */ var checkSymbolSpan: js.Any = js.native
  
  /* private */ var checkSymbolSpanOrHigher: js.Any = js.native
  
  /* private */ var checkSymbolSpanRest: js.Any = js.native
  
  /* private */ var checkTerminal: js.Any = js.native
  
  /* private */ var checkUnarySymbolOrHigher: js.Any = js.native
  
  /* private */ var checkUnicodeCharacterLiteral: js.Any = js.native
  
  /* private */ var checkUnicodeCharacterRange: js.Any = js.native
  
  /* private */ var checkedFileSet: js.Any = js.native
  
  /* private */ var diagnostics: js.Any = js.native
  
  /* private */ var getNodeLinks: js.Any = js.native
  
  /* private */ var getProductionParametersByName: js.Any = js.native
  
  /* private */ var getSymbolLinks: js.Any = js.native
  
  /* private */ var markSymbolAsReferenced: js.Any = js.native
  
  /* private */ var noChecks: js.Any = js.native
  
  /* private */ var noStrictParametricProductions: js.Any = js.native
  
  /* private */ var noUnusedParameters: js.Any = js.native
  
  /* private */ var nodeLinks: js.Any = js.native
  
  /* private */ var options: js.Any = js.native
  
  /* private */ var preprocessDefine: js.Any = js.native
  
  /* private */ var preprocessSourceElement: js.Any = js.native
  
  /* private */ var productionParametersByName: js.Any = js.native
  
  /* private */ var reportError: js.Any = js.native
  
  /* private */ var reportGrammarError: js.Any = js.native
  
  /* private */ var reportGrammarErrorForNode: js.Any = js.native
  
  /* private */ var reportGrammarErrorForNodeOrPos: js.Any = js.native
  
  /* private */ var reportInvalidAssertion: js.Any = js.native
  
  /* private */ var reportInvalidSymbol: js.Any = js.native
  
  /* private */ var resolveIdentifier: js.Any = js.native
  
  /* private */ var resolveProduction: js.Any = js.native
  
  /* private */ var resolveSymbol: js.Any = js.native
  
  /* private */ var sourceFile: js.Any = js.native
  
  /* private */ var symbolLinks: js.Any = js.native
}
