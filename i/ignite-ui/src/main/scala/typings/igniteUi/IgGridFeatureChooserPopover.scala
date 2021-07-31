package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridFeatureChooserPopover
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Sets the time popover fades in and out when showing/hiding
    *
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls where the popover DOM should be attached to.
    *
    *
    * Valid values:
    * "string" A valid jQuery selector for the element
    * "object" A reference to the parent jQuery object
    */
  var appendTo: js.UndefOr[String | js.Object] = js.undefined
  
  var closeOnBlur: js.UndefOr[Boolean] = js.undefined
  
  var containment: js.UndefOr[js.Any] = js.undefined
  
  /**
    * sets the content for the popover container. If left null the content will be get from the target.
    *
    *
    * Valid values:
    * "string" String content of the popover container
    * "function" Function which is a callback that should return the content. Use the 'this' value to access the target DOM element.
    */
  var contentTemplate: js.UndefOr[String | js.Function] = js.undefined
  
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
  var direction: js.UndefOr[String] = js.undefined
  
  /**
    * Controls the priority in which the control searches for space to show relative to the target element.
    * This property has effect only if the [direction](ui.%%WidgetNameLowered%%#options:direction) property value is "auto" or unset.
    *
    */
  var directionPriority: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var gridId: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the content for the popover header
    *
    */
  var headerTemplate: js.UndefOr[IgPopoverHeaderTemplate] = js.undefined
  
  /**
    * defines height for the popover. leave null for auto
    *
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Event fired after popover is hidden.
    */
  var hidden: js.UndefOr[HiddenEvent] = js.undefined
  
  /**
    * Event fired before popover is hidden.
    */
  var hiding: js.UndefOr[HidingEvent] = js.undefined
  
  /**
    * defines height the popover won't exceed even if no specific one is set.
    *
    */
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  
  /**
    * defines width the popover won't exceed even if no specific one is set.
    *
    */
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  
  /**
    * defines width the popover won't go under the value even if no specific one is set.
    *
    */
  var minWidth: js.UndefOr[Double | String] = js.undefined
  
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
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * Selectors indicating which items should show popovers. The predefined value is [title]. Customize if you're using something other then the title attribute for the popover content, or if you need a different selector for event delegation. When changing this option, you likely need to also change the contentTemplate option
    *
    */
  var selectors: js.UndefOr[String] = js.undefined
  
  /**
    * sets the event on which the popover will be shown. Predefined values are "mouseenter", "click" and "focus"
    *
    *
    * Valid values:
    * "mouseenter" the popover is shown on mouse enter in the target element
    * "click" the popover is shown on click on the target element
    * "focus" the popover is shown on focusing the target element
    */
  var showOn: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired before popover is shown.
    */
  var showing: js.UndefOr[ShowingEvent] = js.undefined
  
  /**
    * Event fired after popover is shown.
    */
  var shown: js.UndefOr[ShownEvent] = js.undefined
  
  var targetButton: js.UndefOr[js.Any] = js.undefined
  
  /**
    * defines width for the popover. leave null for auto.
    *
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object IgGridFeatureChooserPopover {
  
  @scala.inline
  def apply(): IgGridFeatureChooserPopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridFeatureChooserPopover]
  }
  
  @scala.inline
  implicit class IgGridFeatureChooserPopoverMutableBuilder[Self <: IgGridFeatureChooserPopover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
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
    def setDirectionPriority(value: js.Array[js.Any]): Self = StObject.set(x, "directionPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionPriorityUndefined: Self = StObject.set(x, "directionPriority", js.undefined)
    
    @scala.inline
    def setDirectionPriorityVarargs(value: js.Any*): Self = StObject.set(x, "directionPriority", js.Array(value :_*))
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setGridId(value: String): Self = StObject.set(x, "gridId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridIdUndefined: Self = StObject.set(x, "gridId", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: IgPopoverHeaderTemplate): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
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
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSelectors(value: String): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
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
    def setTargetButton(value: js.Any): Self = StObject.set(x, "targetButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetButtonUndefined: Self = StObject.set(x, "targetButton", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
