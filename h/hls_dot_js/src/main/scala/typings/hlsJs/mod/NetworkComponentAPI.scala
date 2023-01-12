package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkComponentAPI
  extends StObject
     with ComponentAPI {
  
  def startLoad(startPosition: Double): Unit
  
  def stopLoad(): Unit
}
object NetworkComponentAPI {
  
  inline def apply(destroy: () => Unit, startLoad: Double => Unit, stopLoad: () => Unit): NetworkComponentAPI = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), startLoad = js.Any.fromFunction1(startLoad), stopLoad = js.Any.fromFunction0(stopLoad))
    __obj.asInstanceOf[NetworkComponentAPI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkComponentAPI] (val x: Self) extends AnyVal {
    
    inline def setStartLoad(value: Double => Unit): Self = StObject.set(x, "startLoad", js.Any.fromFunction1(value))
    
    inline def setStopLoad(value: () => Unit): Self = StObject.set(x, "stopLoad", js.Any.fromFunction0(value))
  }
}
