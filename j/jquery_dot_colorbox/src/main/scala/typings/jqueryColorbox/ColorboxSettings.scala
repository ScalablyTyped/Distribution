package typings.jqueryColorbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorboxSettings extends js.Object {
  
  /**
    * This property isn't actually used as Colorbox assumes all hrefs should be treated as either ajax or photos, unless one of the other content types were specified.
    */
  var ajax: js.UndefOr[js.Any] = js.native
  
  /**
    * If false, will disable the left and right arrow keys from navigating between the items in a group.
    */
  var arrowKey: js.UndefOr[Boolean] = js.native
  
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's vertical positioning instead of using the default position of being centered in the viewport.
    */
  var bottom: js.UndefOr[js.Any] = js.native
  
  /**
    * Adds a given class to colorbox and the overlay.
    */
  var className: js.UndefOr[js.Any] = js.native
  
  /**
    * Text or HTML for the close button. The 'esc' key will also close Colorbox.
    */
  var close: js.UndefOr[String] = js.native
  
  /**
    * Set to false to remove the close button.
    */
  var closeButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Text or HTML for the group counter while viewing a group. {current} and {total} are detected and replaced with actual numbers while Colorbox runs.
    */
  var current: js.UndefOr[String] = js.native
  
  /**
    * For submitting GET or POST values through an ajax request. The data property will act exactly like jQuery's .load() data argument, as Colorbox uses .load() for ajax handling.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * If false, will disable closing colorbox on 'esc' key press.
    */
  var escKey: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the fadeOut speed, in milliseconds, when closing Colorbox.
    */
  var fadeOut: js.UndefOr[Double] = js.native
  
  /**
    * If false, the loading graphic removal and onComplete event will be delayed until iframe's content has completely loaded.
    */
  var fastIframe: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, Colorbox will be displayed in a fixed position within the visitor's viewport. This is unlike the default absolute positioning relative to the document.
    */
  var fixed: js.UndefOr[Boolean] = js.native
  
  /**
    * Set a fixed total height. This includes borders and buttons. Example: "100%", "500px", or 500
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * This can be used as an alternative anchor URL or to associate a URL for non-anchor elements such as images or form buttons.
    */
  var href: js.UndefOr[js.Any] = js.native
  
  /**
    * For displaying a string of HTML or text: $.colorbox({html:"<p>Hello</p>"});
    */
  var html: js.UndefOr[js.Any] = js.native
  
  /**
    * If true, specifies that content should be displayed in an iFrame.
    */
  var iframe: js.UndefOr[Boolean] = js.native
  
  /**
    * Error message given when a link to an image fails to load.
    */
  var imgError: js.UndefOr[String] = js.native
  
  /**
    * Set the initial height, prior to any content being loaded.
    */
  var initialHeight: js.UndefOr[Double | String] = js.native
  
  /**
    * Set the initial width, prior to any content being loaded.
    */
  var initialWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * If true, content from the current document can be displayed by passing the href property a jQuery selector, or jQuery object.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  
  /**
    * This is an alternative to 'height' used to set a fixed inner height. This excludes borders and buttons. Example: "50%", "500px", or 500
    */
  var innerHeight: js.UndefOr[Double | String] = js.native
  
  /**
    * This is an alternative to 'width' used to set a fixed inner width. This excludes borders and buttons. Example: "50%", "500px", or 500
    */
  var innerWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's horizontal positioning instead of using the default position of being centered in the viewport.
    */
  var left: js.UndefOr[js.Any] = js.native
  
  /**
    * If false, will disable the ability to loop back to the beginning of the group when on the last element.
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * Set a maximum height for loaded content. Example: "100%", 500, "500px"
    */
  var maxHeight: js.UndefOr[Double | String] = js.native
  
  /**
    * Set a maximum width for loaded content. Example: "100%", 500, "500px"
    */
  var maxWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * Text or HTML for the next button while viewing a group.
    */
  var next: js.UndefOr[String] = js.native
  
  /**
    * Callback that fires at the start of the close process.
    */
  var onCleanup: js.UndefOr[js.Any] = js.native
  
  /**
    * Callback that fires once Colorbox is closed.
    */
  var onClosed: js.UndefOr[js.Any] = js.native
  
  /**
    * Callback that fires right after loaded content is displayed.
    */
  var onComplete: js.UndefOr[js.Any] = js.native
  
  /**
    * Callback that fires right before attempting to load the target content.
    */
  var onLoad: js.UndefOr[js.Any] = js.native
  
  /**
    * Callback that fires right before Colorbox begins to open.
    */
  var onOpen: js.UndefOr[js.Any] = js.native
  
  /**
    * The overlay opacity level. Range: 0 to 1.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * If true, Colorbox will immediately open.
    */
  var open: js.UndefOr[Boolean] = js.native
  
  /**
    * If false, disables closing Colorbox by clicking on the background overlay.
    */
  var overlayClose: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, this setting forces Colorbox to display a link as a photo. Use this when automatic photo detection fails (such as using a url like 'photo.php' instead of 'photo.jpg')
    */
  var photo: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows for preloading of 'Next' and 'Previous' content in a group, after the current content has finished loading. Set to false to disable.
    */
  var preloading: js.UndefOr[Boolean] = js.native
  
  /**
    * Text or HTML for the previous button while viewing a group.
    */
  var previous: js.UndefOr[String] = js.native
  
  /**
    * This can be used as an anchor rel alternative for Colorbox.
    */
  var rel: js.UndefOr[js.Any] = js.native
  
  /**
    * Repositions Colorbox if the window's resize event is fired.
    */
  var reposition: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, Colorbox will scale down the current photo to match the screen's pixel ratio
    */
  var retinaImage: js.UndefOr[Boolean] = js.native
  
  /**
    * If retinaUrl is true and the device has a high resolution display, the href value will have it's extention extended with this suffix. For example, the default value would change `my-photo.jpg` to `my-photo@2x.jpg`
    */
  var retinaSuffix: js.UndefOr[String] = js.native
  
  /**
    * If true and the device has a high resolution display, Colorbox will replace the current photo's file extention with the retinaSuffix+extension
    */
  var retinaUrl: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, focus will be returned when Colorbox exits to the element it was launched from.
    */
  var returnFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's horizontal positioning instead of using the default position of being centered in the viewport.
    */
  var right: js.UndefOr[js.Any] = js.native
  
  /**
    * If true, and if maxWidth, maxHeight, innerWidth, innerHeight, width, or height have been defined, Colorbox will scale photos to fit within the those values.
    */
  var scalePhotos: js.UndefOr[Boolean] = js.native
  
  /**
    * If false, Colorbox will hide scrollbars for overflowing content.
    */
  var scrolling: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, adds an automatic slideshow to a content group / gallery.
    */
  var slideshow: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the slideshow will automatically start to play.
    */
  var slideshowAuto: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the speed of the slideshow, in milliseconds.
    */
  var slideshowSpeed: js.UndefOr[Double] = js.native
  
  /**
    * Text for the slideshow start button.
    */
  var slideshowStart: js.UndefOr[String] = js.native
  
  /**
    * Text for the slideshow stop button
    */
  var slideshowStop: js.UndefOr[String] = js.native
  
  /**
    * Sets the speed of the fade and elastic transitions, in milliseconds.
    */
  var speed: js.UndefOr[Double] = js.native
  
  /**
    * This can be used as an anchor title alternative for Colorbox.
    */
  var title: js.UndefOr[js.Any] = js.native
  
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's vertical positioning instead of using the default position of being centered in the viewport.
    */
  var top: js.UndefOr[js.Any] = js.native
  
  /**
    * The transition type. Can be set to "elastic", "fade", or "none".
    */
  var transition: js.UndefOr[String] = js.native
  
  /**
    * Set a fixed total width. This includes borders and buttons. Example: "100%", "500px", or 500
    */
  var width: js.UndefOr[Double | String] = js.native
  
  /**
    * Error message given when ajax content for a given URL cannot be loaded.
    */
  var xhrError: js.UndefOr[String] = js.native
}
object ColorboxSettings {
  
