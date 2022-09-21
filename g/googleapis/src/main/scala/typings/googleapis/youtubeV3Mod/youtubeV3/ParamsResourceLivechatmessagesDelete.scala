package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLivechatmessagesDelete
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var id: js.UndefOr[String] = js.undefined
}
object ParamsResourceLivechatmessagesDelete {
  
  inline def apply(): ParamsResourceLivechatmessagesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLivechatmessagesDelete]
  }
  
  extension [Self <: ParamsResourceLivechatmessagesDelete](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
