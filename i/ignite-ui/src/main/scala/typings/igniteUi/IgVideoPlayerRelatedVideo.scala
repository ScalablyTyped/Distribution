package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgVideoPlayerRelatedVideo
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets custom CSS class to be applied on the related video element.
    *
    */
  var css: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the height of the related video image.
    *
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets the URL of the related video image.
    *
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets a link to a page that will play the related video. It will be opened in a new window. If there are sources also, the link property has a priority.
    *
    */
  var link: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the sources of the related video.
    *
    */
  var sources: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets/Sets the title of the video.
    *
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the width of the related video image.
    *
    */
  var width: js.UndefOr[Double] = js.native
}
object IgVideoPlayerRelatedVideo {
  
  @scala.inline
  def apply(): IgVideoPlayerRelatedVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerRelatedVideo]
  }
  
  @scala.inline
  implicit class IgVideoPlayerRelatedVideoOps[Self <: IgVideoPlayerRelatedVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: js.Any*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[_]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