  @scala.inline
  def apply(): ColorboxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorboxSettings]
  }
  
  @scala.inline
  implicit class ColorboxSettingsOps[Self <: ColorboxSettings] (val x: Self) extends AnyVal {
    
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
    def setAjax(value: js.Any): Self = this.set("ajax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    
    @scala.inline
    def setArrowKey(value: Boolean): Self = this.set("arrowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowKey: Self = this.set("arrowKey", js.undefined)
    
    @scala.inline
    def setBottom(value: js.Any): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setClassName(value: js.Any): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    
    @scala.inline
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEscKey(value: Boolean): Self = this.set("escKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscKey: Self = this.set("escKey", js.undefined)
    
    @scala.inline
    def setFadeOut(value: Double): Self = this.set("fadeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeOut: Self = this.set("fadeOut", js.undefined)
    
    @scala.inline
    def setFastIframe(value: Boolean): Self = this.set("fastIframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastIframe: Self = this.set("fastIframe", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHref(value: js.Any): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setHtml(value: js.Any): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setIframe(value: Boolean): Self = this.set("iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIframe: Self = this.set("iframe", js.undefined)
    
    @scala.inline
    def setImgError(value: String): Self = this.set("imgError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgError: Self = this.set("imgError", js.undefined)
    
    @scala.inline
    def setInitialHeight(value: Double | String): Self = this.set("initialHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialHeight: Self = this.set("initialHeight", js.undefined)
    
    @scala.inline
    def setInitialWidth(value: Double | String): Self = this.set("initialWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialWidth: Self = this.set("initialWidth", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setInnerHeight(value: Double | String): Self = this.set("innerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerHeight: Self = this.set("innerHeight", js.undefined)
    
    @scala.inline
    def setInnerWidth(value: Double | String): Self = this.set("innerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerWidth: Self = this.set("innerWidth", js.undefined)
    
    @scala.inline
    def setLeft(value: js.Any): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double | String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setOnCleanup(value: js.Any): Self = this.set("onCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCleanup: Self = this.set("onCleanup", js.undefined)
    
    @scala.inline
    def setOnClosed(value: js.Any): Self = this.set("onClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClosed: Self = this.set("onClosed", js.undefined)
    
    @scala.inline
    def setOnComplete(value: js.Any): Self = this.set("onComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnLoad(value: js.Any): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnOpen(value: js.Any): Self = this.set("onOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOverlayClose(value: Boolean): Self = this.set("overlayClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayClose: Self = this.set("overlayClose", js.undefined)
    
    @scala.inline
    def setPhoto(value: Boolean): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    
    @scala.inline
    def setPreloading(value: Boolean): Self = this.set("preloading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloading: Self = this.set("preloading", js.undefined)
    
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setRel(value: js.Any): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    
    @scala.inline
    def setReposition(value: Boolean): Self = this.set("reposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReposition: Self = this.set("reposition", js.undefined)
    
    @scala.inline
    def setRetinaImage(value: Boolean): Self = this.set("retinaImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetinaImage: Self = this.set("retinaImage", js.undefined)
    
    @scala.inline
    def setRetinaSuffix(value: String): Self = this.set("retinaSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetinaSuffix: Self = this.set("retinaSuffix", js.undefined)
    
    @scala.inline
    def setRetinaUrl(value: Boolean): Self = this.set("retinaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetinaUrl: Self = this.set("retinaUrl", js.undefined)
    
    @scala.inline
    def setReturnFocus(value: Boolean): Self = this.set("returnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnFocus: Self = this.set("returnFocus", js.undefined)
    
    @scala.inline
    def setRight(value: js.Any): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setScalePhotos(value: Boolean): Self = this.set("scalePhotos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalePhotos: Self = this.set("scalePhotos", js.undefined)
    
    @scala.inline
    def setScrolling(value: Boolean): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    
    @scala.inline
    def setSlideshow(value: Boolean): Self = this.set("slideshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideshow: Self = this.set("slideshow", js.undefined)
    
    @scala.inline
    def setSlideshowAuto(value: Boolean): Self = this.set("slideshowAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideshowAuto: Self = this.set("slideshowAuto", js.undefined)
    
    @scala.inline
    def setSlideshowSpeed(value: Double): Self = this.set("slideshowSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideshowSpeed: Self = this.set("slideshowSpeed", js.undefined)
    
    @scala.inline
    def setSlideshowStart(value: String): Self = this.set("slideshowStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideshowStart: Self = this.set("slideshowStart", js.undefined)
    
    @scala.inline
    def setSlideshowStop(value: String): Self = this.set("slideshowStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideshowStop: Self = this.set("slideshowStop", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTop(value: js.Any): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setXhrError(value: String): Self = this.set("xhrError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhrError: Self = this.set("xhrError", js.undefined)
  }
}
