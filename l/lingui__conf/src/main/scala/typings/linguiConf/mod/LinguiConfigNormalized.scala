package typings.linguiConf.mod

import typings.linguiConf.anon.Extractor
import typings.linguiConf.anon.Flow
import typings.linguiConf.anon.I18nImportModule
import typings.linguiConf.linguiConfBooleans.`false`
import typings.linguiConf.linguiConfStrings.cjs
import typings.linguiConf.linguiConfStrings.es
import typings.linguiConf.linguiConfStrings.ts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@lingui/conf.@lingui/conf.LinguiConfig, 'runtimeConfigModule'> & {  fallbackLocales :@lingui/conf.@lingui/conf.FallbackLocales | undefined,   runtimeConfigModule :{  i18nImportModule :string,   i18nImportName :string,   TransImportModule :string,   TransImportName :string}} */
trait LinguiConfigNormalized extends StObject {
  
  var catalogs: js.UndefOr[js.Array[CatalogConfig]] = js.undefined
  
  var catalogsMergePath: js.UndefOr[String] = js.undefined
  
  var compileNamespace: js.UndefOr[es | ts | cjs | String] = js.undefined
  
  var compilerBabelOptions: js.UndefOr[Any] = js.undefined
  
  var experimental: js.UndefOr[Extractor] = js.undefined
  
  var extractorParserOptions: js.UndefOr[Flow] = js.undefined
  
  var extractors: js.UndefOr[js.Array[String | ExtractorType]] = js.undefined
  
  var fallbackLocales: js.UndefOr[FallbackLocales | `false`] = js.undefined
  
  var format: js.UndefOr[CatalogFormat | CatalogFormatter] = js.undefined
  
  var formatOptions: js.UndefOr[CatalogFormatOptions] = js.undefined
  
  var localeDir: js.UndefOr[String] = js.undefined
  
  var locales: js.Array[String]
  
  var orderBy: js.UndefOr[OrderBy] = js.undefined
  
  var prevFormat: js.UndefOr[CatalogFormat] = js.undefined
  
  var pseudoLocale: js.UndefOr[String] = js.undefined
  
  var rootDir: js.UndefOr[String] = js.undefined
  
  var runtimeConfigModule: I18nImportModule
  
  var service: js.UndefOr[CatalogService] = js.undefined
  
  var sourceLocale: js.UndefOr[String] = js.undefined
}
object LinguiConfigNormalized {
  
  inline def apply(locales: js.Array[String], runtimeConfigModule: I18nImportModule): LinguiConfigNormalized = {
    val __obj = js.Dynamic.literal(locales = locales.asInstanceOf[js.Any], runtimeConfigModule = runtimeConfigModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinguiConfigNormalized]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinguiConfigNormalized] (val x: Self) extends AnyVal {
    
    inline def setCatalogs(value: js.Array[CatalogConfig]): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
    
    inline def setCatalogsMergePath(value: String): Self = StObject.set(x, "catalogsMergePath", value.asInstanceOf[js.Any])
    
    inline def setCatalogsMergePathUndefined: Self = StObject.set(x, "catalogsMergePath", js.undefined)
    
    inline def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
    
    inline def setCatalogsVarargs(value: CatalogConfig*): Self = StObject.set(x, "catalogs", js.Array(value*))
    
    inline def setCompileNamespace(value: es | ts | cjs | String): Self = StObject.set(x, "compileNamespace", value.asInstanceOf[js.Any])
    
    inline def setCompileNamespaceUndefined: Self = StObject.set(x, "compileNamespace", js.undefined)
    
    inline def setCompilerBabelOptions(value: Any): Self = StObject.set(x, "compilerBabelOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerBabelOptionsUndefined: Self = StObject.set(x, "compilerBabelOptions", js.undefined)
    
    inline def setExperimental(value: Extractor): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setExtractorParserOptions(value: Flow): Self = StObject.set(x, "extractorParserOptions", value.asInstanceOf[js.Any])
    
    inline def setExtractorParserOptionsUndefined: Self = StObject.set(x, "extractorParserOptions", js.undefined)
    
    inline def setExtractors(value: js.Array[String | ExtractorType]): Self = StObject.set(x, "extractors", value.asInstanceOf[js.Any])
    
    inline def setExtractorsUndefined: Self = StObject.set(x, "extractors", js.undefined)
    
    inline def setExtractorsVarargs(value: (String | ExtractorType)*): Self = StObject.set(x, "extractors", js.Array(value*))
    
    inline def setFallbackLocales(value: FallbackLocales | `false`): Self = StObject.set(x, "fallbackLocales", value.asInstanceOf[js.Any])
    
    inline def setFallbackLocalesUndefined: Self = StObject.set(x, "fallbackLocales", js.undefined)
    
    inline def setFormat(value: CatalogFormat | CatalogFormatter): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatOptions(value: CatalogFormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
    
    inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLocaleDir(value: String): Self = StObject.set(x, "localeDir", value.asInstanceOf[js.Any])
    
    inline def setLocaleDirUndefined: Self = StObject.set(x, "localeDir", js.undefined)
    
    inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPrevFormat(value: CatalogFormat): Self = StObject.set(x, "prevFormat", value.asInstanceOf[js.Any])
    
    inline def setPrevFormatUndefined: Self = StObject.set(x, "prevFormat", js.undefined)
    
    inline def setPseudoLocale(value: String): Self = StObject.set(x, "pseudoLocale", value.asInstanceOf[js.Any])
    
    inline def setPseudoLocaleUndefined: Self = StObject.set(x, "pseudoLocale", js.undefined)
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
    
    inline def setRuntimeConfigModule(value: I18nImportModule): Self = StObject.set(x, "runtimeConfigModule", value.asInstanceOf[js.Any])
    
    inline def setService(value: CatalogService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setSourceLocale(value: String): Self = StObject.set(x, "sourceLocale", value.asInstanceOf[js.Any])
    
    inline def setSourceLocaleUndefined: Self = StObject.set(x, "sourceLocale", js.undefined)
  }
}
