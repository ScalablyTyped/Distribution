package typings.highlightJs

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageDetail extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var case_insensitive: js.UndefOr[Boolean] = js.undefined
  
  var classNameAliases: js.UndefOr[Record[String, String]] = js.undefined
  
  var compiled: js.UndefOr[Boolean] = js.undefined
  
  var contains: js.Array[Mode]
  
  var disableAutodetect: js.UndefOr[Boolean] = js.undefined
  
  var exports: js.UndefOr[js.Any] = js.undefined
  
  var keywords: js.UndefOr[(Record[String, js.Any]) | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var rawDefinition: js.UndefOr[js.Function0[Language]] = js.undefined
}
object LanguageDetail {
  
  inline def apply(contains: js.Array[Mode]): LanguageDetail = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetail]
  }
  
  extension [Self <: LanguageDetail](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    inline def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
    
    inline def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
    
    inline def setClassNameAliases(value: Record[String, String]): Self = StObject.set(x, "classNameAliases", value.asInstanceOf[js.Any])
    
    inline def setClassNameAliasesUndefined: Self = StObject.set(x, "classNameAliases", js.undefined)
    
    inline def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
    
    inline def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
    
    inline def setContains(value: js.Array[Mode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsVarargs(value: Mode*): Self = StObject.set(x, "contains", js.Array(value :_*))
    
    inline def setDisableAutodetect(value: Boolean): Self = StObject.set(x, "disableAutodetect", value.asInstanceOf[js.Any])
    
    inline def setDisableAutodetectUndefined: Self = StObject.set(x, "disableAutodetect", js.undefined)
    
    inline def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setKeywords(value: (Record[String, js.Any]) | String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRawDefinition(value: () => Language): Self = StObject.set(x, "rawDefinition", js.Any.fromFunction0(value))
    
    inline def setRawDefinitionUndefined: Self = StObject.set(x, "rawDefinition", js.undefined)
  }
}
