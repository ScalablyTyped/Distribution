package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersLocationlistsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the DV360 advertiser to which the fetched location list belongs.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the location list to fetch.
    */
  var locationListId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersLocationlistsGet {
  
  inline def apply(): ParamsResourceAdvertisersLocationlistsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersLocationlistsGet]
  }
  
  extension [Self <: ParamsResourceAdvertisersLocationlistsGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setLocationListId(value: String): Self = StObject.set(x, "locationListId", value.asInstanceOf[js.Any])
    
    inline def setLocationListIdUndefined: Self = StObject.set(x, "locationListId", js.undefined)
  }
}
