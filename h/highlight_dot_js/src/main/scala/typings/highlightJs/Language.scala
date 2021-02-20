package typings.highlightJs

import typings.highlightJs.highlightJsStrings.self
import typings.std.Record
import typings.std.RegExp
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined highlight.js.LanguageDetail & std.Partial<highlight.js.Mode> */
@js.native
trait Language extends StObject {
  
  var __beforeBegin: js.UndefOr[js.Function] = js.native
  
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  var begin: js.UndefOr[RegExp | String] = js.native
  
  var beginKeywords: js.UndefOr[String] = js.native
  
  var cached_variants: js.UndefOr[js.Array[Mode]] = js.native
  
  var case_insensitive: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classNameAliases: js.UndefOr[Record[String, String]] = js.native
  
  var compiled: js.UndefOr[Boolean] = js.native
  
  var contains: js.Array[Mode] with (js.UndefOr[js.Array[self | Mode]]) = js.native
  
  var disableAutodetect: js.UndefOr[Boolean] = js.native
  
  var end: js.UndefOr[RegExp | String] = js.native
  
  var endSameAsBegin: js.UndefOr[Boolean] = js.native
  
  var endsParent: js.UndefOr[Boolean] = js.native
  
  var endsWithParent: js.UndefOr[Boolean] = js.native
  
  var excludeBegin: js.UndefOr[Boolean] = js.native
  
  var excludeEnd: js.UndefOr[Boolean] = js.native
  
  var exports: js.UndefOr[js.Any] = js.native
  
  var illegal: js.UndefOr[String | RegExp] = js.native
  
  var keywords: js.UndefOr[(Record[String, _]) | String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var lexemes: js.UndefOr[String | RegExp] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  @JSName("on:begin")
  var onColonbegin: js.UndefOr[ModeCallback] = js.native
  
  @JSName("on:end")
  var onColonend: js.UndefOr[js.Function] = js.native
  
  var parent: js.UndefOr[Mode] = js.native
  
  var rawDefinition: js.UndefOr[js.Function0[this.type]] = js.native
  
  var relevance: js.UndefOr[Double] = js.native
  
  var returnBegin: js.UndefOr[Boolean] = js.native
  
  var returnEnd: js.UndefOr[Boolean] = js.native
  
  var skip: js.UndefOr[Boolean] = js.native
  
  var starts: js.UndefOr[Mode] = js.native
  
  var subLanguage: js.UndefOr[String | js.Array[String]] = js.native
  
  var variants: js.UndefOr[js.Array[Mode]] = js.native
}
object Language {
  
  @scala.inline
  def apply(contains: js.Array[Mode] with (js.UndefOr[js.Array[self | Mode]])): Language = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setBegin(value: RegExp | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginKeywords(value: String): Self = StObject.set(x, "beginKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginKeywordsUndefined: Self = StObject.set(x, "beginKeywords", js.undefined)
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    @scala.inline
    def setCached_variants(value: js.Array[Mode]): Self = StObject.set(x, "cached_variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCached_variantsUndefined: Self = StObject.set(x, "cached_variants", js.undefined)
    
    @scala.inline
    def setCached_variantsVarargs(value: Mode*): Self = StObject.set(x, "cached_variants", js.Array(value :_*))
    
    @scala.inline
    def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameAliases(value: Record[String, String]): Self = StObject.set(x, "classNameAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameAliasesUndefined: Self = StObject.set(x, "classNameAliases", js.undefined)
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
    
    @scala.inline
    def setContains(value: js.Array[Mode] with (js.UndefOr[js.Array[self | Mode]])): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutodetect(value: Boolean): Self = StObject.set(x, "disableAutodetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutodetectUndefined: Self = StObject.set(x, "disableAutodetect", js.undefined)
    
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
    def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
    def setRawDefinition(value: () => Language): Self = StObject.set(x, "rawDefinition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRawDefinitionUndefined: Self = StObject.set(x, "rawDefinition", js.undefined)
    
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
