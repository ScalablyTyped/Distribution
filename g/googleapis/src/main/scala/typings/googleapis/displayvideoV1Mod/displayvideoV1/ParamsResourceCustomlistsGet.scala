package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomlistsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the DV360 advertiser that has access to the fetched custom lists.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the custom list to fetch.
    */
  var customListId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomlistsGet {
  
  inline def apply(): ParamsResourceCustomlistsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomlistsGet]
  }
  
  extension [Self <: ParamsResourceCustomlistsGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCustomListId(value: String): Self = StObject.set(x, "customListId", value.asInstanceOf[js.Any])
    
    inline def setCustomListIdUndefined: Self = StObject.set(x, "customListId", js.undefined)
  }
}
