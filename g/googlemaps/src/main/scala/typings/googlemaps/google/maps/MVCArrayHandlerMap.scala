package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MVCArrayHandlerMap[C /* <: MVCArray[T] */, T] extends StObject {
  
  /**
    * This event is fired when {@link MVCArray.insertAt insertAt}() is called. The event passes the index that was
    * passed to {@link MVCArray.insertAt insertAt}().
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.insert_at Maps JavaScript API}
    */
  def insert_at(index: Double): Unit
  
  /**
    * This event is fired when {@link MVCArray.removeAt removeAt}() is called. The event passes the index that was
    * passed to {@link MVCArray.removeAt removeAt}() and the element that was removed from the array.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.remove_at Maps JavaScript API}
    */
  def remove_at(index: Double, removed: T): Unit
  
  /**
    * This event is fired when {@link MVCArray.setAt setAt}() is called. The event passes the index that was passed
    * to {@link MVCArray.setAt setAt}() and the element that was previously in the array at that index.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.set_at Maps JavaScript API}
    */
  def set_at(index: Double, previous: T): Unit
}
object MVCArrayHandlerMap {
  
  inline def apply[C /* <: MVCArray[T] */, T](insert_at: Double => Unit, remove_at: (Double, T) => Unit, set_at: (Double, T) => Unit): MVCArrayHandlerMap[C, T] = {
    val __obj = js.Dynamic.literal(insert_at = js.Any.fromFunction1(insert_at), remove_at = js.Any.fromFunction2(remove_at), set_at = js.Any.fromFunction2(set_at))
    __obj.asInstanceOf[MVCArrayHandlerMap[C, T]]
  }
  
  extension [Self <: MVCArrayHandlerMap[?, ?], C /* <: MVCArray[T] */, T](x: Self & (MVCArrayHandlerMap[C, T])) {
    
    inline def setInsert_at(value: Double => Unit): Self = StObject.set(x, "insert_at", js.Any.fromFunction1(value))
    
    inline def setRemove_at(value: (Double, T) => Unit): Self = StObject.set(x, "remove_at", js.Any.fromFunction2(value))
    
    inline def setSet_at(value: (Double, T) => Unit): Self = StObject.set(x, "set_at", js.Any.fromFunction2(value))
  }
}
