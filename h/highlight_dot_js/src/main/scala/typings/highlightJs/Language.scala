package typings.highlightJs

import typings.highlightJs.highlightJsStrings.self
import typings.std.Record
import typings.std.RegExp
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined highlight.js.LanguageDetail & std.Partial<highlight.js.Mode> */
trait Language extends StObject {
  
  var __beforeBegin: js.UndefOr[js.Function] = js.undefined
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var begin: js.UndefOr[RegExp | String] = js.undefined
  
  var beginKeywords: js.UndefOr[String] = js.undefined
  
  var cached_variants: js.UndefOr[js.Array[Mode]] = js.undefined
  
  var case_insensitive: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var classNameAliases: js.UndefOr[Record[String, String]] = js.undefined
  
  var compiled: js.UndefOr[Boolean] = js.undefined
  
  var contains: js.Array[Mode] & (js.UndefOr[js.Array[self | Mode]])
  
  var disableAutodetect: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[RegExp | String] = js.undefined
  
  var endSameAsBegin: js.UndefOr[Boolean] = js.undefined
  
  var endsParent: js.UndefOr[Boolean] = js.undefined
  
  var endsWithParent: js.UndefOr[Boolean] = js.undefined
  
  var excludeBegin: js.UndefOr[Boolean] = js.undefined
  
  var excludeEnd: js.UndefOr[Boolean] = js.undefined
  
  var exports: js.UndefOr[js.Any] = js.undefined
  
  var illegal: js.UndefOr[String | RegExp] = js.undefined
  
  var keywords: js.UndefOr[(Record[String, js.Any]) | String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var lexemes: js.UndefOr[String | RegExp] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  @JSName("on:begin")
  var onColonbegin: js.UndefOr[ModeCallback] = js.undefined
  
  @JSName("on:end")
  var onColonend: js.UndefOr[js.Function] = js.undefined
  
  var parent: js.UndefOr[Mode] = js.undefined
  
  var rawDefinition: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var relevance: js.UndefOr[Double] = js.undefined
  
  var returnBegin: js.UndefOr[Boolean] = js.undefined
  
  var returnEnd: js.UndefOr[Boolean] = js.undefined
  
  var skip: js.UndefOr[Boolean] = js.undefined
  
  var starts: js.UndefOr[Mode] = js.undefined
  
  var subLanguage: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var variants: js.UndefOr[js.Array[Mode]] = js.undefined
}
object Language {
  
  inline def apply(contains: js.Array[Mode] & (js.UndefOr[js.Array[self | Mode]])): Language = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    inline def setBegin(value: RegExp | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginKeywords(value: String): Self = StObject.set(x, "beginKeywords", value.asInstanceOf[js.Any])
    
    inline def setBeginKeywordsUndefined: Self = StObject.set(x, "beginKeywords", js.undefined)
    
    inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    inline def setCached_variants(value: js.Array[Mode]): Self = StObject.set(x, "cached_variants", value.asInstanceOf[js.Any])
    
    inline def setCached_variantsUndefined: Self = StObject.set(x, "cached_variants", js.undefined)
    
    inline def setCached_variantsVarargs(value: Mode*): Self = StObject.set(x, "cached_variants", js.Array(value :_*))
    
    inline def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
    
    inline def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameAliases(value: Record[String, String]): Self = StObject.set(x, "classNameAliases", value.asInstanceOf[js.Any])
    
    inline def setClassNameAliasesUndefined: Self = StObject.set(x, "classNameAliases", js.undefined)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
    
    inline def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
    
    inline def setContains(value: js.Array[Mode] & (js.UndefOr[js.Array[self | Mode]])): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setDisableAutodetect(value: Boolean): Self = StObject.set(x, "disableAutodetect", value.asInstanceOf[js.Any])
    
    inline def setDisableAutodetectUndefined: Self = StObject.set(x, "disableAutodetect", js.undefined)
    
    inline def setEnd(value: RegExp | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
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
    
    inline def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setIllegal(value: String | RegExp): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
    
    inline def setIllegalUndefined: Self = StObject.set(x, "illegal", js.undefined)
    
    inline def setKeywords(value: (Record[String, js.Any]) | String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLexemes(value: String | RegExp): Self = StObject.set(x, "lexemes", value.asInstanceOf[js.Any])
    
    inline def setLexemesUndefined: Self = StObject.set(x, "lexemes", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = StObject.set(x, "on:begin", js.Any.fromFunction2(value))
    
    inline def setOnColonbeginUndefined: Self = StObject.set(x, "on:begin", js.undefined)
    
    inline def setOnColonend(value: js.Function): Self = StObject.set(x, "on:end", value.asInstanceOf[js.Any])
    
    inline def setOnColonendUndefined: Self = StObject.set(x, "on:end", js.undefined)
    
    inline def setParent(value: Mode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRawDefinition(value: () => Language): Self = StObject.set(x, "rawDefinition", js.Any.fromFunction0(value))
    
    inline def setRawDefinitionUndefined: Self = StObject.set(x, "rawDefinition", js.undefined)
    
    inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
    
    inline def setReturnBegin(value: Boolean): Self = StObject.set(x, "returnBegin", value.asInstanceOf[js.Any])
    
    inline def setReturnBeginUndefined: Self = StObject.set(x, "returnBegin", js.undefined)
    
    inline def setReturnEnd(value: Boolean): Self = StObject.set(x, "returnEnd", value.asInstanceOf[js.Any])
    
    inline def setReturnEndUndefined: Self = StObject.set(x, "returnEnd", js.undefined)
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setStarts(value: Mode): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    inline def setStartsUndefined: Self = StObject.set(x, "starts", js.undefined)
    
    inline def setSubLanguage(value: String | js.Array[String]): Self = StObject.set(x, "subLanguage", value.asInstanceOf[js.Any])
    
    inline def setSubLanguageUndefined: Self = StObject.set(x, "subLanguage", js.undefined)
    
    inline def setSubLanguageVarargs(value: String*): Self = StObject.set(x, "subLanguage", js.Array(value :_*))
    
    inline def setVariants(value: js.Array[Mode]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: Mode*): Self = StObject.set(x, "variants", js.Array(value :_*))
    
    inline def set__beforeBegin(value: js.Function): Self = StObject.set(x, "__beforeBegin", value.asInstanceOf[js.Any])
    
    inline def set__beforeBeginUndefined: Self = StObject.set(x, "__beforeBegin", js.undefined)
  }
}
