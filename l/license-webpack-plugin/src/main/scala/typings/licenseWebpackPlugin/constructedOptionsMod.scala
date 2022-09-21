package typings.licenseWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.licenseWebpackPlugin.anon.Type
import typings.licenseWebpackPlugin.constructedStatsMod.ConstructedStats
import typings.licenseWebpackPlugin.includeExcludeTestMod.IncludeExcludeTest
import typings.licenseWebpackPlugin.licenseIdentifiedModuleMod.LicenseIdentifiedModule
import typings.licenseWebpackPlugin.licenseTestMod.LicenseTest
import typings.licenseWebpackPlugin.moduleMod.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constructedOptionsMod {
  
  @js.native
  trait ConstructedOptions extends StObject {
    
    var addBanner: Boolean = js.native
    
    var additionalChunkModules: StringDictionary[js.Array[Module]] = js.native
    
    var additionalModules: js.Array[Module] = js.native
    
    var buildRoot: String = js.native
    
    var chunkIncludeExcludeTest: IncludeExcludeTest = js.native
    
    def excludedPackageTest(packageName: String): Boolean = js.native
    
    def handleLicenseAmbiguity(packageName: String, licenses: js.Array[Type]): String = js.native
    
    def handleMissingLicenseText(packageName: String): String | Null = js.native
    def handleMissingLicenseText(packageName: String, licenseType: String): String | Null = js.native
    
    def handleMissingLicenseType(packageName: String): String | Null = js.native
    
    def handleUnacceptableLicense(packageName: String, licenseType: String): Unit = js.native
    
    var licenseFileOverrides: StringDictionary[String] = js.native
    
    def licenseInclusionTest(licenseName: String): Boolean = js.native
    @JSName("licenseInclusionTest")
    var licenseInclusionTest_Original: LicenseTest = js.native
    
    var licenseTemplateDir: js.UndefOr[String] = js.native
    
    var licenseTextOverrides: StringDictionary[String] = js.native
    
    var licenseTypeOverrides: StringDictionary[String] = js.native
    
    var modulesDirectories: js.Array[String] | Null = js.native
    
    var outputFilename: String = js.native
    
    var perChunkOutput: Boolean = js.native
    
    var preferredLicenseTypes: js.Array[String] = js.native
    
    def renderBanner(filename: String, modules: js.Array[LicenseIdentifiedModule]): String = js.native
    
    def renderLicenses(modules: js.Array[LicenseIdentifiedModule]): String = js.native
    
    var skipChildCompilers: Boolean = js.native
    
    var stats: ConstructedStats = js.native
    
    def unacceptableLicenseTest(licenseName: String): Boolean = js.native
    @JSName("unacceptableLicenseTest")
    var unacceptableLicenseTest_Original: LicenseTest = js.native
  }
}
