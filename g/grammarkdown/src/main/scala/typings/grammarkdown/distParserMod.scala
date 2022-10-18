package typings.grammarkdown

import typings.esfxCancelable.mod.Cancelable
import typings.grammarkdown.distNodesMod.SourceFile
import typings.grammarkdown.distTypesMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserMod {
  
  @JSImport("grammarkdown/dist/parser", "Parser")
  @js.native
  open class Parser () extends StObject {
    
    /* private */ var canBeIdentifier: Any = js.native
    
    /* private */ var cancelToken: Any = js.native
    
    /* private */ var diagnostics: Any = js.native
    
    /* private */ var finishNode: Any = js.native
    
    /* private */ var imports: Any = js.native
    
    /* private */ var isEOF: Any = js.native
    
    /* private */ var isStartOfArgument: Any = js.native
    
    /* private */ var isStartOfArgumentList: Any = js.native
    
    /* private */ var isStartOfListElement: Any = js.native
    
    /* private */ var isStartOfParameter: Any = js.native
    
    /* private */ var isStartOfRightHandSide: Any = js.native
    
    /* private */ var isStartOfSourceElement: Any = js.native
    
    /* private */ var isStartOfSymbolSpan: Any = js.native
    
    /* private */ var isStartOfSymbolSpanOnSameLine: Any = js.native
    
    /* private */ var lookahead: Any = js.native
    
    /* private */ var nextToken: Any = js.native
    
    /* private */ var nextTokenIsArgument: Any = js.native
    
    /* private */ var nextTokenIsParameterOperatorToken: Any = js.native
    
    /* private */ var parse: Any = js.native
    
    /* private */ var parseAnyToken: Any = js.native
    
    /* private */ var parseArgument: Any = js.native
    
    /* private */ var parseArgumentListTail: Any = js.native
    
    /* private */ var parseAssertion: Any = js.native
    
    /* private */ var parseBody: Any = js.native
    
    /* private */ var parseButNotSymbolTail: Any = js.native
    
    /* private */ var parseDefine: Any = js.native
    
    /* private */ var parseElement: Any = js.native
    
    /* private */ var parseEmptyAssertionTail: Any = js.native
    
    /* private */ var parseIdentifier: Any = js.native
    
    /* private */ var parseImport: Any = js.native
    
    /* private */ var parseInvalidAssertionTail: Any = js.native
    
    /* private */ var parseInvalidSymbol: Any = js.native
    
    /* private */ var parseLexicalGoalAssertionTail: Any = js.native
    
    /* private */ var parseLine: Any = js.native
    
    /* private */ var parseLinkReference: Any = js.native
    
    /* private */ var parseList: Any = js.native
    
    /* private */ var parseLookaheadAssertionTail: Any = js.native
    
    /* private */ var parseMetaElement: Any = js.native
    
    /* private */ var parseNoSymbolHereAssertionTail: Any = js.native
    
    /* private */ var parseNonterminal: Any = js.native
    
    /* private */ var parseNumberLiteral: Any = js.native
    
    /* private */ var parseOneOfList: Any = js.native
    
    /* private */ var parseOneOfSymbol: Any = js.native
    
    /* private */ var parseOptional: Any = js.native
    
    /* private */ var parseParameter: Any = js.native
    
    /* private */ var parseParameterListTail: Any = js.native
    
    /* private */ var parsePlaceholderSymbol: Any = js.native
    
    /* private */ var parsePrimarySymbol: Any = js.native
    
    /* private */ var parseProduction: Any = js.native
    
    /* private */ var parseProse: Any = js.native
    
    /* private */ var parseProseAssertion: Any = js.native
    
    /* private */ var parseProseFragmentLiteral: Any = js.native
    
    /* private */ var parseProseFragments: Any = js.native
    
    /* private */ var parseRightHandSide: Any = js.native
    
    /* private */ var parseRightHandSideList: Any = js.native
    
    /* private */ var parseSourceElement: Any = js.native
    
    /* private */ var parseSourceElementList: Any = js.native
    
    def parseSourceFile(filename: String, text: String): SourceFile = js.native
    def parseSourceFile(filename: String, text: String, cancelable: Cancelable): SourceFile = js.native
    
    /* private */ var parseStringLiteral: Any = js.native
    
    /* private */ var parseSymbol: Any = js.native
    
    /* private */ var parseSymbolSetTail: Any = js.native
    
    /* private */ var parseSymbolSpan: Any = js.native
    
    /* private */ var parseSymbolSpanRest: Any = js.native
    
    /* private */ var parseSymbolSpanRestOrSymbolSet: Any = js.native
    
    /* private */ var parseTerminal: Any = js.native
    
    /* private */ var parseTerminalLiteral: Any = js.native
    
    /* private */ var parseToken: Any = js.native
    
    /* private */ var parseUnarySymbol: Any = js.native
    
    /* private */ var parseUnicodeCharacterLiteral: Any = js.native
    
    /* private */ var parseUnicodeCharacterRangeOrHigher: Any = js.native
    
    /* private */ var parseUnicodeCharacterRangeTail: Any = js.native
    
    /* private */ var parsingContext: Any = js.native
    
    /* private */ var readTokenText: Any = js.native
    
    /* private */ var readTokenValue: Any = js.native
    
    /* private */ var recover: Any = js.native
    
    /* private */ var reportDiagnostics: Any = js.native
    
    /* private */ var scanner: Any = js.native
    
    /* private */ var skipUntil: Any = js.native
    
    /* private */ var speculate: Any = js.native
    
    /* private */ var trivia: Any = js.native
    
    /* private */ var tryMoveToNextElement: Any = js.native
    
    /* private */ var tryParseArgumentList: Any = js.native
    
    /* private */ var tryParseConstraints: Any = js.native
    
    /* private */ var tryParseParameterList: Any = js.native
    
    /* private */ var tryParseSymbolSpan: Any = js.native
    
    /* private */ var tryStopParsingList: Any = js.native
  }
  
  trait TextChange extends StObject {
    
    var range: Range
    
    var text: String
  }
  object TextChange {
    
    inline def apply(range: Range, text: String): TextChange = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextChange]
    }
    
    @JSImport("grammarkdown/dist/parser", "TextChange")
    @js.native
    val ^ : js.Any = js.native
    
    inline def applyChange(originalText: String, change: TextChange): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChange")(originalText.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def clone_(change: TextChange): typings.grammarkdown.anon.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(change.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.anon.Range]
    
    inline def create(text: String, range: Range): typings.grammarkdown.anon.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.grammarkdown.anon.Range]
    
    inline def isUnchanged(change: TextChange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnchanged")(change.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    extension [Self <: TextChange](x: Self) {
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
