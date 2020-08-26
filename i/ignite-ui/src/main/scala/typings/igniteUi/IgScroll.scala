package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgScroll
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Sets or gets if the scrollbars should be always visible (on all environments). Otherwise it will be the default behavior. Note: this option is only for the custom scrollbars set through the scrollbarType option.
    *
    */
  var alwaysVisible: js.UndefOr[Boolean] = js.native
  /**
    * Sets gets the step of the default scrolling behavior when using any of the custom scrollbar track areas.
    *
    */
  var bigIncrementStep: js.UndefOr[Double] = js.native
  /**
    * Sets gets at least how many times the horizontal speed should be bigger so the inertia proceeds only horizontally without scrolling vertically. This is to improve interactions due to not perfectly swiping left/right with some deviation down/up
    *
    */
  var inertiaDeltaX: js.UndefOr[Double] = js.native
  /**
    * Sets gets at least how many times the vertical speed should be bigger so the inertia proceeds only vertically without scrolling horizontally. This is to improve interactions due to not perfectly swiping down/up with some deviation left/right
    *
    */
  var inertiaDeltaY: js.UndefOr[Double] = js.native
  /**
    * Sets gets the modifier for how long the inertia last on mobile devices
    *
    */
  var inertiaDuration: js.UndefOr[Double] = js.native
  /**
    * Sets gets the modifier for how much the inertia scrolls on mobile devices
    *
    */
  var inertiaStep: js.UndefOr[Double] = js.native
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
    * Sets or gets the minimum size of the thumb drag in pixels. For the vertical thumb it means its minimum height, for the horizontal thumb it means its minimum width. This affects only the custom scrollblar when scrollbarType is set to "custom".
    *
    */
  var minThumbSize: js.UndefOr[Double | String] = js.native
  /**
    * Sets or gets if igScroll can modify the DOM when it is initialized on certain element so that the content can be scrollable.
    *
    */
  var modifyDOM: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Event which is raised after the scroller has been rendered fully
    */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
    * Event which is raised after the igScroll has finished resizing.
    * Function takes arguments evt and args.
    * Use evt.originalEvent (with validation for not null of evt) to obtain reference to event of browser.
    * Use args.owner to obtain reference to igScroll.
    */
  var resized: js.UndefOr[ResizedEvent] = js.native
  /**
    * Event which is raised when the igScroll detects that the element is reizing.
    * Function takes arguments evt and args.
    * Use evt.originalEvent (with validation for not null of evt) to obtain reference to event of browser.
    * Use args.owner to obtain reference to igScroll.
    */
  var resizing: js.UndefOr[ResizingEvent] = js.native
  /**
    * Sets custom value for how high is actually the content. Useful when wanting to scroll and update the shown content manually.
    *
    */
  var scrollHeight: js.UndefOr[Double] = js.native
  /**
    * Sets gets current horizontal position of the content.
    *
    */
  var scrollLeft: js.UndefOr[Double] = js.native
  /**
    * Sets gets if only the linked horizontal scrollbar should be used for horizontal scrolling. Note: The behavior when the linked scrollbar is scrolled in this case should be handled manually.
    *
    */
  var scrollOnlyHBar: js.UndefOr[Boolean] = js.native
  /**
    * Sets gets if only the linked vertical scrollbar should be used for vertical scrolling. Note: The behavior when the linked scrollbar is scrolled in this case should be handled manually.
    *
    */
  var scrollOnlyVBar: js.UndefOr[Boolean] = js.native
  /**
    * Sets gets current vertical position of the content.
    *
    */
  var scrollTop: js.UndefOr[Double] = js.native
  /**
    * Sets custom value for what width is actually the content. Useful when wanting to scroll and update the shown content manually.
    *
    */
  var scrollWidth: js.UndefOr[Double] = js.native
  /**
    * Sets gets html or jQuery element which is used for horizontal scrolling.
    *
    */
  var scrollbarH: js.UndefOr[String] = js.native
  /**
    * Sets gets html or jQuery element to which the horizontal scrollbar will be appended to.
    *
    */
  var scrollbarHParent: js.UndefOr[String] = js.native
  /**
    * Sets or gets what type of scrollbars should be using the igScroll (on all environments).
    *
    *
    * Valid values:
    * "custom" Custom scrollbars with custom ui and events.
    * "native" Native scrollbars
    * "none" No scrollbars should be visible
    */
  var scrollbarType: js.UndefOr[String] = js.native
  /**
    * Sets gets html or jQuery element which is used for vertical scrolling.
    *
    */
  var scrollbarV: js.UndefOr[String] = js.native
  /**
    * Sets gets html or jQuery element to which the vertical scrollbar will be appended to.
    *
    */
  var scrollbarVParent: js.UndefOr[String] = js.native
  /**
    * Event which is raised after scrolling has stopped.
    */
  var scrolled: js.UndefOr[ScrolledEvent] = js.native
  /**
    * Event which is raised before scrolling or before each step when having inertia.
    * Return false in order to cancel action.
    */
  var scrolling: js.UndefOr[ScrollingEvent] = js.native
  /**
    * Sets gets the step of the default scrolling behavior when using any of the custom scrollbar arrows
    *
    */
  var smallIncrementStep: js.UndefOr[Double] = js.native
  /**
    * Sets gets if smoother scrolling with small intertia should be used when using mouse wheel
    *
    */
  var smoothing: js.UndefOr[Boolean] = js.native
  /**
    * Sets or gets the modifier for how long the scroll ‘animation’ lasts when using the mouse wheel once. This is used only for the smooth scrolling behavior.
    *
    */
  var smoothingDuration: js.UndefOr[Double] = js.native
  /**
    * Sets or gets the modifier for how many pixels will be scrolled when using the mouse wheel once. This is used only for the smooth scrolling behavior.
    *
    */
  var smoothingStep: js.UndefOr[Double] = js.native
  /**
    * Sets gets how much pixels of toleration there will be when initially swiping horizontally. This is to improve swiping up/down without scrolling left/right when not intended due to small deviation left/right
    *
    */
  var swipeToleranceX: js.UndefOr[Double] = js.native
  /**
    * Sets gets elements that are linked to the main content horizontally. When the content is scrolled on X axis the linked elements scroll accordingly.
    *
    */
  var syncedElemsH: js.UndefOr[js.Array[_]] = js.native
  /**
    * Sets gets elements that are linked to the main content vertically. When the content is scrolled on Y axis the linked elements scroll accordingly.
    *
    */
  var syncedElemsV: js.UndefOr[js.Array[_]] = js.native
  /**
    * Event which is raised on mouse up from the scrollbar's thumb drag.
    */
  var thumbDragEnd: js.UndefOr[ThumbDragEndEvent] = js.native
  /**
    * Event which is raised when the thumb drag is being moved.
    */
  var thumbDragMove: js.UndefOr[ThumbDragMoveEvent] = js.native
  /**
    * Event which is raised when there is mouse click on the scrollbar's thumb drag.
    */
  var thumbDragStart: js.UndefOr[ThumbDragStartEvent] = js.native
  /**
    * Sets gets the step of the default scrolling behavior when using mouse wheel
    *
    */
  var wheelStep: js.UndefOr[Double] = js.native
}

