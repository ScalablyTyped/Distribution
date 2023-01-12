package typings.highlightJs.mod

import typings.std.Record
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined highlight.js.highlight.js.LanguageDetail & std.Partial<highlight.js.highlight.js.Mode> */
trait Language extends StObject {
  
  var __beforeBegin: js.UndefOr[js.Function] = js.undefined
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var begin: js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])] = js.undefined
  
  var beginKeywords: js.UndefOr[String] = js.undefined
  
  var beginScope: js.UndefOr[String | (Record[Double, String])] = js.undefined
  
  var cachedVariants: js.UndefOr[js.Array[Mode]] = js.undefined
  
  var case_insensitive: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var classNameAliases: js.UndefOr[Record[String, String]] = js.undefined
  
  var compilerExtensions: js.UndefOr[js.Array[CompilerExt]] = js.undefined
  
  var contains: js.Array[Mode]
  
  var disableAutodetect: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])] = js.undefined
  
  var endSameAsBegin: js.UndefOr[Boolean] = js.undefined
  
  var endScope: js.UndefOr[String | (Record[Double, String])] = js.undefined
  
  var endsParent: js.UndefOr[Boolean] = js.undefined
  
  var endsWithParent: js.UndefOr[Boolean] = js.undefined
  
  var excludeBegin: js.UndefOr[Boolean] = js.undefined
  
  var excludeEnd: js.UndefOr[Boolean] = js.undefined
  
  var exports: js.UndefOr[Any] = js.undefined
  
  var illegal: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  
  var isCompiled: js.UndefOr[Boolean] = js.undefined
  
  var keywords: js.UndefOr[(Record[String, Any]) | String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var lexemes: js.UndefOr[String | js.RegExp] = js.undefined
  
  var `match`: js.UndefOr[js.RegExp | String | (js.Array[js.RegExp | String])] = js.undefined
  
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
  
  var scope: js.UndefOr[String | (Record[Double, String])] = js.undefined
  
  var skip: js.UndefOr[Boolean] = js.undefined
  
  var starts: js.UndefOr[Mode] = js.undefined
  
  var subLanguage: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var supersetOf: js.UndefOr[String] = js.undefined
  
  var unicodeRegex: js.UndefOr[Boolean] = js.undefined
  
  var variants: js.UndefOr[js.Array[Mode]] = js.undefined
}
object Language {
  
  inline def apply(contains: js.Array[Mode]): Language = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setBegin(value: js.RegExp | String | (js.Array[js.RegExp | String])): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginKeywords(value: String): Self = StObject.set(x, "beginKeywords", value.asInstanceOf[js.Any])
    
    inline def setBeginKeywordsUndefined: Self = StObject.set(x, "beginKeywords", js.undefined)
    
    inline def setBeginScope(value: String | (Record[Double, String])): Self = StObject.set(x, "beginScope", value.asInstanceOf[js.Any])
    
    inline def setBeginScopeUndefined: Self = StObject.set(x, "beginScope", js.undefined)
    
    inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    inline def setBeginVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "begin", js.Array(value*))
    
    inline def setCachedVariants(value: js.Array[Mode]): Self = StObject.set(x, "cachedVariants", value.asInstanceOf[js.Any])
    
    inline def setCachedVariantsUndefined: Self = StObject.set(x, "cachedVariants", js.undefined)
    
    inline def setCachedVariantsVarargs(value: Mode*): Self = StObject.set(x, "cachedVariants", js.Array(value*))
    
    inline def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
    
    inline def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameAliases(value: Record[String, String]): Self = StObject.set(x, "classNameAliases", value.asInstanceOf[js.Any])
    
    inline def setClassNameAliasesUndefined: Self = StObject.set(x, "classNameAliases", js.undefined)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCompilerExtensions(value: js.Array[CompilerExt]): Self = StObject.set(x, "compilerExtensions", value.asInstanceOf[js.Any])
    
    inline def setCompilerExtensionsUndefined: Self = StObject.set(x, "compilerExtensions", js.undefined)
    
    inline def setCompilerExtensionsVarargs(value: CompilerExt*): Self = StObject.set(x, "compilerExtensions", js.Array(value*))
    
    inline def setContains(value: js.Array[Mode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsVarargs(value: Mode*): Self = StObject.set(x, "contains", js.Array(value*))
    
    inline def setDisableAutodetect(value: Boolean): Self = StObject.set(x, "disableAutodetect", value.asInstanceOf[js.Any])
    
    inline def setDisableAutodetectUndefined: Self = StObject.set(x, "disableAutodetect", js.undefined)
    
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
    
    inline def setExports(value: Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
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
    
    inline def setScope(value: String | (Record[Double, String])): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setStarts(value: Mode): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    inline def setStartsUndefined: Self = StObject.set(x, "starts", js.undefined)
    
    inline def setSubLanguage(value: String | js.Array[String]): Self = StObject.set(x, "subLanguage", value.asInstanceOf[js.Any])
    
    inline def setSubLanguageUndefined: Self = StObject.set(x, "subLanguage", js.undefined)
    
    inline def setSubLanguageVarargs(value: String*): Self = StObject.set(x, "subLanguage", js.Array(value*))
    
    inline def setSupersetOf(value: String): Self = StObject.set(x, "supersetOf", value.asInstanceOf[js.Any])
    
    inline def setSupersetOfUndefined: Self = StObject.set(x, "supersetOf", js.undefined)
    
    inline def setUnicodeRegex(value: Boolean): Self = StObject.set(x, "unicodeRegex", value.asInstanceOf[js.Any])
    
    inline def setUnicodeRegexUndefined: Self = StObject.set(x, "unicodeRegex", js.undefined)
    
    inline def setVariants(value: js.Array[Mode]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: Mode*): Self = StObject.set(x, "variants", js.Array(value*))
    
    inline def set__beforeBegin(value: js.Function): Self = StObject.set(x, "__beforeBegin", value.asInstanceOf[js.Any])
    
    inline def set__beforeBeginUndefined: Self = StObject.set(x, "__beforeBegin", js.undefined)
  }
}
