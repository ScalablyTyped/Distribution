package typings
package jqueryDotToolsLib.JQueryToolsNs.overlayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OverlayOptions extends js.Object {
  /**
               * A jQuery selector for the closing elements inside the overlay. These
               * can be any elements such as links, buttons or images. If this is not
               * supplied, a close element is auto-generated. Read more about this in
               * defining close actions.
               */
  var close: js.UndefOr[jqueryDotToolsLib.JQuery] = js.undefined
  /**
               * By default, overlays are closed when the mouse is clicked outside the
               * overlay area. Setting this property to false suppresses this behaviour
               * which is suitable for modal dialogs.
               * @default true
               */
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * By default, overlays are closed when the ESC keyboard key is pressed.
               * Setting this property to false suppresses this behaviour.
               * @default true
               */
  var closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  /** The speed to close the overlay, in milliseconds */
  var closeSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
               * The effect to be used when an overlay is opened and closed. This can
               * dramatically change the behaviour of the overlay. By default this tool
               * uses an effect called "default" which is a simple show/hide effect.
               * @default 'default'
               */
  var effect: js.UndefOr[java.lang.String] = js.undefined
  /**
               * since 1.2.0. whether overlay stays in the same position while the screen
               * is scrolled. This is the default behaviour for all browsers except IE6
               * and below. IE6 does not support fixed positioning. If this property is
               * set to false then the overlay is positioned in relationship to the document
               * so that when the screen is scrolled then the overlay moves along with the document.
               * @default true
               */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Specifies how far from the left-hand edge of the screen the overlay should be
               * placed. By default the overlay is horizontally centered with the value "center"
               * but you can also supply a numerical value specifying a distance in pixels.
               * @default 'center'
               */
  var left: js.UndefOr[jqueryDotToolsLib.jqueryDotToolsLibStrings.center | scala.Double] = js.undefined
  /**
               * If enabled then the overlay loads immediately after it has been initialized.
               * @default false
               */
  var load: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Previously known as expose. Overlay is very often used together with the
               * Mask Tool. Because of this, the support for this feature has been built
               * inside the tool. This option accepts the mask configuration. This is either
               * a simple string specifying the background color of the mask or a more complex
               * object literal specifying more configuration variables. See an example of an
               * overlay together with mask. By default masking is disabled.
               */
  var mask: js.UndefOr[java.lang.String | MaskOptions] = js.undefined
  /** before the overlay is closed */
  var onBeforeClose: js.UndefOr[
    js.ThisFunction1[/* this */ Overlay, /* event */ jqueryLib.JQueryEventObject, scala.Unit]
  ] = js.undefined
  /**
               * before the overlay is displayed. The overlay has already been positioned at the
               * location from where it will start animating.
               */
  var onBeforeLoad: js.UndefOr[
    js.ThisFunction1[/* this */ Overlay, /* event */ jqueryLib.JQueryEventObject, scala.Unit]
  ] = js.undefined
  /** when the overlay is closed  */
  var onClose: js.UndefOr[
    js.ThisFunction1[/* this */ Overlay, /* event */ jqueryLib.JQueryEventObject, scala.Unit]
  ] = js.undefined
  /** when the overlay has completely been displayed  */
  var onLoad: js.UndefOr[
    js.ThisFunction1[/* this */ Overlay, /* event */ jqueryLib.JQueryEventObject, scala.Unit]
  ] = js.undefined
  /**
               * By default, there can be only one overlay on the page at once. Setting this
               * property to false allows you to have multiple overlay instances.
               * @default true
               */
  var oneInstance: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * The speed of the fade-in animation on the "default" effect. Valid values are
               * 'slow', 'normal' and 'fast', or you can supply a numerical value (in milliseconds).
               * By setting this property to 0, the overlay will appear immediately without any animation.
               * @default 'normal'
               */
  var speed: js.UndefOr[
    jqueryDotToolsLib.jqueryDotToolsLibStrings.slow | jqueryDotToolsLib.jqueryDotToolsLibStrings.normal | jqueryDotToolsLib.jqueryDotToolsLibStrings.fast | scala.Double
  ] = js.undefined
  /**
               * The element to be overlayed (if not specified in the rel attribute of the triggering element).
               */
  var target: js.UndefOr[stdLib.Element] = js.undefined
  /**
               * Specifies how far from the top edge of the screen the overlay should be placed.
               * Acceptable values are an integer number specifying a distance in pixels, a string
               * (such as '15%') specifying a percentage value or "center" in which case the overlay
               * is vertically centered. Percentage values work consistently at different screen resolutions.
               * @default '10%'
               */
  var top: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

