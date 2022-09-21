package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFinalizeDefaultLocationRequest extends StObject {
  
  /**
    * The ID of the Project's default GCP resource location. The location must be one of the available [GCP resource locations](https://firebase.google.com/docs/projects/locations).
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaFinalizeDefaultLocationRequest {
  
  inline def apply(): SchemaFinalizeDefaultLocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFinalizeDefaultLocationRequest]
  }
  
  extension [Self <: SchemaFinalizeDefaultLocationRequest](x: Self) {
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
  }
}
