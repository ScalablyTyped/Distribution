package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgNotifier
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Allows setting the respective state CSS on the target element (used to apply border color by default)
    *
    */
  var allowCSSOnTarget: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the time in milliseconds the notification fades in and out when showing/hiding
    *
    */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets the distance in pixels a notification popover slides outwards as it's shown.
    *
    */
  var animationSlideDistance: js.UndefOr[Double] = js.native
  
  /**
    * Controls where the popover DOM should be attached to (only applies to popovers).
    *
    *
    * Valid values:
    * "string" A valid jQuery selector for the element
    * "object" A reference to the parent jQuery object
    */
  var appendTo: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Controls whether the popover will close on blur or not. This option has effect only when the corresponding [showOn](ui.ignotifier#options:showOn) is set (manual by default)
    *
    */
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the containment for the popover. Accepts a jQuery object
    *
    */
  var containment: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets the content for the popover container. Templated with parameters by default: {0} - icon container class, {1} - the icon class and {2} - message text.
    *
    *
    * Valid values:
    * "string" String content of the popover container
    * "function" Function which is a callback that should return the content. Use the 'this' value to access the target DOM element and passed argument for state value. Result can also include the same template parametes.
    */
  var contentTemplate: js.UndefOr[String | js.Function] = js.native
  
  /**
    * controls the direction in which the control shows relative to the target element
    *
    *
    * Valid values:
    * "auto" lets the control show on the side where enough space is available with the priority specified by the [directionPriority](ui.%%WidgetNameLowered%%#options:directionPriority) property
    * "left" shows popover on the left side of the target element
    * "right" shows popover on the right side of the target element
    * "top" shows popover on the top of the target element
    * "bottom" shows popover on the bottom of the target element
    */
  var direction: js.UndefOr[String] = js.native
  
  /**
    * Controls the priority in which the control searches for space to show relative to the target element.
    * This property has effect only if the [direction](ui.%%WidgetNameLowered%%#options:direction) property value is "auto" or unset.
    *
    */
  var directionPriority: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Sets the content for the popover header
    *
    */
  var headerTemplate: js.UndefOr[IgNotifierHeaderTemplate] = js.native
  
  /**
    * defines height for the popover. leave null for auto
    *
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * Event fired after popover is hidden.
    */
  var hidden: js.UndefOr[HiddenEvent] = js.native
  
  /**
    * Event fired before popover is hidden.
    */
  var hiding: js.UndefOr[HidingEvent] = js.native
  
  /**
    * defines height the popover won't exceed even if no specific one is set.
    *
    */
  var maxHeight: js.UndefOr[Double | String] = js.native
  
  /**
    * defines width the popover won't exceed even if no specific one is set.
    *
    */
  var maxWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * defines width the popover won't go under the value even if no specific one is set.
    *
    */
  var minWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * Controls the positioning mode of messages. Setting a mode will override the default behavior which is auto.Note: Inline element uses a block container as is always placed after the target.
    *
    *
    * Valid values:
    * "auto" Uses popover for info and warning messages and inline for errors and success.
    * "popover" Displays messages in a configurable popover.
    * "inline" Displays messages in a simplified notification text under the target.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * Controls the level of notifications shown by automatic and manual messages using the [notify](ui.ignotifier#methods:notify) method. Use [show](ui.ignotifier#methods:show) to ignore the level.
    *
    *
    * Valid values:
    * "success" Show all types of messages
    * "info" Show everything from info level messages up
    * "warning" Show everything from warning level messages up
    * "error" Show only error messages
    */
  var notifyLevel: js.UndefOr[String] = js.native
  
  /**
    * controls the position of the popover according to the target element in case the popover is larger than the target on the side we want to position, if the popover is smaller it should always be in the middle of the visible area
    *
    *
    * Valid values:
    * "auto" lets the control choose a position depending on available space with the following priority balanced > end > start
    * "balanced" the popover is positioned at the middle of the target element
    * "start" the popover is positioned at the beginning of the target element
    * "end" the popover is positioned at the end of the target element
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * Selectors indicating which items should show popovers.
    */
  var selectors: js.UndefOr[String] = js.native
  
  /**
    * Allows rendering a span with the respective state CSS to display jQuery UI framework icons
    *
    */
  var showIcon: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the event on which the notification will be shown. Predefined values are "mouseenter", "click" and "focus"
    *
    *
    * Valid values:
    * "mouseenter" The popover is shown on mouse enter in the target element
    * "click" The popover is shown on click on the target element
    * "focus" The popover is shown on focusing the target element
    * "manual" The popover is shown manually
    */
  var showOn: js.UndefOr[String] = js.native
  
  /**
    * Event fired before popover is shown.
    */
  var showing: js.UndefOr[ShowingEvent] = js.native
  
  /**
    * Event fired after popover is shown.
    */
  var shown: js.UndefOr[ShownEvent] = js.native
  
  /**
    * Gets/Sets the current state of the igNotifier messages. State controls what CSS classes are applied to the messages and target and has interactions with other options as well.
    *
    *
    * Valid values:
    * "success" Messages and target CSS have success styles applied.
    * "info" Messages have info applied. Target is unaffected.
    * "warning" Messages and target CSS have warning styles applied.
    * "error" Messages and target CSS have error styles applied.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * defines width for the popover. leave null for auto.
    *
    */
  var width: js.UndefOr[Double | String] = js.native
}
object IgNotifier {
  
  @scala.inline
  def apply(): IgNotifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgNotifier]
  }
  
  @scala.inline
  implicit class IgNotifierMutableBuilder[Self <: IgNotifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCSSOnTarget(value: Boolean): Self = StObject.set(x, "allowCSSOnTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCSSOnTargetUndefined: Self = StObject.set(x, "allowCSSOnTarget", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationSlideDistance(value: Double): Self = StObject.set(x, "animationSlideDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationSlideDistanceUndefined: Self = StObject.set(x, "animationSlideDistance", js.undefined)
    
    @scala.inline
    def setAppendTo(value: String | js.Object): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
    
    @scala.inline
    def setContainment(value: js.Any): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    @scala.inline
    def setContentTemplate(value: String | js.Function): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionPriority(value: js.Array[_]): Self = StObject.set(x, "directionPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionPriorityUndefined: Self = StObject.set(x, "directionPriority", js.undefined)
    
    @scala.inline
    def setDirectionPriorityVarargs(value: js.Any*): Self = StObject.set(x, "directionPriority", js.Array(value :_*))
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: IgNotifierHeaderTemplate): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden(value: (/* event */ Event, /* ui */ HiddenEventUIParam) => Unit): Self = StObject.set(x, "hidden", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setHiding(value: (/* event */ Event, /* ui */ HidingEventUIParam) => Unit): Self = StObject.set(x, "hiding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHidingUndefined: Self = StObject.set(x, "hiding", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNotifyLevel(value: String): Self = StObject.set(x, "notifyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyLevelUndefined: Self = StObject.set(x, "notifyLevel", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSelectors(value: String): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
    
    @scala.inline
    def setShowOn(value: String): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    @scala.inline
    def setShowing(value: (/* event */ Event, /* ui */ ShowingEventUIParam) => Unit): Self = StObject.set(x, "showing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowingUndefined: Self = StObject.set(x, "showing", js.undefined)
    
    @scala.inline
    def setShown(value: (/* event */ Event, /* ui */ ShownEventUIParam) => Unit): Self = StObject.set(x, "shown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShownUndefined: Self = StObject.set(x, "shown", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
