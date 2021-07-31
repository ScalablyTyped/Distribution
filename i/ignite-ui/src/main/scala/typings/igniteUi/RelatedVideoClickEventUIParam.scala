package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedVideoClickEventUIParam extends StObject {
  
  /**
    * Get the relatedVideo object from the relatedVideos array.
    */
  var relatedVideo: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Get the relatedVideo html element in the DOM.
    */
  var relatedVideoElement: js.UndefOr[js.Any] = js.undefined
}
object RelatedVideoClickEventUIParam {
  
  @scala.inline
  def apply(): RelatedVideoClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedVideoClickEventUIParam]
  }
  
  @scala.inline
  implicit class RelatedVideoClickEventUIParamMutableBuilder[Self <: RelatedVideoClickEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelatedVideo(value: js.Any): Self = StObject.set(x, "relatedVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedVideoElement(value: js.Any): Self = StObject.set(x, "relatedVideoElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedVideoElementUndefined: Self = StObject.set(x, "relatedVideoElement", js.undefined)
    
    @scala.inline
    def setRelatedVideoUndefined: Self = StObject.set(x, "relatedVideo", js.undefined)
  }
}
