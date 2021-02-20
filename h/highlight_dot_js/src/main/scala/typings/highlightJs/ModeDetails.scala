package typings.highlightJs

import typings.highlightJs.highlightJsStrings.self
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModeDetails extends StObject {
  
  var __beforeBegin: js.UndefOr[js.Function] = js.native
  
  var begin: js.UndefOr[RegExp | String] = js.native
  
  var beginKeywords: js.UndefOr[String] = js.native
  
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
  
  var parent: js.UndefOr[Mode] = js.native
  
  var relevance: js.UndefOr[Double] = js.native
  
  var returnBegin: js.UndefOr[Boolean] = js.native
  
  var returnEnd: js.UndefOr[Boolean] = js.native
  
  var skip: js.UndefOr[Boolean] = js.native
  
  var starts: js.UndefOr[Mode] = js.native
  
  // parsed
  var subLanguage: js.UndefOr[String | js.Array[String]] = js.native
  
  var variants: js.UndefOr[js.Array[Mode]] = js.native
}
object ModeDetails {
  
  @scala.inline
  def apply(): ModeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeDetails]
  }
  
  @scala.inline
  implicit class ModeDetailsMutableBuilder[Self <: ModeDetails] (val x: Self) extends AnyVal {
    
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
