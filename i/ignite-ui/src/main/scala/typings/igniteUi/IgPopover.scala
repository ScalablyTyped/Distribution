package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPopover
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Sets the time popover fades in and out when showing/hiding
    *
    */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /**
    * Controls where the popover DOM should be attached to.
    *
    *
    * Valid values:
    * "string" A valid jQuery selector for the element
    * "object" A reference to the parent jQuery object
    */
  var appendTo: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Controls whether the popover will close on blur or not
    *
    */
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the containment for the popover. Accepts a jQuery object
    *
    */
  var containment: js.UndefOr[js.Any] = js.native
  
  /**
    * sets the content for the popover container. If left null the content will be get from the target.
    *
    *
    * Valid values:
    * "string" String content of the popover container
    * "function" Function which is a callback that should return the content. Use the 'this' value to access the target DOM element.
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
  var headerTemplate: js.UndefOr[IgPopoverHeaderTemplate] = js.native
  
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
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
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
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Selectors indicating which items should show popovers. The predefined value is [title]. Customize if you're using something other then the title attribute for the popover content, or if you need a different selector for event delegation. When changing this option, you likely need to also change the contentTemplate option
    *
    */
  var selectors: js.UndefOr[String] = js.native
  
  /**
    * sets the event on which the popover will be shown. Predefined values are "mouseenter", "click" and "focus"
    *
    *
    * Valid values:
    * "mouseenter" the popover is shown on mouse enter in the target element
    * "click" the popover is shown on click on the target element
    * "focus" the popover is shown on focusing the target element
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
    * defines width for the popover. leave null for auto.
    *
    */
  var width: js.UndefOr[Double | String] = js.native
}
object IgPopover {
  
  @scala.inline
  def apply(): IgPopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPopover]
  }
  
  @scala.inline
  implicit class IgPopoverOps[Self <: IgPopover] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAppendTo(value: String | js.Object): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setCloseOnBlur(value: Boolean): Self = this.set("closeOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnBlur: Self = this.set("closeOnBlur", js.undefined)
    
    @scala.inline
    def setContainment(value: js.Any): Self = this.set("containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    
    @scala.inline
    def setContentTemplate(value: String | js.Function): Self = this.set("contentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTemplate: Self = this.set("contentTemplate", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDirectionPriorityVarargs(value: js.Any*): Self = this.set("directionPriority", js.Array(value :_*))
    
    @scala.inline
    def setDirectionPriority(value: js.Array[_]): Self = this.set("directionPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionPriority: Self = this.set("directionPriority", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: IgPopoverHeaderTemplate): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidden(value: (/* event */ Event, /* ui */ HiddenEventUIParam) => Unit): Self = this.set("hidden", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHiding(value: (/* event */ Event, /* ui */ HidingEventUIParam) => Unit): Self = this.set("hiding", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHiding: Self = this.set("hiding", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double | String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double | String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setSelectors(value: String): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
    
    @scala.inline
    def setShowOn(value: String): Self = this.set("showOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOn: Self = this.set("showOn", js.undefined)
    
    @scala.inline
    def setShowing(value: (/* event */ Event, /* ui */ ShowingEventUIParam) => Unit): Self = this.set("showing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShowing: Self = this.set("showing", js.undefined)
    
    @scala.inline
    def setShown(value: (/* event */ Event, /* ui */ ShownEventUIParam) => Unit): Self = this.set("shown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShown: Self = this.set("shown", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
