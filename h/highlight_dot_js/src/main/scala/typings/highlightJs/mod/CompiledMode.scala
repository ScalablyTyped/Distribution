package typings.highlightJs.mod

import typings.highlightJs.highlightJsBooleans.`true`
import typings.highlightJs.privateMod.KeywordDict
import typings.std.Record
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<highlight.js.highlight.js.Mode, 'contains'> & {  begin :std.RegExp | string | undefined,   end :std.RegExp | string | undefined,   scope :string | undefined,   contains :std.Array<highlight.js.highlight.js.CompiledMode>,   keywords :highlight.js.highlight.js/private.KeywordDict,   data :std.Record<string, any>,   terminatorEnd :string,   keywordPatternRe :std.RegExp,   beginRe :std.RegExp,   endRe :std.RegExp,   illegalRe :std.RegExp,   matcher :any,   isCompiled :true,   starts :highlight.js.highlight.js.CompiledMode | undefined,   parent :highlight.js.highlight.js.CompiledMode | undefined,   beginScope :highlight.js.highlight.js.CompiledScope | undefined,   endScope :highlight.js.highlight.js.CompiledScope | undefined} */
trait CompiledMode extends StObject {
  
  var __beforeBegin: js.UndefOr[js.Function] = js.undefined
  
  var begin: (js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])]) & (js.UndefOr[js.RegExp | String])
  
  var beginKeywords: js.UndefOr[String] = js.undefined
  
  var beginRe: js.RegExp
  
  var beginScope: (js.UndefOr[String | (Record[Double, String])]) & js.UndefOr[CompiledScope]
  
  var cachedVariants: js.UndefOr[js.Array[Mode]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var contains: js.Array[CompiledMode]
  
  var data: Record[String, Any]
  
  var end: (js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])]) & (js.UndefOr[js.RegExp | String])
  
  var endRe: js.RegExp
  
  var endSameAsBegin: js.UndefOr[Boolean] = js.undefined
  
  var endScope: (js.UndefOr[String | (Record[Double, String])]) & js.UndefOr[CompiledScope]
  
  var endsParent: js.UndefOr[Boolean] = js.undefined
  
  var endsWithParent: js.UndefOr[Boolean] = js.undefined
  
  var excludeBegin: js.UndefOr[Boolean] = js.undefined
  
  var excludeEnd: js.UndefOr[Boolean] = js.undefined
  
  var illegal: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  
  var illegalRe: js.RegExp
  
  var isCompiled: js.UndefOr[Boolean] & `true`
  
  var keywordPatternRe: js.RegExp
  
  var keywords: (js.UndefOr[(Record[String, Any]) | String]) & KeywordDict
  
  var label: js.UndefOr[String] = js.undefined
  
  var lexemes: js.UndefOr[String | js.RegExp] = js.undefined
  
  var `match`: js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])] = js.undefined
  
  var matcher: Any
  
  @JSName("on:begin")
  var onColonbegin: js.UndefOr[ModeCallback] = js.undefined
  
  @JSName("on:end")
  var onColonend: js.UndefOr[js.Function] = js.undefined
  
  var parent: js.UndefOr[Mode] & js.UndefOr[CompiledMode]
  
  var relevance: js.UndefOr[Double] = js.undefined
  
  var returnBegin: js.UndefOr[Boolean] = js.undefined
  
  var returnEnd: js.UndefOr[Boolean] = js.undefined
  
  var scope: (js.UndefOr[String | (Record[Double, String])]) & js.UndefOr[String]
  
  var skip: js.UndefOr[Boolean] = js.undefined
  
  var starts: js.UndefOr[Mode] & js.UndefOr[CompiledMode]
  
  var subLanguage: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var terminatorEnd: String
  
  var variants: js.UndefOr[js.Array[Mode]] = js.undefined
}
object CompiledMode {
  
