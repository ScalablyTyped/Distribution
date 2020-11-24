package typings.highlightJs

import typings.highlightJs.highlightJsStrings.self
import typings.std.Record
import typings.std.RegExp
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined highlight.js.LanguageDetail & std.Partial<highlight.js.Mode> */
@js.native
trait Language extends js.Object {
  
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
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContains(value: js.Array[Mode] with (js.UndefOr[js.Array[self | Mode]])): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__beforeBegin(value: js.Function): Self = this.set("__beforeBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__beforeBegin: Self = this.set("__beforeBegin", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setBegin(value: RegExp | String): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setBeginKeywords(value: String): Self = this.set("beginKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginKeywords: Self = this.set("beginKeywords", js.undefined)
    
    @scala.inline
    def setCached_variantsVarargs(value: Mode*): Self = this.set("cached_variants", js.Array(value :_*))
    
    @scala.inline
    def setCached_variants(value: js.Array[Mode]): Self = this.set("cached_variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCached_variants: Self = this.set("cached_variants", js.undefined)
    
    @scala.inline
    def setCase_insensitive(value: Boolean): Self = this.set("case_insensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCase_insensitive: Self = this.set("case_insensitive", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClassNameAliases(value: Record[String, String]): Self = this.set("classNameAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNameAliases: Self = this.set("classNameAliases", js.undefined)
    
    @scala.inline
    def setCompiled(value: Boolean): Self = this.set("compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiled: Self = this.set("compiled", js.undefined)
    
    @scala.inline
    def setDisableAutodetect(value: Boolean): Self = this.set("disableAutodetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutodetect: Self = this.set("disableAutodetect", js.undefined)
    
    @scala.inline
    def setEnd(value: RegExp | String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setEndSameAsBegin(value: Boolean): Self = this.set("endSameAsBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndSameAsBegin: Self = this.set("endSameAsBegin", js.undefined)
    
    @scala.inline
    def setEndsParent(value: Boolean): Self = this.set("endsParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndsParent: Self = this.set("endsParent", js.undefined)
    
    @scala.inline
    def setEndsWithParent(value: Boolean): Self = this.set("endsWithParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndsWithParent: Self = this.set("endsWithParent", js.undefined)
    
    @scala.inline
    def setExcludeBegin(value: Boolean): Self = this.set("excludeBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeBegin: Self = this.set("excludeBegin", js.undefined)
    
    @scala.inline
    def setExcludeEnd(value: Boolean): Self = this.set("excludeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeEnd: Self = this.set("excludeEnd", js.undefined)
    
    @scala.inline
    def setExports(value: js.Any): Self = this.set("exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExports: Self = this.set("exports", js.undefined)
    
    @scala.inline
    def setIllegal(value: String | RegExp): Self = this.set("illegal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIllegal: Self = this.set("illegal", js.undefined)
    
    @scala.inline
    def setKeywords(value: (Record[String, _]) | String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLexemes(value: String | RegExp): Self = this.set("lexemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLexemes: Self = this.set("lexemes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = this.set("on:begin", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColonbegin: Self = this.set("on:begin", js.undefined)
    
    @scala.inline
    def setOnColonend(value: js.Function): Self = this.set("on:end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnColonend: Self = this.set("on:end", js.undefined)
    
    @scala.inline
    def setParent(value: Mode): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setRawDefinition(value: () => Language): Self = this.set("rawDefinition", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRawDefinition: Self = this.set("rawDefinition", js.undefined)
    
    @scala.inline
    def setRelevance(value: Double): Self = this.set("relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevance: Self = this.set("relevance", js.undefined)
    
    @scala.inline
    def setReturnBegin(value: Boolean): Self = this.set("returnBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnBegin: Self = this.set("returnBegin", js.undefined)
    
    @scala.inline
    def setReturnEnd(value: Boolean): Self = this.set("returnEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnEnd: Self = this.set("returnEnd", js.undefined)
    
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setStarts(value: Mode): Self = this.set("starts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarts: Self = this.set("starts", js.undefined)
    
    @scala.inline
    def setSubLanguageVarargs(value: String*): Self = this.set("subLanguage", js.Array(value :_*))
    
    @scala.inline
    def setSubLanguage(value: String | js.Array[String]): Self = this.set("subLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubLanguage: Self = this.set("subLanguage", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: Mode*): Self = this.set("variants", js.Array(value :_*))
    
    @scala.inline
    def setVariants(value: js.Array[Mode]): Self = this.set("variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
  }
}
