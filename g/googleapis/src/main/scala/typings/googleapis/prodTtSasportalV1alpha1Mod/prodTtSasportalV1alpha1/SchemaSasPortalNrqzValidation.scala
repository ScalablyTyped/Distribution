package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalNrqzValidation extends StObject {
  
  /**
    * Validation case id.
    */
  var caseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * CPI who signed the validation.
    */
  var cpiId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Device latitude associated with the validation.
    */
  var latitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Device longitude associated with the validation.
    */
  var longitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * State of the NRQZ validation info.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalNrqzValidation {
  
  inline def apply(): SchemaSasPortalNrqzValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalNrqzValidation]
  }
  
  extension [Self <: SchemaSasPortalNrqzValidation](x: Self) {
    
    inline def setCaseId(value: String): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setCaseIdNull: Self = StObject.set(x, "caseId", null)
    
    inline def setCaseIdUndefined: Self = StObject.set(x, "caseId", js.undefined)
    
    inline def setCpiId(value: String): Self = StObject.set(x, "cpiId", value.asInstanceOf[js.Any])
    
    inline def setCpiIdNull: Self = StObject.set(x, "cpiId", null)
    
    inline def setCpiIdUndefined: Self = StObject.set(x, "cpiId", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
