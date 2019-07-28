package typings.jqueryDotColorbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorboxSettings extends js.Object {
  /**
    * This property isn't actually used as Colorbox assumes all hrefs should be treated as either ajax or photos, unless one of the other content types were specified.
    */
  var ajax: js.UndefOr[js.Any] = js.undefined
  /**
    * If false, will disable the left and right arrow keys from navigating between the items in a group.
    */
  var arrowKey: js.UndefOr[Boolean] = js.undefined
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's vertical positioning instead of using the default position of being centered in the viewport.
    */
  var bottom: js.UndefOr[js.Any] = js.undefined
  /**
    * Adds a given class to colorbox and the overlay.
    */
  var className: js.UndefOr[js.Any] = js.undefined
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
  var data: js.UndefOr[js.Any] = js.undefined
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
  var href: js.UndefOr[js.Any] = js.undefined
  /**
    * For displaying a string of HTML or text: $.colorbox({html:"<p>Hello</p>"});
    */
  var html: js.UndefOr[js.Any] = js.undefined
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
  var left: js.UndefOr[js.Any] = js.undefined
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
  var onCleanup: js.UndefOr[js.Any] = js.undefined
  /**
    * Callback that fires once Colorbox is closed.
    */
  var onClosed: js.UndefOr[js.Any] = js.undefined
  /**
    * Callback that fires right after loaded content is displayed.
    */
  var onComplete: js.UndefOr[js.Any] = js.undefined
  /**
    * Callback that fires right before attempting to load the target content.
    */
  var onLoad: js.UndefOr[js.Any] = js.undefined
  /**
    * Callback that fires right before Colorbox begins to open.
    */
  var onOpen: js.UndefOr[js.Any] = js.undefined
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
  var rel: js.UndefOr[js.Any] = js.undefined
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
  var right: js.UndefOr[js.Any] = js.undefined
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
  var title: js.UndefOr[js.Any] = js.undefined
  /**
    * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's vertical positioning instead of using the default position of being centered in the viewport.
    */
  var top: js.UndefOr[js.Any] = js.undefined
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
  @scala.inline
  def apply(
    ajax: js.Any = null,
    arrowKey: js.UndefOr[Boolean] = js.undefined,
    bottom: js.Any = null,
    className: js.Any = null,
    close: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    current: String = null,
    data: js.Any = null,
    escKey: js.UndefOr[Boolean] = js.undefined,
    fadeOut: Int | Double = null,
    fastIframe: js.UndefOr[Boolean] = js.undefined,
    fixed: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    href: js.Any = null,
    html: js.Any = null,
    iframe: js.UndefOr[Boolean] = js.undefined,
    imgError: String = null,
    initialHeight: Double | String = null,
    initialWidth: Double | String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    innerHeight: Double | String = null,
    innerWidth: Double | String = null,
    left: js.Any = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Double | String = null,
    maxWidth: Double | String = null,
    next: String = null,
    onCleanup: js.Any = null,
    onClosed: js.Any = null,
    onComplete: js.Any = null,
    onLoad: js.Any = null,
    onOpen: js.Any = null,
    opacity: Int | Double = null,
    open: js.UndefOr[Boolean] = js.undefined,
    overlayClose: js.UndefOr[Boolean] = js.undefined,
    photo: js.UndefOr[Boolean] = js.undefined,
    preloading: js.UndefOr[Boolean] = js.undefined,
    previous: String = null,
    rel: js.Any = null,
    reposition: js.UndefOr[Boolean] = js.undefined,
    retinaImage: js.UndefOr[Boolean] = js.undefined,
    retinaSuffix: String = null,
    retinaUrl: js.UndefOr[Boolean] = js.undefined,
    returnFocus: js.UndefOr[Boolean] = js.undefined,
    right: js.Any = null,
    scalePhotos: js.UndefOr[Boolean] = js.undefined,
    scrolling: js.UndefOr[Boolean] = js.undefined,
    slideshow: js.UndefOr[Boolean] = js.undefined,
    slideshowAuto: js.UndefOr[Boolean] = js.undefined,
    slideshowSpeed: Int | Double = null,
    slideshowStart: String = null,
    slideshowStop: String = null,
    speed: Int | Double = null,
    title: js.Any = null,
    top: js.Any = null,
    transition: String = null,
    width: Double | String = null,
    xhrError: String = null
  ): ColorboxSettings = {
    val __obj = js.Dynamic.literal()
    if (ajax != null) __obj.updateDynamic("ajax")(ajax)
    if (!js.isUndefined(arrowKey)) __obj.updateDynamic("arrowKey")(arrowKey)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (className != null) __obj.updateDynamic("className")(className)
    if (close != null) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (current != null) __obj.updateDynamic("current")(current)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(escKey)) __obj.updateDynamic("escKey")(escKey)
    if (fadeOut != null) __obj.updateDynamic("fadeOut")(fadeOut.asInstanceOf[js.Any])
    if (!js.isUndefined(fastIframe)) __obj.updateDynamic("fastIframe")(fastIframe)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (html != null) __obj.updateDynamic("html")(html)
    if (!js.isUndefined(iframe)) __obj.updateDynamic("iframe")(iframe)
    if (imgError != null) __obj.updateDynamic("imgError")(imgError)
    if (initialHeight != null) __obj.updateDynamic("initialHeight")(initialHeight.asInstanceOf[js.Any])
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (innerHeight != null) __obj.updateDynamic("innerHeight")(innerHeight.asInstanceOf[js.Any])
    if (innerWidth != null) __obj.updateDynamic("innerWidth")(innerWidth.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next)
    if (onCleanup != null) __obj.updateDynamic("onCleanup")(onCleanup)
    if (onClosed != null) __obj.updateDynamic("onClosed")(onClosed)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(overlayClose)) __obj.updateDynamic("overlayClose")(overlayClose)
    if (!js.isUndefined(photo)) __obj.updateDynamic("photo")(photo)
    if (!js.isUndefined(preloading)) __obj.updateDynamic("preloading")(preloading)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (!js.isUndefined(reposition)) __obj.updateDynamic("reposition")(reposition)
    if (!js.isUndefined(retinaImage)) __obj.updateDynamic("retinaImage")(retinaImage)
    if (retinaSuffix != null) __obj.updateDynamic("retinaSuffix")(retinaSuffix)
    if (!js.isUndefined(retinaUrl)) __obj.updateDynamic("retinaUrl")(retinaUrl)
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus)
    if (right != null) __obj.updateDynamic("right")(right)
    if (!js.isUndefined(scalePhotos)) __obj.updateDynamic("scalePhotos")(scalePhotos)
    if (!js.isUndefined(scrolling)) __obj.updateDynamic("scrolling")(scrolling)
    if (!js.isUndefined(slideshow)) __obj.updateDynamic("slideshow")(slideshow)
    if (!js.isUndefined(slideshowAuto)) __obj.updateDynamic("slideshowAuto")(slideshowAuto)
    if (slideshowSpeed != null) __obj.updateDynamic("slideshowSpeed")(slideshowSpeed.asInstanceOf[js.Any])
    if (slideshowStart != null) __obj.updateDynamic("slideshowStart")(slideshowStart)
    if (slideshowStop != null) __obj.updateDynamic("slideshowStop")(slideshowStop)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (top != null) __obj.updateDynamic("top")(top)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xhrError != null) __obj.updateDynamic("xhrError")(xhrError)
    __obj.asInstanceOf[ColorboxSettings]
  }
}

