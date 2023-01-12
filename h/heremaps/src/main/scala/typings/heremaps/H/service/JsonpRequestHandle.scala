package typings.heremaps.H.service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @property id {number} - the ID associated internally with this request
  * @property cancel {function()} - this function cancels the request and invokes the errback function
  */
trait JsonpRequestHandle extends StObject {
  
  def cancel(): Unit
  
  var id: Double
}
object JsonpRequestHandle {
  
  inline def apply(cancel: () => Unit, id: Double): JsonpRequestHandle = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonpRequestHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonpRequestHandle] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
