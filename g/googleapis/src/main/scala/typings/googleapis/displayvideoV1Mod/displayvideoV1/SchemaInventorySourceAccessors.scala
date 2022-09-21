package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventorySourceAccessors extends StObject {
  
  /**
    * The advertisers with access to the inventory source. All advertisers must belong to the same partner.
    */
  var advertisers: js.UndefOr[SchemaInventorySourceAccessorsAdvertiserAccessors] = js.undefined
  
  /**
    * The partner with access to the inventory source.
    */
  var partner: js.UndefOr[SchemaInventorySourceAccessorsPartnerAccessor] = js.undefined
}
object SchemaInventorySourceAccessors {
  
  inline def apply(): SchemaInventorySourceAccessors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySourceAccessors]
  }
  
  extension [Self <: SchemaInventorySourceAccessors](x: Self) {
    
    inline def setAdvertisers(value: SchemaInventorySourceAccessorsAdvertiserAccessors): Self = StObject.set(x, "advertisers", value.asInstanceOf[js.Any])
    
    inline def setAdvertisersUndefined: Self = StObject.set(x, "advertisers", js.undefined)
    
    inline def setPartner(value: SchemaInventorySourceAccessorsPartnerAccessor): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    inline def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
  }
}