  inline def apply(
    begin: (js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])]) & (js.UndefOr[js.RegExp | String]),
    beginRe: js.RegExp,
    beginScope: (js.UndefOr[String | (Record[Double, String])]) & js.UndefOr[CompiledScope],
    contains: js.Array[CompiledMode],
    data: Record[String, Any],
    end: (js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])]) & (js.UndefOr[js.RegExp | String]),
    endRe: js.RegExp,
    endScope: (js.UndefOr[String | (Record[Double, String])]) & js.UndefOr[CompiledScope],
    illegalRe: js.RegExp,
    isCompiled: js.UndefOr[Boolean] & `true`,
    keywordPatternRe: js.RegExp,
    keywords: (js.UndefOr[(Record[String, Any]) | String]) & KeywordDict,
    matcher: Any,
    parent: js.UndefOr[Mode] & js.UndefOr[CompiledMode],
    scope: (js.UndefOr[String | (Record[Double, String])]) & js.UndefOr[String],
    starts: js.UndefOr[Mode] & js.UndefOr[CompiledMode],
    terminatorEnd: String
  ): CompiledMode = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], beginRe = beginRe.asInstanceOf[js.Any], beginScope = beginScope.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endRe = endRe.asInstanceOf[js.Any], endScope = endScope.asInstanceOf[js.Any], illegalRe = illegalRe.asInstanceOf[js.Any], isCompiled = isCompiled.asInstanceOf[js.Any], keywordPatternRe = keywordPatternRe.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], matcher = matcher.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], starts = starts.asInstanceOf[js.Any], terminatorEnd = terminatorEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledMode]
  }
  
  extension [Self <: CompiledMode](x: Self) {
    
    inline def setBegin(
      value: (js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])]) & (js.UndefOr[js.RegExp | String])
    ): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginKeywords(value: String): Self = StObject.set(x, "beginKeywords", value.asInstanceOf[js.Any])
    
    inline def setBeginKeywordsUndefined: Self = StObject.set(x, "beginKeywords", js.undefined)
    
    inline def setBeginRe(value: js.RegExp): Self = StObject.set(x, "beginRe", value.asInstanceOf[js.Any])
    
    inline def setBeginScope(value: (js.UndefOr[String | (Record[Double, String])]) & js.UndefOr[CompiledScope]): Self = StObject.set(x, "beginScope", value.asInstanceOf[js.Any])
    
    inline def setCachedVariants(value: js.Array[Mode]): Self = StObject.set(x, "cachedVariants", value.asInstanceOf[js.Any])
    
    inline def setCachedVariantsUndefined: Self = StObject.set(x, "cachedVariants", js.undefined)
    
    inline def setCachedVariantsVarargs(value: Mode*): Self = StObject.set(x, "cachedVariants", js.Array(value*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContains(value: js.Array[CompiledMode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsVarargs(value: CompiledMode*): Self = StObject.set(x, "contains", js.Array(value*))
    
    inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEnd(
      value: (js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])]) & (js.UndefOr[js.RegExp | String])
    ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndRe(value: js.RegExp): Self = StObject.set(x, "endRe", value.asInstanceOf[js.Any])
    
    inline def setEndSameAsBegin(value: Boolean): Self = StObject.set(x, "endSameAsBegin", value.asInstanceOf[js.Any])
    
    inline def setEndSameAsBeginUndefined: Self = StObject.set(x, "endSameAsBegin", js.undefined)
    
    inline def setEndScope(value: (js.UndefOr[String | (Record[Double, String])]) & js.UndefOr[CompiledScope]): Self = StObject.set(x, "endScope", value.asInstanceOf[js.Any])
    
    inline def setEndsParent(value: Boolean): Self = StObject.set(x, "endsParent", value.asInstanceOf[js.Any])
    
    inline def setEndsParentUndefined: Self = StObject.set(x, "endsParent", js.undefined)
    
    inline def setEndsWithParent(value: Boolean): Self = StObject.set(x, "endsWithParent", value.asInstanceOf[js.Any])
    
    inline def setEndsWithParentUndefined: Self = StObject.set(x, "endsWithParent", js.undefined)
    
    inline def setExcludeBegin(value: Boolean): Self = StObject.set(x, "excludeBegin", value.asInstanceOf[js.Any])
    
    inline def setExcludeBeginUndefined: Self = StObject.set(x, "excludeBegin", js.undefined)
    
    inline def setExcludeEnd(value: Boolean): Self = StObject.set(x, "excludeEnd", value.asInstanceOf[js.Any])
    
    inline def setExcludeEndUndefined: Self = StObject.set(x, "excludeEnd", js.undefined)
    
    inline def setIllegal(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
    
    inline def setIllegalRe(value: js.RegExp): Self = StObject.set(x, "illegalRe", value.asInstanceOf[js.Any])
    
    inline def setIllegalUndefined: Self = StObject.set(x, "illegal", js.undefined)
    
    inline def setIllegalVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "illegal", js.Array(value*))
    
    inline def setIsCompiled(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "isCompiled", value.asInstanceOf[js.Any])
    
    inline def setKeywordPatternRe(value: js.RegExp): Self = StObject.set(x, "keywordPatternRe", value.asInstanceOf[js.Any])
    
    inline def setKeywords(value: (js.UndefOr[(Record[String, Any]) | String]) & KeywordDict): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLexemes(value: String | js.RegExp): Self = StObject.set(x, "lexemes", value.asInstanceOf[js.Any])
    
    inline def setLexemesUndefined: Self = StObject.set(x, "lexemes", js.undefined)
    
    inline def setMatch(value: js.RegExp | String | (js.Array[js.RegExp | String])): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setMatchVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "match", js.Array(value*))
    
    inline def setMatcher(value: Any): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
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
    
    inline def setScope(value: (js.UndefOr[String | (Record[Double, String])]) & js.UndefOr[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setStarts(value: js.UndefOr[Mode] & js.UndefOr[CompiledMode]): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    inline def setSubLanguage(value: String | js.Array[String]): Self = StObject.set(x, "subLanguage", value.asInstanceOf[js.Any])
    
    inline def setSubLanguageUndefined: Self = StObject.set(x, "subLanguage", js.undefined)
    
    inline def setSubLanguageVarargs(value: String*): Self = StObject.set(x, "subLanguage", js.Array(value*))
    
    inline def setTerminatorEnd(value: String): Self = StObject.set(x, "terminatorEnd", value.asInstanceOf[js.Any])
    
    inline def setVariants(value: js.Array[Mode]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: Mode*): Self = StObject.set(x, "variants", js.Array(value*))
    
    inline def set__beforeBegin(value: js.Function): Self = StObject.set(x, "__beforeBegin", value.asInstanceOf[js.Any])
    
    inline def set__beforeBeginUndefined: Self = StObject.set(x, "__beforeBegin", js.undefined)
  }
}
