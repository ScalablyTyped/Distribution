package typings.licenseWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLicensePolicyMod {
  
  @js.native
  trait LicensePolicy extends StObject {
    
    def handleMissingLicenseText(packageName: String): Unit = js.native
    def handleMissingLicenseText(packageName: String, licenseType: String): Unit = js.native
    
    def handleUnacceptableLicense(packageName: String): Unit = js.native
    def handleUnacceptableLicense(packageName: String, licenseType: String): Unit = js.native
    
    def isLicenseUnacceptableFor(): Boolean = js.native
    def isLicenseUnacceptableFor(licenseType: String): Boolean = js.native
    
    def isLicenseWrittenFor(): Boolean = js.native
    def isLicenseWrittenFor(licenseType: String): Boolean = js.native
  }
}
