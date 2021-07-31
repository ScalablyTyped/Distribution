package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgProgressBar
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var animateTimeout: js.UndefOr[Double] = js.undefined
  
  var change: js.UndefOr[ChangeEvent] = js.undefined
  
  var endValue: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately.
    */
  var queue: js.UndefOr[Boolean] = js.undefined
  
  var range: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object IgProgressBar {
  
  @scala.inline
  def apply(): IgProgressBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgProgressBar]
  }
  
  @scala.inline
  implicit class IgProgressBarMutableBuilder[Self <: IgProgressBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateTimeout(value: Double): Self = StObject.set(x, "animateTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateTimeoutUndefined: Self = StObject.set(x, "animateTimeout", js.undefined)
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setChange(value: (/* event */ Event, /* ui */ ChangeEventUIParam) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
