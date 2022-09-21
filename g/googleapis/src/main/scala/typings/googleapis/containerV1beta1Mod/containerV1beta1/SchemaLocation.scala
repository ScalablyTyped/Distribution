package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocation extends StObject {
  
  /**
    * Contains the name of the resource requested. Specified in the format `projects/x/locations/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the location is recommended for GKE cluster scheduling.
    */
  var recommended: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Contains the type of location this Location is for. Regional or Zonal.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocation {
  
  inline def apply(): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocation]
  }
  
  extension [Self <: SchemaLocation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecommended(value: Boolean): Self = StObject.set(x, "recommended", value.asInstanceOf[js.Any])
    
    inline def setRecommendedNull: Self = StObject.set(x, "recommended", null)
    
    inline def setRecommendedUndefined: Self = StObject.set(x, "recommended", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
