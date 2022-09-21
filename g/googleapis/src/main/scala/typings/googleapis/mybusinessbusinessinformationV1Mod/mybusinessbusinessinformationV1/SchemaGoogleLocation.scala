package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleLocation extends StObject {
  
  /**
    * The sparsely populated Location information. This field can be re-used in CreateLocation if it is not currently claimed by a user.
    */
  var location: js.UndefOr[SchemaLocation] = js.undefined
  
  /**
    * Resource name of this GoogleLocation, in the format `googleLocations/{googleLocationId\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A URL that will redirect the user to the request admin rights UI. This field is only present if the location has already been claimed by any user, including the current user.
    */
  var requestAdminRightsUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleLocation {
  
  inline def apply(): SchemaGoogleLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleLocation]
  }
  
  extension [Self <: SchemaGoogleLocation](x: Self) {
    
    inline def setLocation(value: SchemaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestAdminRightsUri(value: String): Self = StObject.set(x, "requestAdminRightsUri", value.asInstanceOf[js.Any])
    
    inline def setRequestAdminRightsUriNull: Self = StObject.set(x, "requestAdminRightsUri", null)
    
    inline def setRequestAdminRightsUriUndefined: Self = StObject.set(x, "requestAdminRightsUri", js.undefined)
  }
}
