package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvBrowseFeedResponseComposer extends StObject {
  
  var aspect_ratio_finished: Boolean = js.native
  
  var nux_finished: Boolean = js.native
}
object IgtvBrowseFeedResponseComposer {
  
  @scala.inline
  def apply(aspect_ratio_finished: Boolean, nux_finished: Boolean): IgtvBrowseFeedResponseComposer = {
    val __obj = js.Dynamic.literal(aspect_ratio_finished = aspect_ratio_finished.asInstanceOf[js.Any], nux_finished = nux_finished.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseComposer]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseComposerMutableBuilder[Self <: IgtvBrowseFeedResponseComposer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspect_ratio_finished(value: Boolean): Self = StObject.set(x, "aspect_ratio_finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNux_finished(value: Boolean): Self = StObject.set(x, "nux_finished", value.asInstanceOf[js.Any])
  }
}
