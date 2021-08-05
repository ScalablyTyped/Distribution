package typings.highlightJs

import typings.highlightJs.highlightJsBooleans.`true`
import typings.std.Record
import typings.std.RegExp
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.highlightJs.CompiledMode because var conflicts: compiled, contains, keywords. Inlined className, returnBegin, __beforeBegin, beginKeywords, end, onColonend, excludeBegin, lexemes, onColonbegin, endsParent, parent, subLanguage, relevance, variants, skip, excludeEnd, cached_variants, label, starts, begin, endSameAsBegin, endsWithParent, returnEnd, illegal, data, terminator_end, keywordPatternRe, beginRe, endRe, illegalRe, matcher */ trait CompiledLanguage
  extends StObject
     with LanguageDetail {
  
  var __beforeBegin: js.UndefOr[js.Function] = js.undefined
  
  var begin: js.UndefOr[RegExp | String] = js.undefined
  
  var beginKeywords: js.UndefOr[String] = js.undefined
  
  var beginRe: RegExp
  
  var cached_variants: js.UndefOr[js.Array[Mode]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  @JSName("compiled")
  var compiled_CompiledLanguage: `true`
  
  @JSName("contains")
  var contains_CompiledLanguage: js.Array[CompiledMode]
  
  var data: Record[String, js.Any]
  
  var end: js.UndefOr[RegExp | String] = js.undefined
  
  var endRe: RegExp
  
  var endSameAsBegin: js.UndefOr[Boolean] = js.undefined
  
  var endsParent: js.UndefOr[Boolean] = js.undefined
  
  var endsWithParent: js.UndefOr[Boolean] = js.undefined
  
  var excludeBegin: js.UndefOr[Boolean] = js.undefined
  
  var excludeEnd: js.UndefOr[Boolean] = js.undefined
  
  var illegal: js.UndefOr[String | RegExp] = js.undefined
  
  var illegalRe: RegExp
  
  var keywordPatternRe: RegExp
  
  @JSName("keywords")
  var keywords_CompiledLanguage: Record[String, js.Any]
  
  var label: js.UndefOr[String] = js.undefined
  
  var lexemes: js.UndefOr[String | RegExp] = js.undefined
  
  var matcher: js.Any
  
  @JSName("on:begin")
  var onColonbegin: js.UndefOr[ModeCallback] = js.undefined
  
  @JSName("on:end")
  var onColonend: js.UndefOr[js.Function] = js.undefined
  
  var parent: js.UndefOr[Mode] & js.UndefOr[CompiledMode]
  
  var relevance: js.UndefOr[Double] = js.undefined
  
  var returnBegin: js.UndefOr[Boolean] = js.undefined
  
  var returnEnd: js.UndefOr[Boolean] = js.undefined
  
  var skip: js.UndefOr[Boolean] = js.undefined
  
  var starts: js.UndefOr[Mode] & js.UndefOr[CompiledMode]
  
  var subLanguage: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var terminator_end: String
  
  var variants: js.UndefOr[js.Array[Mode]] = js.undefined
}
object CompiledLanguage {
  
  inline def apply(
    beginRe: RegExp,
    contains: js.Array[CompiledMode],
    data: Record[String, js.Any],
    endRe: RegExp,
    illegalRe: RegExp,
    keywordPatternRe: RegExp,
    keywords: Record[String, js.Any],
    matcher: js.Any,
    parent: js.UndefOr[Mode] & js.UndefOr[CompiledMode],
    starts: js.UndefOr[Mode] & js.UndefOr[CompiledMode],
    terminator_end: String
  ): CompiledLanguage = {
    val __obj = js.Dynamic.literal(beginRe = beginRe.asInstanceOf[js.Any], compiled = true, contains = contains.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], endRe = endRe.asInstanceOf[js.Any], illegalRe = illegalRe.asInstanceOf[js.Any], keywordPatternRe = keywordPatternRe.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], matcher = matcher.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], starts = starts.asInstanceOf[js.Any], terminator_end = terminator_end.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledLanguage]
  }
  
  extension [Self <: CompiledLanguage](x: Self) {
    
    inline def setBegin(value: RegExp | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginKeywords(value: String): Self = StObject.set(x, "beginKeywords", value.asInstanceOf[js.Any])
    
    inline def setBeginKeywordsUndefined: Self = StObject.set(x, "beginKeywords", js.undefined)
    
    inline def setBeginRe(value: RegExp): Self = StObject.set(x, "beginRe", value.asInstanceOf[js.Any])
    
    inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    inline def setCached_variants(value: js.Array[Mode]): Self = StObject.set(x, "cached_variants", value.asInstanceOf[js.Any])
    
    inline def setCached_variantsUndefined: Self = StObject.set(x, "cached_variants", js.undefined)
    
    inline def setCached_variantsVarargs(value: Mode*): Self = StObject.set(x, "cached_variants", js.Array(value :_*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCompiled(value: `true`): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
    
    inline def setContains(value: js.Array[CompiledMode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsVarargs(value: CompiledMode*): Self = StObject.set(x, "contains", js.Array(value :_*))
    
    inline def setData(value: Record[String, js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: RegExp | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndRe(value: RegExp): Self = StObject.set(x, "endRe", value.asInstanceOf[js.Any])
    
    inline def setEndSameAsBegin(value: Boolean): Self = StObject.set(x, "endSameAsBegin", value.asInstanceOf[js.Any])
    
    inline def setEndSameAsBeginUndefined: Self = StObject.set(x, "endSameAsBegin", js.undefined)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEndsParent(value: Boolean): Self = StObject.set(x, "endsParent", value.asInstanceOf[js.Any])
    
    inline def setEndsParentUndefined: Self = StObject.set(x, "endsParent", js.undefined)
    
    inline def setEndsWithParent(value: Boolean): Self = StObject.set(x, "endsWithParent", value.asInstanceOf[js.Any])
    
    inline def setEndsWithParentUndefined: Self = StObject.set(x, "endsWithParent", js.undefined)
    
    inline def setExcludeBegin(value: Boolean): Self = StObject.set(x, "excludeBegin", value.asInstanceOf[js.Any])
    
    inline def setExcludeBeginUndefined: Self = StObject.set(x, "excludeBegin", js.undefined)
    
    inline def setExcludeEnd(value: Boolean): Self = StObject.set(x, "excludeEnd", value.asInstanceOf[js.Any])
    
    inline def setExcludeEndUndefined: Self = StObject.set(x, "excludeEnd", js.undefined)
    
    inline def setIllegal(value: String | RegExp): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
    
    inline def setIllegalRe(value: RegExp): Self = StObject.set(x, "illegalRe", value.asInstanceOf[js.Any])
    
    inline def setIllegalUndefined: Self = StObject.set(x, "illegal", js.undefined)
    
    inline def setKeywordPatternRe(value: RegExp): Self = StObject.set(x, "keywordPatternRe", value.asInstanceOf[js.Any])
    
    inline def setKeywords(value: Record[String, js.Any]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLexemes(value: String | RegExp): Self = StObject.set(x, "lexemes", value.asInstanceOf[js.Any])
    
    inline def setLexemesUndefined: Self = StObject.set(x, "lexemes", js.undefined)
    
    inline def setMatcher(value: js.Any): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    inline def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = StObject.set(x, "on:begin", js.Any.fromFunction2(value))
    
    inline def setOnColonbeginUndefined: Self = StObject.set(x, "on:begin", js.undefined)
    
    inline def setOnColonend(value: js.Function): Self = StObject.set(x, "on:end", value.asInstanceOf[js.Any])
    
    inline def setOnColonendUndefined: Self = StObject.set(x, "on:end", js.undefined)
    
    inline def setParent(value: js.UndefOr[Mode] & js.UndefOr[CompiledMode]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
    
    inline def setReturnBegin(value: Boolean): Self = StObject.set(x, "returnBegin", value.asInstanceOf[js.Any])
    
    inline def setReturnBeginUndefined: Self = StObject.set(x, "returnBegin", js.undefined)
    
    inline def setReturnEnd(value: Boolean): Self = StObject.set(x, "returnEnd", value.asInstanceOf[js.Any])
    
    inline def setReturnEndUndefined: Self = StObject.set(x, "returnEnd", js.undefined)
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setStarts(value: js.UndefOr[Mode] & js.UndefOr[CompiledMode]): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    inline def setSubLanguage(value: String | js.Array[String]): Self = StObject.set(x, "subLanguage", value.asInstanceOf[js.Any])
    
    inline def setSubLanguageUndefined: Self = StObject.set(x, "subLanguage", js.undefined)
    
    inline def setSubLanguageVarargs(value: String*): Self = StObject.set(x, "subLanguage", js.Array(value :_*))
    
    inline def setTerminator_end(value: String): Self = StObject.set(x, "terminator_end", value.asInstanceOf[js.Any])
    
    inline def setVariants(value: js.Array[Mode]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: Mode*): Self = StObject.set(x, "variants", js.Array(value :_*))
    
    inline def set__beforeBegin(value: js.Function): Self = StObject.set(x, "__beforeBegin", value.asInstanceOf[js.Any])
    
    inline def set__beforeBeginUndefined: Self = StObject.set(x, "__beforeBegin", js.undefined)
  }
}
