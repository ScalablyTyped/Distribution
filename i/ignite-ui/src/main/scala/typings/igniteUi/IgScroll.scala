package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgScroll
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Sets or gets if the scrollbars should be always visible (on all environments). Otherwise it will be the default behavior. Note: this option is only for the custom scrollbars set through the scrollbarType option.
    *
    */
  var alwaysVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets gets the step of the default scrolling behavior when using any of the custom scrollbar track areas.
    *
    */
  var bigIncrementStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets at least how many times the horizontal speed should be bigger so the inertia proceeds only horizontally without scrolling vertically. This is to improve interactions due to not perfectly swiping left/right with some deviation down/up
    *
    */
  var inertiaDeltaX: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets at least how many times the vertical speed should be bigger so the inertia proceeds only vertically without scrolling horizontally. This is to improve interactions due to not perfectly swiping down/up with some deviation left/right
    *
    */
  var inertiaDeltaY: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets the modifier for how long the inertia last on mobile devices
    *
    */
  var inertiaDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets the modifier for how much the inertia scrolls on mobile devices
    *
    */
  var inertiaStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets or gets the minimum size of the thumb drag in pixels. For the vertical thumb it means its minimum height, for the horizontal thumb it means its minimum width. This affects only the custom scrollblar when scrollbarType is set to "custom".
    *
    */
  var minThumbSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Sets or gets if igScroll can modify the DOM when it is initialized on certain element so that the content can be scrollable.
    *
    */
  var modifyDOM: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Event which is raised after the scroller has been rendered fully
    */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  
  /**
    * Event which is raised after the igScroll has finished resizing.
    * Function takes arguments evt and args.
    * Use evt.originalEvent (with validation for not null of evt) to obtain reference to event of browser.
    * Use args.owner to obtain reference to igScroll.
    */
  var resized: js.UndefOr[ResizedEvent] = js.undefined
  
  /**
    * Event which is raised when the igScroll detects that the element is reizing.
    * Function takes arguments evt and args.
    * Use evt.originalEvent (with validation for not null of evt) to obtain reference to event of browser.
    * Use args.owner to obtain reference to igScroll.
    */
  var resizing: js.UndefOr[ResizingEvent] = js.undefined
  
  /**
    * Sets custom value for how high is actually the content. Useful when wanting to scroll and update the shown content manually.
    *
    */
  var scrollHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets current horizontal position of the content.
    *
    */
  var scrollLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets if only the linked horizontal scrollbar should be used for horizontal scrolling. Note: The behavior when the linked scrollbar is scrolled in this case should be handled manually.
    *
    */
  var scrollOnlyHBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets gets if only the linked vertical scrollbar should be used for vertical scrolling. Note: The behavior when the linked scrollbar is scrolled in this case should be handled manually.
    *
    */
  var scrollOnlyVBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets gets current vertical position of the content.
    *
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets custom value for what width is actually the content. Useful when wanting to scroll and update the shown content manually.
    *
    */
  var scrollWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets html or jQuery element which is used for horizontal scrolling.
    *
    */
  var scrollbarH: js.UndefOr[String] = js.undefined
  
  /**
    * Sets gets html or jQuery element to which the horizontal scrollbar will be appended to.
    *
    */
  var scrollbarHParent: js.UndefOr[String] = js.undefined
  
  /**
    * Sets or gets what type of scrollbars should be using the igScroll (on all environments).
    *
    *
    * Valid values:
    * "custom" Custom scrollbars with custom ui and events.
    * "native" Native scrollbars
    * "none" No scrollbars should be visible
    */
  var scrollbarType: js.UndefOr[String] = js.undefined
  
  /**
    * Sets gets html or jQuery element which is used for vertical scrolling.
    *
    */
  var scrollbarV: js.UndefOr[String] = js.undefined
  
  /**
    * Sets gets html or jQuery element to which the vertical scrollbar will be appended to.
    *
    */
  var scrollbarVParent: js.UndefOr[String] = js.undefined
  
  /**
    * Event which is raised after scrolling has stopped.
    */
  var scrolled: js.UndefOr[ScrolledEvent] = js.undefined
  
  /**
    * Event which is raised before scrolling or before each step when having inertia.
    * Return false in order to cancel action.
    */
  var scrolling: js.UndefOr[ScrollingEvent] = js.undefined
  
  /**
    * Sets gets the step of the default scrolling behavior when using any of the custom scrollbar arrows
    *
    */
  var smallIncrementStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets if smoother scrolling with small intertia should be used when using mouse wheel
    *
    */
  var smoothing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets or gets the modifier for how long the scroll ‘animation’ lasts when using the mouse wheel once. This is used only for the smooth scrolling behavior.
    *
    */
  var smoothingDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets or gets the modifier for how many pixels will be scrolled when using the mouse wheel once. This is used only for the smooth scrolling behavior.
    *
    */
  var smoothingStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets how much pixels of toleration there will be when initially swiping horizontally. This is to improve swiping up/down without scrolling left/right when not intended due to small deviation left/right
    *
    */
  var swipeToleranceX: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets elements that are linked to the main content horizontally. When the content is scrolled on X axis the linked elements scroll accordingly.
    *
    */
  var syncedElemsH: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Sets gets elements that are linked to the main content vertically. When the content is scrolled on Y axis the linked elements scroll accordingly.
    *
    */
  var syncedElemsV: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Event which is raised on mouse up from the scrollbar's thumb drag.
    */
  var thumbDragEnd: js.UndefOr[ThumbDragEndEvent] = js.undefined
  
  /**
    * Event which is raised when the thumb drag is being moved.
    */
  var thumbDragMove: js.UndefOr[ThumbDragMoveEvent] = js.undefined
  
  /**
    * Event which is raised when there is mouse click on the scrollbar's thumb drag.
    */
  var thumbDragStart: js.UndefOr[ThumbDragStartEvent] = js.undefined
  
  /**
    * Sets gets the step of the default scrolling behavior when using mouse wheel
    *
    */
  var wheelStep: js.UndefOr[Double] = js.undefined
}
object IgScroll {
  
