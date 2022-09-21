package typings.googleapis.servicecontrolV2Mod.servicecontrolV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceLocation extends StObject {
  
  /**
    * The locations of a resource after the execution of the operation. Requests to create or delete a location based resource must populate the 'current_locations' field and not the 'original_locations' field. For example: "europe-west1-a" "us-east1" "nam3"
    */
  var currentLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The locations of a resource prior to the execution of the operation. Requests that mutate the resource's location must populate both the 'original_locations' as well as the 'current_locations' fields. For example: "europe-west1-a" "us-east1" "nam3"
    */
  var originalLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaResourceLocation {
  
  inline def apply(): SchemaResourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceLocation]
  }
  
  extension [Self <: SchemaResourceLocation](x: Self) {
    
    inline def setCurrentLocations(value: js.Array[String]): Self = StObject.set(x, "currentLocations", value.asInstanceOf[js.Any])
    
    inline def setCurrentLocationsNull: Self = StObject.set(x, "currentLocations", null)
    
    inline def setCurrentLocationsUndefined: Self = StObject.set(x, "currentLocations", js.undefined)
    
    inline def setCurrentLocationsVarargs(value: String*): Self = StObject.set(x, "currentLocations", js.Array(value*))
    
    inline def setOriginalLocations(value: js.Array[String]): Self = StObject.set(x, "originalLocations", value.asInstanceOf[js.Any])
    
    inline def setOriginalLocationsNull: Self = StObject.set(x, "originalLocations", null)
    
    inline def setOriginalLocationsUndefined: Self = StObject.set(x, "originalLocations", js.undefined)
    
    inline def setOriginalLocationsVarargs(value: String*): Self = StObject.set(x, "originalLocations", js.Array(value*))
  }
}
