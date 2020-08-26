package typings.jqueryTools.JQueryTools.overlay

import typings.jquery.JQueryEventObject
import typings.jqueryTools.JQuery
import typings.jqueryTools.jqueryToolsStrings.center
import typings.jqueryTools.jqueryToolsStrings.fast
import typings.jqueryTools.jqueryToolsStrings.normal
import typings.jqueryTools.jqueryToolsStrings.slow
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayOptions extends js.Object {
  /**
    * A jQuery selector for the closing elements inside the overlay. These
    * can be any elements such as links, buttons or images. If this is not
    * supplied, a close element is auto-generated. Read more about this in
    * defining close actions.
    */
  var close: js.UndefOr[JQuery] = js.native
  /**
    * By default, overlays are closed when the mouse is clicked outside the
    * overlay area. Setting this property to false suppresses this behaviour
    * which is suitable for modal dialogs.
    * @default true
    */
  var closeOnClick: js.UndefOr[Boolean] = js.native
  /**
    * By default, overlays are closed when the ESC keyboard key is pressed.
    * Setting this property to false suppresses this behaviour.
    * @default true
    */
  var closeOnEsc: js.UndefOr[Boolean] = js.native
  /** The speed to close the overlay, in milliseconds */
  var closeSpeed: js.UndefOr[Double] = js.native
  /**
    * The effect to be used when an overlay is opened and closed. This can
    * dramatically change the behaviour of the overlay. By default this tool
    * uses an effect called "default" which is a simple show/hide effect.
    * @default 'default'
    */
  var effect: js.UndefOr[String] = js.native
  /**
    * since 1.2.0. whether overlay stays in the same position while the screen
    * is scrolled. This is the default behaviour for all browsers except IE6
    * and below. IE6 does not support fixed positioning. If this property is
    * set to false then the overlay is positioned in relationship to the document
    * so that when the screen is scrolled then the overlay moves along with the document.
    * @default true
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how far from the left-hand edge of the screen the overlay should be
    * placed. By default the overlay is horizontally centered with the value "center"
    * but you can also supply a numerical value specifying a distance in pixels.
    * @default 'center'
    */
  var left: js.UndefOr[center | Double] = js.native
  /**
    * If enabled then the overlay loads immediately after it has been initialized.
    * @default false
    */
  var load: js.UndefOr[Boolean] = js.native
  /**
    * Previously known as expose. Overlay is very often used together with the
    * Mask Tool. Because of this, the support for this feature has been built
    * inside the tool. This option accepts the mask configuration. This is either
    * a simple string specifying the background color of the mask or a more complex
    * object literal specifying more configuration variables. See an example of an
    * overlay together with mask. By default masking is disabled.
    */
  var mask: js.UndefOr[String | MaskOptions] = js.native
  /** before the overlay is closed */
  var onBeforeClose: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.native
  /**
    * before the overlay is displayed. The overlay has already been positioned at the
    * location from where it will start animating.
    */
  var onBeforeLoad: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.native
  /** when the overlay is closed  */
  var onClose: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.native
  /** when the overlay has completely been displayed  */
  var onLoad: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.native
  /**
    * By default, there can be only one overlay on the page at once. Setting this
    * property to false allows you to have multiple overlay instances.
    * @default true
    */
  var oneInstance: js.UndefOr[Boolean] = js.native
  /**
    * The speed of the fade-in animation on the "default" effect. Valid values are
    * 'slow', 'normal' and 'fast', or you can supply a numerical value (in milliseconds).
    * By setting this property to 0, the overlay will appear immediately without any animation.
    * @default 'normal'
    */
  var speed: js.UndefOr[slow | normal | fast | Double] = js.native
  /**
    * The element to be overlayed (if not specified in the rel attribute of the triggering element).
    */
  var target: js.UndefOr[Element] = js.native
  /**
    * Specifies how far from the top edge of the screen the overlay should be placed.
    * Acceptable values are an integer number specifying a distance in pixels, a string
    * (such as '15%') specifying a percentage value or "center" in which case the overlay
    * is vertically centered. Percentage values work consistently at different screen resolutions.
    * @default '10%'
    */
  var top: js.UndefOr[String | Double] = js.native
}

object OverlayOptions {
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  @scala.inline
  implicit class OverlayOptionsOps[Self <: OverlayOptions] (val x: Self) extends AnyVal {
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
    def setClose(value: JQuery): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = this.set("closeOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEsc: Self = this.set("closeOnEsc", js.undefined)
    @scala.inline
    def setCloseSpeed(value: Double): Self = this.set("closeSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseSpeed: Self = this.set("closeSpeed", js.undefined)
    @scala.inline
    def setEffect(value: String): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setLeft(value: center | Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLoad(value: Boolean): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setMask(value: String | MaskOptions): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setOnBeforeClose(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = this.set("onBeforeClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBeforeClose: Self = this.set("onBeforeClose", js.undefined)
    @scala.inline
    def setOnBeforeLoad(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = this.set("onBeforeLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBeforeLoad: Self = this.set("onBeforeLoad", js.undefined)
    @scala.inline
    def setOnClose(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = this.set("onClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnLoad(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOneInstance(value: Boolean): Self = this.set("oneInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneInstance: Self = this.set("oneInstance", js.undefined)
    @scala.inline
    def setSpeed(value: slow | normal | fast | Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTop(value: String | Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

