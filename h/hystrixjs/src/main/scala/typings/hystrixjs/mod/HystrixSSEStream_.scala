package typings.hystrixjs.mod

import typings.rx.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HystrixSSEStream_ extends StObject {
  
  def toCommandJson(metrics: js.Any): String
  
  def toObservable(): Observable[js.Any]
}
object HystrixSSEStream_ {
  
  inline def apply(toCommandJson: js.Any => String, toObservable: () => Observable[js.Any]): HystrixSSEStream_ = {
    val __obj = js.Dynamic.literal(toCommandJson = js.Any.fromFunction1(toCommandJson), toObservable = js.Any.fromFunction0(toObservable))
    __obj.asInstanceOf[HystrixSSEStream_]
  }
  
  extension [Self <: HystrixSSEStream_](x: Self) {
    
    inline def setToCommandJson(value: js.Any => String): Self = StObject.set(x, "toCommandJson", js.Any.fromFunction1(value))
    
    inline def setToObservable(value: () => Observable[js.Any]): Self = StObject.set(x, "toObservable", js.Any.fromFunction0(value))
  }
}
