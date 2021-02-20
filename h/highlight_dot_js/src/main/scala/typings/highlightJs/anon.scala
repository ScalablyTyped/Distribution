package typings.highlightJs

import typings.highlightJs.highlightJsStrings.self
import typings.std.Error
import typings.std.Record
import typings.std.RegExp
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LanguageName extends StObject {
    
    var languageName: String = js.native
  }
  object LanguageName {
    
    @scala.inline
    def apply(languageName: String): LanguageName = {
      val __obj = js.Dynamic.literal(languageName = languageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageName]
    }
    
    @scala.inline
    implicit class LanguageNameMutableBuilder[Self <: LanguageName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguageName(value: String): Self = StObject.set(x, "languageName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<highlight.js.HighlightResult, 'second_best'> */
  @js.native
  trait OmitHighlightResultsecond extends StObject {
    
    var emitter: Emitter = js.native
    
    var errorRaised: js.UndefOr[Error] = js.native
    
    var illegal: Boolean = js.native
    
    var illegalBy: js.UndefOr[illegalData] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var relevance: Double = js.native
    
    var sofar: js.UndefOr[String] = js.native
    
    var top: js.UndefOr[Language | CompiledMode] = js.native
    
    var value: String = js.native
  }
  object OmitHighlightResultsecond {
    
    @scala.inline
    def apply(emitter: Emitter, illegal: Boolean, relevance: Double, value: String): OmitHighlightResultsecond = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], illegal = illegal.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitHighlightResultsecond]
    }
    
    @scala.inline
    implicit class OmitHighlightResultsecondMutableBuilder[Self <: OmitHighlightResultsecond] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmitter(value: Emitter): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorRaised(value: Error): Self = StObject.set(x, "errorRaised", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorRaisedUndefined: Self = StObject.set(x, "errorRaised", js.undefined)
      
      @scala.inline
      def setIllegal(value: Boolean): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIllegalBy(value: illegalData): Self = StObject.set(x, "illegalBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIllegalByUndefined: Self = StObject.set(x, "illegalBy", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSofar(value: String): Self = StObject.set(x, "sofar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSofarUndefined: Self = StObject.set(x, "sofar", js.undefined)
      
      @scala.inline
      def setTop(value: Language | CompiledMode): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<highlight.js.HLJSOptions> */
  @js.native
  trait PartialHLJSOptions extends StObject {
    
    var __emitter: js.UndefOr[EmitterConstructor] = js.native
    
    var classPrefix: js.UndefOr[String] = js.native
    
    var languageDetectRe: js.UndefOr[RegExp] = js.native
    
    var languages: js.UndefOr[js.Array[String]] = js.native
    
    var noHighlightRe: js.UndefOr[RegExp] = js.native
    
    var tabReplace: js.UndefOr[String] = js.native
    
    var useBR: js.UndefOr[Boolean] = js.native
  }
  object PartialHLJSOptions {
    
    @scala.inline
    def apply(): PartialHLJSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHLJSOptions]
    }
    
    @scala.inline
    implicit class PartialHLJSOptionsMutableBuilder[Self <: PartialHLJSOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassPrefixUndefined: Self = StObject.set(x, "classPrefix", js.undefined)
      
      @scala.inline
      def setLanguageDetectRe(value: RegExp): Self = StObject.set(x, "languageDetectRe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageDetectReUndefined: Self = StObject.set(x, "languageDetectRe", js.undefined)
      
      @scala.inline
      def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      @scala.inline
      def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
      
      @scala.inline
      def setNoHighlightRe(value: RegExp): Self = StObject.set(x, "noHighlightRe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoHighlightReUndefined: Self = StObject.set(x, "noHighlightRe", js.undefined)
      
      @scala.inline
      def setTabReplace(value: String): Self = StObject.set(x, "tabReplace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabReplaceUndefined: Self = StObject.set(x, "tabReplace", js.undefined)
      
      @scala.inline
      def setUseBR(value: Boolean): Self = StObject.set(x, "useBR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBRUndefined: Self = StObject.set(x, "useBR", js.undefined)
      
      @scala.inline
      def set__emitter(value: EmitterConstructor): Self = StObject.set(x, "__emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__emitterUndefined: Self = StObject.set(x, "__emitter", js.undefined)
    }
  }
  
  /* Inlined std.Partial<highlight.js.Mode> & {  binary :string | std.RegExp | undefined} */
  @js.native
  trait PartialModebinarystringRe extends StObject {
    
    var __beforeBegin: js.UndefOr[js.Function] = js.native
    
    var begin: js.UndefOr[RegExp | String] = js.native
    
    var beginKeywords: js.UndefOr[String] = js.native
    
    var binary: js.UndefOr[String | RegExp] = js.native
    
    var cached_variants: js.UndefOr[js.Array[Mode]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var compiled: js.UndefOr[Boolean] = js.native
    
    var contains: js.UndefOr[js.Array[self | Mode]] = js.native
    
    var end: js.UndefOr[RegExp | String] = js.native
    
    var endSameAsBegin: js.UndefOr[Boolean] = js.native
    
    var endsParent: js.UndefOr[Boolean] = js.native
    
    var endsWithParent: js.UndefOr[Boolean] = js.native
    
    var excludeBegin: js.UndefOr[Boolean] = js.native
    
    var excludeEnd: js.UndefOr[Boolean] = js.native
    
    var illegal: js.UndefOr[String | RegExp] = js.native
    
    var keywords: js.UndefOr[(Record[String, _]) | String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var lexemes: js.UndefOr[String | RegExp] = js.native
    
    @JSName("on:begin")
    var onColonbegin: js.UndefOr[ModeCallback] = js.native
    
    @JSName("on:end")
    var onColonend: js.UndefOr[js.Function] = js.native
    
    var parent: js.UndefOr[Mode] = js.native
    
    var relevance: js.UndefOr[Double] = js.native
    
    var returnBegin: js.UndefOr[Boolean] = js.native
    
    var returnEnd: js.UndefOr[Boolean] = js.native
    
    var skip: js.UndefOr[Boolean] = js.native
    
    var starts: js.UndefOr[Mode] = js.native
    
    var subLanguage: js.UndefOr[String | js.Array[String]] = js.native
    
    var variants: js.UndefOr[js.Array[Mode]] = js.native
  }
  object PartialModebinarystringRe {
    
    @scala.inline
    def apply(): PartialModebinarystringRe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialModebinarystringRe]
    }
    
    @scala.inline
    implicit class PartialModebinarystringReMutableBuilder[Self <: PartialModebinarystringRe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBegin(value: RegExp | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeginKeywords(value: String): Self = StObject.set(x, "beginKeywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeginKeywordsUndefined: Self = StObject.set(x, "beginKeywords", js.undefined)
      
      @scala.inline
      def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      @scala.inline
      def setBinary(value: String | RegExp): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setCached_variants(value: js.Array[Mode]): Self = StObject.set(x, "cached_variants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCached_variantsUndefined: Self = StObject.set(x, "cached_variants", js.undefined)
      
      @scala.inline
      def setCached_variantsVarargs(value: Mode*): Self = StObject.set(x, "cached_variants", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
      
      @scala.inline
      def setContains(value: js.Array[self | Mode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setContainsVarargs(value: (self | Mode)*): Self = StObject.set(x, "contains", js.Array(value :_*))
      
      @scala.inline
      def setEnd(value: RegExp | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndSameAsBegin(value: Boolean): Self = StObject.set(x, "endSameAsBegin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndSameAsBeginUndefined: Self = StObject.set(x, "endSameAsBegin", js.undefined)
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEndsParent(value: Boolean): Self = StObject.set(x, "endsParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndsParentUndefined: Self = StObject.set(x, "endsParent", js.undefined)
      
      @scala.inline
      def setEndsWithParent(value: Boolean): Self = StObject.set(x, "endsWithParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndsWithParentUndefined: Self = StObject.set(x, "endsWithParent", js.undefined)
      
      @scala.inline
      def setExcludeBegin(value: Boolean): Self = StObject.set(x, "excludeBegin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeBeginUndefined: Self = StObject.set(x, "excludeBegin", js.undefined)
      
      @scala.inline
      def setExcludeEnd(value: Boolean): Self = StObject.set(x, "excludeEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeEndUndefined: Self = StObject.set(x, "excludeEnd", js.undefined)
      
      @scala.inline
      def setIllegal(value: String | RegExp): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIllegalUndefined: Self = StObject.set(x, "illegal", js.undefined)
      
      @scala.inline
      def setKeywords(value: (Record[String, _]) | String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLexemes(value: String | RegExp): Self = StObject.set(x, "lexemes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLexemesUndefined: Self = StObject.set(x, "lexemes", js.undefined)
      
      @scala.inline
      def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = StObject.set(x, "on:begin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnColonbeginUndefined: Self = StObject.set(x, "on:begin", js.undefined)
      
      @scala.inline
      def setOnColonend(value: js.Function): Self = StObject.set(x, "on:end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnColonendUndefined: Self = StObject.set(x, "on:end", js.undefined)
      
      @scala.inline
      def setParent(value: Mode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
      
      @scala.inline
      def setReturnBegin(value: Boolean): Self = StObject.set(x, "returnBegin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnBeginUndefined: Self = StObject.set(x, "returnBegin", js.undefined)
      
      @scala.inline
      def setReturnEnd(value: Boolean): Self = StObject.set(x, "returnEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnEndUndefined: Self = StObject.set(x, "returnEnd", js.undefined)
      
      @scala.inline
      def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setStarts(value: Mode): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsUndefined: Self = StObject.set(x, "starts", js.undefined)
      
      @scala.inline
      def setSubLanguage(value: String | js.Array[String]): Self = StObject.set(x, "subLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubLanguageUndefined: Self = StObject.set(x, "subLanguage", js.undefined)
      
      @scala.inline
      def setSubLanguageVarargs(value: String*): Self = StObject.set(x, "subLanguage", js.Array(value :_*))
      
      @scala.inline
      def setVariants(value: js.Array[Mode]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      @scala.inline
      def setVariantsVarargs(value: Mode*): Self = StObject.set(x, "variants", js.Array(value :_*))
      
      @scala.inline
      def set__beforeBegin(value: js.Function): Self = StObject.set(x, "__beforeBegin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__beforeBeginUndefined: Self = StObject.set(x, "__beforeBegin", js.undefined)
    }
  }
}
