package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuploadParams extends StObject {
  
  var name: js.Any
  
  var ruploadParams: js.Any
  
  var waterfallId: js.Any
}
object RuploadParams {
  
  inline def apply(name: js.Any, ruploadParams: js.Any, waterfallId: js.Any): RuploadParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ruploadParams = ruploadParams.asInstanceOf[js.Any], waterfallId = waterfallId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuploadParams]
  }
  
  extension [Self <: RuploadParams](x: Self) {
    
    inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRuploadParams(value: js.Any): Self = StObject.set(x, "ruploadParams", value.asInstanceOf[js.Any])
    
    inline def setWaterfallId(value: js.Any): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
  }
}
