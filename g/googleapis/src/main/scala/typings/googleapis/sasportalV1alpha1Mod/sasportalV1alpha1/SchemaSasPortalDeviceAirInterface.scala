package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalDeviceAirInterface extends StObject {
  
  /**
    * Conditional. This field specifies the radio access technology that is used for the CBSD.
    */
  var radioTechnology: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. This field is related to the `radioTechnology` and provides the air interface specification that the CBSD is compliant with at the time of registration.
    */
  var supportedSpec: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalDeviceAirInterface {
  
  inline def apply(): SchemaSasPortalDeviceAirInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalDeviceAirInterface]
  }
  
  extension [Self <: SchemaSasPortalDeviceAirInterface](x: Self) {
    
    inline def setRadioTechnology(value: String): Self = StObject.set(x, "radioTechnology", value.asInstanceOf[js.Any])
    
    inline def setRadioTechnologyNull: Self = StObject.set(x, "radioTechnology", null)
    
    inline def setRadioTechnologyUndefined: Self = StObject.set(x, "radioTechnology", js.undefined)
    
    inline def setSupportedSpec(value: String): Self = StObject.set(x, "supportedSpec", value.asInstanceOf[js.Any])
    
    inline def setSupportedSpecNull: Self = StObject.set(x, "supportedSpec", null)
    
    inline def setSupportedSpecUndefined: Self = StObject.set(x, "supportedSpec", js.undefined)
  }
}
