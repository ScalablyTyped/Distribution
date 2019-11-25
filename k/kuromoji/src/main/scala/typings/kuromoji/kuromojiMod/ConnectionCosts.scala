package typings.kuromoji.kuromojiMod

import typings.std.Int16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionCosts extends js.Object {
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
}

