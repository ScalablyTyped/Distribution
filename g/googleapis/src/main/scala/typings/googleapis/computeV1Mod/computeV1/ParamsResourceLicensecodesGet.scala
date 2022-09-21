package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLicensecodesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Number corresponding to the License code resource to return.
    */
  var licenseCode: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceLicensecodesGet {
  
  inline def apply(): ParamsResourceLicensecodesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLicensecodesGet]
  }
  
  extension [Self <: ParamsResourceLicensecodesGet](x: Self) {
    
    inline def setLicenseCode(value: String): Self = StObject.set(x, "licenseCode", value.asInstanceOf[js.Any])
    
    inline def setLicenseCodeUndefined: Self = StObject.set(x, "licenseCode", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
