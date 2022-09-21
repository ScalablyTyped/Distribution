package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaRemoveControlRequest extends StObject {
  
  /**
    * Required. The id of the control to apply. Assumed to be in the same catalog as the serving config.
    */
  var controlId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaRemoveControlRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaRemoveControlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaRemoveControlRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaRemoveControlRequest](x: Self) {
    
    inline def setControlId(value: String): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
    
    inline def setControlIdNull: Self = StObject.set(x, "controlId", null)
    
    inline def setControlIdUndefined: Self = StObject.set(x, "controlId", js.undefined)
  }
}
