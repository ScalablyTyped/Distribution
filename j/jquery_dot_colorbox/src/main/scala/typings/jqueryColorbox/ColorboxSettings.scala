package typings.jqueryColorbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorboxSettings extends StObject {
  
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
  implicit class ColorboxSettingsMutableBuilder[Self <: ColorboxSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjax(value: js.Any): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
    
    @scala.inline
    def setArrowKey(value: Boolean): Self = StObject.set(x, "arrowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowKeyUndefined: Self = StObject.set(x, "arrowKey", js.undefined)
    
    @scala.inline
    def setBottom(value: js.Any): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setClassName(value: js.Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEscKey(value: Boolean): Self = StObject.set(x, "escKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscKeyUndefined: Self = StObject.set(x, "escKey", js.undefined)
    
    @scala.inline
    def setFadeOut(value: Double): Self = StObject.set(x, "fadeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeOutUndefined: Self = StObject.set(x, "fadeOut", js.undefined)
    
    @scala.inline
    def setFastIframe(value: Boolean): Self = StObject.set(x, "fastIframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastIframeUndefined: Self = StObject.set(x, "fastIframe", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHref(value: js.Any): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setHtml(value: js.Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    @scala.inline
    def setImgError(value: String): Self = StObject.set(x, "imgError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgErrorUndefined: Self = StObject.set(x, "imgError", js.undefined)
    
    @scala.inline
    def setInitialHeight(value: Double | String): Self = StObject.set(x, "initialHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialHeightUndefined: Self = StObject.set(x, "initialHeight", js.undefined)
    
    @scala.inline
    def setInitialWidth(value: Double | String): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setInnerHeight(value: Double | String): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerHeightUndefined: Self = StObject.set(x, "innerHeight", js.undefined)
    
    @scala.inline
    def setInnerWidth(value: Double | String): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
    
    @scala.inline
    def setLeft(value: js.Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setOnCleanup(value: js.Any): Self = StObject.set(x, "onCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCleanupUndefined: Self = StObject.set(x, "onCleanup", js.undefined)
    
    @scala.inline
    def setOnClosed(value: js.Any): Self = StObject.set(x, "onClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
    
    @scala.inline
    def setOnComplete(value: js.Any): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    @scala.inline
    def setOnLoad(value: js.Any): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnOpen(value: js.Any): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOverlayClose(value: Boolean): Self = StObject.set(x, "overlayClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayCloseUndefined: Self = StObject.set(x, "overlayClose", js.undefined)
    
    @scala.inline
    def setPhoto(value: Boolean): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setPreloading(value: Boolean): Self = StObject.set(x, "preloading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadingUndefined: Self = StObject.set(x, "preloading", js.undefined)
    
    @scala.inline
    def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    @scala.inline
    def setRel(value: js.Any): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setReposition(value: Boolean): Self = StObject.set(x, "reposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositionUndefined: Self = StObject.set(x, "reposition", js.undefined)
    
    @scala.inline
    def setRetinaImage(value: Boolean): Self = StObject.set(x, "retinaImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetinaImageUndefined: Self = StObject.set(x, "retinaImage", js.undefined)
    
    @scala.inline
    def setRetinaSuffix(value: String): Self = StObject.set(x, "retinaSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetinaSuffixUndefined: Self = StObject.set(x, "retinaSuffix", js.undefined)
    
    @scala.inline
    def setRetinaUrl(value: Boolean): Self = StObject.set(x, "retinaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetinaUrlUndefined: Self = StObject.set(x, "retinaUrl", js.undefined)
    
    @scala.inline
    def setReturnFocus(value: Boolean): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
    
    @scala.inline
    def setRight(value: js.Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setScalePhotos(value: Boolean): Self = StObject.set(x, "scalePhotos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalePhotosUndefined: Self = StObject.set(x, "scalePhotos", js.undefined)
    
    @scala.inline
    def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    @scala.inline
    def setSlideshow(value: Boolean): Self = StObject.set(x, "slideshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideshowAuto(value: Boolean): Self = StObject.set(x, "slideshowAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideshowAutoUndefined: Self = StObject.set(x, "slideshowAuto", js.undefined)
    
    @scala.inline
    def setSlideshowSpeed(value: Double): Self = StObject.set(x, "slideshowSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideshowSpeedUndefined: Self = StObject.set(x, "slideshowSpeed", js.undefined)
    
    @scala.inline
    def setSlideshowStart(value: String): Self = StObject.set(x, "slideshowStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideshowStartUndefined: Self = StObject.set(x, "slideshowStart", js.undefined)
    
    @scala.inline
    def setSlideshowStop(value: String): Self = StObject.set(x, "slideshowStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideshowStopUndefined: Self = StObject.set(x, "slideshowStop", js.undefined)
    
    @scala.inline
    def setSlideshowUndefined: Self = StObject.set(x, "slideshow", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTop(value: js.Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXhrError(value: String): Self = StObject.set(x, "xhrError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrErrorUndefined: Self = StObject.set(x, "xhrError", js.undefined)
  }
}
