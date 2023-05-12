package typings.linguiConf

import org.scalablytyped.runtime.StringDictionary
import typings.linguiConf.linguiConfBooleans.`false`
import typings.linguiConf.linguiConfStrings.cjs
import typings.linguiConf.linguiConfStrings.es
import typings.linguiConf.linguiConfStrings.ts
import typings.linguiConf.mod.CatalogConfig
import typings.linguiConf.mod.CatalogFormat
import typings.linguiConf.mod.CatalogFormatOptions
import typings.linguiConf.mod.CatalogFormatter
import typings.linguiConf.mod.CatalogService
import typings.linguiConf.mod.ExperimentalExtractorOptions
import typings.linguiConf.mod.ExtractorType
import typings.linguiConf.mod.FallbackLocales
import typings.linguiConf.mod.ModuleSource
import typings.linguiConf.mod.OrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ConfigPath extends StObject {
    
    var configPath: js.UndefOr[String] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var skipValidation: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigPath {
    
    inline def apply(): ConfigPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigPath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigPath] (val x: Self) extends AnyVal {
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setSkipValidation(value: Boolean): Self = StObject.set(x, "skipValidation", value.asInstanceOf[js.Any])
      
      inline def setSkipValidationUndefined: Self = StObject.set(x, "skipValidation", js.undefined)
    }
  }
  
  trait Existing extends StObject {
    
    var existing: String | Null
    
    var filename: String
    
    var locale: String | Null
    
    var sourceLocale: String
  }
  object Existing {
    
    inline def apply(filename: String, sourceLocale: String): Existing = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], sourceLocale = sourceLocale.asInstanceOf[js.Any], existing = null, locale = null)
      __obj.asInstanceOf[Existing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Existing] (val x: Self) extends AnyVal {
      
      inline def setExisting(value: String): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
      
      inline def setExistingNull: Self = StObject.set(x, "existing", null)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleNull: Self = StObject.set(x, "locale", null)
      
      inline def setSourceLocale(value: String): Self = StObject.set(x, "sourceLocale", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extractor extends StObject {
    
    var extractor: js.UndefOr[ExperimentalExtractorOptions] = js.undefined
  }
  object Extractor {
    
    inline def apply(): Extractor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extractor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extractor] (val x: Self) extends AnyVal {
      
      inline def setExtractor(value: ExperimentalExtractorOptions): Self = StObject.set(x, "extractor", value.asInstanceOf[js.Any])
      
      inline def setExtractorUndefined: Self = StObject.set(x, "extractor", js.undefined)
    }
  }
  
  trait Filename extends StObject {
    
    var filename: String
    
    var locale: String | Null
    
    var sourceLocale: String
  }
  object Filename {
    
    inline def apply(filename: String, sourceLocale: String): Filename = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], sourceLocale = sourceLocale.asInstanceOf[js.Any], locale = null)
      __obj.asInstanceOf[Filename]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleNull: Self = StObject.set(x, "locale", null)
      
      inline def setSourceLocale(value: String): Self = StObject.set(x, "sourceLocale", value.asInstanceOf[js.Any])
    }
  }
  
  trait Flow extends StObject {
    
    /**
      * Enable if you use flow. This will apply Flow syntax to js files
      */
    var flow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default false
      *
      * By default, standard decorators (Stage3) are applied for TS files
      * Enable this if you want to use TypesScript's experimental decorators.
      */
    var tsExperimentalDecorators: js.UndefOr[Boolean] = js.undefined
  }
  object Flow {
    
    inline def apply(): Flow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flow] (val x: Self) extends AnyVal {
      
      inline def setFlow(value: Boolean): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
      
      inline def setTsExperimentalDecorators(value: Boolean): Self = StObject.set(x, "tsExperimentalDecorators", value.asInstanceOf[js.Any])
      
      inline def setTsExperimentalDecoratorsUndefined: Self = StObject.set(x, "tsExperimentalDecorators", js.undefined)
    }
  }
  
  trait I18nImportModule extends StObject {
    
    var TransImportModule: String
    
    var TransImportName: String
    
    var i18nImportModule: String
    
    var i18nImportName: String
  }
  object I18nImportModule {
    
    inline def apply(
      TransImportModule: String,
      TransImportName: String,
      i18nImportModule: String,
      i18nImportName: String
    ): I18nImportModule = {
      val __obj = js.Dynamic.literal(TransImportModule = TransImportModule.asInstanceOf[js.Any], TransImportName = TransImportName.asInstanceOf[js.Any], i18nImportModule = i18nImportModule.asInstanceOf[js.Any], i18nImportName = i18nImportName.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nImportModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I18nImportModule] (val x: Self) extends AnyVal {
      
      inline def setI18nImportModule(value: String): Self = StObject.set(x, "i18nImportModule", value.asInstanceOf[js.Any])
      
      inline def setI18nImportName(value: String): Self = StObject.set(x, "i18nImportName", value.asInstanceOf[js.Any])
      
      inline def setTransImportModule(value: String): Self = StObject.set(x, "TransImportModule", value.asInstanceOf[js.Any])
      
      inline def setTransImportName(value: String): Self = StObject.set(x, "TransImportName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@lingui/conf.@lingui/conf.LinguiConfig> */
  trait PartialLinguiConfig extends StObject {
    
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
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var orderBy: js.UndefOr[OrderBy] = js.undefined
    
    var prevFormat: js.UndefOr[CatalogFormat] = js.undefined
    
    var pseudoLocale: js.UndefOr[String] = js.undefined
    
    var rootDir: js.UndefOr[String] = js.undefined
    
    var runtimeConfigModule: js.UndefOr[ModuleSource | StringDictionary[ModuleSource]] = js.undefined
    
    var service: js.UndefOr[CatalogService] = js.undefined
    
    var sourceLocale: js.UndefOr[String] = js.undefined
  }
  object PartialLinguiConfig {
    
    inline def apply(): PartialLinguiConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLinguiConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLinguiConfig] (val x: Self) extends AnyVal {
      
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
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      inline def setPrevFormat(value: CatalogFormat): Self = StObject.set(x, "prevFormat", value.asInstanceOf[js.Any])
      
      inline def setPrevFormatUndefined: Self = StObject.set(x, "prevFormat", js.undefined)
      
      inline def setPseudoLocale(value: String): Self = StObject.set(x, "pseudoLocale", value.asInstanceOf[js.Any])
      
      inline def setPseudoLocaleUndefined: Self = StObject.set(x, "pseudoLocale", js.undefined)
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setRuntimeConfigModule(value: ModuleSource | StringDictionary[ModuleSource]): Self = StObject.set(x, "runtimeConfigModule", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfigModuleUndefined: Self = StObject.set(x, "runtimeConfigModule", js.undefined)
      
      inline def setService(value: CatalogService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setSourceLocale(value: String): Self = StObject.set(x, "sourceLocale", value.asInstanceOf[js.Any])
      
      inline def setSourceLocaleUndefined: Self = StObject.set(x, "sourceLocale", js.undefined)
    }
  }
  
  trait SkipValidation extends StObject {
    
    var skipValidation: js.UndefOr[Boolean] = js.undefined
  }
  object SkipValidation {
    
    inline def apply(): SkipValidation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipValidation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkipValidation] (val x: Self) extends AnyVal {
      
      inline def setSkipValidation(value: Boolean): Self = StObject.set(x, "skipValidation", value.asInstanceOf[js.Any])
      
      inline def setSkipValidationUndefined: Self = StObject.set(x, "skipValidation", js.undefined)
    }
  }
}
