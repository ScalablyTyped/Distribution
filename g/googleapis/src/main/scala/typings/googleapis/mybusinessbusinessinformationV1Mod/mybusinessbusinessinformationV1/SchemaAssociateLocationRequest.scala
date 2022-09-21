package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAssociateLocationRequest extends StObject {
  
  /**
    * The association to establish. If not set, it indicates no match.
    */
  var placeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAssociateLocationRequest {
  
  inline def apply(): SchemaAssociateLocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssociateLocationRequest]
  }
  
  extension [Self <: SchemaAssociateLocationRequest](x: Self) {
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdNull: Self = StObject.set(x, "placeId", null)
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
  }
}
