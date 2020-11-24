package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgVideoPlayerBanner
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets whether to apply animation effects when showing or hiding the banner. If set to true, the animation is played for banner.duration in milliseconds.
    *
    */
  var animate: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets whether to automatically hide the banner. If set to true, the banner is hidden after [hidedelay](ui.igvideoplayer#options:banners.hidedelay) in milliseconds.
    *
    */
  var autohide: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets whether the user will be able to close the banner or not.
    *
    */
  var closeBanner: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the banner specific css class, that will be applied on the banner grid.
    *
    */
  var css: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the banner animation duration.
    *
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets the banner height
    *
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * Gets/Sets the banner autohide delay in milliseconds. It is taken into account only if the banner.autohide option is set to true.
    *
    */
  var hidedelay: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets the banner image url.
    *
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the banner link that will open in new window.
    *
    */
  var link: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets an array of numbers. Each number specifies on which second in the movie the banner will pop.
    *
    */
  var times: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets/Sets whether the banner is visible or not.
    *
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the banner width
    *
    */
  var width: js.UndefOr[Double | String] = js.native
}
object IgVideoPlayerBanner {
  
  @scala.inline
  def apply(): IgVideoPlayerBanner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerBanner]
  }
  
  @scala.inline
  implicit class IgVideoPlayerBannerOps[Self <: IgVideoPlayerBanner] (val x: Self) extends AnyVal {
    
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setAutohide(value: Boolean): Self = this.set("autohide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutohide: Self = this.set("autohide", js.undefined)
    
    @scala.inline
    def setCloseBanner(value: Boolean): Self = this.set("closeBanner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseBanner: Self = this.set("closeBanner", js.undefined)
    
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidedelay(value: Double): Self = this.set("hidedelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidedelay: Self = this.set("hidedelay", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setTimesVarargs(value: js.Any*): Self = this.set("times", js.Array(value :_*))
    
    @scala.inline
    def setTimes(value: js.Array[_]): Self = this.set("times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimes: Self = this.set("times", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
