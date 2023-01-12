package typings.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait jQRangeSliderScale extends StObject {
  
  var first: js.UndefOr[js.Function2[/* min */ Double, /* max */ Double, Double]] = js.undefined
  
  // 'true' to stop scale generating ticks from a given value
  var format: js.UndefOr[
    js.Function3[/* tickContainer */ Any, /* tickStartValue */ Any, /* tickEndValue */ Any, Unit]
  ] = js.undefined
  
  // compute the next value.
  var label: js.UndefOr[js.Function2[/* value */ Any, /* nextValue */ Any, String]] = js.undefined
  
  // compute the ruler first value.
  def next(value: Any): Any
  
  // compute displayed text for a given internal
  var stop: js.UndefOr[js.Function1[/* value */ Any, Boolean]] = js.undefined
}
object jQRangeSliderScale {
  
  inline def apply(next: Any => Any): jQRangeSliderScale = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[jQRangeSliderScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: jQRangeSliderScale] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: (/* min */ Double, /* max */ Double) => Double): Self = StObject.set(x, "first", js.Any.fromFunction2(value))
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setFormat(value: (/* tickContainer */ Any, /* tickStartValue */ Any, /* tickEndValue */ Any) => Unit): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLabel(value: (/* value */ Any, /* nextValue */ Any) => String): Self = StObject.set(x, "label", js.Any.fromFunction2(value))
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setNext(value: Any => Any): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    
    inline def setStop(value: /* value */ Any => Boolean): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
