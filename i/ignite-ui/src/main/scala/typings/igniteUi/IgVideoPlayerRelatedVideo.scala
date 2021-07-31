package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgVideoPlayerRelatedVideo
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets custom CSS class to be applied on the related video element.
    *
    */
  var css: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the height of the related video image.
    *
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the URL of the related video image.
    *
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets a link to a page that will play the related video. It will be opened in a new window. If there are sources also, the link property has a priority.
    *
    */
  var link: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the sources of the related video.
    *
    */
  var sources: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets/Sets the title of the video.
    *
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the width of the related video image.
    *
    */
  var width: js.UndefOr[Double] = js.undefined
}
object IgVideoPlayerRelatedVideo {
  
  @scala.inline
  def apply(): IgVideoPlayerRelatedVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerRelatedVideo]
  }
  
  @scala.inline
  implicit class IgVideoPlayerRelatedVideoMutableBuilder[Self <: IgVideoPlayerRelatedVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[js.Any]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: js.Any*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
