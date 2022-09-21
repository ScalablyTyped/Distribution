package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.licensePolicyMod.LicensePolicy
import typings.licenseWebpackPlugin.licenseTestRunnerMod.LicenseTestRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginLicensePolicyMod {
  
  @JSImport("license-webpack-plugin/dist/PluginLicensePolicy", "PluginLicensePolicy")
  @js.native
  open class PluginLicensePolicy protected ()
    extends StObject
       with LicensePolicy {
    def this(
      licenseTester: LicenseTestRunner,
      unacceptableLicenseTester: LicenseTestRunner,
      unacceptableLicenseHandler: js.Function2[/* packageName */ String, /* licenseType */ String, Unit],
      missingLicenseTextHandler: js.Function2[/* packageName */ String, /* licenseType */ String, Unit]
    ) = this()
    
    /* private */ var licenseTester: Any = js.native
    
    /* private */ var missingLicenseTextHandler: Any = js.native
    
    /* private */ var unacceptableLicenseHandler: Any = js.native
    
    /* private */ var unacceptableLicenseTester: Any = js.native
  }
}
