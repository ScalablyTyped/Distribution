package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionCosts extends js.Object {
  var buffer: stdLib.Int16Array
  def get(forward_id: scala.Double, backward_id: scala.Double): scala.Double
  def loadConnectionCosts(connection_costs_buffer: stdLib.Int16Array): scala.Unit
  def put(forward_id: scala.Double, backward_id: scala.Double, cost: scala.Double): scala.Unit
}

object ConnectionCosts {
  @scala.inline
  def apply(
    buffer: stdLib.Int16Array,
    get: (scala.Double, scala.Double) => scala.Double,
    loadConnectionCosts: stdLib.Int16Array => scala.Unit,
    put: (scala.Double, scala.Double, scala.Double) => scala.Unit
  ): ConnectionCosts = {
    val __obj = js.Dynamic.literal(buffer = buffer, get = js.Any.fromFunction2(get), loadConnectionCosts = js.Any.fromFunction1(loadConnectionCosts), put = js.Any.fromFunction3(put))
  
    __obj.asInstanceOf[ConnectionCosts]
  }
}

