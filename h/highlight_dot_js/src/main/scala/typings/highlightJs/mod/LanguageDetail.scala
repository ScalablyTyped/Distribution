package typings.highlightJs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageDetail extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var case_insensitive: js.UndefOr[Boolean] = js.undefined
  
  var classNameAliases: js.UndefOr[Record[String, String]] = js.undefined
  
  var compilerExtensions: js.UndefOr[js.Array[CompilerExt]] = js.undefined
  
  var contains: js.Array[Mode]
  
  var disableAutodetect: js.UndefOr[Boolean] = js.undefined
  
  var exports: js.UndefOr[Any] = js.undefined
  
  var isCompiled: js.UndefOr[Boolean] = js.undefined
  
  var keywords: js.UndefOr[(Record[String, Any]) | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var rawDefinition: js.UndefOr[js.Function0[Language]] = js.undefined
  
  var supersetOf: js.UndefOr[String] = js.undefined
  
  var unicodeRegex: js.UndefOr[Boolean] = js.undefined
}
object LanguageDetail {
  
  inline def apply(contains: js.Array[Mode]): LanguageDetail = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetail]
  }
  
  extension [Self <: LanguageDetail](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
    
    inline def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
    
    inline def setClassNameAliases(value: Record[String, String]): Self = StObject.set(x, "classNameAliases", value.asInstanceOf[js.Any])
    
    inline def setClassNameAliasesUndefined: Self = StObject.set(x, "classNameAliases", js.undefined)
    
    inline def setCompilerExtensions(value: js.Array[CompilerExt]): Self = StObject.set(x, "compilerExtensions", value.asInstanceOf[js.Any])
    
    inline def setCompilerExtensionsUndefined: Self = StObject.set(x, "compilerExtensions", js.undefined)
    
    inline def setCompilerExtensionsVarargs(value: CompilerExt*): Self = StObject.set(x, "compilerExtensions", js.Array(value*))
    
    inline def setContains(value: js.Array[Mode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsVarargs(value: Mode*): Self = StObject.set(x, "contains", js.Array(value*))
    
    inline def setDisableAutodetect(value: Boolean): Self = StObject.set(x, "disableAutodetect", value.asInstanceOf[js.Any])
    
    inline def setDisableAutodetectUndefined: Self = StObject.set(x, "disableAutodetect", js.undefined)
    
    inline def setExports(value: Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setIsCompiled(value: Boolean): Self = StObject.set(x, "isCompiled", value.asInstanceOf[js.Any])
    
    inline def setIsCompiledUndefined: Self = StObject.set(x, "isCompiled", js.undefined)
    
    inline def setKeywords(value: (Record[String, Any]) | String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRawDefinition(value: () => Language): Self = StObject.set(x, "rawDefinition", js.Any.fromFunction0(value))
    
    inline def setRawDefinitionUndefined: Self = StObject.set(x, "rawDefinition", js.undefined)
    
    inline def setSupersetOf(value: String): Self = StObject.set(x, "supersetOf", value.asInstanceOf[js.Any])
    
    inline def setSupersetOfUndefined: Self = StObject.set(x, "supersetOf", js.undefined)
    
    inline def setUnicodeRegex(value: Boolean): Self = StObject.set(x, "unicodeRegex", value.asInstanceOf[js.Any])
    
    inline def setUnicodeRegexUndefined: Self = StObject.set(x, "unicodeRegex", js.undefined)
  }
}
