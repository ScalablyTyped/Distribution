package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersInsertionordersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser this insertion order belongs to.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the insertion order to delete.
    */
  var insertionOrderId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersInsertionordersDelete {
  
  inline def apply(): ParamsResourceAdvertisersInsertionordersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersInsertionordersDelete]
  }
  
  extension [Self <: ParamsResourceAdvertisersInsertionordersDelete](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setInsertionOrderId(value: String): Self = StObject.set(x, "insertionOrderId", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrderIdUndefined: Self = StObject.set(x, "insertionOrderId", js.undefined)
  }
}
