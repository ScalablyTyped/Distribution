package typings.grammarkdown

import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.anon.Text
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.typesMod.Range
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("grammarkdown/dist/parser", "Parser")
  @js.native
  class Parser () extends StObject {
    
    var canBeIdentifier: js.Any = js.native
    
    var cancelToken: js.Any = js.native
    
    var diagnostics: js.Any = js.native
    
    var finishNode: js.Any = js.native
    
    var imports: js.Any = js.native
    
    var isEOF: js.Any = js.native
    
    var isStartOfArgument: js.Any = js.native
    
    var isStartOfArgumentList: js.Any = js.native
    
    var isStartOfListElement: js.Any = js.native
    
    var isStartOfParameter: js.Any = js.native
    
    var isStartOfRightHandSide: js.Any = js.native
    
    var isStartOfSourceElement: js.Any = js.native
    
    var isStartOfSymbolSpan: js.Any = js.native
    
    var isStartOfSymbolSpanOnSameLine: js.Any = js.native
    
    var lookahead: js.Any = js.native
    
    var nextToken: js.Any = js.native
    
    var nextTokenIsArgument: js.Any = js.native
    
    var nextTokenIsParameterOperatorToken: js.Any = js.native
    
    var parse: js.Any = js.native
    
    var parseAnyToken: js.Any = js.native
    
    var parseArgument: js.Any = js.native
    
    var parseArgumentListTail: js.Any = js.native
    
    var parseAssertion: js.Any = js.native
    
    var parseBody: js.Any = js.native
    
    var parseButNotSymbolTail: js.Any = js.native
    
    var parseDefine: js.Any = js.native
    
    var parseElement: js.Any = js.native
    
    var parseEmptyAssertionTail: js.Any = js.native
    
    var parseIdentifier: js.Any = js.native
    
    var parseImport: js.Any = js.native
    
    var parseInvalidAssertionTail: js.Any = js.native
    
    var parseInvalidSymbol: js.Any = js.native
    
    var parseLexicalGoalAssertionTail: js.Any = js.native
    
    var parseLine: js.Any = js.native
    
    var parseLinkReference: js.Any = js.native
    
    var parseList: js.Any = js.native
    
    var parseLookaheadAssertionTail: js.Any = js.native
    
    var parseMetaElement: js.Any = js.native
    
    var parseNoSymbolHereAssertionTail: js.Any = js.native
    
    var parseNonterminal: js.Any = js.native
    
    var parseNumberLiteral: js.Any = js.native
    
    var parseOneOfList: js.Any = js.native
    
    var parseOneOfSymbol: js.Any = js.native
    
    var parseOptional: js.Any = js.native
    
    var parseParameter: js.Any = js.native
    
    var parseParameterListTail: js.Any = js.native
    
    var parsePlaceholderSymbol: js.Any = js.native
    
    var parsePrimarySymbol: js.Any = js.native
    
    var parseProduction: js.Any = js.native
    
    var parseProse: js.Any = js.native
    
    var parseProseAssertion: js.Any = js.native
    
    var parseProseFragmentLiteral: js.Any = js.native
    
    var parseProseFragments: js.Any = js.native
    
    var parseRightHandSide: js.Any = js.native
    
    var parseRightHandSideList: js.Any = js.native
    
    var parseSourceElement: js.Any = js.native
    
    var parseSourceElementList: js.Any = js.native
    
    def parseSourceFile(filename: String, text: String): SourceFile = js.native
    def parseSourceFile(filename: String, text: String, cancelable: Cancelable): SourceFile = js.native
    def parseSourceFile(filename: String, text: String, cancelable: CancellationToken): SourceFile = js.native
    
    var parseStringLiteral: js.Any = js.native
    
    var parseSymbol: js.Any = js.native
    
    var parseSymbolSetTail: js.Any = js.native
    
    var parseSymbolSpan: js.Any = js.native
    
    var parseSymbolSpanRest: js.Any = js.native
    
    var parseSymbolSpanRestOrSymbolSet: js.Any = js.native
    
    var parseTerminal: js.Any = js.native
    
    var parseToken: js.Any = js.native
    
    var parseUnarySymbol: js.Any = js.native
    
    var parseUnicodeCharacterLiteral: js.Any = js.native
    
    var parseUnicodeCharacterRangeOrHigher: js.Any = js.native
    
    var parseUnicodeCharacterRangeTail: js.Any = js.native
    
    var parsingContext: js.Any = js.native
    
    var readTokenText: js.Any = js.native
    
    var readTokenValue: js.Any = js.native
    
    var recover: js.Any = js.native
    
    var reportDiagnostics: js.Any = js.native
    
    var scanner: js.Any = js.native
    
    var skipUntil: js.Any = js.native
    
    var speculate: js.Any = js.native
    
    var tags: js.Any = js.native
    
    var tryMoveToNextElement: js.Any = js.native
    
    var tryParseArgumentList: js.Any = js.native
    
    var tryParseConstraints: js.Any = js.native
    
    var tryParseParameterList: js.Any = js.native
    
    var tryParseSymbolSpan: js.Any = js.native
    
    var tryStopParsingList: js.Any = js.native
  }
  
  @js.native
  trait TextChange extends StObject {
    
    var range: Range = js.native
    
    var text: String = js.native
  }
  object TextChange {
    
    @scala.inline
    def apply(range: Range, text: String): TextChange = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextChange]
    }
    
    @JSImport("grammarkdown/dist/parser", "TextChange.applyChange")
    @js.native
    def applyChange(originalText: String, change: TextChange): String = js.native
    
    @JSImport("grammarkdown/dist/parser", "TextChange.clone")
    @js.native
    def clone_(change: TextChange): Text = js.native
    
    @JSImport("grammarkdown/dist/parser", "TextChange.create")
    @js.native
    def create(text: String, range: Range): Text = js.native
    
    @JSImport("grammarkdown/dist/parser", "TextChange.isUnchanged")
    @js.native
    def isUnchanged(change: TextChange): Boolean = js.native
    
    @scala.inline
    implicit class TextChangeMutableBuilder[Self <: TextChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
