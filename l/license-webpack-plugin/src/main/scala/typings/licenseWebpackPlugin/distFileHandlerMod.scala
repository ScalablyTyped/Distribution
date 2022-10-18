package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.distLicenseIdentifiedModuleMod.LicenseIdentifiedModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFileHandlerMod {
  
  @js.native
  trait FileHandler extends StObject {
    
    def excludedPackageTest(filename: String): Boolean = js.native
    
    def getModule(): LicenseIdentifiedModule | Null = js.native
    def getModule(filename: String): LicenseIdentifiedModule | Null = js.native
    
    def isBuildRoot(filename: String): Boolean = js.native
    
    def isInModuleDirectory(filename: String): Boolean = js.native
  }
}
