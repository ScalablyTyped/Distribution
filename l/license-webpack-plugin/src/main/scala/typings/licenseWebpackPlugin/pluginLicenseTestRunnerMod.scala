package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.licenseTestMod.LicenseTest
import typings.licenseWebpackPlugin.licenseTestRunnerMod.LicenseTestRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginLicenseTestRunnerMod {
  
  @JSImport("license-webpack-plugin/dist/PluginLicenseTestRunner", "PluginLicenseTestRunner")
  @js.native
  open class PluginLicenseTestRunner protected ()
    extends StObject
       with LicenseTestRunner {
    def this(licenseTest: LicenseTest) = this()
    
    /* private */ var licenseTest: Any = js.native
    
    /* CompleteClass */
    override def test(licenseId: String): Boolean = js.native
  }
}
