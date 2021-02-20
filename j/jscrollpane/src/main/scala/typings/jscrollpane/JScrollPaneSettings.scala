package typings.jscrollpane

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JScrollPaneSettings extends StObject {
  
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
  implicit class JScrollPaneSettingsMutableBuilder[Self <: JScrollPaneSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimateDuration(value: Double): Self = StObject.set(x, "animateDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateDurationUndefined: Self = StObject.set(x, "animateDuration", js.undefined)
    
    @scala.inline
    def setAnimateEase(value: String): Self = StObject.set(x, "animateEase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateEaseUndefined: Self = StObject.set(x, "animateEase", js.undefined)
    
    @scala.inline
    def setAnimateScroll(value: Boolean): Self = StObject.set(x, "animateScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateScrollUndefined: Self = StObject.set(x, "animateScroll", js.undefined)
    
    @scala.inline
    def setArrowButtonSpeed(value: Double): Self = StObject.set(x, "arrowButtonSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowButtonSpeedUndefined: Self = StObject.set(x, "arrowButtonSpeed", js.undefined)
    
    @scala.inline
    def setArrowRepeatFreq(value: Double): Self = StObject.set(x, "arrowRepeatFreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowRepeatFreqUndefined: Self = StObject.set(x, "arrowRepeatFreq", js.undefined)
    
    @scala.inline
    def setArrowScrollOnHover(value: Boolean): Self = StObject.set(x, "arrowScrollOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowScrollOnHoverUndefined: Self = StObject.set(x, "arrowScrollOnHover", js.undefined)
    
    @scala.inline
    def setAutoReinitialise(value: Boolean): Self = StObject.set(x, "autoReinitialise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReinitialiseDelay(value: Double): Self = StObject.set(x, "autoReinitialiseDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReinitialiseDelayUndefined: Self = StObject.set(x, "autoReinitialiseDelay", js.undefined)
    
    @scala.inline
    def setAutoReinitialiseUndefined: Self = StObject.set(x, "autoReinitialise", js.undefined)
    
    @scala.inline
    def setClickOnTrack(value: Boolean): Self = StObject.set(x, "clickOnTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickOnTrackUndefined: Self = StObject.set(x, "clickOnTrack", js.undefined)
    
    @scala.inline
    def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
    
    @scala.inline
    def setEnableKeyboardNavigation(value: Boolean): Self = StObject.set(x, "enableKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableKeyboardNavigationUndefined: Self = StObject.set(x, "enableKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setHideFocus(value: Boolean): Self = StObject.set(x, "hideFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFocusUndefined: Self = StObject.set(x, "hideFocus", js.undefined)
    
    @scala.inline
    def setHijackInternalLinks(value: Boolean): Self = StObject.set(x, "hijackInternalLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHijackInternalLinksUndefined: Self = StObject.set(x, "hijackInternalLinks", js.undefined)
    
    @scala.inline
    def setHorizontalArrowPositions(value: String): Self = StObject.set(x, "horizontalArrowPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalArrowPositionsUndefined: Self = StObject.set(x, "horizontalArrowPositions", js.undefined)
    
    @scala.inline
    def setHorizontalDragMaxWidth(value: Double): Self = StObject.set(x, "horizontalDragMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalDragMaxWidthUndefined: Self = StObject.set(x, "horizontalDragMaxWidth", js.undefined)
    
    @scala.inline
    def setHorizontalDragMinWidth(value: Double): Self = StObject.set(x, "horizontalDragMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalDragMinWidthUndefined: Self = StObject.set(x, "horizontalDragMinWidth", js.undefined)
    
    @scala.inline
    def setHorizontalGutter(value: Double): Self = StObject.set(x, "horizontalGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalGutterUndefined: Self = StObject.set(x, "horizontalGutter", js.undefined)
    
    @scala.inline
    def setMaintainPosition(value: Boolean): Self = StObject.set(x, "maintainPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainPositionUndefined: Self = StObject.set(x, "maintainPosition", js.undefined)
    
    @scala.inline
    def setMouseWheelSpeed(value: Double): Self = StObject.set(x, "mouseWheelSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelSpeedUndefined: Self = StObject.set(x, "mouseWheelSpeed", js.undefined)
    
    @scala.inline
    def setShowArrows(value: Boolean): Self = StObject.set(x, "showArrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowArrowsUndefined: Self = StObject.set(x, "showArrows", js.undefined)
    
    @scala.inline
    def setStickToBottom(value: Boolean): Self = StObject.set(x, "stickToBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickToBottomUndefined: Self = StObject.set(x, "stickToBottom", js.undefined)
    
    @scala.inline
    def setStickToRight(value: Boolean): Self = StObject.set(x, "stickToRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickToRightUndefined: Self = StObject.set(x, "stickToRight", js.undefined)
    
    @scala.inline
    def setTrackClickRepeatFreq(value: Double): Self = StObject.set(x, "trackClickRepeatFreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackClickRepeatFreqUndefined: Self = StObject.set(x, "trackClickRepeatFreq", js.undefined)
    
    @scala.inline
    def setTrackClickSpeed(value: Double): Self = StObject.set(x, "trackClickSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackClickSpeedUndefined: Self = StObject.set(x, "trackClickSpeed", js.undefined)
    
    @scala.inline
    def setVerticalArrowPositions(value: String): Self = StObject.set(x, "verticalArrowPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalArrowPositionsUndefined: Self = StObject.set(x, "verticalArrowPositions", js.undefined)
    
    @scala.inline
    def setVerticalDragMaxHeight(value: Double): Self = StObject.set(x, "verticalDragMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalDragMaxHeightUndefined: Self = StObject.set(x, "verticalDragMaxHeight", js.undefined)
    
    @scala.inline
    def setVerticalDragMinHeight(value: Double): Self = StObject.set(x, "verticalDragMinHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalDragMinHeightUndefined: Self = StObject.set(x, "verticalDragMinHeight", js.undefined)
    
    @scala.inline
    def setVerticalGutter(value: Double): Self = StObject.set(x, "verticalGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalGutterUndefined: Self = StObject.set(x, "verticalGutter", js.undefined)
  }
}
