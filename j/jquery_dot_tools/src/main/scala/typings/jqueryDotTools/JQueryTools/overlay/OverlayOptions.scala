package typings.jqueryDotTools.JQueryTools.overlay

import typings.jquery.JQueryEventObject
import typings.jqueryDotTools.JQuery
import typings.jqueryDotTools.jqueryDotToolsStrings.center
import typings.jqueryDotTools.jqueryDotToolsStrings.fast
import typings.jqueryDotTools.jqueryDotToolsStrings.normal
import typings.jqueryDotTools.jqueryDotToolsStrings.slow
import typings.std.Element
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
  var close: js.UndefOr[JQuery] = js.undefined
  /**
    * By default, overlays are closed when the mouse is clicked outside the
    * overlay area. Setting this property to false suppresses this behaviour
    * which is suitable for modal dialogs.
    * @default true
    */
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, overlays are closed when the ESC keyboard key is pressed.
    * Setting this property to false suppresses this behaviour.
    * @default true
    */
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  /** The speed to close the overlay, in milliseconds */
  var closeSpeed: js.UndefOr[Double] = js.undefined
  /**
    * The effect to be used when an overlay is opened and closed. This can
    * dramatically change the behaviour of the overlay. By default this tool
    * uses an effect called "default" which is a simple show/hide effect.
    * @default 'default'
    */
  var effect: js.UndefOr[String] = js.undefined
  /**
    * since 1.2.0. whether overlay stays in the same position while the screen
    * is scrolled. This is the default behaviour for all browsers except IE6
    * and below. IE6 does not support fixed positioning. If this property is
    * set to false then the overlay is positioned in relationship to the document
    * so that when the screen is scrolled then the overlay moves along with the document.
    * @default true
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies how far from the left-hand edge of the screen the overlay should be
    * placed. By default the overlay is horizontally centered with the value "center"
    * but you can also supply a numerical value specifying a distance in pixels.
    * @default 'center'
    */
  var left: js.UndefOr[center | Double] = js.undefined
  /**
    * If enabled then the overlay loads immediately after it has been initialized.
    * @default false
    */
  var load: js.UndefOr[Boolean] = js.undefined
  /**
    * Previously known as expose. Overlay is very often used together with the
    * Mask Tool. Because of this, the support for this feature has been built
    * inside the tool. This option accepts the mask configuration. This is either
    * a simple string specifying the background color of the mask or a more complex
    * object literal specifying more configuration variables. See an example of an
    * overlay together with mask. By default masking is disabled.
    */
  var mask: js.UndefOr[String | MaskOptions] = js.undefined
  /** before the overlay is closed */
  var onBeforeClose: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.undefined
  /**
    * before the overlay is displayed. The overlay has already been positioned at the
    * location from where it will start animating.
    */
  var onBeforeLoad: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.undefined
  /** when the overlay is closed  */
  var onClose: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.undefined
  /** when the overlay has completely been displayed  */
  var onLoad: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.undefined
  /**
    * By default, there can be only one overlay on the page at once. Setting this
    * property to false allows you to have multiple overlay instances.
    * @default true
    */
  var oneInstance: js.UndefOr[Boolean] = js.undefined
  /**
    * The speed of the fade-in animation on the "default" effect. Valid values are
    * 'slow', 'normal' and 'fast', or you can supply a numerical value (in milliseconds).
    * By setting this property to 0, the overlay will appear immediately without any animation.
    * @default 'normal'
    */
  var speed: js.UndefOr[slow | normal | fast | Double] = js.undefined
  /**
    * The element to be overlayed (if not specified in the rel attribute of the triggering element).
    */
  var target: js.UndefOr[Element] = js.undefined
  /**
    * Specifies how far from the top edge of the screen the overlay should be placed.
    * Acceptable values are an integer number specifying a distance in pixels, a string
    * (such as '15%') specifying a percentage value or "center" in which case the overlay
    * is vertically centered. Percentage values work consistently at different screen resolutions.
    * @default '10%'
    */
  var top: js.UndefOr[String | Double] = js.undefined
}

object OverlayOptions {
  @scala.inline
  def apply(
    close: JQuery = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closeSpeed: Int | Double = null,
    effect: String = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    left: center | Double = null,
    load: js.UndefOr[Boolean] = js.undefined,
    mask: String | MaskOptions = null,
    onBeforeClose: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit] = null,
    onBeforeLoad: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit] = null,
    onClose: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit] = null,
    onLoad: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit] = null,
    oneInstance: js.UndefOr[Boolean] = js.undefined,
    speed: slow | normal | fast | Double = null,
    target: Element = null,
    top: String | Double = null
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.asInstanceOf[js.Any])
    if (closeSpeed != null) __obj.updateDynamic("closeSpeed")(closeSpeed.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(load)) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onBeforeClose != null) __obj.updateDynamic("onBeforeClose")(onBeforeClose.asInstanceOf[js.Any])
    if (onBeforeLoad != null) __obj.updateDynamic("onBeforeLoad")(onBeforeLoad.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(oneInstance)) __obj.updateDynamic("oneInstance")(oneInstance.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
}

