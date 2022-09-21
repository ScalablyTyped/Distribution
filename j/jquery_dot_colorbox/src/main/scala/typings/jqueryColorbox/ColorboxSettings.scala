package typings.jqueryColorbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorboxSettings extends StObject {
  
  /**
    * This property isn't actually used as Colorbox assumes all hrefs should be treated as either ajax or photos, unless one of the other content types were specified.
    */
  var ajax: js.UndefOr[Any] = js.undefined
  
  /**
    * If false, will disable the left and right arrow keys from navigating between the items in a group.
    */
  var arrowKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's vertical positioning instead of using the default position of being centered in the viewport.
    */
  var bottom: js.UndefOr[Any] = js.undefined
  
  /**
    * Adds a given class to colorbox and the overlay.
    */
  var className: js.UndefOr[Any] = js.undefined
  
  /**
    * Text or HTML for the close button. The 'esc' key will also close Colorbox.
    */
  var close: js.UndefOr[String] = js.undefined
  
  /**
    * Set to false to remove the close button.
    */
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Text or HTML for the group counter while viewing a group. {current} and {total} are detected and replaced with actual numbers while Colorbox runs.
    */
  var current: js.UndefOr[String] = js.undefined
  
  /**
    * For submitting GET or POST values through an ajax request. The data property will act exactly like jQuery's .load() data argument, as Colorbox uses .load() for ajax handling.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * If false, will disable closing colorbox on 'esc' key press.
    */
  var escKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the fadeOut speed, in milliseconds, when closing Colorbox.
    */
  var fadeOut: js.UndefOr[Double] = js.undefined
  
  /**
    * If false, the loading graphic removal and onComplete event will be delayed until iframe's content has completely loaded.
    */
  var fastIframe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, Colorbox will be displayed in a fixed position within the visitor's viewport. This is unlike the default absolute positioning relative to the document.
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set a fixed total height. This includes borders and buttons. Example: "100%", "500px", or 500
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * This can be used as an alternative anchor URL or to associate a URL for non-anchor elements such as images or form buttons.
    */
  var href: js.UndefOr[Any] = js.undefined
  
  /**
    * For displaying a string of HTML or text: $.colorbox({html:"<p>Hello</p>"});
    */
  var html: js.UndefOr[Any] = js.undefined
  
  /**
    * If true, specifies that content should be displayed in an iFrame.
    */
  var iframe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Error message given when a link to an image fails to load.
    */
  var imgError: js.UndefOr[String] = js.undefined
  
  /**
    * Set the initial height, prior to any content being loaded.
    */
  var initialHeight: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Set the initial width, prior to any content being loaded.
    */
  var initialWidth: js.UndefOr[Double | String] = js.undefined
  
  /**
    * If true, content from the current document can be displayed by passing the href property a jQuery selector, or jQuery object.
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is an alternative to 'height' used to set a fixed inner height. This excludes borders and buttons. Example: "50%", "500px", or 500
    */
  var innerHeight: js.UndefOr[Double | String] = js.undefined
  
  /**
    * This is an alternative to 'width' used to set a fixed inner width. This excludes borders and buttons. Example: "50%", "500px", or 500
    */
  var innerWidth: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's horizontal positioning instead of using the default position of being centered in the viewport.
    */
  var left: js.UndefOr[Any] = js.undefined
  
  /**
    * If false, will disable the ability to loop back to the beginning of the group when on the last element.
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set a maximum height for loaded content. Example: "100%", 500, "500px"
    */
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Set a maximum width for loaded content. Example: "100%", 500, "500px"
    */
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Text or HTML for the next button while viewing a group.
    */
  var next: js.UndefOr[String] = js.undefined
  
  /**
    * Callback that fires at the start of the close process.
    */
  var onCleanup: js.UndefOr[Any] = js.undefined
  
  /**
    * Callback that fires once Colorbox is closed.
    */
  var onClosed: js.UndefOr[Any] = js.undefined
  
  /**
    * Callback that fires right after loaded content is displayed.
    */
  var onComplete: js.UndefOr[Any] = js.undefined
  
  /**
    * Callback that fires right before attempting to load the target content.
    */
  var onLoad: js.UndefOr[Any] = js.undefined
  
  /**
    * Callback that fires right before Colorbox begins to open.
    */
  var onOpen: js.UndefOr[Any] = js.undefined
  
  /**
    * The overlay opacity level. Range: 0 to 1.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * If true, Colorbox will immediately open.
    */
  var open: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If false, disables closing Colorbox by clicking on the background overlay.
    */
  var overlayClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, this setting forces Colorbox to display a link as a photo. Use this when automatic photo detection fails (such as using a url like 'photo.php' instead of 'photo.jpg')
    */
  var photo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows for preloading of 'Next' and 'Previous' content in a group, after the current content has finished loading. Set to false to disable.
    */
  var preloading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Text or HTML for the previous button while viewing a group.
    */
  var previous: js.UndefOr[String] = js.undefined
  
  /**
    * This can be used as an anchor rel alternative for Colorbox.
    */
  var rel: js.UndefOr[Any] = js.undefined
  
  /**
    * Repositions Colorbox if the window's resize event is fired.
    */
  var reposition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, Colorbox will scale down the current photo to match the screen's pixel ratio
    */
  var retinaImage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If retinaUrl is true and the device has a high resolution display, the href value will have it's extention extended with this suffix. For example, the default value would change `my-photo.jpg` to `my-photo@2x.jpg`
    */
  var retinaSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * If true and the device has a high resolution display, Colorbox will replace the current photo's file extention with the retinaSuffix+extension
    */
  var retinaUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, focus will be returned when Colorbox exits to the element it was launched from.
    */
  var returnFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's horizontal positioning instead of using the default position of being centered in the viewport.
    */
  var right: js.UndefOr[Any] = js.undefined
  
  /**
    * If true, and if maxWidth, maxHeight, innerWidth, innerHeight, width, or height have been defined, Colorbox will scale photos to fit within the those values.
    */
  var scalePhotos: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If false, Colorbox will hide scrollbars for overflowing content.
    */
  var scrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, adds an automatic slideshow to a content group / gallery.
    */
  var slideshow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, the slideshow will automatically start to play.
    */
  var slideshowAuto: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the speed of the slideshow, in milliseconds.
    */
  var slideshowSpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * Text for the slideshow start button.
    */
  var slideshowStart: js.UndefOr[String] = js.undefined
  
  /**
    * Text for the slideshow stop button
    */
  var slideshowStop: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the speed of the fade and elastic transitions, in milliseconds.
    */
  var speed: js.UndefOr[Double] = js.undefined
  
  /**
    * This can be used as an anchor title alternative for Colorbox.
    */
  var title: js.UndefOr[Any] = js.undefined
  
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's vertical positioning instead of using the default position of being centered in the viewport.
    */
  var top: js.UndefOr[Any] = js.undefined
  
  /**
    * The transition type. Can be set to "elastic", "fade", or "none".
    */
  var transition: js.UndefOr[String] = js.undefined
  
  /**
    * Set a fixed total width. This includes borders and buttons. Example: "100%", "500px", or 500
    */
  var width: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Error message given when ajax content for a given URL cannot be loaded.
    */
  var xhrError: js.UndefOr[String] = js.undefined
}
object ColorboxSettings {
  
