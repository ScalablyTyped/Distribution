package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetLocation extends StObject {
  
  /**
    * The address of the location to which the user is invited.
    */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the location to which the user is invited.
    */
  var locationName: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetLocation {
  
  inline def apply(): SchemaTargetLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetLocation]
  }
  
  extension [Self <: SchemaTargetLocation](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setLocationName(value: String): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
    
    inline def setLocationNameNull: Self = StObject.set(x, "locationName", null)
    
    inline def setLocationNameUndefined: Self = StObject.set(x, "locationName", js.undefined)
  }
}
