package typings.highlightJs

import typings.highlightJs.highlightJsStrings.second_best
import typings.highlightJs.highlightJsStrings.self
import typings.highlightJs.mod.CallbackResponse
import typings.highlightJs.mod.CompiledMode
import typings.highlightJs.mod.Emitter
import typings.highlightJs.mod.EmitterConstructor
import typings.highlightJs.mod.HighlightResult
import typings.highlightJs.mod.Mode
import typings.highlightJs.mod.ModeCallback
import typings.highlightJs.mod.RegexEitherOptions
import typings.highlightJs.mod.illegalData
import typings.std.Element
import typings.std.Omit
import typings.std.Record
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AnyNumberOfTimes extends StObject {
    
    def anyNumberOfTimes(re: String): String = js.native
    def anyNumberOfTimes(re: js.RegExp): String = js.native
    
    def concat(args: (js.RegExp | String)*): String = js.native
    
    def either(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Array<RegExp | string> | [...Array<RegExp | string>, RegexEitherOptions] is not an array type */ args: Array[RegexEitherOptions | js.RegExp | String]
    ): String = js.native
    def either(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Array<RegExp | string> | [...Array<RegExp | string>, RegexEitherOptions] is not an array type */ args: js.Array[js.RegExp | String]
    ): String = js.native
    
    def lookahead(re: String): String = js.native
    def lookahead(re: js.RegExp): String = js.native
    
    def optional(re: String): String = js.native
    def optional(re: js.RegExp): String = js.native
  }
  
  trait Block extends StObject {
    
    var block: Element
    
    var result: HighlightResult
    
    var text: String
  }
  object Block {
    
    inline def apply(block: Element, result: HighlightResult, text: String): Block = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    extension [Self <: Block](x: Self) {
      
      inline def setBlock(value: Element): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setResult(value: HighlightResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlockLanguage extends StObject {
    
    var block: Element
    
    var language: String
  }
  object BlockLanguage {
    
    inline def apply(block: Element, language: String): BlockLanguage = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockLanguage]
    }
    
    extension [Self <: BlockLanguage](x: Self) {
      
      inline def setBlock(value: Element): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
  
  trait El extends StObject {
    
    var el: Element
    
    var result: HighlightResult
    
    var text: String
  }
  object El {
    
    inline def apply(el: Element, result: HighlightResult, text: String): El = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[El]
    }
    
    extension [Self <: El](x: Self) {
      
      inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setResult(value: HighlightResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Emit extends StObject {
    
    var _emit: js.UndefOr[Record[Double, Boolean]] = js.undefined
    
    var _multi: js.UndefOr[Boolean] = js.undefined
    
    var _wrap: js.UndefOr[String] = js.undefined
  }
  object Emit {
    
    inline def apply(): Emit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Emit]
    }
    
    extension [Self <: Emit](x: Self) {
      
      inline def set_emit(value: Record[Double, Boolean]): Self = StObject.set(x, "_emit", value.asInstanceOf[js.Any])
      
      inline def set_emitUndefined: Self = StObject.set(x, "_emit", js.undefined)
      
      inline def set_multi(value: Boolean): Self = StObject.set(x, "_multi", value.asInstanceOf[js.Any])
      
      inline def set_multiUndefined: Self = StObject.set(x, "_multi", js.undefined)
      
      inline def set_wrap(value: String): Self = StObject.set(x, "_wrap", value.asInstanceOf[js.Any])
      
      inline def set_wrapUndefined: Self = StObject.set(x, "_wrap", js.undefined)
    }
  }
  
  trait Language extends StObject {
    
    var el: Element
    
    var language: String
  }
  object Language {
    
    inline def apply(el: Element, language: String): Language = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    extension [Self <: Language](x: Self) {
      
      inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
  
  trait LanguageName extends StObject {
    
    var languageName: String
  }
  object LanguageName {
    
    inline def apply(languageName: String): LanguageName = {
      val __obj = js.Dynamic.literal(languageName = languageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageName]
    }
    
    extension [Self <: LanguageName](x: Self) {
      
      inline def setLanguageName(value: String): Self = StObject.set(x, "languageName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<highlight.js.highlight.js.HighlightResult, 'second_best'> */
  trait OmitHighlightResultsecond extends StObject {
    
    var _emitter: Emitter
    
    var _illegalBy: js.UndefOr[illegalData] = js.undefined
    
    var _top: js.UndefOr[typings.highlightJs.mod.Language | CompiledMode] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var errorRaised: js.UndefOr[js.Error] = js.undefined
    
    var illegal: Boolean
    
    var language: js.UndefOr[String] = js.undefined
    
    var relevance: Double
    
    var secondBest: js.UndefOr[Omit[HighlightResult, second_best]] = js.undefined
    
    var value: String
  }
  object OmitHighlightResultsecond {
    
    inline def apply(_emitter: Emitter, illegal: Boolean, relevance: Double, value: String): OmitHighlightResultsecond = {
      val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], illegal = illegal.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitHighlightResultsecond]
    }
    
    extension [Self <: OmitHighlightResultsecond](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setErrorRaised(value: js.Error): Self = StObject.set(x, "errorRaised", value.asInstanceOf[js.Any])
      
      inline def setErrorRaisedUndefined: Self = StObject.set(x, "errorRaised", js.undefined)
      
      inline def setIllegal(value: Boolean): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      inline def setSecondBest(value: Omit[HighlightResult, second_best]): Self = StObject.set(x, "secondBest", value.asInstanceOf[js.Any])
      
      inline def setSecondBestUndefined: Self = StObject.set(x, "secondBest", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def set_emitter(value: Emitter): Self = StObject.set(x, "_emitter", value.asInstanceOf[js.Any])
      
      inline def set_illegalBy(value: illegalData): Self = StObject.set(x, "_illegalBy", value.asInstanceOf[js.Any])
      
      inline def set_illegalByUndefined: Self = StObject.set(x, "_illegalBy", js.undefined)
      
      inline def set_top(value: typings.highlightJs.mod.Language | CompiledMode): Self = StObject.set(x, "_top", value.asInstanceOf[js.Any])
      
      inline def set_topUndefined: Self = StObject.set(x, "_top", js.undefined)
    }
  }
  
  /* Inlined std.Partial<highlight.js.highlight.js.HLJSOptions> */
  trait PartialHLJSOptions extends StObject {
    
    var __emitter: js.UndefOr[EmitterConstructor] = js.undefined
    
    var classPrefix: js.UndefOr[String] = js.undefined
    
    var cssSelector: js.UndefOr[String] = js.undefined
    
    var ignoreUnescapedHTML: js.UndefOr[Boolean] = js.undefined
    
    var languageDetectRe: js.UndefOr[js.RegExp] = js.undefined
    
    var languages: js.UndefOr[js.Array[String]] = js.undefined
    
    var noHighlightRe: js.UndefOr[js.RegExp] = js.undefined
    
    var throwUnescapedHTML: js.UndefOr[Boolean] = js.undefined
  }
  object PartialHLJSOptions {
    
    inline def apply(): PartialHLJSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHLJSOptions]
    }
    
    extension [Self <: PartialHLJSOptions](x: Self) {
      
      inline def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      inline def setClassPrefixUndefined: Self = StObject.set(x, "classPrefix", js.undefined)
      
      inline def setCssSelector(value: String): Self = StObject.set(x, "cssSelector", value.asInstanceOf[js.Any])
      
      inline def setCssSelectorUndefined: Self = StObject.set(x, "cssSelector", js.undefined)
      
      inline def setIgnoreUnescapedHTML(value: Boolean): Self = StObject.set(x, "ignoreUnescapedHTML", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnescapedHTMLUndefined: Self = StObject.set(x, "ignoreUnescapedHTML", js.undefined)
      
      inline def setLanguageDetectRe(value: js.RegExp): Self = StObject.set(x, "languageDetectRe", value.asInstanceOf[js.Any])
      
      inline def setLanguageDetectReUndefined: Self = StObject.set(x, "languageDetectRe", js.undefined)
      
      inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
      
      inline def setNoHighlightRe(value: js.RegExp): Self = StObject.set(x, "noHighlightRe", value.asInstanceOf[js.Any])
      
      inline def setNoHighlightReUndefined: Self = StObject.set(x, "noHighlightRe", js.undefined)
      
      inline def setThrowUnescapedHTML(value: Boolean): Self = StObject.set(x, "throwUnescapedHTML", value.asInstanceOf[js.Any])
      
      inline def setThrowUnescapedHTMLUndefined: Self = StObject.set(x, "throwUnescapedHTML", js.undefined)
      
      inline def set__emitter(value: EmitterConstructor): Self = StObject.set(x, "__emitter", value.asInstanceOf[js.Any])
      
      inline def set__emitterUndefined: Self = StObject.set(x, "__emitter", js.undefined)
    }
  }
  
  /* Inlined std.Partial<highlight.js.highlight.js.Mode> & {  binary :string | std.RegExp | undefined} */
  trait PartialModebinarystringRe extends StObject {
    
    var __beforeBegin: js.UndefOr[js.Function] = js.undefined
    
    var begin: js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])] = js.undefined
    
    var beginKeywords: js.UndefOr[String] = js.undefined
    
    var beginScope: js.UndefOr[String | (Record[Double, String])] = js.undefined
    
    var binary: js.UndefOr[String | js.RegExp] = js.undefined
    
    var cachedVariants: js.UndefOr[js.Array[Mode]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contains: js.UndefOr[js.Array[self | Mode]] = js.undefined
    
    var end: js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])] = js.undefined
    
    var endSameAsBegin: js.UndefOr[Boolean] = js.undefined
    
    var endScope: js.UndefOr[String | (Record[Double, String])] = js.undefined
    
    var endsParent: js.UndefOr[Boolean] = js.undefined
    
    var endsWithParent: js.UndefOr[Boolean] = js.undefined
    
    var excludeBegin: js.UndefOr[Boolean] = js.undefined
    
    var excludeEnd: js.UndefOr[Boolean] = js.undefined
    
    var illegal: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var isCompiled: js.UndefOr[Boolean] = js.undefined
    
    var keywords: js.UndefOr[(Record[String, Any]) | String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var lexemes: js.UndefOr[String | js.RegExp] = js.undefined
    
    var `match`: js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])] = js.undefined
    
    @JSName("on:begin")
    var onColonbegin: js.UndefOr[ModeCallback] = js.undefined
    
    @JSName("on:end")
    var onColonend: js.UndefOr[js.Function] = js.undefined
    
    var parent: js.UndefOr[Mode] = js.undefined
    
    var relevance: js.UndefOr[Double] = js.undefined
    
    var returnBegin: js.UndefOr[Boolean] = js.undefined
    
    var returnEnd: js.UndefOr[Boolean] = js.undefined
    
    var scope: js.UndefOr[String | (Record[Double, String])] = js.undefined
    
    var skip: js.UndefOr[Boolean] = js.undefined
    
    var starts: js.UndefOr[Mode] = js.undefined
    
    var subLanguage: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var variants: js.UndefOr[js.Array[Mode]] = js.undefined
  }
  object PartialModebinarystringRe {
    
    inline def apply(): PartialModebinarystringRe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialModebinarystringRe]
    }
    
    extension [Self <: PartialModebinarystringRe](x: Self) {
      
      inline def setBegin(value: js.RegExp | String | (js.Array[js.RegExp | String])): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginKeywords(value: String): Self = StObject.set(x, "beginKeywords", value.asInstanceOf[js.Any])
      
      inline def setBeginKeywordsUndefined: Self = StObject.set(x, "beginKeywords", js.undefined)
      
      inline def setBeginScope(value: String | (Record[Double, String])): Self = StObject.set(x, "beginScope", value.asInstanceOf[js.Any])
      
      inline def setBeginScopeUndefined: Self = StObject.set(x, "beginScope", js.undefined)
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setBeginVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "begin", js.Array(value*))
      
      inline def setBinary(value: String | js.RegExp): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setCachedVariants(value: js.Array[Mode]): Self = StObject.set(x, "cachedVariants", value.asInstanceOf[js.Any])
      
      inline def setCachedVariantsUndefined: Self = StObject.set(x, "cachedVariants", js.undefined)
      
      inline def setCachedVariantsVarargs(value: Mode*): Self = StObject.set(x, "cachedVariants", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContains(value: js.Array[self | Mode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setContainsVarargs(value: (self | Mode)*): Self = StObject.set(x, "contains", js.Array(value*))
      
      inline def setEnd(value: js.RegExp | String | (js.Array[js.RegExp | String])): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndSameAsBegin(value: Boolean): Self = StObject.set(x, "endSameAsBegin", value.asInstanceOf[js.Any])
      
      inline def setEndSameAsBeginUndefined: Self = StObject.set(x, "endSameAsBegin", js.undefined)
      
      inline def setEndScope(value: String | (Record[Double, String])): Self = StObject.set(x, "endScope", value.asInstanceOf[js.Any])
      
      inline def setEndScopeUndefined: Self = StObject.set(x, "endScope", js.undefined)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "end", js.Array(value*))
      
      inline def setEndsParent(value: Boolean): Self = StObject.set(x, "endsParent", value.asInstanceOf[js.Any])
      
      inline def setEndsParentUndefined: Self = StObject.set(x, "endsParent", js.undefined)
      
      inline def setEndsWithParent(value: Boolean): Self = StObject.set(x, "endsWithParent", value.asInstanceOf[js.Any])
      
      inline def setEndsWithParentUndefined: Self = StObject.set(x, "endsWithParent", js.undefined)
      
      inline def setExcludeBegin(value: Boolean): Self = StObject.set(x, "excludeBegin", value.asInstanceOf[js.Any])
      
      inline def setExcludeBeginUndefined: Self = StObject.set(x, "excludeBegin", js.undefined)
      
      inline def setExcludeEnd(value: Boolean): Self = StObject.set(x, "excludeEnd", value.asInstanceOf[js.Any])
      
      inline def setExcludeEndUndefined: Self = StObject.set(x, "excludeEnd", js.undefined)
      
      inline def setIllegal(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
      
      inline def setIllegalUndefined: Self = StObject.set(x, "illegal", js.undefined)
      
      inline def setIllegalVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "illegal", js.Array(value*))
      
      inline def setIsCompiled(value: Boolean): Self = StObject.set(x, "isCompiled", value.asInstanceOf[js.Any])
      
      inline def setIsCompiledUndefined: Self = StObject.set(x, "isCompiled", js.undefined)
      
      inline def setKeywords(value: (Record[String, Any]) | String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLexemes(value: String | js.RegExp): Self = StObject.set(x, "lexemes", value.asInstanceOf[js.Any])
      
      inline def setLexemesUndefined: Self = StObject.set(x, "lexemes", js.undefined)
      
      inline def setMatch(value: js.RegExp | String | (js.Array[js.RegExp | String])): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMatchVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "match", js.Array(value*))
      
      inline def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = StObject.set(x, "on:begin", js.Any.fromFunction2(value))
      
      inline def setOnColonbeginUndefined: Self = StObject.set(x, "on:begin", js.undefined)
      
      inline def setOnColonend(value: js.Function): Self = StObject.set(x, "on:end", value.asInstanceOf[js.Any])
      
      inline def setOnColonendUndefined: Self = StObject.set(x, "on:end", js.undefined)
      
      inline def setParent(value: Mode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
      
      inline def setReturnBegin(value: Boolean): Self = StObject.set(x, "returnBegin", value.asInstanceOf[js.Any])
      
      inline def setReturnBeginUndefined: Self = StObject.set(x, "returnBegin", js.undefined)
      
      inline def setReturnEnd(value: Boolean): Self = StObject.set(x, "returnEnd", value.asInstanceOf[js.Any])
      
      inline def setReturnEndUndefined: Self = StObject.set(x, "returnEnd", js.undefined)
      
      inline def setScope(value: String | (Record[Double, String])): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setStarts(value: Mode): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
      
      inline def setStartsUndefined: Self = StObject.set(x, "starts", js.undefined)
      
      inline def setSubLanguage(value: String | js.Array[String]): Self = StObject.set(x, "subLanguage", value.asInstanceOf[js.Any])
      
      inline def setSubLanguageUndefined: Self = StObject.set(x, "subLanguage", js.undefined)
      
      inline def setSubLanguageVarargs(value: String*): Self = StObject.set(x, "subLanguage", js.Array(value*))
      
      inline def setVariants(value: js.Array[Mode]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setVariantsVarargs(value: Mode*): Self = StObject.set(x, "variants", js.Array(value*))
      
      inline def set__beforeBegin(value: js.Function): Self = StObject.set(x, "__beforeBegin", value.asInstanceOf[js.Any])
      
      inline def set__beforeBeginUndefined: Self = StObject.set(x, "__beforeBegin", js.undefined)
    }
  }
}