  inline def apply(): ColorboxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorboxSettings]
  }
  
  extension [Self <: ColorboxSettings](x: Self) {
    
    inline def setAjax(value: Any): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
    
    inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
    
    inline def setArrowKey(value: Boolean): Self = StObject.set(x, "arrowKey", value.asInstanceOf[js.Any])
    
    inline def setArrowKeyUndefined: Self = StObject.set(x, "arrowKey", js.undefined)
    
    inline def setBottom(value: Any): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEscKey(value: Boolean): Self = StObject.set(x, "escKey", value.asInstanceOf[js.Any])
    
    inline def setEscKeyUndefined: Self = StObject.set(x, "escKey", js.undefined)
    
    inline def setFadeOut(value: Double): Self = StObject.set(x, "fadeOut", value.asInstanceOf[js.Any])
    
    inline def setFadeOutUndefined: Self = StObject.set(x, "fadeOut", js.undefined)
    
    inline def setFastIframe(value: Boolean): Self = StObject.set(x, "fastIframe", value.asInstanceOf[js.Any])
    
    inline def setFastIframeUndefined: Self = StObject.set(x, "fastIframe", js.undefined)
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHref(value: Any): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setHtml(value: Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    inline def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    inline def setImgError(value: String): Self = StObject.set(x, "imgError", value.asInstanceOf[js.Any])
    
    inline def setImgErrorUndefined: Self = StObject.set(x, "imgError", js.undefined)
    
    inline def setInitialHeight(value: Double | String): Self = StObject.set(x, "initialHeight", value.asInstanceOf[js.Any])
    
    inline def setInitialHeightUndefined: Self = StObject.set(x, "initialHeight", js.undefined)
    
    inline def setInitialWidth(value: Double | String): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
    
    inline def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setInnerHeight(value: Double | String): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    inline def setInnerHeightUndefined: Self = StObject.set(x, "innerHeight", js.undefined)
    
    inline def setInnerWidth(value: Double | String): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    inline def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
    
    inline def setLeft(value: Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setOnCleanup(value: Any): Self = StObject.set(x, "onCleanup", value.asInstanceOf[js.Any])
    
    inline def setOnCleanupUndefined: Self = StObject.set(x, "onCleanup", js.undefined)
    
    inline def setOnClosed(value: Any): Self = StObject.set(x, "onClosed", value.asInstanceOf[js.Any])
    
    inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
    
    inline def setOnComplete(value: Any): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnLoad(value: Any): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnOpen(value: Any): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOverlayClose(value: Boolean): Self = StObject.set(x, "overlayClose", value.asInstanceOf[js.Any])
    
    inline def setOverlayCloseUndefined: Self = StObject.set(x, "overlayClose", js.undefined)
    
    inline def setPhoto(value: Boolean): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPreloading(value: Boolean): Self = StObject.set(x, "preloading", value.asInstanceOf[js.Any])
    
    inline def setPreloadingUndefined: Self = StObject.set(x, "preloading", js.undefined)
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setRel(value: Any): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setReposition(value: Boolean): Self = StObject.set(x, "reposition", value.asInstanceOf[js.Any])
    
    inline def setRepositionUndefined: Self = StObject.set(x, "reposition", js.undefined)
    
    inline def setRetinaImage(value: Boolean): Self = StObject.set(x, "retinaImage", value.asInstanceOf[js.Any])
    
    inline def setRetinaImageUndefined: Self = StObject.set(x, "retinaImage", js.undefined)
    
    inline def setRetinaSuffix(value: String): Self = StObject.set(x, "retinaSuffix", value.asInstanceOf[js.Any])
    
    inline def setRetinaSuffixUndefined: Self = StObject.set(x, "retinaSuffix", js.undefined)
    
    inline def setRetinaUrl(value: Boolean): Self = StObject.set(x, "retinaUrl", value.asInstanceOf[js.Any])
    
    inline def setRetinaUrlUndefined: Self = StObject.set(x, "retinaUrl", js.undefined)
    
    inline def setReturnFocus(value: Boolean): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
    
    inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
    
    inline def setRight(value: Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setScalePhotos(value: Boolean): Self = StObject.set(x, "scalePhotos", value.asInstanceOf[js.Any])
    
    inline def setScalePhotosUndefined: Self = StObject.set(x, "scalePhotos", js.undefined)
    
    inline def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSlideshow(value: Boolean): Self = StObject.set(x, "slideshow", value.asInstanceOf[js.Any])
    
    inline def setSlideshowAuto(value: Boolean): Self = StObject.set(x, "slideshowAuto", value.asInstanceOf[js.Any])
    
    inline def setSlideshowAutoUndefined: Self = StObject.set(x, "slideshowAuto", js.undefined)
    
    inline def setSlideshowSpeed(value: Double): Self = StObject.set(x, "slideshowSpeed", value.asInstanceOf[js.Any])
    
    inline def setSlideshowSpeedUndefined: Self = StObject.set(x, "slideshowSpeed", js.undefined)
    
    inline def setSlideshowStart(value: String): Self = StObject.set(x, "slideshowStart", value.asInstanceOf[js.Any])
    
    inline def setSlideshowStartUndefined: Self = StObject.set(x, "slideshowStart", js.undefined)
    
    inline def setSlideshowStop(value: String): Self = StObject.set(x, "slideshowStop", value.asInstanceOf[js.Any])
    
    inline def setSlideshowStopUndefined: Self = StObject.set(x, "slideshowStop", js.undefined)
    
    inline def setSlideshowUndefined: Self = StObject.set(x, "slideshow", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTop(value: Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXhrError(value: String): Self = StObject.set(x, "xhrError", value.asInstanceOf[js.Any])
    
    inline def setXhrErrorUndefined: Self = StObject.set(x, "xhrError", js.undefined)
  }
}
