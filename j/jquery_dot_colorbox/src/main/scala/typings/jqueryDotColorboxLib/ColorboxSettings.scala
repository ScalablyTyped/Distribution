package typings
package jqueryDotColorboxLib

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
  var arrowKey: js.UndefOr[scala.Boolean] = js.undefined
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
  var close: js.UndefOr[java.lang.String] = js.undefined
  /**
      * Set to false to remove the close button.
      */
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * Text or HTML for the group counter while viewing a group. {current} and {total} are detected and replaced with actual numbers while Colorbox runs.
      */
  var current: js.UndefOr[java.lang.String] = js.undefined
  /**
      * For submitting GET or POST values through an ajax request. The data property will act exactly like jQuery's .load() data argument, as Colorbox uses .load() for ajax handling.
      */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
      * If false, will disable closing colorbox on 'esc' key press.
      */
  var escKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * Sets the fadeOut speed, in milliseconds, when closing Colorbox.
      */
  var fadeOut: js.UndefOr[scala.Double] = js.undefined
  /**
      * If false, the loading graphic removal and onComplete event will be delayed until iframe's content has completely loaded.
      */
  var fastIframe: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * If true, Colorbox will be displayed in a fixed position within the visitor's viewport. This is unlike the default absolute positioning relative to the document.
      */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * Set a fixed total height. This includes borders and buttons. Example: "100%", "500px", or 500
      */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
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
  var iframe: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * Error message given when a link to an image fails to load.
      */
  var imgError: js.UndefOr[java.lang.String] = js.undefined
  /**
      * Set the initial height, prior to any content being loaded.
      */
  var initialHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
      * Set the initial width, prior to any content being loaded.
      */
  var initialWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
      * If true, content from the current document can be displayed by passing the href property a jQuery selector, or jQuery object.
      */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * This is an alternative to 'height' used to set a fixed inner height. This excludes borders and buttons. Example: "50%", "500px", or 500
      */
  var innerHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
      * This is an alternative to 'width' used to set a fixed inner width. This excludes borders and buttons. Example: "50%", "500px", or 500
      */
  var innerWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
      * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's horizontal positioning instead of using the default position of being centered in the viewport.
      */
  var left: js.UndefOr[js.Any] = js.undefined
  /**
      * If false, will disable the ability to loop back to the beginning of the group when on the last element.
      */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * Set a maximum height for loaded content. Example: "100%", 500, "500px"
      */
  var maxHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
      * Set a maximum width for loaded content. Example: "100%", 500, "500px"
      */
  var maxWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
      * Text or HTML for the next button while viewing a group.
      */
  var next: js.UndefOr[java.lang.String] = js.undefined
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
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
      * If true, Colorbox will immediately open.
      */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * If false, disables closing Colorbox by clicking on the background overlay.
      */
  var overlayClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * If true, this setting forces Colorbox to display a link as a photo. Use this when automatic photo detection fails (such as using a url like 'photo.php' instead of 'photo.jpg')
      */
  var photo: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * Allows for preloading of 'Next' and 'Previous' content in a group, after the current content has finished loading. Set to false to disable.
      */
  var preloading: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * Text or HTML for the previous button while viewing a group.
      */
  var previous: js.UndefOr[java.lang.String] = js.undefined
  /**
      * This can be used as an anchor rel alternative for Colorbox.
      */
  var rel: js.UndefOr[js.Any] = js.undefined
  /**
      * Repositions Colorbox if the window's resize event is fired.
      */
  var reposition: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * If true, Colorbox will scale down the current photo to match the screen's pixel ratio
      */
  var retinaImage: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * If retinaUrl is true and the device has a high resolution display, the href value will have it's extention extended with this suffix. For example, the default value would change `my-photo.jpg` to `my-photo@2x.jpg`
      */
  var retinaSuffix: js.UndefOr[java.lang.String] = js.undefined
  /**
      * If true and the device has a high resolution display, Colorbox will replace the current photo's file extention with the retinaSuffix+extension
      */
  var retinaUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * If true, focus will be returned when Colorbox exits to the element it was launched from.
      */
  var returnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * Accepts a pixel or percent value (50, "50px", "10%"). Controls Colorbox's horizontal positioning instead of using the default position of being centered in the viewport.
      */
  var right: js.UndefOr[js.Any] = js.undefined
  /**
      * If true, and if maxWidth, maxHeight, innerWidth, innerHeight, width, or height have been defined, Colorbox will scale photos to fit within the those values.
      */
  var scalePhotos: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * If false, Colorbox will hide scrollbars for overflowing content.
      */
  var scrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * If true, adds an automatic slideshow to a content group / gallery.
      */
  var slideshow: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * If true, the slideshow will automatically start to play.
      */
  var slideshowAuto: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * Sets the speed of the slideshow, in milliseconds.
      */
  var slideshowSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
      * Text for the slideshow start button.
      */
  var slideshowStart: js.UndefOr[java.lang.String] = js.undefined
  /**
      * Text for the slideshow stop button
      */
  var slideshowStop: js.UndefOr[java.lang.String] = js.undefined
  /**
      * Sets the speed of the fade and elastic transitions, in milliseconds.
      */
  var speed: js.UndefOr[scala.Double] = js.undefined
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
  var transition: js.UndefOr[java.lang.String] = js.undefined
  /**
      * Set a fixed total width. This includes borders and buttons. Example: "100%", "500px", or 500
      */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
      * Error message given when ajax content for a given URL cannot be loaded.
      */
  var xhrError: js.UndefOr[java.lang.String] = js.undefined
}

