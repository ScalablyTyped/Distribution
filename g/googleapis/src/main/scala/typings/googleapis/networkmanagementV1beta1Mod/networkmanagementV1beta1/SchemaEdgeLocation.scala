package typings.googleapis.networkmanagementV1beta1Mod.networkmanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEdgeLocation extends StObject {
  
  /**
    * Name of the metropolitan area.
    */
  var metropolitanArea: js.UndefOr[String | Null] = js.undefined
}
object SchemaEdgeLocation {
  
  inline def apply(): SchemaEdgeLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEdgeLocation]
  }
  
  extension [Self <: SchemaEdgeLocation](x: Self) {
    
    inline def setMetropolitanArea(value: String): Self = StObject.set(x, "metropolitanArea", value.asInstanceOf[js.Any])
    
    inline def setMetropolitanAreaNull: Self = StObject.set(x, "metropolitanArea", null)
    
    inline def setMetropolitanAreaUndefined: Self = StObject.set(x, "metropolitanArea", js.undefined)
  }
}
