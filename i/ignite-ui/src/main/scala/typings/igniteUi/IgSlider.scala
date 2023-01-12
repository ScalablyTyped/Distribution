package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSlider
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Get or set whether the slide handle will animate when it is moved.
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the slider bookmark click event. Fired when a bookmark is clicked.
    */
  var bookmarkClick: js.UndefOr[BookmarkClickEvent] = js.undefined
  
  /**
    * Defines the slider bookmark hit event. Fired when the slider handle passes after the bookmark value.
    */
  var bookmarkHit: js.UndefOr[BookmarkHitEvent] = js.undefined
  
  /**
    * Get or set the bookmarks array.
    */
  var bookmarks: js.UndefOr[IgSliderBookmarks] = js.undefined
  
  /**
    * Defines the slider value change event. Fired when the value of the slider changes. It fires after the slide event.
    */
  var change: js.UndefOr[ChangeEvent] = js.undefined
  
  /**
    * Get or set the slider range maximum value.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Get or set the slider range minimum value.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Get or set the slider orientation.
    */
  var orientation: js.UndefOr[Any] = js.undefined
  
  /**
    * Get or set the whether to show bookmarks title on bookmark hover or not.
    */
  var showBookmarkTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the slide event. Fired when the user is sliding with mouse.
    */
  var slide: js.UndefOr[SlideEvent] = js.undefined
  
  /**
    * Defines the slide start event.
    */
  var start: js.UndefOr[StartEvent] = js.undefined
  
  /**
    * Get or set the step with which the value is increased.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the slide stop event. Fired to mark the end of a sliding action.
    */
  var stop: js.UndefOr[StopEvent] = js.undefined
  
  /**
    * Get or set whether the handle will be moved to the bookmark position when a bookmark is clicked.
    */
  var syncHandleWithBookmark: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Get or set the slider value.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object IgSlider {
  
  inline def apply(): IgSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSlider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgSlider] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBookmarkClick(value: (/* event */ Event, /* ui */ BookmarkClickEventUIParam) => Unit): Self = StObject.set(x, "bookmarkClick", js.Any.fromFunction2(value))
    
    inline def setBookmarkClickUndefined: Self = StObject.set(x, "bookmarkClick", js.undefined)
    
    inline def setBookmarkHit(value: (/* event */ Event, /* ui */ BookmarkHitEventUIParam) => Unit): Self = StObject.set(x, "bookmarkHit", js.Any.fromFunction2(value))
    
    inline def setBookmarkHitUndefined: Self = StObject.set(x, "bookmarkHit", js.undefined)
    
    inline def setBookmarks(value: IgSliderBookmarks): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
    
    inline def setBookmarksUndefined: Self = StObject.set(x, "bookmarks", js.undefined)
    
    inline def setChange(value: (/* event */ Event, /* ui */ ChangeEventUIParam) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOrientation(value: Any): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setShowBookmarkTitle(value: Boolean): Self = StObject.set(x, "showBookmarkTitle", value.asInstanceOf[js.Any])
    
    inline def setShowBookmarkTitleUndefined: Self = StObject.set(x, "showBookmarkTitle", js.undefined)
    
    inline def setSlide(value: (/* event */ Event, /* ui */ SlideEventUIParam) => Unit): Self = StObject.set(x, "slide", js.Any.fromFunction2(value))
    
    inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
    
    inline def setStart(value: (/* event */ Event, /* ui */ StartEventUIParam) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStop(value: (/* event */ Event, /* ui */ StopEventUIParam) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setSyncHandleWithBookmark(value: Boolean): Self = StObject.set(x, "syncHandleWithBookmark", value.asInstanceOf[js.Any])
    
    inline def setSyncHandleWithBookmarkUndefined: Self = StObject.set(x, "syncHandleWithBookmark", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
