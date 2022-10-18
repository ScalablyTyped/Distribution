package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.anon.Type
import typings.licenseWebpackPlugin.distLicenseTypeIdentifierMod.LicenseTypeIdentifier
import typings.licenseWebpackPlugin.distLicenseTypeOverridesMod.LicenseTypeOverrides
import typings.licenseWebpackPlugin.distLoggerMod.Logger
import typings.licenseWebpackPlugin.distPackageJsonMod.PackageJson
import typings.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginLicenseTypeIdentifierMod {
  
  @JSImport("license-webpack-plugin/dist/PluginLicenseTypeIdentifier", "PluginLicenseTypeIdentifier")
  @js.native
  open class PluginLicenseTypeIdentifier protected ()
    extends StObject
       with LicenseTypeIdentifier {
    def this(
      logger: Logger,
      licenseTypeOverrides: LicenseTypeOverrides,
      preferredLicenseTypes: js.Array[String],
      handleLicenseAmbiguity: js.Function2[/* packageName */ String, /* licenses */ js.Array[Type], String],
      handleMissingLicenseType: js.Function1[/* packageName */ String, String | Null]
    ) = this()
    
    /* CompleteClass */
    override def findLicenseIdentifier(compilation: WebpackCompilation, packageName: String, packageJson: PackageJson): String | Null = js.native
    
    /* private */ var findPreferredLicense: Any = js.native
    
    /* private */ var handleLicenseAmbiguity: Any = js.native
    
    /* private */ var handleMissingLicenseType: Any = js.native
    
    /* private */ var licenseTypeOverrides: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var preferredLicenseTypes: Any = js.native
  }
}
