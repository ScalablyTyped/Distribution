package typings.jscrollpane

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JScrollPaneSettings extends js.Object {
  /**
    * The number of milliseconds taken to animate to a new position
    */
  var animateDuration: js.UndefOr[Double] = js.native
  /**
    * The type of easing to use when animating to a new position
    */
  var animateEase: js.UndefOr[String] = js.native
  /**
    * Whether to use animation when calling scrollTo or scrollBy. You can control the animation speed and easing by using
    * the animateDuration and animateEase settings or if you want to exercise more complete control then you can override
    * the animate API method. Demo. 
    */
  var animateScroll: js.UndefOr[Boolean] = js.native
  /**
    * A multiplier which is used to control the amount that the scrollpane scrolls each time on of the arrow buttons is pressed.
    */
  var arrowButtonSpeed: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds between each repeated scroll event when the mouse is held down over one of the arrow keys.
    */
  var arrowRepeatFreq: js.UndefOr[Double] = js.native
  /**
    * Whether the arrow buttons should cause the jScrollPane to scroll while you are hovering over them. 
    */
  var arrowScrollOnHover: js.UndefOr[Boolean] = js.native
  /**
    * Whether jScrollPane should automatically reinitialise itself periodically after you have initially initialised it.
    * This can help with instances when the size of the content of the scrollpane (or the surrounding element) changes.
    * However, it does involve an overhead of running a javascript function on a timer so it is recommended only to activate
    * where necessary.
    */
  var autoReinitialise: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds between each reinitialisation (if autoReinitialise is true). 
    */
  var autoReinitialiseDelay: js.UndefOr[Double] = js.native
  /**
    * Whether clicking on the track (e.g. the area behind the drag) should scroll towards the point clicked on.
    * Defaults to true as this is the native behaviour in these situations. 
    */
  var clickOnTrack: js.UndefOr[Boolean] = js.native
  /**
    * The width of the content of the scroll pane. The default value of undefined will allow jScrollPane to calculate the
    * width of it's content. However, in some cases you will want to disable this (e.g. to prevent horizontal scrolling or
    * where the calculation of the size of the content doesn't return reliable results)
    */
  var contentWidth: js.UndefOr[Double] = js.native
  /**
    * Whether keyboard navigation should be enabled (e.g. whether the user can focus the scrollpane and then use
    * the arrow (and other) keys to navigate around. 
    */
  var enableKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /**
    * Whether the focus outline should be hidden in all browsers. For best accessibility you should not change
    * this option. You can style the outline with the CSS property outline and outline-offset. 
    */
  var hideFocus: js.UndefOr[Boolean] = js.native
  /**
    * Whether internal links on the page should be hijacked so that if they point so content within a jScrollPane then
    * they automatically scroll the jScrollPane to the correct place.
    */
  var hijackInternalLinks: js.UndefOr[Boolean] = js.native
  /**
    * Where the horizontal arrows should appear relative to the horizontal track.
    */
  var horizontalArrowPositions: js.UndefOr[String] = js.native
  /**
    * The largest width that the horizontal drag can have. The size of the drag elements is based on the proportion of the
    * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
    */
  var horizontalDragMaxWidth: js.UndefOr[Double] = js.native
  /**
    * The smallest width that the horizontal drag can have. The size of the drag elements is based on the proportion of the
    * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
    */
  var horizontalDragMinWidth: js.UndefOr[Double] = js.native
  /**
    * The amount of space between the bottom of the content and the horizontal scrollbar. 
    */
  var horizontalGutter: js.UndefOr[Double] = js.native
  /**
    * Whether the scrollpane should attempt to maintain it's position whenever it is reinitialised.
    * If true then the viewport of the scrollpane will remain the same when it is reinitialised, if false
    then the viewport will jump back up to the top when the scrollpane is reinitialised. See also stickToBottom and stickToRight. 
    */
  var maintainPosition: js.UndefOr[Boolean] = js.native
  /**
    * A multiplier which is used to control the amount that the scrollpane scrolls each time the mouse wheel is turned. 
    */
  var mouseWheelSpeed: js.UndefOr[Double] = js.native
  /**
    * Whether arrows should be shown on the generated scroll pane. When set to false only the scrollbar
    * track and drag will be shown, if set to true then arrows buttons will also be shown.
    */
  var showArrows: js.UndefOr[Boolean] = js.native
  /**
    * If maintainPosition is true and the scrollpane is scrolled to the bottom then the scrollpane then the scrollpane will
    * remain scrolled to the bottom even if new content is added to the pane which makes it taller. 
    */
  var stickToBottom: js.UndefOr[Boolean] = js.native
  /**
    * If maintainPosition is true and the scrollpane is scrolled to its right edge then the scrollpane then the scrollpane
    * will remain scrolled to the right edge even if new content is added to the pane which makes it wider. 
    */
  var stickToRight: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds between each repeated scroll event when the mouse is held down over the track. 
    */
  var trackClickRepeatFreq: js.UndefOr[Double] = js.native
  /**
    * A multiplier which is used to control the amount that the scrollpane scrolls each trackClickRepeatFreq
    * while the mouse button is held down over the track. 
    */
  var trackClickSpeed: js.UndefOr[Double] = js.native
  /**
    * Where the vertical arrows should appear relative to the vertical track.
    */
  var verticalArrowPositions: js.UndefOr[String] = js.native
  /**
    * The largest height that the vertical drag can have. The size of the drag elements is based on the proportion of the
    * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
    */
  var verticalDragMaxHeight: js.UndefOr[Double] = js.native
  /**
    * The smallest height that the vertical drag can have. The size of the drag elements is based on the proportion of the
    * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
    */
  var verticalDragMinHeight: js.UndefOr[Double] = js.native
  /**
    * The amount of space between the side of the content and the vertical scrollbar. 
    */
  var verticalGutter: js.UndefOr[Double] = js.native
}

