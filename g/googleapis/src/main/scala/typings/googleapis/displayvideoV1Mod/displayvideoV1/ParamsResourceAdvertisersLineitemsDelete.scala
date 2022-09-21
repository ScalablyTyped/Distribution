package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersLineitemsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser this line item belongs to.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the line item to delete.
    */
  var lineItemId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersLineitemsDelete {
  
  inline def apply(): ParamsResourceAdvertisersLineitemsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersLineitemsDelete]
  }
  
  extension [Self <: ParamsResourceAdvertisersLineitemsDelete](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
  }
}
