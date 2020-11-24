package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MVCArrayHandlerMap[C /* <: MVCArray[T] */, T] extends js.Object {
  
  /**
    * This event is fired when {@link MVCArray.insertAt insertAt}() is called. The event passes the index that was
    * passed to {@link MVCArray.insertAt insertAt}().
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.insert_at Maps JavaScript API}
    */
  def insert_at(index: Double): Unit = js.native
  
  /**
    * This event is fired when {@link MVCArray.removeAt removeAt}() is called. The event passes the index that was
    * passed to {@link MVCArray.removeAt removeAt}() and the element that was removed from the array.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.remove_at Maps JavaScript API}
    */
  def remove_at(index: Double, removed: T): Unit = js.native
  
  /**
    * This event is fired when {@link MVCArray.setAt setAt}() is called. The event passes the index that was passed
    * to {@link MVCArray.setAt setAt}() and the element that was previously in the array at that index.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.set_at Maps JavaScript API}
    */
  def set_at(index: Double, previous: T): Unit = js.native
}
object MVCArrayHandlerMap {
  
  @scala.inline
  def apply[C /* <: MVCArray[T] */, T](insert_at: Double => Unit, remove_at: (Double, T) => Unit, set_at: (Double, T) => Unit): MVCArrayHandlerMap[C, T] = {
    val __obj = js.Dynamic.literal(insert_at = js.Any.fromFunction1(insert_at), remove_at = js.Any.fromFunction2(remove_at), set_at = js.Any.fromFunction2(set_at))
    __obj.asInstanceOf[MVCArrayHandlerMap[C, T]]
  }
  
  @scala.inline
  implicit class MVCArrayHandlerMapOps[Self <: MVCArrayHandlerMap[_, _], C /* <: MVCArray[T] */, T] (val x: Self with (MVCArrayHandlerMap[C, T])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsert_at(value: Double => Unit): Self = this.set("insert_at", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_at(value: (Double, T) => Unit): Self = this.set("remove_at", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet_at(value: (Double, T) => Unit): Self = this.set("set_at", js.Any.fromFunction2(value))
  }
}
