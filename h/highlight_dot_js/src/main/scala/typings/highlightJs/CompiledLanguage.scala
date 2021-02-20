package typings.highlightJs

import typings.highlightJs.highlightJsBooleans.`true`
import typings.std.Record
import typings.std.RegExp
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.highlightJs.CompiledMode because var conflicts: compiled, contains, keywords. Inlined className, returnBegin, __beforeBegin, beginKeywords, end, onColonend, excludeBegin, lexemes, onColonbegin, endsParent, parent, subLanguage, relevance, variants, skip, excludeEnd, cached_variants, label, starts, begin, endSameAsBegin, endsWithParent, returnEnd, illegal, data, terminator_end, keywordPatternRe, beginRe, endRe, illegalRe, matcher */ @js.native
trait CompiledLanguage extends LanguageDetail {
  
  var __beforeBegin: js.UndefOr[js.Function] = js.native
  
  var begin: js.UndefOr[RegExp | String] = js.native
  
  var beginKeywords: js.UndefOr[String] = js.native
  
  var beginRe: RegExp = js.native
  
  var cached_variants: js.UndefOr[js.Array[Mode]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  @JSName("compiled")
  var compiled_CompiledLanguage: `true` = js.native
  
  @JSName("contains")
  var contains_CompiledLanguage: js.Array[CompiledMode] = js.native
  
  var data: Record[String, _] = js.native
  
  var end: js.UndefOr[RegExp | String] = js.native
  
  var endRe: RegExp = js.native
  
  var endSameAsBegin: js.UndefOr[Boolean] = js.native
  
  var endsParent: js.UndefOr[Boolean] = js.native
  
  var endsWithParent: js.UndefOr[Boolean] = js.native
  
  var excludeBegin: js.UndefOr[Boolean] = js.native
  
  var excludeEnd: js.UndefOr[Boolean] = js.native
  
  var illegal: js.UndefOr[String | RegExp] = js.native
  
  var illegalRe: RegExp = js.native
  
  var keywordPatternRe: RegExp = js.native
  
  @JSName("keywords")
  var keywords_CompiledLanguage: Record[String, _] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var lexemes: js.UndefOr[String | RegExp] = js.native
  
  var matcher: js.Any = js.native
  
  @JSName("on:begin")
  var onColonbegin: js.UndefOr[ModeCallback] = js.native
  
  @JSName("on:end")
  var onColonend: js.UndefOr[js.Function] = js.native
  
  var parent: js.UndefOr[Mode] with js.UndefOr[CompiledMode] = js.native
  
  var relevance: js.UndefOr[Double] = js.native
  
  var returnBegin: js.UndefOr[Boolean] = js.native
  
  var returnEnd: js.UndefOr[Boolean] = js.native
  
  var skip: js.UndefOr[Boolean] = js.native
  
  var starts: js.UndefOr[Mode] with js.UndefOr[CompiledMode] = js.native
  
  var subLanguage: js.UndefOr[String | js.Array[String]] = js.native
  
  var terminator_end: String = js.native
  
  var variants: js.UndefOr[js.Array[Mode]] = js.native
}
object CompiledLanguage {
  
  @scala.inline
  def apply(
    beginRe: RegExp,
    compiled: `true`,
    contains: js.Array[CompiledMode],
    data: Record[String, _],
    endRe: RegExp,
    illegalRe: RegExp,
    keywordPatternRe: RegExp,
    keywords: Record[String, _],
    matcher: js.Any,
    parent: js.UndefOr[Mode] with js.UndefOr[CompiledMode],
    starts: js.UndefOr[Mode] with js.UndefOr[CompiledMode],
    terminator_end: String
  ): CompiledLanguage = {
    val __obj = js.Dynamic.literal(beginRe = beginRe.asInstanceOf[js.Any], compiled = compiled.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], endRe = endRe.asInstanceOf[js.Any], illegalRe = illegalRe.asInstanceOf[js.Any], keywordPatternRe = keywordPatternRe.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], matcher = matcher.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], starts = starts.asInstanceOf[js.Any], terminator_end = terminator_end.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledLanguage]
  }
  
  @scala.inline
  implicit class CompiledLanguageMutableBuilder[Self <: CompiledLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: RegExp | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginKeywords(value: String): Self = StObject.set(x, "beginKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginKeywordsUndefined: Self = StObject.set(x, "beginKeywords", js.undefined)
    
    @scala.inline
    def setBeginRe(value: RegExp): Self = StObject.set(x, "beginRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
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
    def setCompiled(value: `true`): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: js.Array[CompiledMode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsVarargs(value: CompiledMode*): Self = StObject.set(x, "contains", js.Array(value :_*))
    
    @scala.inline
    def setData(value: Record[String, _]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: RegExp | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRe(value: RegExp): Self = StObject.set(x, "endRe", value.asInstanceOf[js.Any])
    
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
    def setIllegalRe(value: RegExp): Self = StObject.set(x, "illegalRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIllegalUndefined: Self = StObject.set(x, "illegal", js.undefined)
    
    @scala.inline
    def setKeywordPatternRe(value: RegExp): Self = StObject.set(x, "keywordPatternRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: Record[String, _]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLexemes(value: String | RegExp): Self = StObject.set(x, "lexemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexemesUndefined: Self = StObject.set(x, "lexemes", js.undefined)
    
    @scala.inline
    def setMatcher(value: js.Any): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = StObject.set(x, "on:begin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnColonbeginUndefined: Self = StObject.set(x, "on:begin", js.undefined)
    
    @scala.inline
    def setOnColonend(value: js.Function): Self = StObject.set(x, "on:end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnColonendUndefined: Self = StObject.set(x, "on:end", js.undefined)
    
    @scala.inline
    def setParent(value: js.UndefOr[Mode] with js.UndefOr[CompiledMode]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
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
    def setStarts(value: js.UndefOr[Mode] with js.UndefOr[CompiledMode]): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLanguage(value: String | js.Array[String]): Self = StObject.set(x, "subLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLanguageUndefined: Self = StObject.set(x, "subLanguage", js.undefined)
    
    @scala.inline
    def setSubLanguageVarargs(value: String*): Self = StObject.set(x, "subLanguage", js.Array(value :_*))
    
    @scala.inline
    def setTerminator_end(value: String): Self = StObject.set(x, "terminator_end", value.asInstanceOf[js.Any])
    
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
