package typings.hystrixjs.mod

import typings.rxLiteAggregates.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HystrixSSEStream_ extends StObject {
  
  def toCommandJson(metrics: Any): String
  
  def toObservable(): Observable[Any]
}
object HystrixSSEStream_ {
  
  inline def apply(toCommandJson: Any => String, toObservable: () => Observable[Any]): HystrixSSEStream_ = {
    val __obj = js.Dynamic.literal(toCommandJson = js.Any.fromFunction1(toCommandJson), toObservable = js.Any.fromFunction0(toObservable))
    __obj.asInstanceOf[HystrixSSEStream_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HystrixSSEStream_] (val x: Self) extends AnyVal {
    
    inline def setToCommandJson(value: Any => String): Self = StObject.set(x, "toCommandJson", js.Any.fromFunction1(value))
    
    inline def setToObservable(value: () => Observable[Any]): Self = StObject.set(x, "toObservable", js.Any.fromFunction0(value))
  }
}