  inline def apply(): IgScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgScroll]
  }
  
  extension [Self <: IgScroll](x: Self) {
    
    inline def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
    
    inline def setAlwaysVisibleUndefined: Self = StObject.set(x, "alwaysVisible", js.undefined)
    
    inline def setBigIncrementStep(value: Double): Self = StObject.set(x, "bigIncrementStep", value.asInstanceOf[js.Any])
    
    inline def setBigIncrementStepUndefined: Self = StObject.set(x, "bigIncrementStep", js.undefined)
    
    inline def setInertiaDeltaX(value: Double): Self = StObject.set(x, "inertiaDeltaX", value.asInstanceOf[js.Any])
    
    inline def setInertiaDeltaXUndefined: Self = StObject.set(x, "inertiaDeltaX", js.undefined)
    
    inline def setInertiaDeltaY(value: Double): Self = StObject.set(x, "inertiaDeltaY", value.asInstanceOf[js.Any])
    
    inline def setInertiaDeltaYUndefined: Self = StObject.set(x, "inertiaDeltaY", js.undefined)
    
    inline def setInertiaDuration(value: Double): Self = StObject.set(x, "inertiaDuration", value.asInstanceOf[js.Any])
    
    inline def setInertiaDurationUndefined: Self = StObject.set(x, "inertiaDuration", js.undefined)
    
    inline def setInertiaStep(value: Double): Self = StObject.set(x, "inertiaStep", value.asInstanceOf[js.Any])
    
    inline def setInertiaStepUndefined: Self = StObject.set(x, "inertiaStep", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMinThumbSize(value: Double | String): Self = StObject.set(x, "minThumbSize", value.asInstanceOf[js.Any])
    
    inline def setMinThumbSizeUndefined: Self = StObject.set(x, "minThumbSize", js.undefined)
    
    inline def setModifyDOM(value: Boolean): Self = StObject.set(x, "modifyDOM", value.asInstanceOf[js.Any])
    
    inline def setModifyDOMUndefined: Self = StObject.set(x, "modifyDOM", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = StObject.set(x, "rendered", js.Any.fromFunction2(value))
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setResized(value: (/* event */ Event, /* ui */ ResizedEventUIParam) => Unit): Self = StObject.set(x, "resized", js.Any.fromFunction2(value))
    
    inline def setResizedUndefined: Self = StObject.set(x, "resized", js.undefined)
    
    inline def setResizing(value: (/* event */ Event, /* ui */ ResizingEventUIParam) => Unit): Self = StObject.set(x, "resizing", js.Any.fromFunction2(value))
    
    inline def setResizingUndefined: Self = StObject.set(x, "resizing", js.undefined)
    
    inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    inline def setScrollOnlyHBar(value: Boolean): Self = StObject.set(x, "scrollOnlyHBar", value.asInstanceOf[js.Any])
    
    inline def setScrollOnlyHBarUndefined: Self = StObject.set(x, "scrollOnlyHBar", js.undefined)
    
    inline def setScrollOnlyVBar(value: Boolean): Self = StObject.set(x, "scrollOnlyVBar", value.asInstanceOf[js.Any])
    
    inline def setScrollOnlyVBarUndefined: Self = StObject.set(x, "scrollOnlyVBar", js.undefined)
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    
    inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    
    inline def setScrollWidthUndefined: Self = StObject.set(x, "scrollWidth", js.undefined)
    
    inline def setScrollbarH(value: String): Self = StObject.set(x, "scrollbarH", value.asInstanceOf[js.Any])
    
    inline def setScrollbarHParent(value: String): Self = StObject.set(x, "scrollbarHParent", value.asInstanceOf[js.Any])
    
    inline def setScrollbarHParentUndefined: Self = StObject.set(x, "scrollbarHParent", js.undefined)
    
    inline def setScrollbarHUndefined: Self = StObject.set(x, "scrollbarH", js.undefined)
    
    inline def setScrollbarType(value: String): Self = StObject.set(x, "scrollbarType", value.asInstanceOf[js.Any])
    
    inline def setScrollbarTypeUndefined: Self = StObject.set(x, "scrollbarType", js.undefined)
    
    inline def setScrollbarV(value: String): Self = StObject.set(x, "scrollbarV", value.asInstanceOf[js.Any])
    
    inline def setScrollbarVParent(value: String): Self = StObject.set(x, "scrollbarVParent", value.asInstanceOf[js.Any])
    
    inline def setScrollbarVParentUndefined: Self = StObject.set(x, "scrollbarVParent", js.undefined)
    
    inline def setScrollbarVUndefined: Self = StObject.set(x, "scrollbarV", js.undefined)
    
    inline def setScrolled(value: (/* event */ Event, /* ui */ ScrolledEventUIParam) => Unit): Self = StObject.set(x, "scrolled", js.Any.fromFunction2(value))
    
    inline def setScrolledUndefined: Self = StObject.set(x, "scrolled", js.undefined)
    
    inline def setScrolling(value: (/* event */ Event, /* ui */ ScrollingEventUIParam) => Unit): Self = StObject.set(x, "scrolling", js.Any.fromFunction2(value))
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSmallIncrementStep(value: Double): Self = StObject.set(x, "smallIncrementStep", value.asInstanceOf[js.Any])
    
    inline def setSmallIncrementStepUndefined: Self = StObject.set(x, "smallIncrementStep", js.undefined)
    
    inline def setSmoothing(value: Boolean): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
    
    inline def setSmoothingDuration(value: Double): Self = StObject.set(x, "smoothingDuration", value.asInstanceOf[js.Any])
    
    inline def setSmoothingDurationUndefined: Self = StObject.set(x, "smoothingDuration", js.undefined)
    
    inline def setSmoothingStep(value: Double): Self = StObject.set(x, "smoothingStep", value.asInstanceOf[js.Any])
    
    inline def setSmoothingStepUndefined: Self = StObject.set(x, "smoothingStep", js.undefined)
    
    inline def setSmoothingUndefined: Self = StObject.set(x, "smoothing", js.undefined)
    
    inline def setSwipeToleranceX(value: Double): Self = StObject.set(x, "swipeToleranceX", value.asInstanceOf[js.Any])
    
    inline def setSwipeToleranceXUndefined: Self = StObject.set(x, "swipeToleranceX", js.undefined)
    
    inline def setSyncedElemsH(value: js.Array[Any]): Self = StObject.set(x, "syncedElemsH", value.asInstanceOf[js.Any])
    
    inline def setSyncedElemsHUndefined: Self = StObject.set(x, "syncedElemsH", js.undefined)
    
    inline def setSyncedElemsHVarargs(value: Any*): Self = StObject.set(x, "syncedElemsH", js.Array(value*))
    
    inline def setSyncedElemsV(value: js.Array[Any]): Self = StObject.set(x, "syncedElemsV", value.asInstanceOf[js.Any])
    
    inline def setSyncedElemsVUndefined: Self = StObject.set(x, "syncedElemsV", js.undefined)
    
    inline def setSyncedElemsVVarargs(value: Any*): Self = StObject.set(x, "syncedElemsV", js.Array(value*))
    
    inline def setThumbDragEnd(value: (/* event */ Event, /* ui */ ThumbDragEndEventUIParam) => Unit): Self = StObject.set(x, "thumbDragEnd", js.Any.fromFunction2(value))
    
    inline def setThumbDragEndUndefined: Self = StObject.set(x, "thumbDragEnd", js.undefined)
    
    inline def setThumbDragMove(value: (/* event */ Event, /* ui */ ThumbDragMoveEventUIParam) => Unit): Self = StObject.set(x, "thumbDragMove", js.Any.fromFunction2(value))
    
    inline def setThumbDragMoveUndefined: Self = StObject.set(x, "thumbDragMove", js.undefined)
    
    inline def setThumbDragStart(value: (/* event */ Event, /* ui */ ThumbDragStartEventUIParam) => Unit): Self = StObject.set(x, "thumbDragStart", js.Any.fromFunction2(value))
    
    inline def setThumbDragStartUndefined: Self = StObject.set(x, "thumbDragStart", js.undefined)
    
    inline def setWheelStep(value: Double): Self = StObject.set(x, "wheelStep", value.asInstanceOf[js.Any])
    
    inline def setWheelStepUndefined: Self = StObject.set(x, "wheelStep", js.undefined)
  }
}
