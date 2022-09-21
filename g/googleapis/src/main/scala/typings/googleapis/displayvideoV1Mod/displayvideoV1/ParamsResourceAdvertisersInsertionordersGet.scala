package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersInsertionordersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser this insertion order belongs to.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the insertion order to fetch.
    */
  var insertionOrderId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersInsertionordersGet {
  
  inline def apply(): ParamsResourceAdvertisersInsertionordersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersInsertionordersGet]
  }
  
  extension [Self <: ParamsResourceAdvertisersInsertionordersGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setInsertionOrderId(value: String): Self = StObject.set(x, "insertionOrderId", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrderIdUndefined: Self = StObject.set(x, "insertionOrderId", js.undefined)
  }
}
