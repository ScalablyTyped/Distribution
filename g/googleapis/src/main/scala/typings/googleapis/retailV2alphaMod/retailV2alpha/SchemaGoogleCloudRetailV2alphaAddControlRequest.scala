package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaAddControlRequest extends StObject {
  
  /**
    * Required. The id of the control to apply. Assumed to be in the same catalog as the serving config - if id is not found a NOT_FOUND error is returned.
    */
  var controlId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaAddControlRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaAddControlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaAddControlRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaAddControlRequest](x: Self) {
    
    inline def setControlId(value: String): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
    
    inline def setControlIdNull: Self = StObject.set(x, "controlId", null)
    
    inline def setControlIdUndefined: Self = StObject.set(x, "controlId", js.undefined)
  }
}
