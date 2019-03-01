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
    get: js.Function2[scala.Double, scala.Double, scala.Double],
    loadConnectionCosts: js.Function1[stdLib.Int16Array, scala.Unit],
    put: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit]
  ): ConnectionCosts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("loadConnectionCosts")(loadConnectionCosts)
    __obj.updateDynamic("put")(put)
    __obj.asInstanceOf[ConnectionCosts]
  }
}

