package typings.hystrixjs.mod

import typings.rx.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HystrixSSEStream_ extends StObject {
  
  def toCommandJson(metrics: js.Any): String = js.native
  
  def toObservable(): Observable[_] = js.native
}
object HystrixSSEStream_ {
  
  @scala.inline
  def apply(toCommandJson: js.Any => String, toObservable: () => Observable[_]): HystrixSSEStream_ = {
    val __obj = js.Dynamic.literal(toCommandJson = js.Any.fromFunction1(toCommandJson), toObservable = js.Any.fromFunction0(toObservable))
    __obj.asInstanceOf[HystrixSSEStream_]
  }
  
  @scala.inline
  implicit class HystrixSSEStream_MutableBuilder[Self <: HystrixSSEStream_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToCommandJson(value: js.Any => String): Self = StObject.set(x, "toCommandJson", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToObservable(value: () => Observable[_]): Self = StObject.set(x, "toObservable", js.Any.fromFunction0(value))
  }
}
