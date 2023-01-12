package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackageJsonMod {
  
  trait PackageJson extends StObject {
    
    var license: js.UndefOr[String | Type] = js.undefined
    
    var licenses: js.UndefOr[js.Array[Type]] = js.undefined
    
    var name: String
    
    var version: String
  }
  object PackageJson {
    
    inline def apply(name: String, version: String): PackageJson = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageJson] (val x: Self) extends AnyVal {
      
      inline def setLicense(value: String | Type): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setLicenses(value: js.Array[Type]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
      
      inline def setLicensesVarargs(value: Type*): Self = StObject.set(x, "licenses", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
