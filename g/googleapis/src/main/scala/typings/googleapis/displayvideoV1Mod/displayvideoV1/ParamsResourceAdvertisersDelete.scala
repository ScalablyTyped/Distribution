package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser we need to delete.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersDelete {
  
  inline def apply(): ParamsResourceAdvertisersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersDelete]
  }
  
  extension [Self <: ParamsResourceAdvertisersDelete](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
  }
}
