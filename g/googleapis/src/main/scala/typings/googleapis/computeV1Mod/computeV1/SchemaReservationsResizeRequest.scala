package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReservationsResizeRequest extends StObject {
  
  /**
    * Number of allocated resources can be resized with minimum = 1 and maximum = 1000.
    */
  var specificSkuCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaReservationsResizeRequest {
  
  inline def apply(): SchemaReservationsResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationsResizeRequest]
  }
  
  extension [Self <: SchemaReservationsResizeRequest](x: Self) {
    
    inline def setSpecificSkuCount(value: String): Self = StObject.set(x, "specificSkuCount", value.asInstanceOf[js.Any])
    
    inline def setSpecificSkuCountNull: Self = StObject.set(x, "specificSkuCount", null)
    
    inline def setSpecificSkuCountUndefined: Self = StObject.set(x, "specificSkuCount", js.undefined)
  }
}
