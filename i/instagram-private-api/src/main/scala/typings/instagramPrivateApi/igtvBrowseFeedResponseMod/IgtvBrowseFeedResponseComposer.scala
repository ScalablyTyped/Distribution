package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvBrowseFeedResponseComposer extends StObject {
  
  var aspect_ratio_finished: Boolean
  
  var nux_finished: Boolean
}
object IgtvBrowseFeedResponseComposer {
  
  inline def apply(aspect_ratio_finished: Boolean, nux_finished: Boolean): IgtvBrowseFeedResponseComposer = {
    val __obj = js.Dynamic.literal(aspect_ratio_finished = aspect_ratio_finished.asInstanceOf[js.Any], nux_finished = nux_finished.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseComposer]
  }
  
  extension [Self <: IgtvBrowseFeedResponseComposer](x: Self) {
    
    inline def setAspect_ratio_finished(value: Boolean): Self = StObject.set(x, "aspect_ratio_finished", value.asInstanceOf[js.Any])
    
    inline def setNux_finished(value: Boolean): Self = StObject.set(x, "nux_finished", value.asInstanceOf[js.Any])
  }
}
