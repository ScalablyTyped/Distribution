package typings.jqueryTinycarousel

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryTinyCarousel {
  
  trait JQueryTinyCarouselOptions extends StObject {
    
    /**
      * Show animation when changing block? (default: true)
      */
    var animation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Vertical or horizontal scroller? 'x' or 'y'. (default: 'x')
      */
    var axis: js.UndefOr[String] = js.undefined
    
    /**
      * Function that executes after every move (default: null)
      */
    var callback: js.UndefOr[js.Function2[/* element */ HTMLElement, /* index */ Double, Unit]] = js.undefined
    
    /**
      * Show left and right navigation buttons? (default: true)
      */
    var controls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How many blocks do you want to move at a time? (default: 1)
      */
    var display: js.UndefOr[Double] = js.undefined
    
    /**
      * Time of the animation in miliseconds (default: 1000)
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Move to the next block on an interval. (default: false)
      */
    var interval: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Interval time in milliseconds. (default: 3000)
      */
    var intervaltime: js.UndefOr[Double] = js.undefined
    
    /**
      * Show page number navigation buttons? (default: false)
      */
    var pager: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If interval is true and rewind is true it will play in reverse if the last slide is reached. (default: false)
      */
    var rewind: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Start block of the carousel. (default: 1)
      */
    var start: js.UndefOr[Double] = js.undefined
  }
  object JQueryTinyCarouselOptions {
    
    inline def apply(): JQueryTinyCarouselOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JQueryTinyCarouselOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JQueryTinyCarouselOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setCallback(value: (/* element */ HTMLElement, /* index */ Double) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setDisplay(value: Double): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setInterval(value: Boolean): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setIntervaltime(value: Double): Self = StObject.set(x, "intervaltime", value.asInstanceOf[js.Any])
      
      inline def setIntervaltimeUndefined: Self = StObject.set(x, "intervaltime", js.undefined)
      
      inline def setPager(value: Boolean): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
      
      inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
      
      inline def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      inline def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
