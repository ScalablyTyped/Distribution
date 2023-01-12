package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.distModuleMod.Module
import typings.licenseWebpackPlugin.distPackageJsonMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLicenseIdentifiedModuleMod {
  
  trait LicenseIdentifiedModule
    extends StObject
       with Module {
    
    var licenseId: js.UndefOr[String | Null] = js.undefined
    
    var licenseText: js.UndefOr[String | Null] = js.undefined
    
    var packageJson: js.UndefOr[PackageJson] = js.undefined
  }
  object LicenseIdentifiedModule {
    
    inline def apply(directory: String, name: String): LicenseIdentifiedModule = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseIdentifiedModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LicenseIdentifiedModule] (val x: Self) extends AnyVal {
      
      inline def setLicenseId(value: String): Self = StObject.set(x, "licenseId", value.asInstanceOf[js.Any])
      
      inline def setLicenseIdNull: Self = StObject.set(x, "licenseId", null)
      
      inline def setLicenseIdUndefined: Self = StObject.set(x, "licenseId", js.undefined)
      
      inline def setLicenseText(value: String): Self = StObject.set(x, "licenseText", value.asInstanceOf[js.Any])
      
      inline def setLicenseTextNull: Self = StObject.set(x, "licenseText", null)
      
      inline def setLicenseTextUndefined: Self = StObject.set(x, "licenseText", js.undefined)
      
      inline def setPackageJson(value: PackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      inline def setPackageJsonUndefined: Self = StObject.set(x, "packageJson", js.undefined)
    }
  }
}
