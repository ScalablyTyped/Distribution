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

