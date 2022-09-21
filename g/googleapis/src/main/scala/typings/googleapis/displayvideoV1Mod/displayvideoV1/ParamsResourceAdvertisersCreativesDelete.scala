package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersCreativesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser this creative belongs to.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the creative to be deleted.
    */
  var creativeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersCreativesDelete {
  
  inline def apply(): ParamsResourceAdvertisersCreativesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersCreativesDelete]
  }
  
  extension [Self <: ParamsResourceAdvertisersCreativesDelete](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
  }
}
