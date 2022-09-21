package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSubscriptionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var id: js.UndefOr[String] = js.undefined
}
object ParamsResourceSubscriptionsDelete {
  
  inline def apply(): ParamsResourceSubscriptionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsDelete]
  }
  
  extension [Self <: ParamsResourceSubscriptionsDelete](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