object JScrollPaneSettings {
  @scala.inline
  def apply(): JScrollPaneSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JScrollPaneSettings]
  }
  @scala.inline
  implicit class JScrollPaneSettingsOps[Self <: JScrollPaneSettings] (val x: Self) extends AnyVal {
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
    def setAnimateDuration(value: Double): Self = this.set("animateDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateDuration: Self = this.set("animateDuration", js.undefined)
    @scala.inline
    def setAnimateEase(value: String): Self = this.set("animateEase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateEase: Self = this.set("animateEase", js.undefined)
    @scala.inline
    def setAnimateScroll(value: Boolean): Self = this.set("animateScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateScroll: Self = this.set("animateScroll", js.undefined)
    @scala.inline
    def setArrowButtonSpeed(value: Double): Self = this.set("arrowButtonSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowButtonSpeed: Self = this.set("arrowButtonSpeed", js.undefined)
    @scala.inline
    def setArrowRepeatFreq(value: Double): Self = this.set("arrowRepeatFreq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowRepeatFreq: Self = this.set("arrowRepeatFreq", js.undefined)
    @scala.inline
    def setArrowScrollOnHover(value: Boolean): Self = this.set("arrowScrollOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowScrollOnHover: Self = this.set("arrowScrollOnHover", js.undefined)
    @scala.inline
    def setAutoReinitialise(value: Boolean): Self = this.set("autoReinitialise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoReinitialise: Self = this.set("autoReinitialise", js.undefined)
    @scala.inline
    def setAutoReinitialiseDelay(value: Double): Self = this.set("autoReinitialiseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoReinitialiseDelay: Self = this.set("autoReinitialiseDelay", js.undefined)
    @scala.inline
    def setClickOnTrack(value: Boolean): Self = this.set("clickOnTrack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickOnTrack: Self = this.set("clickOnTrack", js.undefined)
    @scala.inline
    def setContentWidth(value: Double): Self = this.set("contentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentWidth: Self = this.set("contentWidth", js.undefined)
    @scala.inline
    def setEnableKeyboardNavigation(value: Boolean): Self = this.set("enableKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableKeyboardNavigation: Self = this.set("enableKeyboardNavigation", js.undefined)
    @scala.inline
    def setHideFocus(value: Boolean): Self = this.set("hideFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideFocus: Self = this.set("hideFocus", js.undefined)
    @scala.inline
    def setHijackInternalLinks(value: Boolean): Self = this.set("hijackInternalLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHijackInternalLinks: Self = this.set("hijackInternalLinks", js.undefined)
    @scala.inline
    def setHorizontalArrowPositions(value: String): Self = this.set("horizontalArrowPositions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalArrowPositions: Self = this.set("horizontalArrowPositions", js.undefined)
    @scala.inline
    def setHorizontalDragMaxWidth(value: Double): Self = this.set("horizontalDragMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalDragMaxWidth: Self = this.set("horizontalDragMaxWidth", js.undefined)
    @scala.inline
    def setHorizontalDragMinWidth(value: Double): Self = this.set("horizontalDragMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalDragMinWidth: Self = this.set("horizontalDragMinWidth", js.undefined)
    @scala.inline
    def setHorizontalGutter(value: Double): Self = this.set("horizontalGutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalGutter: Self = this.set("horizontalGutter", js.undefined)
    @scala.inline
    def setMaintainPosition(value: Boolean): Self = this.set("maintainPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainPosition: Self = this.set("maintainPosition", js.undefined)
    @scala.inline
    def setMouseWheelSpeed(value: Double): Self = this.set("mouseWheelSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseWheelSpeed: Self = this.set("mouseWheelSpeed", js.undefined)
    @scala.inline
    def setShowArrows(value: Boolean): Self = this.set("showArrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowArrows: Self = this.set("showArrows", js.undefined)
    @scala.inline
    def setStickToBottom(value: Boolean): Self = this.set("stickToBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickToBottom: Self = this.set("stickToBottom", js.undefined)
    @scala.inline
    def setStickToRight(value: Boolean): Self = this.set("stickToRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickToRight: Self = this.set("stickToRight", js.undefined)
    @scala.inline
    def setTrackClickRepeatFreq(value: Double): Self = this.set("trackClickRepeatFreq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackClickRepeatFreq: Self = this.set("trackClickRepeatFreq", js.undefined)
    @scala.inline
    def setTrackClickSpeed(value: Double): Self = this.set("trackClickSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackClickSpeed: Self = this.set("trackClickSpeed", js.undefined)
    @scala.inline
    def setVerticalArrowPositions(value: String): Self = this.set("verticalArrowPositions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalArrowPositions: Self = this.set("verticalArrowPositions", js.undefined)
    @scala.inline
    def setVerticalDragMaxHeight(value: Double): Self = this.set("verticalDragMaxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalDragMaxHeight: Self = this.set("verticalDragMaxHeight", js.undefined)
    @scala.inline
    def setVerticalDragMinHeight(value: Double): Self = this.set("verticalDragMinHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalDragMinHeight: Self = this.set("verticalDragMinHeight", js.undefined)
    @scala.inline
    def setVerticalGutter(value: Double): Self = this.set("verticalGutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalGutter: Self = this.set("verticalGutter", js.undefined)
  }
  
}

