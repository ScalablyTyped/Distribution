package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser to fetch.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersGet {
  
  inline def apply(): ParamsResourceAdvertisersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersGet]
  }
  
  extension [Self <: ParamsResourceAdvertisersGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
  }
}
