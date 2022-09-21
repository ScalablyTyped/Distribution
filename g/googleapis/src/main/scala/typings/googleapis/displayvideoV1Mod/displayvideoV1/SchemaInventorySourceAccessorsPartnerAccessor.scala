package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventorySourceAccessorsPartnerAccessor extends StObject {
  
  /**
    * The ID of the partner.
    */
  var partnerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventorySourceAccessorsPartnerAccessor {
  
  inline def apply(): SchemaInventorySourceAccessorsPartnerAccessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySourceAccessorsPartnerAccessor]
  }
  
  extension [Self <: SchemaInventorySourceAccessorsPartnerAccessor](x: Self) {
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdNull: Self = StObject.set(x, "partnerId", null)
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
