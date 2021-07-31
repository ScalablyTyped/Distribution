package typings.kuromoji.mod

import typings.std.Int16Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionCosts extends StObject {
  
  var buffer: Int16Array
  
  def get(forward_id: Double, backward_id: Double): Double
  
  def loadConnectionCosts(connection_costs_buffer: Int16Array): Unit
  
  def put(forward_id: Double, backward_id: Double, cost: Double): Unit
}
object ConnectionCosts {
  
  @scala.inline
  def apply(
    buffer: Int16Array,
    get: (Double, Double) => Double,
    loadConnectionCosts: Int16Array => Unit,
    put: (Double, Double, Double) => Unit
  ): ConnectionCosts = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), loadConnectionCosts = js.Any.fromFunction1(loadConnectionCosts), put = js.Any.fromFunction3(put))
    __obj.asInstanceOf[ConnectionCosts]
  }
  
  @scala.inline
  implicit class ConnectionCostsMutableBuilder[Self <: ConnectionCosts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Int16Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: (Double, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadConnectionCosts(value: Int16Array => Unit): Self = StObject.set(x, "loadConnectionCosts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
  }
}
