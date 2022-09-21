package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppliedLicense extends StObject {
  
  /**
    * The OS license returned from the adaptation module's report.
    */
  var osLicense: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The license type that was used in OS adaptation.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppliedLicense {
  
  inline def apply(): SchemaAppliedLicense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppliedLicense]
  }
  
  extension [Self <: SchemaAppliedLicense](x: Self) {
    
    inline def setOsLicense(value: String): Self = StObject.set(x, "osLicense", value.asInstanceOf[js.Any])
    
    inline def setOsLicenseNull: Self = StObject.set(x, "osLicense", null)
    
    inline def setOsLicenseUndefined: Self = StObject.set(x, "osLicense", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
