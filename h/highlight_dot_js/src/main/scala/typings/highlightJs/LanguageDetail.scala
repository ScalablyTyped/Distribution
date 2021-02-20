package typings.highlightJs

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageDetail extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  var case_insensitive: js.UndefOr[Boolean] = js.native
  
  var classNameAliases: js.UndefOr[Record[String, String]] = js.native
  
  var compiled: js.UndefOr[Boolean] = js.native
  
  var contains: js.Array[Mode] = js.native
  
  var disableAutodetect: js.UndefOr[Boolean] = js.native
  
  var exports: js.UndefOr[js.Any] = js.native
  
  var keywords: js.UndefOr[(Record[String, _]) | String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var rawDefinition: js.UndefOr[js.Function0[Language]] = js.native
}
object LanguageDetail {
  
  @scala.inline
  def apply(contains: js.Array[Mode]): LanguageDetail = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetail]
  }
  
  @scala.inline
  implicit class LanguageDetailMutableBuilder[Self <: LanguageDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
    
    @scala.inline
    def setClassNameAliases(value: Record[String, String]): Self = StObject.set(x, "classNameAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameAliasesUndefined: Self = StObject.set(x, "classNameAliases", js.undefined)
    
    @scala.inline
    def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
    
    @scala.inline
    def setContains(value: js.Array[Mode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsVarargs(value: Mode*): Self = StObject.set(x, "contains", js.Array(value :_*))
    
    @scala.inline
    def setDisableAutodetect(value: Boolean): Self = StObject.set(x, "disableAutodetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutodetectUndefined: Self = StObject.set(x, "disableAutodetect", js.undefined)
    
    @scala.inline
    def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    @scala.inline
    def setKeywords(value: (Record[String, _]) | String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRawDefinition(value: () => Language): Self = StObject.set(x, "rawDefinition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRawDefinitionUndefined: Self = StObject.set(x, "rawDefinition", js.undefined)
  }
}
