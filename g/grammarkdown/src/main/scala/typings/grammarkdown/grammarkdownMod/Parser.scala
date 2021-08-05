package typings.grammarkdown.grammarkdownMod

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Parser")
@js.native
class Parser () extends StObject {
  
  /* private */ var canBeIdentifier: js.Any = js.native
  
  /* private */ var cancelToken: js.Any = js.native
  
  /* private */ var diagnostics: js.Any = js.native
  
  /* private */ var finishNode: js.Any = js.native
  
  /* private */ var imports: js.Any = js.native
  
  /* private */ var isEOF: js.Any = js.native
  
  /* private */ var isStartOfArgument: js.Any = js.native
  
  /* private */ var isStartOfArgumentList: js.Any = js.native
  
  /* private */ var isStartOfListElement: js.Any = js.native
  
  /* private */ var isStartOfParameter: js.Any = js.native
  
  /* private */ var isStartOfRightHandSide: js.Any = js.native
  
  /* private */ var isStartOfSourceElement: js.Any = js.native
  
  /* private */ var isStartOfSymbolSpan: js.Any = js.native
  
  /* private */ var isStartOfSymbolSpanOnSameLine: js.Any = js.native
  
  /* private */ var lookahead: js.Any = js.native
  
  /* private */ var nextToken: js.Any = js.native
  
  /* private */ var nextTokenIsArgument: js.Any = js.native
  
  /* private */ var nextTokenIsParameterOperatorToken: js.Any = js.native
  
  /* private */ var parse: js.Any = js.native
  
  /* private */ var parseAnyToken: js.Any = js.native
  
  /* private */ var parseArgument: js.Any = js.native
  
  /* private */ var parseArgumentListTail: js.Any = js.native
  
  /* private */ var parseAssertion: js.Any = js.native
  
  /* private */ var parseBody: js.Any = js.native
  
  /* private */ var parseButNotSymbolTail: js.Any = js.native
  
  /* private */ var parseDefine: js.Any = js.native
  
  /* private */ var parseElement: js.Any = js.native
  
  /* private */ var parseEmptyAssertionTail: js.Any = js.native
  
  /* private */ var parseIdentifier: js.Any = js.native
  
  /* private */ var parseImport: js.Any = js.native
  
  /* private */ var parseInvalidAssertionTail: js.Any = js.native
  
  /* private */ var parseInvalidSymbol: js.Any = js.native
  
  /* private */ var parseLexicalGoalAssertionTail: js.Any = js.native
  
  /* private */ var parseLinkReference: js.Any = js.native
  
  /* private */ var parseList: js.Any = js.native
  
  /* private */ var parseLookaheadAssertionTail: js.Any = js.native
  
  /* private */ var parseMetaElement: js.Any = js.native
  
  /* private */ var parseNoSymbolHereAssertionTail: js.Any = js.native
  
  /* private */ var parseNonterminal: js.Any = js.native
  
  /* private */ var parseOneOfList: js.Any = js.native
  
  /* private */ var parseOneOfSymbol: js.Any = js.native
  
  /* private */ var parseOptional: js.Any = js.native
  
  /* private */ var parseParameter: js.Any = js.native
  
  /* private */ var parseParameterListTail: js.Any = js.native
  
  /* private */ var parsePlaceholderSymbol: js.Any = js.native
  
  /* private */ var parsePrimarySymbol: js.Any = js.native
  
  /* private */ var parseProduction: js.Any = js.native
  
  /* private */ var parseProse: js.Any = js.native
  
  /* private */ var parseProseAssertion: js.Any = js.native
  
  /* private */ var parseProseFragmentLiteral: js.Any = js.native
  
  /* private */ var parseProseFragments: js.Any = js.native
  
  /* private */ var parseRightHandSide: js.Any = js.native
  
  /* private */ var parseRightHandSideList: js.Any = js.native
  
  /* private */ var parseSourceElement: js.Any = js.native
  
  /* private */ var parseSourceElementList: js.Any = js.native
  
  def parseSourceFile(filename: String, text: String): SourceFile = js.native
  def parseSourceFile(filename: String, text: String, cancelable: Cancelable): SourceFile = js.native
  def parseSourceFile(filename: String, text: String, cancelable: CancellationToken): SourceFile = js.native
  
  /* private */ var parseStringLiteral: js.Any = js.native
  
  /* private */ var parseSymbol: js.Any = js.native
  
  /* private */ var parseSymbolSetTail: js.Any = js.native
  
  /* private */ var parseSymbolSpan: js.Any = js.native
  
  /* private */ var parseSymbolSpanRest: js.Any = js.native
  
  /* private */ var parseSymbolSpanRestOrSymbolSet: js.Any = js.native
  
  /* private */ var parseTerminal: js.Any = js.native
  
  /* private */ var parseToken: js.Any = js.native
  
  /* private */ var parseUnarySymbol: js.Any = js.native
  
  /* private */ var parseUnicodeCharacterLiteral: js.Any = js.native
  
  /* private */ var parseUnicodeCharacterRangeOrHigher: js.Any = js.native
  
  /* private */ var parseUnicodeCharacterRangeTail: js.Any = js.native
  
  /* private */ var parsingContext: js.Any = js.native
  
  /* private */ var readTokenText: js.Any = js.native
  
  /* private */ var readTokenValue: js.Any = js.native
  
  /* private */ var recover: js.Any = js.native
  
  /* private */ var reportDiagnostics: js.Any = js.native
  
  /* private */ var scanner: js.Any = js.native
  
  /* private */ var skipUntil: js.Any = js.native
  
  /* private */ var speculate: js.Any = js.native
  
  /* private */ var tags: js.Any = js.native
  
  /* private */ var tryMoveToNextElement: js.Any = js.native
  
  /* private */ var tryParseArgumentList: js.Any = js.native
  
  /* private */ var tryParseConstraints: js.Any = js.native
  
  /* private */ var tryParseParameterList: js.Any = js.native
  
  /* private */ var tryParseSymbolSpan: js.Any = js.native
  
  /* private */ var tryStopParsingList: js.Any = js.native
}
