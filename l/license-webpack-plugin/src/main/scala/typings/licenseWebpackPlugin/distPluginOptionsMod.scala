package typings.licenseWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.licenseWebpackPlugin.anon.Type
import typings.licenseWebpackPlugin.distIncludeExcludeTestMod.IncludeExcludeTest
import typings.licenseWebpackPlugin.distLicenseIdentifiedModuleMod.LicenseIdentifiedModule
import typings.licenseWebpackPlugin.distLicenseTestMod.LicenseTest
import typings.licenseWebpackPlugin.distModuleMod.Module
import typings.licenseWebpackPlugin.distPluginStatsMod.PluginStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginOptionsMod {
  
  trait PluginOptions extends StObject {
    
    var addBanner: js.UndefOr[Boolean] = js.undefined
    
    var additionalChunkModules: js.UndefOr[StringDictionary[js.Array[Module]]] = js.undefined
    
    var additionalModules: js.UndefOr[js.Array[Module]] = js.undefined
    
    var chunkIncludeExcludeTest: js.UndefOr[IncludeExcludeTest] = js.undefined
    
    var excludedPackageTest: js.UndefOr[js.Function1[/* packageName */ String, Boolean]] = js.undefined
    
    var handleLicenseAmbiguity: js.UndefOr[js.Function2[/* packageName */ String, /* licenses */ js.Array[Type], String]] = js.undefined
    
    var handleMissingLicenseText: js.UndefOr[
        js.Function2[/* packageName */ String, /* licenseType */ String | Null, String | Null]
      ] = js.undefined
    
    var handleMissingLicenseType: js.UndefOr[js.Function1[/* packageName */ String, String | Null]] = js.undefined
    
    var handleUnacceptableLicense: js.UndefOr[js.Function2[/* packageName */ String, /* licenseType */ String, Unit]] = js.undefined
    
    var licenseFileOverrides: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var licenseInclusionTest: js.UndefOr[LicenseTest] = js.undefined
    
    var licenseTemplateDir: js.UndefOr[String] = js.undefined
    
    var licenseTextOverrides: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var licenseTypeOverrides: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var modulesDirectories: js.UndefOr[js.Array[String]] = js.undefined
    
    var outputFilename: js.UndefOr[String] = js.undefined
    
    var perChunkOutput: js.UndefOr[Boolean] = js.undefined
    
    var preferredLicenseTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var renderBanner: js.UndefOr[
        js.Function2[/* filename */ String, /* modules */ js.Array[LicenseIdentifiedModule], String]
      ] = js.undefined
    
    var renderLicenses: js.UndefOr[js.Function1[/* modules */ js.Array[LicenseIdentifiedModule], String]] = js.undefined
    
    var skipChildCompilers: js.UndefOr[Boolean] = js.undefined
    
    var stats: js.UndefOr[PluginStats] = js.undefined
    
    var unacceptableLicenseTest: js.UndefOr[LicenseTest] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      inline def setAddBanner(value: Boolean): Self = StObject.set(x, "addBanner", value.asInstanceOf[js.Any])
      
      inline def setAddBannerUndefined: Self = StObject.set(x, "addBanner", js.undefined)
      
      inline def setAdditionalChunkModules(value: StringDictionary[js.Array[Module]]): Self = StObject.set(x, "additionalChunkModules", value.asInstanceOf[js.Any])
      
      inline def setAdditionalChunkModulesUndefined: Self = StObject.set(x, "additionalChunkModules", js.undefined)
      
      inline def setAdditionalModules(value: js.Array[Module]): Self = StObject.set(x, "additionalModules", value.asInstanceOf[js.Any])
      
      inline def setAdditionalModulesUndefined: Self = StObject.set(x, "additionalModules", js.undefined)
      
      inline def setAdditionalModulesVarargs(value: Module*): Self = StObject.set(x, "additionalModules", js.Array(value*))
      
      inline def setChunkIncludeExcludeTest(value: IncludeExcludeTest): Self = StObject.set(x, "chunkIncludeExcludeTest", value.asInstanceOf[js.Any])
      
      inline def setChunkIncludeExcludeTestFunction1(value: /* chunkName */ String => Boolean): Self = StObject.set(x, "chunkIncludeExcludeTest", js.Any.fromFunction1(value))
      
      inline def setChunkIncludeExcludeTestUndefined: Self = StObject.set(x, "chunkIncludeExcludeTest", js.undefined)
      
      inline def setExcludedPackageTest(value: /* packageName */ String => Boolean): Self = StObject.set(x, "excludedPackageTest", js.Any.fromFunction1(value))
      
      inline def setExcludedPackageTestUndefined: Self = StObject.set(x, "excludedPackageTest", js.undefined)
      
      inline def setHandleLicenseAmbiguity(value: (/* packageName */ String, /* licenses */ js.Array[Type]) => String): Self = StObject.set(x, "handleLicenseAmbiguity", js.Any.fromFunction2(value))
      
      inline def setHandleLicenseAmbiguityUndefined: Self = StObject.set(x, "handleLicenseAmbiguity", js.undefined)
      
      inline def setHandleMissingLicenseText(value: (/* packageName */ String, /* licenseType */ String | Null) => String | Null): Self = StObject.set(x, "handleMissingLicenseText", js.Any.fromFunction2(value))
      
      inline def setHandleMissingLicenseTextUndefined: Self = StObject.set(x, "handleMissingLicenseText", js.undefined)
      
      inline def setHandleMissingLicenseType(value: /* packageName */ String => String | Null): Self = StObject.set(x, "handleMissingLicenseType", js.Any.fromFunction1(value))
      
      inline def setHandleMissingLicenseTypeUndefined: Self = StObject.set(x, "handleMissingLicenseType", js.undefined)
      
      inline def setHandleUnacceptableLicense(value: (/* packageName */ String, /* licenseType */ String) => Unit): Self = StObject.set(x, "handleUnacceptableLicense", js.Any.fromFunction2(value))
      
      inline def setHandleUnacceptableLicenseUndefined: Self = StObject.set(x, "handleUnacceptableLicense", js.undefined)
      
      inline def setLicenseFileOverrides(value: StringDictionary[String]): Self = StObject.set(x, "licenseFileOverrides", value.asInstanceOf[js.Any])
      
      inline def setLicenseFileOverridesUndefined: Self = StObject.set(x, "licenseFileOverrides", js.undefined)
      
      inline def setLicenseInclusionTest(value: /* licenseName */ String => Boolean): Self = StObject.set(x, "licenseInclusionTest", js.Any.fromFunction1(value))
      
      inline def setLicenseInclusionTestUndefined: Self = StObject.set(x, "licenseInclusionTest", js.undefined)
      
      inline def setLicenseTemplateDir(value: String): Self = StObject.set(x, "licenseTemplateDir", value.asInstanceOf[js.Any])
      
      inline def setLicenseTemplateDirUndefined: Self = StObject.set(x, "licenseTemplateDir", js.undefined)
      
      inline def setLicenseTextOverrides(value: StringDictionary[String]): Self = StObject.set(x, "licenseTextOverrides", value.asInstanceOf[js.Any])
      
      inline def setLicenseTextOverridesUndefined: Self = StObject.set(x, "licenseTextOverrides", js.undefined)
      
      inline def setLicenseTypeOverrides(value: StringDictionary[String]): Self = StObject.set(x, "licenseTypeOverrides", value.asInstanceOf[js.Any])
      
      inline def setLicenseTypeOverridesUndefined: Self = StObject.set(x, "licenseTypeOverrides", js.undefined)
      
      inline def setModulesDirectories(value: js.Array[String]): Self = StObject.set(x, "modulesDirectories", value.asInstanceOf[js.Any])
      
      inline def setModulesDirectoriesUndefined: Self = StObject.set(x, "modulesDirectories", js.undefined)
      
      inline def setModulesDirectoriesVarargs(value: String*): Self = StObject.set(x, "modulesDirectories", js.Array(value*))
      
      inline def setOutputFilename(value: String): Self = StObject.set(x, "outputFilename", value.asInstanceOf[js.Any])
      
      inline def setOutputFilenameUndefined: Self = StObject.set(x, "outputFilename", js.undefined)
      
      inline def setPerChunkOutput(value: Boolean): Self = StObject.set(x, "perChunkOutput", value.asInstanceOf[js.Any])
      
      inline def setPerChunkOutputUndefined: Self = StObject.set(x, "perChunkOutput", js.undefined)
      
      inline def setPreferredLicenseTypes(value: js.Array[String]): Self = StObject.set(x, "preferredLicenseTypes", value.asInstanceOf[js.Any])
      
      inline def setPreferredLicenseTypesUndefined: Self = StObject.set(x, "preferredLicenseTypes", js.undefined)
      
      inline def setPreferredLicenseTypesVarargs(value: String*): Self = StObject.set(x, "preferredLicenseTypes", js.Array(value*))
      
      inline def setRenderBanner(value: (/* filename */ String, /* modules */ js.Array[LicenseIdentifiedModule]) => String): Self = StObject.set(x, "renderBanner", js.Any.fromFunction2(value))
      
      inline def setRenderBannerUndefined: Self = StObject.set(x, "renderBanner", js.undefined)
      
      inline def setRenderLicenses(value: /* modules */ js.Array[LicenseIdentifiedModule] => String): Self = StObject.set(x, "renderLicenses", js.Any.fromFunction1(value))
      
      inline def setRenderLicensesUndefined: Self = StObject.set(x, "renderLicenses", js.undefined)
      
      inline def setSkipChildCompilers(value: Boolean): Self = StObject.set(x, "skipChildCompilers", value.asInstanceOf[js.Any])
      
      inline def setSkipChildCompilersUndefined: Self = StObject.set(x, "skipChildCompilers", js.undefined)
      
      inline def setStats(value: PluginStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setUnacceptableLicenseTest(value: /* licenseName */ String => Boolean): Self = StObject.set(x, "unacceptableLicenseTest", js.Any.fromFunction1(value))
      
      inline def setUnacceptableLicenseTestUndefined: Self = StObject.set(x, "unacceptableLicenseTest", js.undefined)
    }
  }
}