object IgScroll {
  @scala.inline
  def apply(): IgScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgScroll]
  }
  @scala.inline
  implicit class IgScrollOps[Self <: IgScroll] (val x: Self) extends AnyVal {
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
    def setAlwaysVisible(value: Boolean): Self = this.set("alwaysVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysVisible: Self = this.set("alwaysVisible", js.undefined)
    @scala.inline
    def setBigIncrementStep(value: Double): Self = this.set("bigIncrementStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigIncrementStep: Self = this.set("bigIncrementStep", js.undefined)
    @scala.inline
    def setInertiaDeltaX(value: Double): Self = this.set("inertiaDeltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInertiaDeltaX: Self = this.set("inertiaDeltaX", js.undefined)
    @scala.inline
    def setInertiaDeltaY(value: Double): Self = this.set("inertiaDeltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInertiaDeltaY: Self = this.set("inertiaDeltaY", js.undefined)
    @scala.inline
    def setInertiaDuration(value: Double): Self = this.set("inertiaDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInertiaDuration: Self = this.set("inertiaDuration", js.undefined)
    @scala.inline
    def setInertiaStep(value: Double): Self = this.set("inertiaStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInertiaStep: Self = this.set("inertiaStep", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMinThumbSize(value: Double | String): Self = this.set("minThumbSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinThumbSize: Self = this.set("minThumbSize", js.undefined)
    @scala.inline
    def setModifyDOM(value: Boolean): Self = this.set("modifyDOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyDOM: Self = this.set("modifyDOM", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = this.set("rendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    @scala.inline
    def setResized(value: (/* event */ Event, /* ui */ ResizedEventUIParam) => Unit): Self = this.set("resized", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResized: Self = this.set("resized", js.undefined)
    @scala.inline
    def setResizing(value: (/* event */ Event, /* ui */ ResizingEventUIParam) => Unit): Self = this.set("resizing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResizing: Self = this.set("resizing", js.undefined)
    @scala.inline
    def setScrollHeight(value: Double): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollHeight: Self = this.set("scrollHeight", js.undefined)
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollLeft: Self = this.set("scrollLeft", js.undefined)
    @scala.inline
    def setScrollOnlyHBar(value: Boolean): Self = this.set("scrollOnlyHBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOnlyHBar: Self = this.set("scrollOnlyHBar", js.undefined)
    @scala.inline
    def setScrollOnlyVBar(value: Boolean): Self = this.set("scrollOnlyVBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOnlyVBar: Self = this.set("scrollOnlyVBar", js.undefined)
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    @scala.inline
    def setScrollWidth(value: Double): Self = this.set("scrollWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollWidth: Self = this.set("scrollWidth", js.undefined)
    @scala.inline
    def setScrollbarH(value: String): Self = this.set("scrollbarH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarH: Self = this.set("scrollbarH", js.undefined)
    @scala.inline
    def setScrollbarHParent(value: String): Self = this.set("scrollbarHParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarHParent: Self = this.set("scrollbarHParent", js.undefined)
    @scala.inline
    def setScrollbarType(value: String): Self = this.set("scrollbarType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarType: Self = this.set("scrollbarType", js.undefined)
    @scala.inline
    def setScrollbarV(value: String): Self = this.set("scrollbarV", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarV: Self = this.set("scrollbarV", js.undefined)
    @scala.inline
    def setScrollbarVParent(value: String): Self = this.set("scrollbarVParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarVParent: Self = this.set("scrollbarVParent", js.undefined)
    @scala.inline
    def setScrolled(value: (/* event */ Event, /* ui */ ScrolledEventUIParam) => Unit): Self = this.set("scrolled", js.Any.fromFunction2(value))
    @scala.inline
    def deleteScrolled: Self = this.set("scrolled", js.undefined)
    @scala.inline
    def setScrolling(value: (/* event */ Event, /* ui */ ScrollingEventUIParam) => Unit): Self = this.set("scrolling", js.Any.fromFunction2(value))
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    @scala.inline
    def setSmallIncrementStep(value: Double): Self = this.set("smallIncrementStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallIncrementStep: Self = this.set("smallIncrementStep", js.undefined)
    @scala.inline
    def setSmoothing(value: Boolean): Self = this.set("smoothing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothing: Self = this.set("smoothing", js.undefined)
    @scala.inline
    def setSmoothingDuration(value: Double): Self = this.set("smoothingDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothingDuration: Self = this.set("smoothingDuration", js.undefined)
    @scala.inline
    def setSmoothingStep(value: Double): Self = this.set("smoothingStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothingStep: Self = this.set("smoothingStep", js.undefined)
    @scala.inline
    def setSwipeToleranceX(value: Double): Self = this.set("swipeToleranceX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeToleranceX: Self = this.set("swipeToleranceX", js.undefined)
    @scala.inline
    def setSyncedElemsHVarargs(value: js.Any*): Self = this.set("syncedElemsH", js.Array(value :_*))
    @scala.inline
    def setSyncedElemsH(value: js.Array[_]): Self = this.set("syncedElemsH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncedElemsH: Self = this.set("syncedElemsH", js.undefined)
    @scala.inline
    def setSyncedElemsVVarargs(value: js.Any*): Self = this.set("syncedElemsV", js.Array(value :_*))
    @scala.inline
    def setSyncedElemsV(value: js.Array[_]): Self = this.set("syncedElemsV", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncedElemsV: Self = this.set("syncedElemsV", js.undefined)
    @scala.inline
    def setThumbDragEnd(value: (/* event */ Event, /* ui */ ThumbDragEndEventUIParam) => Unit): Self = this.set("thumbDragEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteThumbDragEnd: Self = this.set("thumbDragEnd", js.undefined)
    @scala.inline
    def setThumbDragMove(value: (/* event */ Event, /* ui */ ThumbDragMoveEventUIParam) => Unit): Self = this.set("thumbDragMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteThumbDragMove: Self = this.set("thumbDragMove", js.undefined)
    @scala.inline
    def setThumbDragStart(value: (/* event */ Event, /* ui */ ThumbDragStartEventUIParam) => Unit): Self = this.set("thumbDragStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteThumbDragStart: Self = this.set("thumbDragStart", js.undefined)
    @scala.inline
    def setWheelStep(value: Double): Self = this.set("wheelStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheelStep: Self = this.set("wheelStep", js.undefined)
  }
  
}

