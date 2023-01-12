package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedVideoClickEventUIParam extends StObject {
  
  /**
    * Get the relatedVideo object from the relatedVideos array.
    */
  var relatedVideo: js.UndefOr[Any] = js.undefined
  
  /**
    * Get the relatedVideo html element in the DOM.
    */
  var relatedVideoElement: js.UndefOr[Any] = js.undefined
}
object RelatedVideoClickEventUIParam {
  
  inline def apply(): RelatedVideoClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedVideoClickEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedVideoClickEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setRelatedVideo(value: Any): Self = StObject.set(x, "relatedVideo", value.asInstanceOf[js.Any])
    
    inline def setRelatedVideoElement(value: Any): Self = StObject.set(x, "relatedVideoElement", value.asInstanceOf[js.Any])
    
    inline def setRelatedVideoElementUndefined: Self = StObject.set(x, "relatedVideoElement", js.undefined)
    
    inline def setRelatedVideoUndefined: Self = StObject.set(x, "relatedVideo", js.undefined)
  }
}
