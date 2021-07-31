package typings.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait jQRangeSliderScale extends StObject {
  
  var first: js.UndefOr[js.Function2[/* min */ Double, /* max */ Double, Double]] = js.undefined
  
  // 'true' to stop scale generating ticks from a given value
  var format: js.UndefOr[
    js.Function3[
      /* tickContainer */ js.Any, 
      /* tickStartValue */ js.Any, 
      /* tickEndValue */ js.Any, 
      Unit
    ]
  ] = js.undefined
  
  // compute the next value.
  var label: js.UndefOr[js.Function2[/* value */ js.Any, /* nextValue */ js.Any, String]] = js.undefined
  
  // compute the ruler first value.
  def next(value: js.Any): js.Any
  
  // compute displayed text for a given internal
  var stop: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.undefined
}
object jQRangeSliderScale {
  
  @scala.inline
  def apply(next: js.Any => js.Any): jQRangeSliderScale = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[jQRangeSliderScale]
  }
  
  @scala.inline
  implicit class jQRangeSliderScaleMutableBuilder[Self <: jQRangeSliderScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: (/* min */ Double, /* max */ Double) => Double): Self = StObject.set(x, "first", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    @scala.inline
    def setFormat(
      value: (/* tickContainer */ js.Any, /* tickStartValue */ js.Any, /* tickEndValue */ js.Any) => Unit
    ): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLabel(value: (/* value */ js.Any, /* nextValue */ js.Any) => String): Self = StObject.set(x, "label", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setNext(value: js.Any => js.Any): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
